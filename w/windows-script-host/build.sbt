organization := "org.scalablytyped.japgolly"
name := "windows-script-host"
version := "5.8-dt-20211202Z-a7b944"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "activex-interop" % "0.0-dt-20211202Z-74ff45",
  "org.scalablytyped.japgolly" %%% "activex-iwshruntimelibrary" % "0.0-dt-20220705Z-831426",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
