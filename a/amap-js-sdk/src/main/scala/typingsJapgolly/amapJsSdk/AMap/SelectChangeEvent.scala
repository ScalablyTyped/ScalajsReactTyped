package typingsJapgolly.amapJsSdk.AMap

import org.scalajs.dom.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectChangeEvent extends StObject {
  
  var data: Poi
  
  var id: String
  
  var listElement: HTMLLIElement
  
  var marker: Marker
  
  var `type`: String
}
object SelectChangeEvent {
  
  inline def apply(data: Poi, id: String, listElement: HTMLLIElement, marker: Marker, `type`: String): SelectChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectChangeEvent]
  }
  
  extension [Self <: SelectChangeEvent](x: Self) {
    
    inline def setData(value: Poi): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setListElement(value: HTMLLIElement): Self = StObject.set(x, "listElement", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
