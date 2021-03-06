organization := "org.scalablytyped.japgolly"
name := "aws-sdk__region-provider"
version := "0.1.0-preview.1-f8eb07"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-94b637",
  "org.scalablytyped.japgolly" %%% "aws-sdk__types" % "0.1.0-preview.1-c00b43",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
