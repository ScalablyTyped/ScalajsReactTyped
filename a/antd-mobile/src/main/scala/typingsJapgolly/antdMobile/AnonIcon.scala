package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var icon: Element
  var mode: String
  var prefixCls: String
  def onClick(): Unit
}

object AnonIcon {
  @scala.inline
  def apply(icon: VdomElement, mode: String, onClick: Callback, prefixCls: String): AnonIcon = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.asInstanceOf[AnonIcon]
  }
}

