package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultValue extends js.Object {
  var defaultValue: Double
  var disabled: Boolean
  var maximumTrackTintColor: String
  var minimumTrackTintColor: String
  def onAfterChange(): Unit
  def onChange(): Unit
}

object AnonDefaultValue {
  @scala.inline
  def apply(
    defaultValue: Double,
    disabled: Boolean,
    maximumTrackTintColor: String,
    minimumTrackTintColor: String,
    onAfterChange: Callback,
    onChange: Callback
  ): AnonDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], maximumTrackTintColor = maximumTrackTintColor.asInstanceOf[js.Any], minimumTrackTintColor = minimumTrackTintColor.asInstanceOf[js.Any])
    __obj.updateDynamic("onAfterChange")(onAfterChange.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.asInstanceOf[AnonDefaultValue]
  }
}

