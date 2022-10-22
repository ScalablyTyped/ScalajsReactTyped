package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`draw-complete`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineDrawActionDrawCompleteEvent extends StObject {
  
  var defaultPrevented: Boolean
  
  var preventDefault: js.Function
  
  var `type`: `draw-complete`
  
  var vertices: js.Array[js.Array[Double]]
}
object PolylineDrawActionDrawCompleteEvent {
  
  inline def apply(defaultPrevented: Boolean, preventDefault: js.Function, vertices: js.Array[js.Array[Double]]): PolylineDrawActionDrawCompleteEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw-complete")
    __obj.asInstanceOf[PolylineDrawActionDrawCompleteEvent]
  }
  
  extension [Self <: PolylineDrawActionDrawCompleteEvent](x: Self) {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setType(value: `draw-complete`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
