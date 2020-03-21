organization := "org.scalablytyped.japgolly"
name := "webpack-blocks"
version := "2.0-dt-20191016Z-28cef5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "anymatch" % "1.3-dt-20190212Z-ec06c4",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "source-list-map" % "v0.1.6-dt-20200225Z-55ccc1",
  "org.scalablytyped.japgolly" %%% "source-map" % "0.7.3-1b2e50",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "tapable" % "v1.0.0-dt-20200225Z-02549a",
  "org.scalablytyped.japgolly" %%% "uglify-js" % "3.0-dt-20200225Z-0ef4a7",
  "org.scalablytyped.japgolly" %%% "webpack" % "4.41-dt-20200227Z-6e50fb",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__assets" % "2.0-dt-20191016Z-fbe667",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__babel" % "2.0-dt-20191016Z-5f6a23",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__core" % "2.0-dt-20191016Z-7d370f",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__dev-server" % "2.0-dt-20191016Z-db4782",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__postcss" % "2.0-dt-20191016Z-a0a59a",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__sass" % "2.0-dt-20191016Z-ec2224",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__typescript" % "2.0-dt-20191016Z-4ec39e",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__uglify" % "2.0-dt-20191016Z-18f515",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__webpack" % "2.0-dt-20191016Z-8bffdd",
  "org.scalablytyped.japgolly" %%% "webpack-sources" % "0.1-dt-20200225Z-a1eff2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
