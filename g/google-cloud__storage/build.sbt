organization := "org.scalablytyped.japgolly"
name := "google-cloud__storage"
version := "6.5.2-55d938"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "gaxios" % "5.0.2-8fc171",
  "org.scalablytyped.japgolly" %%% "google-auth-library" % "8.5.2-6e2860",
  "org.scalablytyped.japgolly" %%% "gtoken" % "6.1.2-8120f4",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "teeny-request" % "8.0.2-309216")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
