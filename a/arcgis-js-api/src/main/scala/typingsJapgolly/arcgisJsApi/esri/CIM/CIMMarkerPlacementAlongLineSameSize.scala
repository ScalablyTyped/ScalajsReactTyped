package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAlongLineSameSize
  extends StObject
     with CIMMarkerPlacementAlongLine
     with CIMMarkerPlacementType {
  
  @JSName("type")
  var type_CIMMarkerPlacementAlongLineSameSize: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineSameSize
}
object CIMMarkerPlacementAlongLineSameSize {
  
  inline def apply(): CIMMarkerPlacementAlongLineSameSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementAlongLineSameSize")
    __obj.asInstanceOf[CIMMarkerPlacementAlongLineSameSize]
  }
  
  extension [Self <: CIMMarkerPlacementAlongLineSameSize](x: Self) {
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineSameSize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
