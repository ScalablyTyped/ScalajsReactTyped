package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var cascade: Boolean
  var cols: Double
  var pickerPrefixCls: String
  var popupPrefixCls: String
  var prefixCls: String
  var title: String
  var triggerType: String
  def format(values: js.Array[String]): String
}

object AnonFormat {
  @scala.inline
  def apply(
    cascade: Boolean,
    cols: Double,
    format: js.Array[String] => CallbackTo[String],
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    title: String,
    triggerType: String
  ): AnonFormat = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], popupPrefixCls = popupPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => format(t0).runNow()))
    __obj.asInstanceOf[AnonFormat]
  }
}

