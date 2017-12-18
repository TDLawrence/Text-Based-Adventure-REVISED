
public class Ruler extends Person {
	private String title;
 public Ruler(String title,String firstName,String familyName,int xLoc,int yLoc)
 {super(firstName,familyName,xLoc,yLoc);
	 this.title=title;
 }
 
 public String getTitle()
 {
	 return this.title;
 }
 
 
}
