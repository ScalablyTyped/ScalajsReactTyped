package typingsJapgolly.rmcTrigger

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterPopupVisibleChange extends js.Object {
  var afterPopupVisibleChange: js.Function0[Unit]
  var defaultPopupVisible: Boolean
  var destroyPopupOnHide: Boolean
  var getDocument: js.Function0[Document_]
  var getPopupClassNameFromAlign: js.Function0[String]
  var mask: Boolean
  var maskClosable: Boolean
  var onPopupAlign: js.Function0[Unit]
  var onPopupVisibleChange: js.Function0[Unit]
  var popupClassName: String
  var prefixCls: String
}

object AnonAfterPopupVisibleChange {
  @scala.inline
  def apply(
    afterPopupVisibleChange: Callback,
    defaultPopupVisible: Boolean,
    destroyPopupOnHide: Boolean,
    getDocument: CallbackTo[Document_],
    getPopupClassNameFromAlign: CallbackTo[String],
    mask: Boolean,
    maskClosable: Boolean,
    onPopupAlign: Callback,
    onPopupVisibleChange: Callback,
    popupClassName: String,
    prefixCls: String
  ): AnonAfterPopupVisibleChange = {
    val __obj = js.Dynamic.literal(defaultPopupVisible = defaultPopupVisible.asInstanceOf[js.Any], destroyPopupOnHide = destroyPopupOnHide.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], popupClassName = popupClassName.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("afterPopupVisibleChange")(afterPopupVisibleChange.toJsFn)
    __obj.updateDynamic("getDocument")(getDocument.toJsFn)
    __obj.updateDynamic("getPopupClassNameFromAlign")(getPopupClassNameFromAlign.toJsFn)
    __obj.updateDynamic("onPopupAlign")(onPopupAlign.toJsFn)
    __obj.updateDynamic("onPopupVisibleChange")(onPopupVisibleChange.toJsFn)
    __obj.asInstanceOf[AnonAfterPopupVisibleChange]
  }
}

