import java.util.Date;

public abstract class Document {
	private String title;
	private String author;
	private Date date;
	private PublishingLocation publishingLocation;
	
	public Document(String title, String author, Date date, String city, String state, String postCode) {
		this.title = title;
		this.author = author;
		this.date = date;
		this.publishingLocation = new PublishingLocation(city, state, postCode);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getCity() {
		return publishingLocation.getCity();
	}
	
	public String getState() {
		return publishingLocation.getState();
	}
	
	public String getPostCode() {
		return publishingLocation.getPostCode();
	}
	
	public boolean sameAuthor(Document document){
		return this.author.equals(document.getAuthor());
	}
	
	public int compareDates(Document document){
		return this.date.compareTo(document.getDate());
	}
	
	public int compareWithGeneralDate(Date date){
		return this.date.compareTo(date);
	}
}
