package com.Saas.DevTracker.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "Vagas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vagas{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int cd_id;
//posso apenas mudar o nome de cada coluna dentro do @Column e deixar os nomes normais no codigo.
@Column(name = "ds_titulo")
private String Titulo;
@Column(name = "nm_empresa")
private String empresa;
@Column(name = "ds_regiao")
private String Regiao;
@Column(name = "dt_dataPublicacao")
private LocalDate dataPublicacao;
@Column(name = "ds_nivel")
private String nivel;
@Column(name = "ds_formatoVaga")
private String formatoVaga;
}