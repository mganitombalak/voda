FROM alpine
RUN apk update && apk add openjdk11 --repository=http://dl-cdn.alpinelinux.org/alpine/edge/community
#RUN mkdir vodafone
WORKDIR vodafone
COPY ./target/product-api.jar .
#ADD SOURCE(URL,RAR,TAR,ZIP) DESTINATION(.)
EXPOSE 80
ENTRYPOINT ["java","-jar","product-api.jar"]
#CMD ["java","-jar","product-api.jar"]
