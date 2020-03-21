organization := "org.scalablytyped.japgolly"
name := "react-instantsearch-dom"
version := "5.2-dt-20191126Z-d5ead2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "algoliasearch" % "3.34.0-dt-20200226Z-64a157",
  "org.scalablytyped.japgolly" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-599041",
  "org.scalablytyped.japgolly" %%% "csstype" % "2.6.6-ec7cc3",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-d18e40",
  "org.scalablytyped.japgolly" %%% "react" % "16.9-dt-20200227Z-a90427",
  "org.scalablytyped.japgolly" %%% "react-instantsearch-core" % "5.2-dt-20191022Z-45e361",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
