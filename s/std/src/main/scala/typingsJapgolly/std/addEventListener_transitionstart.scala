package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.transitionstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_transitionstart extends js.Object {
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.Window, 
      /* ev */ org.scalajs.dom.raw.TransitionEvent, 
      _
    ]
  ): Unit = js.native
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.Window, 
      /* ev */ org.scalajs.dom.raw.TransitionEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.Window, 
      /* ev */ org.scalajs.dom.raw.TransitionEvent, 
      _
    ],
    options: AddEventListenerOptions
  ): Unit = js.native
}

