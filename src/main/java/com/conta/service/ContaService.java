package com.conta.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.conta.model.ContaModel;
import com.conta.model.ResponseModel;
import com.conta.repository.ContaRepository;

@CrossOrigin(origins  = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class ContaService {
 
	@Autowired
	private ContaRepository contaRepository; 
 
	/**
	 * SALVAR UM NOVO REGISTRO
	 * @param conta
	 * @return
	 */
	@RequestMapping(value="/conta", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody ContaModel conta){
 
 
		try {
 
			this.contaRepository.save(conta);
 
			return new ResponseModel(1,"Registro salvo com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage());			
		}
	}
 
	/**
	 * ATUALIZAR O REGISTRO DE UMA CONTA
	 * @param conta
	 * @return
	 */
	@RequestMapping(value="/conta", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel atualizar(@RequestBody ContaModel conta){
 
		try {
 
			this.contaRepository.save(conta);		
 
			return new ResponseModel(1,"Registro atualizado com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage());
		}
	}
 
	/**
	 * CONSULTAR TODAS AS CONTAS
	 * @return
	 */
	@RequestMapping(value="/conta", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<ContaModel> consultar(){
 
		return this.contaRepository.findAll();
	}
 
	/**
	 * BUSCAR UMA CONTA PELO ID
	 * @param ID
	 * @return
	 */
	@RequestMapping(value="/conta/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ContaModel buscar(@PathVariable("id") Integer id){
 
		return this.contaRepository.findOne(id);
	}
 
	/***
	 * EXCLUIR UMA CONTA PELO ID
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/conta/{id}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel excluir(@PathVariable("id") Integer id){
 
		ContaModel contaModel = contaRepository.findOne(id);
 
		try {
 
			contaRepository.delete(contaModel);
 
			return new ResponseModel(1, "Registro excluido com sucesso!");
 
		}catch(Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}
 
}