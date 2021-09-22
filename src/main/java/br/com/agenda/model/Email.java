package br.com.agenda.model;

import javax.persistence.*;

@Entity
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String email;

	@ManyToOne
	private Contato contato;
	
	public Email(String email, Contato contato) {
		this.email = email;
		this.contato = contato;
	}

	public Email() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Integer getId() {
		return id;
	}
}
