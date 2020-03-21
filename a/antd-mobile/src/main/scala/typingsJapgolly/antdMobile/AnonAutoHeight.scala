package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoHeight extends js.Object {
  var autoHeight: Boolean
  var clear: Boolean
  var disabled: Boolean
  var editable: Boolean
  var error: Boolean
  var labelNumber: Double
  var onBlur: js.Function0[Unit]
  var onChange: js.Function0[Unit]
  var onErrorClick: js.Function0[Unit]
  var onFocus: js.Function0[Unit]
  var placeholder: String
  var prefixCls: String
  var prefixListCls: String
  var rows: Double
}

object AnonAutoHeight {
  @scala.inline
  def apply(
    autoHeight: Boolean,
    clear: Boolean,
    disabled: Boolean,
    editable: Boolean,
    error: Boolean,
    labelNumber: Double,
    onBlur: Callback,
    onChange: Callback,
    onErrorClick: Callback,
    onFocus: Callback,
    placeholder: String,
    prefixCls: String,
    prefixListCls: String,
    rows: Double
  ): AnonAutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], labelNumber = labelNumber.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prefixListCls = prefixListCls.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onErrorClick")(onErrorClick.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    __obj.asInstanceOf[AnonAutoHeight]
  }
}

