package Classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class Movie{
    private String title;
	private int year;
	private int episodeNumber;
	private float cost;
	private float recipe;
	private ArrayList<Actor> actors;

	public Movie(){
		this.title = "";
		this.actors = new ArrayList<Actor>();
	}

	public Movie(String title, int year, int episodeNumber, float cost, float recipe) {
		this.title = title;
		this.year = year;
		this.episodeNumber = episodeNumber;
		this.cost = cost;
		this.recipe = recipe;
	}

	public Movie(String title, int year, int episodeNumber, float cost, float recipe, ArrayList<Actor> actors) {
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

	public ArrayList<Actor> getActors() {
		return actors;
	}

	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}

	public int nbActors(){
		return this.actors.size();
	}

	public int nbCharacters(){
		AtomicInteger total = new AtomicInteger();
		this.actors.forEach((actor) -> {
			total.addAndGet(actor.nbCharacters());
		});
		return total.get();
	}

	public float getBenefits(){
		return this.recipe - this.cost;
	}

	public boolean isBefore(int year){
		return (this.year < year);
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

	public void sortActors(){
		this.actors.sort(Comparator.comparing(Actor::getLastName));
	}
}