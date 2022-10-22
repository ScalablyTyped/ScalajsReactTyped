organization := "org.scalablytyped.japgolly"
name := "update-notifier"
version := "6.0-dt-20220704Z-687250"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "boxen" % "7.0.0-51d6c6",
  "org.scalablytyped.japgolly" %%% "cli-boxes" % "3.0.0-5e8f1e",
  "org.scalablytyped.japgolly" %%% "configstore" % "6.0-dt-20220704Z-eb72a0",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "type-fest" % "3.1.0-643745")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
