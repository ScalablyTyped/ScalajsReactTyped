organization := "org.scalablytyped.japgolly"
name := "ecmarkup"
version := "15.0.0-85df5c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "command-line-usage" % "5.0-dt-20211202Z-923cd7",
  "org.scalablytyped.japgolly" %%% "ecmarkdown" % "7.2.0-dfdcf8",
  "org.scalablytyped.japgolly" %%% "esfx__async-canceltoken" % "1.0.0-pre.41-8f94e2",
  "org.scalablytyped.japgolly" %%% "esfx__cancelable" % "1.0.0-pre.41-f2d352",
  "org.scalablytyped.japgolly" %%% "esfx__canceltoken" % "1.0.0-pre.41-cd855a",
  "org.scalablytyped.japgolly" %%% "esfx__disposable" % "1.0.0-pre.41-6e280c",
  "org.scalablytyped.japgolly" %%% "grammarkdown" % "3.2.0-19eb5c",
  "org.scalablytyped.japgolly" %%% "prex" % "0.4.9-85e2e4",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
