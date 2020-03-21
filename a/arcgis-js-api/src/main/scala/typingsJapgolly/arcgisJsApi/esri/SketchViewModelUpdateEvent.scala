package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.active
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.cancel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.complete
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.move
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.start
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.transform
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelUpdateEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var state: start | active | complete | cancel
  var tool: move | transform | reshape
  var toolEventInfo: UpdateToolEventInfo
  var `type`: update
}

object SketchViewModelUpdateEvent {
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    state: start | active | complete | cancel,
    tool: move | transform | reshape,
    toolEventInfo: UpdateToolEventInfo,
    `type`: update
  ): SketchViewModelUpdateEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchViewModelUpdateEvent]
  }
}

