package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.animationend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_animationend extends js.Object {
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.Window, 
      /* ev */ org.scalajs.dom.raw.AnimationEvent, 
      _
    ]
  ): Unit = js.native
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.Window, 
      /* ev */ org.scalajs.dom.raw.AnimationEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.Window, 
      /* ev */ org.scalajs.dom.raw.AnimationEvent, 
      _
    ],
    options: AddEventListenerOptions
  ): Unit = js.native
}

