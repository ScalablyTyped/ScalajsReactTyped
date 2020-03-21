organization := "org.scalablytyped.japgolly"
name := "firebase__firestore"
version := "1.10.2-02db98"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "firebase__app-types" % "0.5.1-56434b",
  "org.scalablytyped.japgolly" %%% "firebase__auth-interop-types" % "0.1.2-9bfebf",
  "org.scalablytyped.japgolly" %%% "firebase__component" % "0.1.5-49254d",
  "org.scalablytyped.japgolly" %%% "firebase__firestore-types" % "1.9.1-d101ba",
  "org.scalablytyped.japgolly" %%% "firebase__util" % "0.2.40-0884a4",
  "org.scalablytyped.japgolly" %%% "grpc" % "1.21.1-93e275",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "protobufjs" % "6.8.8-89b32e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "typescript" % "3.8.2-cfbb15")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
