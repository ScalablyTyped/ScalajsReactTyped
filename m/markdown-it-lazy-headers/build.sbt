organization := "org.scalablytyped.japgolly"
name := "markdown-it-lazy-headers"
version := "0.13-dt-20211202Z-68b0ef"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "linkify-it" % "3.0.2-dt-20220818Z-eb0768",
  "org.scalablytyped.japgolly" %%% "markdown-it" % "12.2-dt-20211202Z-af1150",
  "org.scalablytyped.japgolly" %%% "mdurl" % "1.0-dt-20211202Z-bb43fa",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
