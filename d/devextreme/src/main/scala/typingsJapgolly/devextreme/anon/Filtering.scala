package typingsJapgolly.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filtering extends StObject {
  
  /**
    * Specifies whether or not filtering must be performed on the server side.
    */
  var filtering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether paging by groups should be performed on the server side.
    */
  var groupPaging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not grouping must be performed on the server side.
    */
  var grouping: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not paging must be performed on the server side.
    */
  var paging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not sorting must be performed on the server side.
    */
  var sorting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not summaries summaries are calculated on the server-side.
    */
  var summary: js.UndefOr[Boolean] = js.undefined
}
object Filtering {
  
  inline def apply(): Filtering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filtering]
  }
  
  extension [Self <: Filtering](x: Self) {
    
    inline def setFiltering(value: Boolean): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
    
    inline def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    inline def setGroupPaging(value: Boolean): Self = StObject.set(x, "groupPaging", value.asInstanceOf[js.Any])
    
    inline def setGroupPagingUndefined: Self = StObject.set(x, "groupPaging", js.undefined)
    
    inline def setGrouping(value: Boolean): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setPaging(value: Boolean): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setSorting(value: Boolean): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    inline def setSummary(value: Boolean): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
