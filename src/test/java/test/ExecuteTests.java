package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utils.RestUtils;

public class ExecuteTests extends MassaDados {
	
	@Test
	public void execucaoTestes() {
		RestUtils.urlBase();
		//1) Crie os usuarios Ana Maia, Rodrigo Mendes, Tatiana Vasconcelos 
		RestUtils.realizarCadastro(ana.getUser(), endpointUser);
		RestUtils.realizarCadastro(rodrigo.getUser(), endpointUser);
		RestUtils.realizarCadastro(tatiana.getUser(), endpointUser);
		
		//2) Crie os pets Snoopy (dog), Bichento (cat) e Perry (platypus)
		RestUtils.realizarCadastro(snoopy.getPet(), endpointPet);
		RestUtils.realizarCadastro(bichento.getPet(), endpointPet);
		RestUtils.realizarCadastro(perry.getPet(), endpointPet);
		
		//3) Faça a venda do Perry para a Ana Maia, do Snoopy para o Rodrigo Mendes e do Bichento para a Tatiana Vanconcelos
		RestUtils.realizarCadastro(anaPerry.getStore(), endpointStore);
		RestUtils.realizarCadastro(rodrigoSnoopy.getStore(), endpointStore);
		RestUtils.realizarCadastro(tatianaBichento.getStore(), endpointStore);
		
		//4) Mude o status da ordem de venda do Perry e do Snoopy para "approved" e do Bichento para "delivered"
		RestUtils.alterarStatus(perry, "approved", endpointPet);
		RestUtils.alterarStatus(snoopy, "approved", endpointPet);
		RestUtils.alterarStatus(bichento, "delivered", endpointPet);
		
		//5) Consulte as 3 ordens geradas
		RestUtils.consultarOrdemUsuario(ana, endpointUser);
		RestUtils.consultarOrdemUsuario(rodrigo, endpointUser);
		RestUtils.consultarOrdemUsuario(tatiana, endpointUser);
		
		RestUtils.consultarOrdemAnimal(perry, endpointPet);
		RestUtils.consultarOrdemAnimal(bichento, endpointPet);
		RestUtils.consultarOrdemAnimal(snoopy, endpointPet);
		
		RestUtils.consultarOrdemStatus(anaPerry, endpointStore);
		assertEquals(anaPerry.getStore().get("status"), RestUtils.get("status"));
		RestUtils.consultarOrdemStatus(rodrigoSnoopy, endpointStore);
		assertEquals(rodrigoSnoopy.getStore().get("status"), RestUtils.get("status"));
		RestUtils.consultarOrdemStatus(tatianaBichento, endpointStore);
		assertEquals(tatianaBichento.getStore().get("status"), RestUtils.get("status"));
	}
}
