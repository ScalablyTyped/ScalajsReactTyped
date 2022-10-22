package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.active
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.complete
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.move
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.start
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.transform
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelUpdateEvent extends StObject {
  
  var aborted: Boolean
  
  var graphics: js.Array[Graphic]
  
  var state: start | active | complete
  
  var tool: move | transform | reshape
  
  var toolEventInfo: UpdateToolEventInfo
  
  var `type`: update
}
object SketchViewModelUpdateEvent {
  
  inline def apply(
    aborted: Boolean,
    graphics: js.Array[Graphic],
    state: start | active | complete,
    tool: move | transform | reshape,
    toolEventInfo: UpdateToolEventInfo
  ): SketchViewModelUpdateEvent = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], graphics = graphics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[SketchViewModelUpdateEvent]
  }
  
  extension [Self <: SketchViewModelUpdateEvent](x: Self) {
    
    inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    inline def setGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "graphics", js.Array(value*))
    
    inline def setState(value: start | active | complete): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTool(value: move | transform | reshape): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setToolEventInfo(value: UpdateToolEventInfo): Self = StObject.set(x, "toolEventInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
