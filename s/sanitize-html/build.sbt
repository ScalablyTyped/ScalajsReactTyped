organization := "org.scalablytyped.japgolly"
name := "sanitize-html"
version := "1.20.1-dt-20200227Z-5ec88d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "domhandler" % "2.4-dt-20200225Z-1da2f1",
  "org.scalablytyped.japgolly" %%% "domutils" % "1.7-dt-20190326Z-fcb627",
  "org.scalablytyped.japgolly" %%% "htmlparser2" % "v3.10.x-dt-20200226Z-48f80d",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
