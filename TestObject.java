package qcjson;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;


@SuppressWarnings("serial")
public class TestObject implements Serializable {
	private String myString;
	private int integer;
	private Date date;
	
	public TestObject(String aString, int anInt, Date aDate) {
		myString = aString;
		integer = anInt;
		date = aDate;
	}
	
	public TestObject(HashMap aMapRepresentation){
		this.myString = (String)aMapRepresentation.get("String");
		String stampString = (String)aMapRepresentation.get("Date");
		this.date = new Date(Timestamp.valueOf(stampString).getTime());
		Long asLong = (Long)aMapRepresentation.get("Int");
		this.integer = asLong.intValue();
		
	}

	@Override
	public boolean equals(Object obj)
	{ 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestObject other = (TestObject) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
		{
			System.out.println("Failed: "+ date +" "+other.date);
			return false;
		}
		if (integer != other.integer)
			return false;
		if (myString == null) 
		{
			if (other.myString != null)
				return false;
		} else if (!myString.equals(other.myString))
			return false;
		return true;
	}

}