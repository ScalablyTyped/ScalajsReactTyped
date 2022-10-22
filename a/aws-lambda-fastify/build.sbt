organization := "org.scalablytyped.japgolly"
name := "aws-lambda-fastify"
version := "1.4-dt-20211202Z-dc8a55"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ajv" % "8.11.0-e04284",
  "org.scalablytyped.japgolly" %%% "aws-lambda" % "8.10-dt-20221012Z-e2b4dc",
  "org.scalablytyped.japgolly" %%% "buffer" % "6.0.3-40f891",
  "org.scalablytyped.japgolly" %%% "fast-json-stringify" % "5.3.0-d9ecbd",
  "org.scalablytyped.japgolly" %%% "fastify" % "4.9.0-19d267",
  "org.scalablytyped.japgolly" %%% "fastify__ajv-compiler" % "3.3.1-0b5db6",
  "org.scalablytyped.japgolly" %%% "fastify__error" % "3.0.0-8f065f",
  "org.scalablytyped.japgolly" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-220b72",
  "org.scalablytyped.japgolly" %%% "find-my-way" % "7.3.1-8f45c2",
  "org.scalablytyped.japgolly" %%% "light-my-request" % "5.6.1-89e0cc",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "pino" % "8.6.1-61c2d1",
  "org.scalablytyped.japgolly" %%% "pino-pretty" % "4.7-dt-20220624Z-ef32bb",
  "org.scalablytyped.japgolly" %%% "pino-std-serializers" % "6.0.0-dc906e",
  "org.scalablytyped.japgolly" %%% "re2" % "1.17.7-1eb746",
  "org.scalablytyped.japgolly" %%% "sonic-boom" % "3.2.0-670545",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "uri-js" % "4.4.1-ea7df5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
