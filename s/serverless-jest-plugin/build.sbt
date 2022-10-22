organization := "org.scalablytyped.japgolly"
name := "serverless-jest-plugin"
version := "0.3-dt-20211202Z-271e95"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "aws-lambda" % "8.10-dt-20221012Z-e2b4dc",
  "org.scalablytyped.japgolly" %%% "lambda-wrapper" % "0.3-dt-20211202Z-a88cd4",
  "org.scalablytyped.japgolly" %%% "serverless" % "3.12-dt-20220806Z-733e36",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
