package typingsJapgolly.expo.aRMod

import typingsJapgolly.reactNative.mod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/AR", "onDidFailWithError")
@js.native
object onDidFailWithError extends js.Object {
  def apply(listener: js.Function1[/* event */ DidFailWithErrorEvent, Unit]): EmitterSubscription = js.native
}

