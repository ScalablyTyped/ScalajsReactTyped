package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.keydown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_keydown extends js.Object {
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _]
  ): Unit = js.native
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

