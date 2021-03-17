FROM alpine
RUN apk update && apk add openjdk11 --repository=http://dl-cdn.alpinelinux.org/alpine/edge/community
#RUN mkdir vodafone
WORKDIR vodafone
COPY ./target/product-api.jar .
EXPOSE 80
CMD ["java","-jar","product-api.jar"]
