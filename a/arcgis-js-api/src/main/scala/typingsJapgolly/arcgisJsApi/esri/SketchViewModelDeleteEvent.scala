package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.delete
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.move
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelDeleteEvent extends StObject {
  
  var graphics: js.Array[Graphic]
  
  var tool: move | reshape | transform
  
  var `type`: delete
}
object SketchViewModelDeleteEvent {
  
  inline def apply(graphics: js.Array[Graphic], tool: move | reshape | transform): SketchViewModelDeleteEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[SketchViewModelDeleteEvent]
  }
  
  extension [Self <: SketchViewModelDeleteEvent](x: Self) {
    
    inline def setGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    inline def setGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "graphics", js.Array(value*))
    
    inline def setTool(value: move | reshape | transform): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
