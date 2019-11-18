package typingsJapgolly.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardStatic extends EventEmitter {
  def addListener(eventType: KeyboardEventName, listener: KeyboardEventListener): EmitterSubscription = js.native
  def dismiss(): Unit = js.native
}

