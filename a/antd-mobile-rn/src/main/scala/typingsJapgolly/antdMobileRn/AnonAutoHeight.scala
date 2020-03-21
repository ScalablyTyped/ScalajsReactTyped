package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoHeight extends js.Object {
  var autoHeight: Boolean
  var clear: Boolean
  var count: Double
  var editable: Boolean
  var error: Boolean
  var keyboardType: String
  var last: Boolean
  var rows: Double
  var styles: StringDictionary[RegisteredStyle[_]]
  def onBlur(): Unit
  def onChange(): Unit
  def onErrorClick(): Unit
  def onFocus(): Unit
}

object AnonAutoHeight {
  @scala.inline
  def apply(
    autoHeight: Boolean,
    clear: Boolean,
    count: Double,
    editable: Boolean,
    error: Boolean,
    keyboardType: String,
    last: Boolean,
    onBlur: Callback,
    onChange: Callback,
    onErrorClick: Callback,
    onFocus: Callback,
    rows: Double,
    styles: StringDictionary[RegisteredStyle[_]]
  ): AnonAutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], keyboardType = keyboardType.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onErrorClick")(onErrorClick.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    __obj.asInstanceOf[AnonAutoHeight]
  }
}

