organization := "org.scalablytyped.japgolly"
name := "prosemirror-gapcursor"
version := "1.0-dt-20220624Z-7a2d18"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "orderedmap" % "2.0.0-7669b5",
  "org.scalablytyped.japgolly" %%% "prosemirror-model" % "1.18.1-409be1",
  "org.scalablytyped.japgolly" %%% "prosemirror-state" % "1.4.1-c48276",
  "org.scalablytyped.japgolly" %%% "prosemirror-transform" % "1.7.0-717c6f",
  "org.scalablytyped.japgolly" %%% "prosemirror-view" % "1.28.0-3a4ec3",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
