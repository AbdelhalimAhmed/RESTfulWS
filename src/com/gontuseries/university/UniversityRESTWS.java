package com.gontuseries.university;


import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/university")
public class UniversityRESTWS {
	@GET
	//@Path("{studentRollNo1}/{studentRollNo2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentsInfo1 (
//			@PathParam("studentRollNo1")String studentRollNo1,
//			@PathParam("studentRollNo2")String studentRollNo2)
			@QueryParam("studentRollNo1")String studentRollNo1,
			@QueryParam("studentRollNo2")String studentRollNo2)
				{
					return "you sent me two roll numbers using query parameters in the http url -->"
							+ studentRollNo1 + " and " + studentRollNo2;
				}


}


//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String getHTMLUniversityInfo(){
//		return "<html>" + "<title>" + "Abdelhalim's website" + "</title>"
//				+ "<body><h1>" + "Welcome to Abdelhalim's RESTful web Service :D " + "</body></h1>" +
//				"</html>";
//		
//	}
//	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getXMLUniversityInfo(){
//		return "Welcome to Abdelhalim's RESTful web Service :D ";
//		
//	}
//	
//	@PUT
//	@Path("{studentRollNo}")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String updateUniversityInfo (@PathParam("studentRollNo")String studentRollNo){
//		return "Done Successfully";
//	}

