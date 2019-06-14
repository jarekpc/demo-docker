Aplikacja testowa do deploy openshift:
mvn clean fabric8:build
mvn clean fabric8:deploy -Popenshift

docker-compose -f keycloak-postgres.yml up
