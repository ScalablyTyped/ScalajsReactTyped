organization := "org.scalablytyped.japgolly"
name := "remark-gfm"
version := "3.0.1-3fe367"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "markdown-table" % "3.0.2-0da2b6",
  "org.scalablytyped.japgolly" %%% "mdast" % "3.0-dt-20211202Z-a36ed9",
  "org.scalablytyped.japgolly" %%% "mdast-util-from-markdown" % "1.2.0-e91c03",
  "org.scalablytyped.japgolly" %%% "mdast-util-gfm-table" % "1.0.6-7e50a2",
  "org.scalablytyped.japgolly" %%% "mdast-util-to-markdown" % "1.3.0-5dccd7",
  "org.scalablytyped.japgolly" %%% "micromark-extension-gfm-strikethrough" % "1.0.4-78f579",
  "org.scalablytyped.japgolly" %%% "micromark-util-types" % "1.0.2-3b0bd5",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "unified" % "10.1.2-05acd2",
  "org.scalablytyped.japgolly" %%% "unist" % "2.0-dt-20220624Z-db00de",
  "org.scalablytyped.japgolly" %%% "vfile" % "5.3.5-a9a4b9",
  "org.scalablytyped.japgolly" %%% "vfile-message" % "3.1.2-85db16")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
