package com.buzzimonitor.desafio.core.model;

import java.io.Serializable;

public abstract class Model <E extends Serializable>{
	
	public abstract E getId();
	
	public abstract void setId(E id);
}
