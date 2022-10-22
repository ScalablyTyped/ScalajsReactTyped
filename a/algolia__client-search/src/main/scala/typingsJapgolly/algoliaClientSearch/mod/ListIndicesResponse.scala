package typingsJapgolly.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndicesResponse extends StObject {
  
  /**
    * List of index response
    */
  var items: js.Array[Index]
  
  /**
    * Number of pages
    */
  var nbPages: Double
}
object ListIndicesResponse {
  
  inline def apply(items: js.Array[Index], nbPages: Double): ListIndicesResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndicesResponse]
  }
  
  extension [Self <: ListIndicesResponse](x: Self) {
    
    inline def setItems(value: js.Array[Index]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Index*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNbPages(value: Double): Self = StObject.set(x, "nbPages", value.asInstanceOf[js.Any])
  }
}
