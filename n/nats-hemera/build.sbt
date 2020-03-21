organization := "org.scalablytyped.japgolly"
name := "nats-hemera"
version := "7.0.2-465f4b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "pino" % "5.15-dt-20200206Z-8ae2a6",
  "org.scalablytyped.japgolly" %%% "pino-std-serializers" % "2.4-dt-20190701Z-be88be",
  "org.scalablytyped.japgolly" %%% "sonic-boom" % "0.7-dt-20190819Z-4e9923",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
