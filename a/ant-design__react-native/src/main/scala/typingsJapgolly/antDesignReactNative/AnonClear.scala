package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  var clear: Boolean
  var editable: Boolean
  var error: Boolean
  var extra: String
  var labelNumber: Double
  var labelPosition: String
  var last: Boolean
  var textAlign: String
  var `type`: String
  def onBlur(): Unit
  def onChange(): Unit
  def onErrorClick(): Unit
  def onExtraClick(): Unit
  def onFocus(): Unit
}

object AnonClear {
  @scala.inline
  def apply(
    clear: Boolean,
    editable: Boolean,
    error: Boolean,
    extra: String,
    labelNumber: Double,
    labelPosition: String,
    last: Boolean,
    onBlur: Callback,
    onChange: Callback,
    onErrorClick: Callback,
    onExtraClick: Callback,
    onFocus: Callback,
    textAlign: String,
    `type`: String
  ): AnonClear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], labelNumber = labelNumber.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onErrorClick")(onErrorClick.toJsFn)
    __obj.updateDynamic("onExtraClick")(onExtraClick.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClear]
  }
}

