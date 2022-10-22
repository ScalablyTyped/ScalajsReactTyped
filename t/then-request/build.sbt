organization := "org.scalablytyped.japgolly"
name := "then-request"
version := "6.0.2-b05d49"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "form-data" % "4.0.0-06ff2d",
  "org.scalablytyped.japgolly" %%% "http-basic" % "8.1.3-c6a584",
  "org.scalablytyped.japgolly" %%% "http-response-object" % "3.0.2-d928e8",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "promise" % "8.2.0-bd3702",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
