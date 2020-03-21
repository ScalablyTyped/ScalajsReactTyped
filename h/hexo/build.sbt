organization := "org.scalablytyped.japgolly"
name := "hexo"
version := "3.8-dt-20200225Z-fcd640"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "bunyan" % "1.8-dt-20200226Z-ec4c1d",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20200226Z-95dbfc",
  "org.scalablytyped.japgolly" %%% "hexo-util" % "0.6-dt-20190808Z-3b0d78",
  "org.scalablytyped.japgolly" %%% "minimist" % "1.2.0-dt-20200225Z-0f9493",
  "org.scalablytyped.japgolly" %%% "moment" % "2.24.0-8e4e98",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "underscore" % "1.9-dt-20200225Z-5f2ec8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
