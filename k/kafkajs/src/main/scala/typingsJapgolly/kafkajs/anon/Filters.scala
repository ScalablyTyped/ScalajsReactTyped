package typingsJapgolly.kafkajs.anon

import typingsJapgolly.kafkajs.mod.AclFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  var filters: js.Array[AclFilter]
}
object Filters {
  
  inline def apply(filters: js.Array[AclFilter]): Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  
  extension [Self <: Filters](x: Self) {
    
    inline def setFilters(value: js.Array[AclFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: AclFilter*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
