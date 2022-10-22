package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.delete
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.move
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchDeleteEvent extends StObject {
  
  var graphics: js.Array[Graphic]
  
  var tool: move | reshape | transform
  
  var `type`: delete
}
object SketchDeleteEvent {
  
  inline def apply(graphics: js.Array[Graphic], tool: move | reshape | transform): SketchDeleteEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[SketchDeleteEvent]
  }
  
  extension [Self <: SketchDeleteEvent](x: Self) {
    
    inline def setGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    inline def setGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "graphics", js.Array(value*))
    
    inline def setTool(value: move | reshape | transform): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
