package org.webofthings.freezeme.dao;

public abstract class AbstractFoodDAO {
	String name = "";
	String expiration = "";
	String imageUrl = "";
	String infoUrl = "";

	/**
	 * This loads the data related to a food item.
	 */
	public abstract void load();

	/**
	 * This adds a food item to the freezer (i.e., schedules the alert)
	 */
	public abstract void addToFreezer();

	/**
	 * This removes a food item from the freezer (i.e., removes all scheduled
	 * alerts)
	 */
	public abstract void removeFromFreeezer();

	public String getName() {
		return name;
	}

	public String getExpiration() {
		return expiration;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getInfoUrl() {
		return infoUrl;
	}
}
