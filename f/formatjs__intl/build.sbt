organization := "org.scalablytyped.japgolly"
name := "formatjs__intl"
version := "2.5.1-4dbf8b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "formatjs__ecma402-abstract" % "1.13.0-24d87c",
  "org.scalablytyped.japgolly" %%% "formatjs__icu-messageformat-parser" % "2.1.10-c458c7",
  "org.scalablytyped.japgolly" %%% "formatjs__icu-skeleton-parser" % "1.3.14-a4a222",
  "org.scalablytyped.japgolly" %%% "formatjs__intl-displaynames" % "6.1.4-5dfac5",
  "org.scalablytyped.japgolly" %%% "formatjs__intl-listformat" % "7.1.3-ac6f7d",
  "org.scalablytyped.japgolly" %%% "intl-messageformat" % "10.2.1-2f6baf",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
