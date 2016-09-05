package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	private int id;
	@Column(name = "name")
	private String itsName;
	@Column(name = "author")
	private String itsAuthor;

	public Book() {

	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getItsName() {
		return itsName;
	}

	public final void setItsName(String itsName) {
		this.itsName = itsName;
	}

	public final String getItsAuthor() {
		return itsAuthor;
	}

	public final void setItsAuthor(String itsAuthor) {
		this.itsAuthor = itsAuthor;
	}
}
