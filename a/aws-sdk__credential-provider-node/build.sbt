organization := "org.scalablytyped.japgolly"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-102cf3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-4d0270",
  "org.scalablytyped.japgolly" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-9ec413",
  "org.scalablytyped.japgolly" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-94b637",
  "org.scalablytyped.japgolly" %%% "aws-sdk__types" % "0.1.0-preview.1-c00b43",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
