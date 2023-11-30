FROM gitpod/workspace-full

RUN brew install sbt
# RUN cs install scala:2.12.2 && cs install scalac:2.12.2
# RUN sdk install scala 2.12.18
# RUN sdk install sbt

ENV TZ=Asia/Tokyo


