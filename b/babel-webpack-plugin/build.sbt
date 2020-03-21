organization := "org.scalablytyped.japgolly"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-0b4a51"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "anymatch" % "1.3-dt-20190212Z-ec06c4",
  "org.scalablytyped.japgolly" %%% "babel-core" % "6.25-dt-20200226Z-3b01fd",
  "org.scalablytyped.japgolly" %%% "babel-generator" % "6.25-dt-20200226Z-f54f15",
  "org.scalablytyped.japgolly" %%% "babel-template" % "6.25-dt-20200226Z-1b7dfd",
  "org.scalablytyped.japgolly" %%% "babel-traverse" % "6.25-dt-20190212Z-6426b0",
  "org.scalablytyped.japgolly" %%% "babel-types" % "7.0-dt-20190424Z-c3935f",
  "org.scalablytyped.japgolly" %%% "babylon" % "6.16-dt-20200226Z-ca46e8",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "source-list-map" % "v0.1.6-dt-20200225Z-55ccc1",
  "org.scalablytyped.japgolly" %%% "source-map" % "0.7.3-1b2e50",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "tapable" % "v1.0.0-dt-20200225Z-02549a",
  "org.scalablytyped.japgolly" %%% "uglify-js" % "3.0-dt-20200225Z-0ef4a7",
  "org.scalablytyped.japgolly" %%% "webpack" % "4.41-dt-20200227Z-6e50fb",
  "org.scalablytyped.japgolly" %%% "webpack-sources" % "0.1-dt-20200225Z-a1eff2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
