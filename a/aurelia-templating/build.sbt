organization := "org.scalablytyped.japgolly"
name := "aurelia-templating"
version := "1.11.1-9f8c24"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "aurelia-binding" % "2.5.4-b592b3",
  "org.scalablytyped.japgolly" %%% "aurelia-dependency-injection" % "1.5.2-425b91",
  "org.scalablytyped.japgolly" %%% "aurelia-loader" % "1.0.2-58b2e4",
  "org.scalablytyped.japgolly" %%% "aurelia-metadata" % "1.0.7-4817f4",
  "org.scalablytyped.japgolly" %%% "aurelia-task-queue" % "1.3.3-5f33a6",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
