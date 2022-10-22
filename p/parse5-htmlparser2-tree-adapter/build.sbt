organization := "org.scalablytyped.japgolly"
name := "parse5-htmlparser2-tree-adapter"
version := "7.0.0-fa9ca7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "domelementtype" % "2.3.0-05d680",
  "org.scalablytyped.japgolly" %%% "domhandler" % "5.0.3-0e13e3",
  "org.scalablytyped.japgolly" %%% "parse5" % "7.1.1-73c81c",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
