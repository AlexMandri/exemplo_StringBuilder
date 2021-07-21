package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private int like;
	
	List<Comment> comment = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date moment, String title, String content, int like) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.like = like;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public List<Comment> getComment() {
		return comment;
	}
	
	public void addComment(Comment comment) {
		this.comment.add(comment);
	}
	public void removeComment(Comment comment) {
		this.comment.remove(comment);
	}
}
