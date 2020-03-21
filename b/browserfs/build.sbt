organization := "org.scalablytyped.japgolly"
name := "browserfs"
version := "1.4.3-3396b6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "dropboxjs" % "0.0-unknown-dt-20200226Z-790c01",
  "org.scalablytyped.japgolly" %%% "filesystem" % "0.0-unknown-dt-20200225Z-0f8483",
  "org.scalablytyped.japgolly" %%% "filewriter" % "0.0-unknown-dt-20200226Z-cf4459",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
