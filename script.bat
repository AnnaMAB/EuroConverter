@echo off
echo Stopping euro-converter
docker stop euro-converter
echo Deleting container euro-converter
docker rm euro-converter
echo Deleting image euro-converter
docker rmi euro-converter
echo Running mvn package
call mvn package
echo Creating image euro-converter
docker build -t euro-converter .
echo Creating and running container euro-converter
docker run -d -p 8082:8082 --name euro-converter --network services-network euro-converter
echo Done!