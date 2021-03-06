organization := "org.scalablytyped.japgolly"
name := "gcs-resumable-upload"
version := "2.3.0-06753a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "configstore" % "4.0-dt-20181202Z-445742",
  "org.scalablytyped.japgolly" %%% "duplexify" % "3.6-dt-20181030Z-535c60",
  "org.scalablytyped.japgolly" %%% "gaxios" % "2.0.1-648100",
  "org.scalablytyped.japgolly" %%% "google-auth-library" % "5.3.0-9fd834",
  "org.scalablytyped.japgolly" %%% "gtoken" % "4.1.0-15e640",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "pumpify" % "1.4-dt-20181017Z-42ee13",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
