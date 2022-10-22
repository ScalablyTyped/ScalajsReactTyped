organization := "org.scalablytyped.japgolly"
name := "parcel__plugin"
version := "2.7.0-57265c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "parcel__diagnostic" % "2.7.0-950d7d",
  "org.scalablytyped.japgolly" %%% "parcel__package-manager" % "2.7.0-88adf2",
  "org.scalablytyped.japgolly" %%% "parcel__source-map" % "2.1.1-71c3f4",
  "org.scalablytyped.japgolly" %%% "parcel__types" % "2.7.0-87ea65",
  "org.scalablytyped.japgolly" %%% "parcel__workers" % "2.7.0-87267e",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
