organization := "org.scalablytyped.japgolly"
name := "selderee__plugin-htmlparser2"
version := "0.9.0-15a674"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "domelementtype" % "2.3.0-05d680",
  "org.scalablytyped.japgolly" %%% "domhandler" % "5.0.3-0e13e3",
  "org.scalablytyped.japgolly" %%% "selderee" % "0.9.0-c6c234",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
