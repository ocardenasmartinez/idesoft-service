## Pasos para correr idesoft-service:

git clone https://github.com/ocardenasmartinez/idesoft-service

cd idesoft-service

mvn package

docker build -f Dockerfile -t idesoft-service .

docker run -p 8080:8080 idesoft-service