organization := "org.scalablytyped.japgolly"
name := "pouchdb-browser"
version := "6.1-dt-20200226Z-0cc83c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "debug" % "4.1-dt-20200226Z-3b294d",
  "org.scalablytyped.japgolly" %%% "pouchdb-core" % "7.0-dt-20200225Z-15067f",
  "org.scalablytyped.japgolly" %%% "pouchdb-find" % "6.3-dt-20200225Z-567b9f",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
