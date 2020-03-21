package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJumpNextIcon extends js.Object {
  var jumpNextIcon: Element
  var jumpPrevIcon: Element
  var nextIcon: Element
  var prevIcon: Element
}

object AnonJumpNextIcon {
  @scala.inline
  def apply(jumpNextIcon: VdomElement, jumpPrevIcon: VdomElement, nextIcon: VdomElement, prevIcon: VdomElement): AnonJumpNextIcon = {
    val __obj = js.Dynamic.literal()
    if (jumpNextIcon != null) __obj.updateDynamic("jumpNextIcon")(jumpNextIcon.rawElement.asInstanceOf[js.Any])
    if (jumpPrevIcon != null) __obj.updateDynamic("jumpPrevIcon")(jumpPrevIcon.rawElement.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.rawElement.asInstanceOf[js.Any])
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJumpNextIcon]
  }
}

