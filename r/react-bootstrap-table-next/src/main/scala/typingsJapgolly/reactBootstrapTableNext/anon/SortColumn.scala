package typingsJapgolly.reactBootstrapTableNext.anon

import typingsJapgolly.reactBootstrapTableNext.mod.ColumnDescription
import typingsJapgolly.reactBootstrapTableNext.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortColumn[T /* <: js.Object */] extends StObject {
  
  var sortColumn: ColumnDescription[T, Any]
  
  var sortOrder: SortOrder
}
object SortColumn {
  
  inline def apply[T /* <: js.Object */](sortColumn: ColumnDescription[T, Any], sortOrder: SortOrder): SortColumn[T] = {
    val __obj = js.Dynamic.literal(sortColumn = sortColumn.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortColumn[T]]
  }
  
  extension [Self <: SortColumn[?], T /* <: js.Object */](x: Self & SortColumn[T]) {
    
    inline def setSortColumn(value: ColumnDescription[T, Any]): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
