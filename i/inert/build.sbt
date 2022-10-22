organization := "org.scalablytyped.japgolly"
name := "inert"
version := "5.1-dt-20211202Z-12d12d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "boom" % "7.3-dt-20220913Z-0e559c",
  "org.scalablytyped.japgolly" %%% "catbox" % "10.0-dt-20211202Z-6a25e4",
  "org.scalablytyped.japgolly" %%% "hapi" % "18.0-dt-20220819Z-30b26d",
  "org.scalablytyped.japgolly" %%% "iron" % "5.0-dt-20211202Z-2c641a",
  "org.scalablytyped.japgolly" %%% "joi" % "17.6.3-89f02e",
  "org.scalablytyped.japgolly" %%% "mime-db" % "1.43-dt-20211202Z-18cd1e",
  "org.scalablytyped.japgolly" %%% "mimos" % "3.0-dt-20211202Z-fdeaa7",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "podium" % "1.0-dt-20211202Z-9bf29f",
  "org.scalablytyped.japgolly" %%% "shot" % "4.0-dt-20211202Z-6f3780",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
