package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`min-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacitySliderMinChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: `min-change`
  var value: Double
}

object OpacitySliderMinChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: `min-change`, value: Double): OpacitySliderMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacitySliderMinChangeEvent]
  }
}

