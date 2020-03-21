organization := "org.scalablytyped.japgolly"
name := "hapi__hawk"
version := "8.0-dt-20200122Z-d32de6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "caseless" % "0.12-dt-20190311Z-d016a6",
  "org.scalablytyped.japgolly" %%% "crypto-js" % "v3.1.8-dt-20200226Z-7f3408",
  "org.scalablytyped.japgolly" %%% "form-data" % "2.5.1-b08b8b",
  "org.scalablytyped.japgolly" %%% "hapi__boom" % "9.0.0-2ec35d",
  "org.scalablytyped.japgolly" %%% "hapi__catbox" % "10.2-dt-20190521Z-182bb0",
  "org.scalablytyped.japgolly" %%% "hapi__hapi" % "19.0-dt-20200227Z-654799",
  "org.scalablytyped.japgolly" %%% "hapi__iron" % "6.0.0-e27567",
  "org.scalablytyped.japgolly" %%% "hapi__joi" % "16.0-dt-20200225Z-f14e6d",
  "org.scalablytyped.japgolly" %%% "hapi__mimos" % "4.1-dt-20200225Z-43d59e",
  "org.scalablytyped.japgolly" %%% "hapi__podium" % "3.4-dt-20200225Z-20478c",
  "org.scalablytyped.japgolly" %%% "hapi__shot" % "4.1-dt-20190404Z-896cee",
  "org.scalablytyped.japgolly" %%% "hapi__sntp" % "3.1-dt-20190425Z-5f7cf6",
  "org.scalablytyped.japgolly" %%% "mime-db" % "1.27-dt-20190322Z-630eaa",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "request" % "2.48-dt-20191217Z-011ed5",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "tough-cookie" % "2.3-dt-20191206Z-d45a45")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
