Aplikacja testowa do deploy openshift:
mvn docker-compose:up

i otworzyc strone:
http://localhost:8080/auth/

gdy chcemy zamknac docker-compose

mvn docker-compose:down

http://localhost:8080/auth/admin/master/console/

#mvn clean fabric8:build
mvn clean fabric8:deploy -Popenshift

docker-compose -f keycloak-postgres.yml up

add https://hub.docker.com/r/jboss/keycloak

