organization := "org.scalablytyped.japgolly"
name := "ng-cordova"
version := "0.0-unknown-dt-20200226Z-939a73"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "angular" % "1.6-dt-20200225Z-c2c598",
  "org.scalablytyped.japgolly" %%% "cordova-plugin-camera" % "4.1.0-96af7f",
  "org.scalablytyped.japgolly" %%% "cordova-plugin-file" % "6.0.2-cb27d8",
  "org.scalablytyped.japgolly" %%% "cordova-plugin-file-transfer" % "1.7.1-9e7653",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
