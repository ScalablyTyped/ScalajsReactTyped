package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnChange extends js.Object {
  var disabled: Boolean
  var selectedIndex: Double
  var styles: StringDictionary[RegisteredStyle[_]]
  var tintColor: String
  var values: js.Array[scala.Nothing]
  def onChange(): Unit
  def onValueChange(): Unit
}

object AnonOnChange {
  @scala.inline
  def apply(
    disabled: Boolean,
    onChange: Callback,
    onValueChange: Callback,
    selectedIndex: Double,
    styles: StringDictionary[RegisteredStyle[_]],
    tintColor: String,
    values: js.Array[scala.Nothing]
  ): AnonOnChange = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onValueChange")(onValueChange.toJsFn)
    __obj.asInstanceOf[AnonOnChange]
  }
}

