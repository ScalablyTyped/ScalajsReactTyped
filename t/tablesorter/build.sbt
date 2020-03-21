organization := "org.scalablytyped.japgolly"
name := "tablesorter"
version := "2.31-dt-20200225Z-243808"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "cldrjs" % "0.4.4-dt-20200226Z-b9673f",
  "org.scalablytyped.japgolly" %%% "globalize" % "0.0-unknown-dt-20200226Z-b10e6e",
  "org.scalablytyped.japgolly" %%% "jquery" % "3.3-dt-20200225Z-1ffbf2",
  "org.scalablytyped.japgolly" %%% "jqueryui" % "1.12-dt-20200225Z-191f72",
  "org.scalablytyped.japgolly" %%% "requirejs" % "2.1.20-dt-20200227Z-00a27c",
  "org.scalablytyped.japgolly" %%% "select2" % "4.0-dt-20200225Z-8c068f",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20181006Z-7d1fc9",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
