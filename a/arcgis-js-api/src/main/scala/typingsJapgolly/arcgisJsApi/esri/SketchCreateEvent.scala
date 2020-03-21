package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.active
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.cancel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.circle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.complete
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.create
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchCreateEvent extends js.Object {
  var graphic: Graphic
  var state: start | active | complete | cancel
  var tool: point | polyline | polygon | rectangle | circle
  var toolEventInfo: CreateToolEventInfo
  var `type`: create
}

object SketchCreateEvent {
  @scala.inline
  def apply(
    graphic: Graphic,
    state: start | active | complete | cancel,
    tool: point | polyline | polygon | rectangle | circle,
    toolEventInfo: CreateToolEventInfo,
    `type`: create
  ): SketchCreateEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchCreateEvent]
  }
}

