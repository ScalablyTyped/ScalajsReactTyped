package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var checked: Boolean
  var disabled: Boolean
  var name: String
  var platform: String
  var prefixCls: String
  def onChange(): Unit
  def onClick(): Unit
}

object AnonName {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    name: String,
    onChange: Callback,
    onClick: Callback,
    platform: String,
    prefixCls: String
  ): AnonName = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.asInstanceOf[AnonName]
  }
}

