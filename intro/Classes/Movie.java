package Classes;

import java.util.Collection;

public class Movie{
    private String title;
	private int year;
	private int episodeNumber;
	private float cost;
	private float recipe;
	private Collection<Actor> actors;

	public Movie(String title, int year, int episodeNumber, float cost, float recipe) {
		this.title = title;
		this.year = year;
		this.episodeNumber = episodeNumber;
		this.cost = cost;
		this.recipe = recipe;
	}

	public Movie(String title, int year, int episodeNumber, float cost, float recipe, Collection<Actor> actors) {
		this.title = title;
		this.year = year;
		this.episodeNumber = episodeNumber;
		this.cost = cost;
		this.recipe = recipe;
		this.actors = actors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEpisodeNumber() {
		return episodeNumber;
	}

	public void setEpisodeNumber(int episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getRecipe() {
		return recipe;
	}

	public void setRecipe(float recipe) {
		this.recipe = recipe;
	}

	public Collection<Actor> getActors() {
		return actors;
	}

	public void setActors(Collection<Actor> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"title='" + title + '\'' +
				", year=" + year +
				", episodeNumber=" + episodeNumber +
				", cost=" + cost +
				", recipe=" + recipe +
				", actors=" + actors +
				'}';
	}
}