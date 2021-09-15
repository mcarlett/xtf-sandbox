FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift:latest
ENV CONFIG_MASTER_URL=""
ENV OPENSHIFT_URL=""
ENV OPENSHIFT_ADMIN_USERNAME=""
ENV OPENSHIFT_ADMIN_PASSWORD=""
ENV OPENSHIFT_VERSION=""
ADD target/xtf-sandbox-jar-with-dependencies.jar /deployments/
