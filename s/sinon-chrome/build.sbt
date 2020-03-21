organization := "org.scalablytyped.japgolly"
name := "sinon-chrome"
version := "v2.2.4-dt-20200227Z-0e742f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "chrome" % "0.0-unknown-dt-20200228Z-49dcd1",
  "org.scalablytyped.japgolly" %%% "filesystem" % "0.0-unknown-dt-20200225Z-0f8483",
  "org.scalablytyped.japgolly" %%% "filewriter" % "0.0-unknown-dt-20200226Z-cf4459",
  "org.scalablytyped.japgolly" %%% "sinon" % "7.5-dt-20200225Z-52d6ed",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
