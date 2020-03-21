package typingsJapgolly.rmcDialog

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnClose extends js.Object {
  var onClose: js.Function0[Unit]
  var prefixCls: String
  var visible: Boolean
}

object AnonOnClose {
  @scala.inline
  def apply(onClose: Callback, prefixCls: String, visible: Boolean): AnonOnClose = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.asInstanceOf[AnonOnClose]
  }
}

