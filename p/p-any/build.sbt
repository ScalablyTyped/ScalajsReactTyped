organization := "org.scalablytyped.japgolly"
name := "p-any"
version := "4.0.0-8052f7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "aggregate-error" % "4.0.1-bb28da",
  "org.scalablytyped.japgolly" %%% "p-cancelable" % "4.0.1-e2f285",
  "org.scalablytyped.japgolly" %%% "p-some" % "6.0.0-f1024e",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
