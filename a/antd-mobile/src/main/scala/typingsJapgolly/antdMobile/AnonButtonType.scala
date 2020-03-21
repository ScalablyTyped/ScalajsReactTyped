package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonType extends js.Object {
  var buttonType: String
  var prefixCls: String
  def onButtonClick(): Unit
}

object AnonButtonType {
  @scala.inline
  def apply(buttonType: String, onButtonClick: Callback, prefixCls: String): AnonButtonType = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("onButtonClick")(onButtonClick.toJsFn)
    __obj.asInstanceOf[AnonButtonType]
  }
}

