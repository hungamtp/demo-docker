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
