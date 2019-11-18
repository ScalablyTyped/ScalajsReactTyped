package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.devicemotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_devicemotion extends js.Object {
  def apply(`type`: devicemotion, listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _]): Unit = js.native
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

