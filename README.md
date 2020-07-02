## Pasos para instalar idesoft-service:

git clone https://github.com/ocardenasmartinez/idesoft-service

cd idesoft-service

mvn package

docker build -f Dockerfile -t idesoft-service .

docker run -p 8080:8080 idesoft-service

## Correr la aplicación

http://localhost:8080/?comuna=BUIN