package typingsJapgolly.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterType extends StObject {
  
  var filterType: typingsJapgolly.muiDatatables.mod.FilterType
  
  var name: String
}
object FilterType {
  
  inline def apply(filterType: typingsJapgolly.muiDatatables.mod.FilterType, name: String): FilterType = {
    val __obj = js.Dynamic.literal(filterType = filterType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterType]
  }
  
  extension [Self <: FilterType](x: Self) {
    
    inline def setFilterType(value: typingsJapgolly.muiDatatables.mod.FilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
