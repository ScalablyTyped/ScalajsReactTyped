package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOrderPagePerpageQSort extends StObject {
  
  var query: OrderPagePerpageQSort
}
object QueryOrderPagePerpageQSort {
  
  inline def apply(query: OrderPagePerpageQSort): QueryOrderPagePerpageQSort = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOrderPagePerpageQSort]
  }
  
  extension [Self <: QueryOrderPagePerpageQSort](x: Self) {
    
    inline def setQuery(value: OrderPagePerpageQSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
