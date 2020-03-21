organization := "org.scalablytyped.japgolly"
name := "serverless-jest-plugin"
version := "0.3-dt-20200219Z-678b7f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "aws-lambda" % "8.10-dt-20200302Z-01b054",
  "org.scalablytyped.japgolly" %%% "lambda-wrapper" % "0.3-dt-20200219Z-357d73",
  "org.scalablytyped.japgolly" %%% "serverless" % "1.18-dt-20200227Z-253fb7",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
