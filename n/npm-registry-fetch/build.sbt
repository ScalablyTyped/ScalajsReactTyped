organization := "org.scalablytyped.japgolly"
name := "npm-registry-fetch"
version := "4.0-dt-20190925Z-10af9d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "form-data" % "2.5.1-b08b8b",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "node-fetch" % "2.5-dt-20200225Z-6b6cc5",
  "org.scalablytyped.japgolly" %%% "npm-package-arg" % "6.1-dt-20181031Z-860ef6",
  "org.scalablytyped.japgolly" %%% "npmlog" % "4.1-dt-20190626Z-50e728",
  "org.scalablytyped.japgolly" %%% "ssri" % "6.0-dt-20190422Z-08a29b",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
