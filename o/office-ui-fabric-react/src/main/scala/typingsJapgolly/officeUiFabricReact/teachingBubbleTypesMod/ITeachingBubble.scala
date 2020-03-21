package typingsJapgolly.officeUiFabricReact.teachingBubbleTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITeachingBubble extends js.Object {
  /** Sets focus to the TeachingBubble root element */
  def focus(): Unit
}

object ITeachingBubble {
  @scala.inline
  def apply(focus: Callback): ITeachingBubble = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[ITeachingBubble]
  }
}

