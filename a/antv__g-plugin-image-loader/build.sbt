organization := "org.scalablytyped.japgolly"
name := "antv__g-plugin-image-loader"
version := "1.1.18-a100b4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "antv__g-lite" % "1.0.6-a57edd",
  "org.scalablytyped.japgolly" %%% "antv__util" % "3.3.0-6bcbe7",
  "org.scalablytyped.japgolly" %%% "eventemitter3" % "4.0.7-a15150",
  "org.scalablytyped.japgolly" %%% "gl-matrix" % "3.4.3-a577e0",
  "org.scalablytyped.japgolly" %%% "inversify" % "6.0.1-a9a274",
  "org.scalablytyped.japgolly" %%% "mana-syringe" % "0.3.2-96c9ed",
  "org.scalablytyped.japgolly" %%% "offscreencanvas" % "2019.7-dt-20220526Z-509f29",
  "org.scalablytyped.japgolly" %%% "rbush" % "3.0-dt-20220819Z-e26bd2",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
