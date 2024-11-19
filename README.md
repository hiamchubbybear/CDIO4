# MySQL Docker Setup Guide

This guide provides instructions for setting up a MySQL database using Docker for development purposes.

## Prerequisites

Before you begin, make sure you have:
- Docker installed on your system
- Basic knowledge of Docker commands
- A database management tool (MySQL Workbench, TablePlus, or DBeaver)

## Quick Start

### 1. Pull MySQL Image
```bash
docker pull mysql:latest
```

### 2. Run MySQL Container
```bash
docker run --name cdio4 -e MYSQL_ROOT_PASSWORD=123456 -d mysql
```

### 3. Database Connection Details
- **Host**: localhost or 127.0.0.1
- **Port**: 3306
- **Username**: root
- **Password**: 123456
- **Database**: cdio4

## Detailed Setup Instructions

### Creating the Database
Connect to MySQL and create your database:
```sql
CREATE DATABASE cdio4;
```

### Container Management Commands
```bash
# View running containers
docker ps

# Start container
docker start cdio4

# Stop container
docker stop cdio4

# Remove container
docker rm cdio4

# View logs
docker logs cdio4
```

## Database Operations

### Accessing MySQL Shell
```bash
docker exec -it cdio4 mysql -u root -p
```

### Backup and Restore
```bash
# Create backup
docker exec cdio4 mysqldump -u root -p123456 cdio4 > backup.sql

# Restore from backup
docker exec -i cdio4 mysql -u root -p123456 cdio4 < backup.sql
```

## Troubleshooting

### Common Issues and Solutions

1. **Cannot connect to database**
   - Verify container is running using `docker ps`
   - Check logs with `docker logs cdio4`
   - Ensure port 3306 is not in use

2. **Container won't start**
   - Check if port 3306 is already in use
   - Verify Docker service is running
   - Check system resources

## Security Notes

- Change the default password (123456) in production environments
- Avoid exposing the MySQL port publicly
- Regular backup your database
- Keep Docker and MySQL images updated

## Contributing

Feel free to submit issues and enhancement requests.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
