package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.wheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_wheel extends js.Object {
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.Window, /* ev */ org.scalajs.dom.raw.WheelEvent, _]
  ): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.Window, /* ev */ org.scalajs.dom.raw.WheelEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.Window, /* ev */ org.scalajs.dom.raw.WheelEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

