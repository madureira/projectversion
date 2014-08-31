package br.com.projectversion.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.projectversion.entity.Client;

@Resource
public class HomeController {
	
	@Autowired
	private Result result;

	@Path("/")
	public void index() {
		Client client = new Client();
		client.setName("Rafael Madureira dos Santos");
		
		this.result.include("client", client);
	}

}