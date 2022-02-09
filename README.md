# liv2train_java_assignment API information


TASK 1: **CREATE TUITION CENTERS**

  **POST Request**: 
  **URL**: http://localhost:8080/tuition_center/create
  
  **Request Body**:
 	
	{
	    "centerName": "Verma Institute",
		"centerCode": "IPAKMILDVERM",
		"address": {
		"detailedAddress": "Bahwanpura colony near sai baba mandir maharashtra",
		    "city":"Pune",
		    "state": "Maharashtra",
		    "pincode": "180004"
	    },
		"studentCapacity": 100,
		"coursesOffered": [
		"PCM", "COMMERCE", "Biology", "Zoology"
	    ],
		"contactEmail": "vermatit@yahoo.com",
		"contactPhone": "1912456517"
	}
  
  **Server Response**:
  
    {
    "statusCode": 200,
    "message": "Tuition center created successfully",
    "data": {
        "trainingCenterId": 1,
        "centerName": "Verma Institute",
        "centerCode": "IPAKMILDVERM",
        "address": {
            "detailedAddress": "Bahwanpura colony near sai baba mandir maharashtra",
            "city": "Pune",
            "state": "Maharashtra",
            "pincode": "180004"
        },
        "studentCapacity": 100,
        "coursesOffered": [
            "PCM",
            "COMMERCE",
            "Biology",
            "Zoology"
        ],
        "createdOn": 1644389307972,
        "contactEmail": "vermatit@yahoo.com",
        "contactPhone": "1912456517"
    },
    "success": true
    }
    
    **If any validation error occur**
    
    **Request Body**:
    	{
	    "centerName": "Argade Institute of Science",
		"centerCode": "123", // LENGTH < 12
		"address": {
		"detailedAddress": "Bahwanpura colony near sai baba mandir maharashtra",
		    "city":"Pune",
		    "state": "Maharashtra",
		    "pincode": "180004"
	    },
		"studentCapacity": 100,
		"coursesOffered": [
		"PCM"
	    ],
		"contactEmail": "vipalymgmail.com", // INVALID EMAIL
		"contactPhone": "101202303311" // Invalid Phone
	}
	
	**SERVER Response**
	
		{
		    "statusCode": 409,
		    "message": "Error(s) occured.",
		    "data": [
			"Center code should be exactly 12 characters",
			"Provide a valid phone number",
			"Email should be valid"
		    ],
		    "success": false
		}
    
    
 TASK 2: **FETCH ALL CENTERS**
 
 **GET Request**
 **URL**: http://localhost:8080/tuition_center/find_all
 
 **SERVER Response**:
 
	 {
	    "statusCode": 200,
	    "message": "2 center(s) found",
	    "data": [
		{
		    "trainingCenterId": 1,
		    "centerName": "Verma Institute",
		    "centerCode": "IPAKMILDVERM",
		    "address": {
			"detailedAddress": "Bahwanpura colony near sai baba mandir maharashtra",
			"city": "Pune",
			"state": "Maharashtra",
			"pincode": "180004"
		    },
		    "studentCapacity": 100,
		    "coursesOffered": [
			"PCM",
			"COMMERCE",
			"Biology",
			"Zoology"
		    ],
		    "createdOn": 1644390862518,
		    "contactEmail": "vermatit@yahoo.com",
		    "contactPhone": "1912456517"
		},
		{
		    "trainingCenterId": 2,
		    "centerName": "Argade Institute of Science",
		    "centerCode": "VIPALKAPALMA",
		    "address": {
			"detailedAddress": "Bahwanpura colony near sai baba mandir maharashtra",
			"city": "Pune",
			"state": "Maharashtra",
			"pincode": "180004"
		    },
		    "studentCapacity": 100,
		    "coursesOffered": [
			"PCM"
		    ],
		    "createdOn": 1644390878951,
		    "contactEmail": "vipalym@gmail.com",
		    "contactPhone": "1012023033"
		}
	    ],
	    "success": true
	}

**IF NO Data exist**
	
	**SERVER Response**
		{
		    "statusCode": 404,
		    "message": "No data exist.",
		    "data": null,
		    "success": true
		}
