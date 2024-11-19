# Docker Setup with MySQL for Project

## 1. Pull MySQL Docker Image

To start, pull the latest version of the MySQL image from Docker Hub:

```bash
docker pull mysql:latest
2. Run MySQL Container
Once the image is downloaded, run the MySQL container with the following command:

bash
Copy code
docker run --name cdio4 -e MYSQL_ROOT_PASSWORD=123456 -d mysql
Explanation:
--name cdio4: This gives the container a name (cdio4) so you can easily reference it.
-e MYSQL_ROOT_PASSWORD=123456: Sets the root password for MySQL. Replace 123456 with your desired password.
-d mysql: Runs the container in detached mode using the mysql image.
This command starts the MySQL server inside the container.

3. Set Up Database
Step 1: Connect to MySQL via Database Management Tool
To interact with the MySQL database, you can use a database management tool such as:

MySQL Workbench
TablePlus
DBeaver
Any other DBMS of your choice
Step 2: Connect to the MySQL Server
Open your database management tool and use the following connection details:

Host: localhost or 127.0.0.1 (if running on your local machine)
Port: 3306 (default MySQL port)
Username: root (the default MySQL root user)
Password: 123456 (the password you set for the root user)
Step 3: Create the Database
After connecting successfully, create a new database by executing the following SQL command:

sql
Copy code
CREATE DATABASE cdio4;
This will create a new database called cdio4 where you can store your project data.
