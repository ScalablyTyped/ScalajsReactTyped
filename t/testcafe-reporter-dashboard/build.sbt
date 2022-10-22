organization := "org.scalablytyped.japgolly"
name := "testcafe-reporter-dashboard"
version := "0.2.7-rc.1-9d986f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "fp-ts" % "2.13.0-335e54",
  "org.scalablytyped.japgolly" %%% "io-ts" % "2.2.19-f50344",
  "org.scalablytyped.japgolly" %%% "io-ts-types" % "0.5.17-53753e",
  "org.scalablytyped.japgolly" %%% "monocle-ts" % "2.3.13-270921",
  "org.scalablytyped.japgolly" %%% "newtype-ts" % "0.3.5-c4acf7",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
