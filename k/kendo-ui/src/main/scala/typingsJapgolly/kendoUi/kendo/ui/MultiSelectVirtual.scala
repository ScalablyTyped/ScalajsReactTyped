package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiSelectVirtual extends StObject {
  
  var itemHeight: js.UndefOr[Double] = js.undefined
  
  var mapValueTo: js.UndefOr[String] = js.undefined
  
  var valueMapper: js.UndefOr[js.Function] = js.undefined
}
object MultiSelectVirtual {
  
  inline def apply(): MultiSelectVirtual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectVirtual]
  }
  
  extension [Self <: MultiSelectVirtual](x: Self) {
    
    inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
    
    inline def setMapValueTo(value: String): Self = StObject.set(x, "mapValueTo", value.asInstanceOf[js.Any])
    
    inline def setMapValueToUndefined: Self = StObject.set(x, "mapValueTo", js.undefined)
    
    inline def setValueMapper(value: js.Function): Self = StObject.set(x, "valueMapper", value.asInstanceOf[js.Any])
    
    inline def setValueMapperUndefined: Self = StObject.set(x, "valueMapper", js.undefined)
  }
}
