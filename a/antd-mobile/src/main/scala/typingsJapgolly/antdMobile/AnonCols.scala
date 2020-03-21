package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCols extends js.Object {
  var cascade: Boolean
  var cols: Double
  var pickerPrefixCls: String
  var prefixCls: String
  var value: js.Array[scala.Nothing]
  def onChange(): Unit
}

object AnonCols {
  @scala.inline
  def apply(
    cascade: Boolean,
    cols: Double,
    onChange: Callback,
    pickerPrefixCls: String,
    prefixCls: String,
    value: js.Array[scala.Nothing]
  ): AnonCols = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.asInstanceOf[AnonCols]
  }
}

