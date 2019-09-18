package de.buchbinder.duisburg.scopetest.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "viewBean")
@ViewScoped
public class ViewBean implements Serializable {

	private static final long serialVersionUID = 2L;

	private List<String> items;
	private String item;
	
	
	@PostConstruct
	private void init() {
		items = new ArrayList<>();
		
	}
	
	public void addItem() {
		if (item != null && !item.isEmpty()) {
			items.add(item);
			item = null;
		}
	}
	
	public void deleteContent() {
		items.clear();
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
