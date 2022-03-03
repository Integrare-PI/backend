package com.generation.backend.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagens")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo usuario é obrigatório!")
	@Size(min = 8, max = 100, message = "O atributo usuario deve conter entre 8 e 100 caracteres!")
	private String usuario;
	
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 8, max = 100, message = "O atributo nome deve conter entre 8 e 100 caracteres!")
	private String nome_completo;
	
	@NotBlank(message = "O atributo senha é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo senha deve conter entre 8 e 100 caracteres!")
	private String senha;
	
	@NotBlank(message = "O atributo tipo_usuario é obrigatório!")
	@Size( max = 255, message = "O atributo tipo_usuario deve conter até 255 caracteres!")
	private String tipo_usuario;
	
	@Size( max = 1000, message = "O atributo foto deve conter até 1000 caracteres!")
	private String foto;
		
	@OneToMany (mappedBy = "User", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("Tema")
	private List <Postagem> postagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
 }