organization := "org.scalablytyped.japgolly"
name := "naver-whale"
version := "0.0-unknown-dt-20200225Z-bbbb22"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "chrome" % "0.0-unknown-dt-20200228Z-49dcd1",
  "org.scalablytyped.japgolly" %%% "filesystem" % "0.0-unknown-dt-20200225Z-0f8483",
  "org.scalablytyped.japgolly" %%% "filewriter" % "0.0-unknown-dt-20200226Z-cf4459",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
