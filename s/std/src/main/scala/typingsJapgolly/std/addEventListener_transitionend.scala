package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.transitionend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_transitionend extends js.Object {
  def apply(`type`: transitionend, listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

