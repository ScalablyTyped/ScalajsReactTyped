package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.keypress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_keypress extends js.Object {
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _]
  ): Unit = js.native
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

