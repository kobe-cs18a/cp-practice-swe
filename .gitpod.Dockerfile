FROM gitpod/workspace-full

RUN brew install scala@2.12
RUN brew install sbt
# RUN sdk install scala 2.12.18
# RUN sdk install sbt

ENV TZ=Asia/Tokyo


