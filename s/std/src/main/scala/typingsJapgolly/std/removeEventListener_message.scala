package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_message extends js.Object {
  def apply(`type`: message, listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]): Unit = js.native
  def apply(
    `type`: message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

