package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.dblclick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_dblclick extends js.Object {
  def apply(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ org.scalajs.dom.raw.MouseEvent, _]
  ): Unit = js.native
  def apply(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ org.scalajs.dom.raw.MouseEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ org.scalajs.dom.raw.MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

