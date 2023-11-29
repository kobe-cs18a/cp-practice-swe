FROM gitpod/workspace-full

RUN brew install scala@2.12 sbt

ENV TZ=Asia/Tokyo


