organization := "org.scalablytyped.japgolly"
name := "workbox-sw"
version := "4.3-dt-20220624Z-3d85c7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "workbox-background-sync" % "4.3-dt-20211202Z-605edb",
  "org.scalablytyped.japgolly" %%% "workbox-broadcast-update" % "4.3-dt-20211202Z-cdcb90",
  "org.scalablytyped.japgolly" %%% "workbox-cacheable-response" % "4.3-dt-20211202Z-428d12",
  "org.scalablytyped.japgolly" %%% "workbox-core" % "4.3-dt-20211202Z-75b276",
  "org.scalablytyped.japgolly" %%% "workbox-expiration" % "4.3-dt-20211202Z-1b345c",
  "org.scalablytyped.japgolly" %%% "workbox-google-analytics" % "4.3-dt-20211202Z-9d919b",
  "org.scalablytyped.japgolly" %%% "workbox-precaching" % "4.3-dt-20211202Z-4fd4a4",
  "org.scalablytyped.japgolly" %%% "workbox-range-requests" % "4.3-dt-20211202Z-d1332f",
  "org.scalablytyped.japgolly" %%% "workbox-routing" % "4.3-dt-20211202Z-26d078",
  "org.scalablytyped.japgolly" %%% "workbox-strategies" % "4.3-dt-20211202Z-90781d",
  "org.scalablytyped.japgolly" %%% "workbox-streams" % "4.3-dt-20211202Z-285502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
