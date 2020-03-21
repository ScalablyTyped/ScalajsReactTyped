organization := "org.scalablytyped.japgolly"
name := "phantomcss"
version := "0.11.1-dt-20200225Z-d2b481"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "casperjs" % "1.1-dt-20200226Z-64d467",
  "org.scalablytyped.japgolly" %%% "phantomjs" % "1.9-dt-20200226Z-c5c802",
  "org.scalablytyped.japgolly" %%% "resemblejs" % "v1.3.0-dt-20200227Z-faac21",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
