package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccept extends js.Object {
  var accept: String
  var disableDelete: Boolean
  var files: js.Array[scala.Nothing]
  var length: Double
  var multiple: Boolean
  var onAddImageClick: js.Function0[Unit]
  var onChange: js.Function0[Unit]
  var onFail: js.Function0[Unit]
  var onImageClick: js.Function0[Unit]
  var prefixCls: String
  var selectable: Boolean
}

object AnonAccept {
  @scala.inline
  def apply(
    accept: String,
    disableDelete: Boolean,
    files: js.Array[scala.Nothing],
    length: Double,
    multiple: Boolean,
    onAddImageClick: Callback,
    onChange: Callback,
    onFail: Callback,
    onImageClick: Callback,
    prefixCls: String,
    selectable: Boolean
  ): AnonAccept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], disableDelete = disableDelete.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any])
    __obj.updateDynamic("onAddImageClick")(onAddImageClick.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onFail")(onFail.toJsFn)
    __obj.updateDynamic("onImageClick")(onImageClick.toJsFn)
    __obj.asInstanceOf[AnonAccept]
  }
}

