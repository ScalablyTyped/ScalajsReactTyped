package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`max-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSliderMaxChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: `max-change`
  var value: Double
}

object ColorSliderMaxChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: `max-change`, value: Double): ColorSliderMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSliderMaxChangeEvent]
  }
}

