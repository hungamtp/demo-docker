cmd
#docker images
list all images
#docker ps
list all container is runnig

#docker ps -a 
list all container 

#docker rm (containerId)
remove container

#docker rmi 
remove image + -f (force to delete)

#docker build -t (name) .
build to image

#docker run -d(run in background) --name=(name) -p (dockerPort):(internalPort) (imageName)
run the app in background 
and want to see the log (docker logs 'containerId')

#docker -f logs (containerId)
view the log
-f : tailing the log

#CMD vs ENTRYPOINT

docker run ubuntu-sleeper sleep 10
with cmd CMD["sleep","10"]
docker run ubuntu-sleeper
with entrypoint ENTRYPOINT["sleep"]
docker run ubuntu-sleeper 10

#docker container stop

docker exec -it postgres_container psql -U posgres

docker-compose -f docker-compose.build.yml build build(service name)

docker-compose up -d (service-name)
What is containers ?



docker run -p[port call port --> container port] -d
docker rm  : remove container
docker rm -f(force) $(docker ps -aq) : remove all container
docker rm -f $(docker ps -aq)
Naming container

docker run --name [name] -p[port call port --> container port] -d

Binding the index to web sever

docker run --name website -v $(pwd):/usr/share/nginx/html:ro -d -p 8080:80 nginx

Go inside the container
docker exec -it website bash

cmd #docker images list all images #docker ps list all container is runnig
#docker ps -a list all container
#docker rm (containerId) remove container
#docker rmi remove image + -f (force to delete)
#docker build -t (name) . build to image
#docker run -d(run in background) --name=(name) -p (dockerPort):(internalPort) (imageName) run the app in background and want to see the log (docker logs 'containerId')
#docker -f logs (containerId) view the log -f : tailing the log
#CMD vs ENTRYPOINT
docker run ubuntu-sleeper sleep 10 with cmd CMD["sleep","10"] docker run ubuntu-sleeper with entrypoint ENTRYPOINT["sleep"] docker run ubuntu-sleeper 10
#docker container stop

docker exec -it postgres_container psql -U posgres
