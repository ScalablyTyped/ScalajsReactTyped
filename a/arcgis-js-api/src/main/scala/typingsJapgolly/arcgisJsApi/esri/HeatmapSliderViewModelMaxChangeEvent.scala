package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapSliderViewModelMaxChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: max
  var value: Double
}

object HeatmapSliderViewModelMaxChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: max, value: Double): HeatmapSliderViewModelMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapSliderViewModelMaxChangeEvent]
  }
}

