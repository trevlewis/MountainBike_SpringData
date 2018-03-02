# MountainBike_SpringData

Note: To build this project you need to exclude the tests (gradle clean build -x test). I did not use mocks so that I can show how to test with Sprign Boot Test.  
	
This is a demo with Spring Data JPA and Spring Data REST. 

You can start exploring the API with http://localhost:8080/models, since this API is full HATEOAS you should be able to find
all the info you need. 

```JSON
{
    "_embedded": {
        "models": [
            {
                "name": "Epic XTR Di2",
                "price": 10000,
                "forkBrand": "RockShox",
                "forkTravel": 110,
                "hasRearShock": true,
                "rearShockBrand": "RockShox",
                "rearShockTravel": 120,
                "tireSize": 29,
                "frameMaterial": "Carbon",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/models/1"
                    },
                    "model": {
                        "href": "http://localhost:8080/models/1"
                    },
                    "modelType": {
                        "href": "http://localhost:8080/models/1/modelType"
                    },
                    "manufacturer": {
                        "href": "http://localhost:8080/models/1/manufacturer"
                    }
                }
            },
            {
                "name": "Enduro",
                "price": 8500,
                "forkBrand": "Ohlins RXF",
                "forkTravel": 160,
                "hasRearShock": true,
                "rearShockBrand": "Ohlins STX",
                "rearShockTravel": 160,
                "tireSize": 27.5,
                "frameMaterial": "Carbon",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/models/2"
                    },
                    "model": {
                        "href": "http://localhost:8080/models/2"
                    },
                    "modelType": {
                        "href": "http://localhost:8080/models/2/modelType"
                    },
                    "manufacturer": {
                        "href": "http://localhost:8080/models/2/manufacturer"
                    }
                }
            },
            {
                "name": "Stumpjumper",
                "price": 2800,
                "forkBrand": "RockShox",
                "forkTravel": 150,
                "hasRearShock": true,
                "rearShockBrand": "RockShox",
                "rearShockTravel": 150,
                "tireSize": 29,
                "frameMaterial": "Alloy",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/models/3"
                    },
                    "model": {
                        "href": "http://localhost:8080/models/3"
                    },
                    "modelType": {
                        "href": "http://localhost:8080/models/3/modelType"
                    },
                    "manufacturer": {
                        "href": "http://localhost:8080/models/3/manufacturer"
                    }
                }
            },
            {
                "name": "Jeffsy",
                "price": 4999,
                "forkBrand": "Fox",
                "forkTravel": 140,
                "hasRearShock": true,
                "rearShockBrand": "Fox",
                "rearShockTravel": 140,
                "tireSize": 29,
                "frameMaterial": "Carbon",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/models/4"
                    },
                    "model": {
                        "href": "http://localhost:8080/models/4"
                    },
                    "modelType": {
                        "href": "http://localhost:8080/models/4/modelType"
                    },
                    "manufacturer": {
                        "href": "http://localhost:8080/models/4/manufacturer"
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/models{?page,size,sort}",
            "templated": true
        },
        "profile": {
            "href": "http://localhost:8080/profile/models"
        },
        "search": {
            "href": "http://localhost:8080/models/search"
        }
    },
    "page": {
        "size": 20,
        "totalElements": 18,
        "totalPages": 1,
        "number": 0
    }
}
```
