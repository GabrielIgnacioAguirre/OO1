package io.github.unlp_oo.ejercicio1;

import io.github.unlp_oo.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	/**
	 * Complete con su implementación
	 */
	private String text;
	private int likes;
	private boolean isFeatured;
	
	public WallPostImpl() {
		this.text = "Undefined post";
		this.likes = 0;
		this.isFeatured = false;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	public int getLikes() {
		return this.likes;
	}
	
	public void like() {
		this.likes++;
	}
	
	public void dislike() {
		if (this.likes > 0) this.likes--;
	}
	
	public boolean isFeatured() {
		return this.isFeatured;
	}
	
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;
	}
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
