package de.buchbinder.duisburg.scopetest.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "requestBean")
@RequestScoped
public class RequestBean implements Serializable{

	private static final long serialVersionUID = 5854995562746151323L;
	
	private List<String> items;
	private String item;
	
	@PostConstruct
	private void init() {
		items = new ArrayList<>();
	}

	public void deleteContent() {
		items.clear();
	}
	
	public void addItem() {
		if (item != null && !item.isEmpty()) {
			items.add(item);
			item = null;
		}
	}
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public List<String> getItems() {
		return items;
	}
}
