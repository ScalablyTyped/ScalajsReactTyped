organization := "org.scalablytyped.japgolly"
name := "sc-broker"
version := "8.0-dt-20200205Z-df1f5b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "expirymanager" % "0.9-dt-20181130Z-4135d4",
  "org.scalablytyped.japgolly" %%% "fleximap" % "0.9-dt-20181205Z-dcc977",
  "org.scalablytyped.japgolly" %%% "ncom" % "1.0-dt-20200205Z-0f8a26",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
