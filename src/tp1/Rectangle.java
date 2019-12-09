package tp1;
import java.util.UUID;

public class Rectangle {
	private UUID id = UUID.randomUUID();
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public String toString() {
		String id = String.valueOf(this.id);
		String width = String.valueOf(this.width);
		String length = String.valueOf(this.length);
		return String.format("%s : Width : %s, Length :%s",id,width,length);
	}
}
