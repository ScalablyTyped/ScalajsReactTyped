package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.drag
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacitySliderThumbDragEvent extends js.Object {
  var index: Double
  var state: start | drag
  var `type`: `thumb-drag`
  var value: Double
}

object OpacitySliderThumbDragEvent {
  @scala.inline
  def apply(index: Double, state: start | drag, `type`: `thumb-drag`, value: Double): OpacitySliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacitySliderThumbDragEvent]
  }
}

