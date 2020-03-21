organization := "org.scalablytyped.japgolly"
name := "ngbootbox"
version := "0.0-unknown-dt-20200226Z-92d103"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "bootbox" % "5.2.0-dt-20200226Z-6ec432",
  "org.scalablytyped.japgolly" %%% "jquery" % "3.3-dt-20200225Z-1ffbf2",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20181006Z-7d1fc9",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
