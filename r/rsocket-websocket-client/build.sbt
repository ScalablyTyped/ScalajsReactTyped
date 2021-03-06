organization := "org.scalablytyped.japgolly"
name := "rsocket-websocket-client"
version := "0.0-dt-20191126Z-b7470f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "rsocket-core" % "0.0-dt-20200218Z-a22aa5",
  "org.scalablytyped.japgolly" %%% "rsocket-flowable" % "0.0-dt-20200226Z-7cd7f6",
  "org.scalablytyped.japgolly" %%% "rsocket-types" % "0.0-dt-20200225Z-d25ba6",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
