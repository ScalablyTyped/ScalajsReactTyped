organization := "org.scalablytyped.japgolly"
name := "backbone-fetch-cache"
version := "1.4-dt-20211223Z-2474f1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "backbone" % "1.4-dt-20220913Z-bdeb1c",
  "org.scalablytyped.japgolly" %%% "jquery" % "3.5-dt-20220624Z-e18178",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20211202Z-0d86ba",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "underscore" % "1.11-dt-20220722Z-16472a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
