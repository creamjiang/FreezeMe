/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package org.webofthings.freezeme.dao;

/**
 * 
 * Class to simulate the EVRYTHNG service when developing.
 * 
 * @author Aitor Gómez Goiri
 * 
 */
public class FakeFoodDAO extends AbstractFoodDAO {
	@Override
	public void load() {
		this.name = "Fish sticks";
		this.expiration = "3 days left";
		this.imageUrl = "http://fishingwithdaughters.com/wp-content/uploads/2010/07/fishsticks12342386433.gif";
		this.infoUrl = "http://www.google.es";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.webofthings.freezeme.dao.AbstractFoodDAO#addToFreezer()
	 */
	@Override
	public void addToFreezer() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.webofthings.freezeme.dao.AbstractFoodDAO#removeFromFreeezer()
	 */
	@Override
	public void removeFromFreeezer() {
		// TODO Auto-generated method stub

	}
}