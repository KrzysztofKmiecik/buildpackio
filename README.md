# buildpack
https://buildpacks.io
1.
mvn spring-boot:build-image

to generuje image:
[INFO] Successfully built image 'docker.io/library/buildpackio:0.0.1-SNAPSHOT'

2.
uruchomienie contenera z image
❯ docker run -p 8080:8080 buildpackio:0.0.1-SNAPSHOT


http://localhost:8080/hello
