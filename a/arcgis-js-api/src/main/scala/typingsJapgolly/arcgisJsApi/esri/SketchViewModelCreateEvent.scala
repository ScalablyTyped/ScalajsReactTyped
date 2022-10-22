package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.active
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.cancel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.circle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.complete
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.create
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelCreateEvent extends StObject {
  
  var graphic: Graphic
  
  var state: start | active | complete | cancel
  
  var tool: point | multipoint | polyline | polygon | rectangle | circle
  
  var toolEventInfo: CreateToolEventInfo
  
  var `type`: create
}
object SketchViewModelCreateEvent {
  
  inline def apply(
    graphic: Graphic,
    state: start | active | complete | cancel,
    tool: point | multipoint | polyline | polygon | rectangle | circle,
    toolEventInfo: CreateToolEventInfo
  ): SketchViewModelCreateEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("create")
    __obj.asInstanceOf[SketchViewModelCreateEvent]
  }
  
  extension [Self <: SketchViewModelCreateEvent](x: Self) {
    
    inline def setGraphic(value: Graphic): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    inline def setState(value: start | active | complete | cancel): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTool(value: point | multipoint | polyline | polygon | rectangle | circle): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setToolEventInfo(value: CreateToolEventInfo): Self = StObject.set(x, "toolEventInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: create): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
