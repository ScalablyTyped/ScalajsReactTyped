organization := "org.scalablytyped.japgolly"
name := "wordpress__plugins"
version := "3.0-dt-20211202Z-debb06"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "downshift" % "6.1.12-a03b62",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "re-resizable" % "6.9.9-43c720",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-dom" % "18.0-dt-20220819Z-74fd4f",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tinycolor2" % "1.4-dt-20211202Z-3b6197",
  "org.scalablytyped.japgolly" %%% "wordpress__components" % "19.10-dt-20220829Z-58f5b4",
  "org.scalablytyped.japgolly" %%% "wordpress__element" % "4.17.0-23bcc1",
  "org.scalablytyped.japgolly" %%% "wordpress__notices" % "3.5-dt-20220601Z-9afccb",
  "org.scalablytyped.japgolly" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-7f92e7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
