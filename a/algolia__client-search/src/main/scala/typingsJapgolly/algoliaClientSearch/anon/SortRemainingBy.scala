package typingsJapgolly.algoliaClientSearch.anon

import typingsJapgolly.algoliaClientSearch.algoliaClientSearchStrings.alpha
import typingsJapgolly.algoliaClientSearch.algoliaClientSearchStrings.count
import typingsJapgolly.algoliaClientSearch.algoliaClientSearchStrings.hidden
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortRemainingBy extends StObject {
  
  /**
    * pinned order of facet values
    */
  val order: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * How to display the remaining items.
    * - facet count (descending)
    * - alphabetical (ascending)
    * - hidden (show only pinned values)
    */
  val sortRemainingBy: js.UndefOr[count | alpha | hidden] = js.undefined
}
object SortRemainingBy {
  
  inline def apply(): SortRemainingBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortRemainingBy]
  }
  
  extension [Self <: SortRemainingBy](x: Self) {
    
    inline def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setSortRemainingBy(value: count | alpha | hidden): Self = StObject.set(x, "sortRemainingBy", value.asInstanceOf[js.Any])
    
    inline def setSortRemainingByUndefined: Self = StObject.set(x, "sortRemainingBy", js.undefined)
  }
}
