/*
 * Oreka -- A media capture and retrieval platform
 * 
 * Copyright (C) 2005, orecx LLC
 *
 * http://www.orecx.com
 *
 * This program is free software, distributed under the terms of
 * the GNU General Public License.
 * Please refer to http://www.gnu.org/copyleft/gpl.html
 *
 */

/**
 * 
 */
package net.sf.oreka.persistent;

import javax.persistence.Entity;
import javax.persistence.GeneratorType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @hibernate.class
 */
@Entity
public class LoginString {

	private int id;
	private String loginString;
	private User user;
	private Domain domain;
	
	/**
	 * @hibernate.many-to-one
	 * @return Returns the domain.
	 */
	@ManyToOne
	public Domain getDomain() {
		return domain;
	}
	

	/**
	 * @param domain The domain to set.
	 */
	public void setDomain(Domain domain) {
		this.domain = domain;
	}
	

	/**
	 * @hibernate.id
	 * generator-class="native"
	 * @return Returns the id.
	 */
	@Id(generate=GeneratorType.AUTO)
	public int getId() {
		return id;
	}
	

	/**
	 * @param id The id to set.
	 */
	public void setId(int id) {
		this.id = id;
	}
	

	/**
	 * @hibernate.property
	 * not-null="true"
	 * @return Returns the loginString.
	 */
	public String getLoginString() {
		return loginString;
	}
	

	/**
	 * @param loginString The loginString to set.
	 */
	public void setLoginString(String loginString) {
		this.loginString = loginString;
	}
	

	/**
	 * @hibernate.many-to-one
	 * @return Returns the user.
	 */
	@ManyToOne
	public User getUser() {
		return user;
	}
	

	/**
	 * @param user The user to set.
	 */
	public void setUser(User user) {
		this.user = user;
	}
	

	/**
	 * 
	 */
	public LoginString() {
	}

}