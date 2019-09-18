package de.buchbinder.duisburg.scopetest.beans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.buchbinder.duisburg.webbasics.database.DataSetCollectionBeanBase;

@ManagedBean(name= "sessionBean" )
@SessionScoped
public class SessionBean implements Serializable {

	private static final long serialVersionUID = 1L;

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
