organization := "org.scalablytyped.japgolly"
name := "jimp__plugins"
version := "0.8.5-77afa3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "jimp__core" % "0.8.5-f7c0b8",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-blit" % "0.8.5-4792e4",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-blur" % "0.8.5-d631da",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-color" % "0.8.5-391bb9",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-contain" % "0.8.5-38c7e1",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-cover" % "0.8.5-25b797",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-crop" % "0.8.5-fbc726",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-displace" % "0.8.5-f5be00",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-dither" % "0.8.5-a8c4ad",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-flip" % "0.8.5-1efcd3",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-gaussian" % "0.8.5-70aec2",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-invert" % "0.8.5-f2b93d",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-mask" % "0.8.5-6b259c",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-normalize" % "0.8.5-6edc6b",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-print" % "0.8.5-c0c0d0",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-resize" % "0.8.5-3e13e0",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-rotate" % "0.8.5-2b469d",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-scale" % "0.8.5-9b7dff",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
