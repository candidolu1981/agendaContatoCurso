package br.com.agenda.service;

import org.springframework.stereotype.Service;

import br.com.agenda.model.Contato;
import br.com.agenda.model.dto.ContatoInputDto;
import br.com.agenda.repository.ContatoRepository;

@Service
public class ContatoService {
	
	private final ContatoRepository contatoRepository;

	public ContatoService(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}
	
	public Contato buscarContatoPorId(Integer id) {
		System.out.println(contatoRepository.getById(id));
		return contatoRepository.getById(id);
	}

	public Contato salvarContato(ContatoInputDto contatoDto) {
		Contato contato = contatoDto.converte();
		return contatoRepository.save(contato);
	}
}
