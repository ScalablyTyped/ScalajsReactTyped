package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.beforeunload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_beforeunload extends js.Object {
  def apply(`type`: beforeunload, listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _]): Unit = js.native
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

