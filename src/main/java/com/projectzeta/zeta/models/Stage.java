package com.projectzeta.zeta.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Stage {

	
	private Long idStage;
	
	private String text;
	
	private String mapName;
	
	private String flat;
	
	private List<Options> options;
	
	private Boolean finalStage;
	
	private Long restModifier;
	
	public Stage() {
		
	}


	public Stage(Long idStage, String text, String mapName, String flat) {
		super();
		this.idStage = idStage;
		this.text = text;
		this.mapName = mapName;
		this.flat = flat;
	}


	public Long getIdStage() {
		return idStage;
	}


	public void setIdStage(Long idStage) {
		this.idStage = idStage;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getMapName() {
		return mapName;
	}


	public void setMapName(String mapName) {
		this.mapName = mapName;
	}


	public String getFlat() {
		return flat;
	}


	public void setFlat(String flat) {
		this.flat = flat;
	}


	public List<Options> getOptions() {
		return options;
	}


	public void setOptions(List<Options> options) {
		this.options = options;
	}


	public Boolean getFinalStage() {
		return finalStage;
	}


	public void setFinalStage(Boolean finalStage) {
		this.finalStage = finalStage;
	}


	public Long getRestModifier() {
		return restModifier;
	}


	public void setRestModifier(Long restModifier) {
		this.restModifier = restModifier;
	}
	
	
}
