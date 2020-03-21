organization := "org.scalablytyped.japgolly"
name := "firebase__functions"
version := "0.4.32-6e06fe"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "firebase__app-types" % "0.5.1-56434b",
  "org.scalablytyped.japgolly" %%% "firebase__auth-interop-types" % "0.1.2-9bfebf",
  "org.scalablytyped.japgolly" %%% "firebase__component" % "0.1.5-49254d",
  "org.scalablytyped.japgolly" %%% "firebase__functions-types" % "0.3.14-6b8680",
  "org.scalablytyped.japgolly" %%% "firebase__messaging-types" % "0.4.2-e2a952",
  "org.scalablytyped.japgolly" %%% "firebase__util" % "0.2.40-0884a4",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
