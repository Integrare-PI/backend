package com.generation.backend.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo assunto é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo assunto deve conter entre 5 e 100 caracteres!")
	private String assunto;

	@NotBlank(message = "O atributo texto é obrigatório!")
	@Size(max = 1000, message = "O atributo texto deve conter até 1000 caracteres!")
	private String texto_descricao;

	@Size(max = 1000, message = "O atributo anexo deve conter até 1000 caracteres!")
	private String anexo;
	
	//add 13.04
	@Size(max = 1000, message = "O atributo anexo deve conter até 1000 caracteres!")
	private String video;
	
	//add 13.04
	@Size(max = 1000, message = "O atributo anexo deve conter até 1000 caracteres!")
	private String resposta;

	//add 13.04
	@Column(columnDefinition = "integer default 0")
	private int curtidas;
	
	@UpdateTimestamp
	private LocalDateTime data;

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;

	//inclusao get and set
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTexto_descricao() {
		return texto_descricao;
	}

	public void setTexto_descricao(String texto_descricao) {
		this.texto_descricao = texto_descricao;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	
	
}