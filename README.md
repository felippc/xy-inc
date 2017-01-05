# xy-inc presents our Point Of Interest (POI) Application

Now you can find a list of interesting places around you anywhere.

# Services

Go to "http://localhost:8080/poi/point" to get a list of all Points we have in our domain.

If you want to save your own point, just submit a POST to "localhost:8080/poi/point" with your desired data in the body of your request. Functional Example:

{
    "x": 22,
    "y": 20,
    "name": "My House"
}

Finally, if you want to find good places in a max distance between your current position, just call the service:
"http://localhost:8080/poi/point/distance/{X}/{Y}/{maxDistance}".

Example:

http://localhost:8080/poi/point/distance/20/10/10

# Runing application at your own server

All you need to do is get the code and run the command line "mvn clean spring-boot:run" to get our POI running at hour own server.

OBS1: Please, make sure you have a MySql server running with grants to user "admin", with pass "admin" (check our application.properties file on "scr/main/resources") .

OBS2: You also need to run our file "points.sql", found inside the directory "scripts" in your MySql server in order to prepare your database.
