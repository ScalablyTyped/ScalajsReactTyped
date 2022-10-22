organization := "org.scalablytyped.japgolly"
name := "firebase"
version := "9.12.1-ddc647"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "firebase__analytics" % "0.8.3-c37577",
  "org.scalablytyped.japgolly" %%% "firebase__app" % "0.8.2-bfba1f",
  "org.scalablytyped.japgolly" %%% "firebase__app-check" % "0.5.15-d8500a",
  "org.scalablytyped.japgolly" %%% "firebase__app-check-interop-types" % "0.1.0-13e1f4",
  "org.scalablytyped.japgolly" %%% "firebase__app-types" % "0.8.0-d25a07",
  "org.scalablytyped.japgolly" %%% "firebase__auth" % "0.20.10-2319c8",
  "org.scalablytyped.japgolly" %%% "firebase__auth-interop-types" % "0.1.6-bdd746",
  "org.scalablytyped.japgolly" %%% "firebase__component" % "0.5.20-97e94a",
  "org.scalablytyped.japgolly" %%% "firebase__database" % "0.13.9-42539e",
  "org.scalablytyped.japgolly" %%% "firebase__firestore" % "3.7.1-f0623f",
  "org.scalablytyped.japgolly" %%% "firebase__firestore-compat" % "0.2.1-2d68ec",
  "org.scalablytyped.japgolly" %%% "firebase__firestore-types" % "2.5.0-d4df6b",
  "org.scalablytyped.japgolly" %%% "firebase__functions" % "0.8.7-85295d",
  "org.scalablytyped.japgolly" %%% "firebase__installations" % "0.5.15-663276",
  "org.scalablytyped.japgolly" %%% "firebase__logger" % "0.3.3-2bcaf2",
  "org.scalablytyped.japgolly" %%% "firebase__messaging" % "0.9.19-a4173b",
  "org.scalablytyped.japgolly" %%% "firebase__messaging-interop-types" % "0.1.0-3bdf83",
  "org.scalablytyped.japgolly" %%% "firebase__performance" % "0.5.15-ad2c2f",
  "org.scalablytyped.japgolly" %%% "firebase__remote-config" % "0.3.14-74db98",
  "org.scalablytyped.japgolly" %%% "firebase__remote-config-types" % "0.2.0-437f41",
  "org.scalablytyped.japgolly" %%% "firebase__storage" % "0.9.12-50e265",
  "org.scalablytyped.japgolly" %%% "firebase__util" % "1.7.2-2aee96",
  "org.scalablytyped.japgolly" %%% "formdata-polyfill" % "4.0.10-5be100",
  "org.scalablytyped.japgolly" %%% "grpc__grpc-js" % "1.7.2-695a99",
  "org.scalablytyped.japgolly" %%% "grpc__proto-loader" % "0.7.3-978e90",
  "org.scalablytyped.japgolly" %%% "long" % "5.2.0-c6f5b1",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "node-fetch" % "3.2.10-78ad93",
  "org.scalablytyped.japgolly" %%% "protobufjs" % "7.1.2-b1c8a5",
  "org.scalablytyped.japgolly" %%% "rollup" % "3.2.2-3943b7",
  "org.scalablytyped.japgolly" %%% "selenium-webdriver" % "4.1-dt-20220909Z-ba92c6",
  "org.scalablytyped.japgolly" %%% "sinon" % "10.0-dt-20220720Z-30f991",
  "org.scalablytyped.japgolly" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-f8d735",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "typescript" % "4.8.4-7a2e7a",
  "org.scalablytyped.japgolly" %%% "ws" % "8.5-dt-20220624Z-5c45c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
