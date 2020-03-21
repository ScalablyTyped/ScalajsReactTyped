package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`segment-drag`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.drag
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderSegmentDragEvent extends js.Object {
  var index: Double
  var state: start | drag
  var thumbIndices: js.Array[Double]
  var `type`: `segment-drag`
}

object SliderSegmentDragEvent {
  @scala.inline
  def apply(index: Double, state: start | drag, thumbIndices: js.Array[Double], `type`: `segment-drag`): SliderSegmentDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], thumbIndices = thumbIndices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderSegmentDragEvent]
  }
}

