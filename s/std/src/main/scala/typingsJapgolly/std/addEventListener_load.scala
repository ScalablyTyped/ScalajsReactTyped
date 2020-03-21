package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.load
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_load extends js.Object {
  def apply(`type`: load, listener: js.ThisFunction1[/* this */ Window_, /* ev */ Event_, _]): Unit = js.native
  def apply(
    `type`: load,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: load,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

