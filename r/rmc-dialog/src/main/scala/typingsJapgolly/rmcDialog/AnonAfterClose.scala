package typingsJapgolly.rmcDialog

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterClose extends js.Object {
  var afterClose: js.Function0[Unit]
  var className: String
  var closable: Boolean
  var mask: Boolean
  var maskClosable: Boolean
  var onClose: js.Function0[Unit]
  var prefixCls: String
  var visible: Boolean
}

object AnonAfterClose {
  @scala.inline
  def apply(
    afterClose: Callback,
    className: String,
    closable: Boolean,
    mask: Boolean,
    maskClosable: Boolean,
    onClose: Callback,
    prefixCls: String,
    visible: Boolean
  ): AnonAfterClose = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("afterClose")(afterClose.toJsFn)
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.asInstanceOf[AnonAfterClose]
  }
}

