
public class Buyer {
String id;
String cprice;
public Buyer(String id, String cprice) {
	super();
	this.id = id;
	this.cprice = cprice;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCprice() {
	return cprice;
}
public void setCprice(String cprice) {
	this.cprice = cprice;
}
@Override
public String toString() {
	return "Buyer [id=" + id + ", cprice=" + cprice + "]";
}


}
