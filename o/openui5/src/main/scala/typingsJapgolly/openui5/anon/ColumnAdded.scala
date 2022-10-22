package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapUiTableColumnMod.default
import typingsJapgolly.openui5.sapUiTableLibraryMod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnAdded extends StObject {
  
  /**
    * sorted column.
    */
  var column: js.UndefOr[default] = js.undefined
  
  /**
    * If column was added to sorter this is true. If new sort is started this is set to false
    */
  var columnAdded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sort Order
    */
  var sortOrder: js.UndefOr[
    SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String)
  ] = js.undefined
}
object ColumnAdded {
  
  inline def apply(): ColumnAdded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnAdded]
  }
  
  extension [Self <: ColumnAdded](x: Self) {
    
    inline def setColumn(value: default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnAdded(value: Boolean): Self = StObject.set(x, "columnAdded", value.asInstanceOf[js.Any])
    
    inline def setColumnAddedUndefined: Self = StObject.set(x, "columnAdded", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setSortOrder(
      value: SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String)
    ): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
