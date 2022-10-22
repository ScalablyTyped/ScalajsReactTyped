organization := "org.scalablytyped.japgolly"
name := "react-intl-redux"
version := "v0.1.0-dt-20220818Z-cf8e57"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "formatjs__ecma402-abstract" % "1.13.0-24d87c",
  "org.scalablytyped.japgolly" %%% "formatjs__icu-messageformat-parser" % "2.1.10-c458c7",
  "org.scalablytyped.japgolly" %%% "formatjs__icu-skeleton-parser" % "1.3.14-a4a222",
  "org.scalablytyped.japgolly" %%% "formatjs__intl-listformat" % "7.1.3-ac6f7d",
  "org.scalablytyped.japgolly" %%% "intl-messageformat" % "10.2.1-2f6baf",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-intl" % "6.2.1-e4d735",
  "org.scalablytyped.japgolly" %%% "redux" % "4.2.0-cbc283",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
