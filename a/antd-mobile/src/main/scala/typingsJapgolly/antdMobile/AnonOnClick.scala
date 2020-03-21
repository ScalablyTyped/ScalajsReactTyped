package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnClick extends js.Object {
  var disabled: Boolean
  var prefixCls: String
  def onClick(): Unit
}

object AnonOnClick {
  @scala.inline
  def apply(disabled: Boolean, onClick: Callback, prefixCls: String): AnonOnClick = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.asInstanceOf[AnonOnClick]
  }
}

