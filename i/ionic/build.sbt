organization := "org.scalablytyped.japgolly"
name := "ionic"
version := "5.4.16-15e9ff"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "cookiejar" % "2.1-dt-20190116Z-82d6a9",
  "org.scalablytyped.japgolly" %%% "debug" % "4.1-dt-20200226Z-3b294d",
  "org.scalablytyped.japgolly" %%% "elementtree" % "0.1-dt-20180830Z-67ce0e",
  "org.scalablytyped.japgolly" %%% "inquirer" % "6.5-dt-20200226Z-29a9c4",
  "org.scalablytyped.japgolly" %%% "ionic__cli-framework" % "3.0.6-6af610",
  "org.scalablytyped.japgolly" %%% "ionic__cli-framework-prompts" % "1.0.4-9cc456",
  "org.scalablytyped.japgolly" %%% "ionic__discover" % "2.0.8-fe66f7",
  "org.scalablytyped.japgolly" %%% "ionic__utils-network" % "1.0.6-45ebf1",
  "org.scalablytyped.japgolly" %%% "ionic__utils-object" % "1.0.6-00b4d9",
  "org.scalablytyped.japgolly" %%% "ionic__utils-subprocess" % "1.0.13-0cdb20",
  "org.scalablytyped.japgolly" %%% "log-update" % "3.4.0-5d64aa",
  "org.scalablytyped.japgolly" %%% "minimist" % "1.2.0-dt-20200225Z-0f9493",
  "org.scalablytyped.japgolly" %%% "minipass" % "2.2-dt-20180214Z-e3d338",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "rxjs" % "6.5.4-a27765",
  "org.scalablytyped.japgolly" %%% "rxjs-compat" % "6.5.4-968493",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "string-width" % "4.2.0-f7da86",
  "org.scalablytyped.japgolly" %%% "superagent" % "4.1-dt-20200214Z-b9ff9f",
  "org.scalablytyped.japgolly" %%% "tar" % "4.0-dt-20200227Z-4d6a55",
  "org.scalablytyped.japgolly" %%% "through" % "0.0-unknown-dt-20200225Z-90fce9",
  "org.scalablytyped.japgolly" %%% "ws" % "7.2-dt-20200227Z-0c2dec")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
