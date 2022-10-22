package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamLayerViewDataReceivedEvent extends StObject {
  
  var attributes: Any
  
  var geometry: Any
}
object StreamLayerViewDataReceivedEvent {
  
  inline def apply(attributes: Any, geometry: Any): StreamLayerViewDataReceivedEvent = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLayerViewDataReceivedEvent]
  }
  
  extension [Self <: StreamLayerViewDataReceivedEvent](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: Any): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
