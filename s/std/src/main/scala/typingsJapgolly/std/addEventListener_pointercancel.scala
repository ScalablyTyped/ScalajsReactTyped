package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.pointercancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_pointercancel extends js.Object {
  def apply(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ org.scalajs.dom.raw.PointerEvent, _]
  ): Unit = js.native
  def apply(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ org.scalajs.dom.raw.PointerEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ org.scalajs.dom.raw.PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

