organization := "org.scalablytyped.japgolly"
name := "react-instantsearch"
version := "6.10-dt-20220105Z-b1926c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "algolia__cache-common" % "4.14.2-90d397",
  "org.scalablytyped.japgolly" %%% "algolia__client-analytics" % "4.14.2-0887dd",
  "org.scalablytyped.japgolly" %%% "algolia__client-common" % "4.14.2-0196d2",
  "org.scalablytyped.japgolly" %%% "algolia__client-personalization" % "4.14.2-79b8bf",
  "org.scalablytyped.japgolly" %%% "algolia__client-search" % "4.14.2-e35c30",
  "org.scalablytyped.japgolly" %%% "algolia__events" % "4.0.1-5a2f0f",
  "org.scalablytyped.japgolly" %%% "algolia__logger-common" % "4.14.2-7f8f3e",
  "org.scalablytyped.japgolly" %%% "algolia__requester-common" % "4.14.2-ea28a9",
  "org.scalablytyped.japgolly" %%% "algolia__transporter" % "4.14.2-ba7ca3",
  "org.scalablytyped.japgolly" %%% "algoliasearch" % "4.14.2-73a8bc",
  "org.scalablytyped.japgolly" %%% "algoliasearch-helper" % "3.11.1-ad149f",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-instantsearch-core" % "6.26-dt-20220720Z-d2ce13",
  "org.scalablytyped.japgolly" %%% "react-instantsearch-dom" % "6.12-dt-20220426Z-5ed3a2",
  "org.scalablytyped.japgolly" %%% "react-instantsearch-native" % "6.3-dt-20211202Z-08749d",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
