package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterClose extends js.Object {
  var closable: Boolean
  var disabled: Boolean
  var prefixCls: String
  var selected: Boolean
  var small: Boolean
  def afterClose(): Unit
  def onChange(): Unit
  def onClose(): Unit
}

object AnonAfterClose {
  @scala.inline
  def apply(
    afterClose: Callback,
    closable: Boolean,
    disabled: Boolean,
    onChange: Callback,
    onClose: Callback,
    prefixCls: String,
    selected: Boolean,
    small: Boolean
  ): AnonAfterClose = {
    val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.updateDynamic("afterClose")(afterClose.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.asInstanceOf[AnonAfterClose]
  }
}

