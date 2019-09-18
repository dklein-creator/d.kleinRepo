package de.buchbinder.duisburg.scopetest.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.buchbinder.duisburg.webbasics.database.DataSetCollectionBeanBase;

@ManagedBean(name= "applicationBean" )
@ApplicationScoped
public class ApplicationBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<String> items;
	  private String item;
	  
	  @PostConstruct
	  public void init() {
	    items = new ArrayList<>();
	    double rnd = Math.random();
	    items.add(String.valueOf(rnd));
	    rnd = Math.random();
	    items.add(String.valueOf(rnd));
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
