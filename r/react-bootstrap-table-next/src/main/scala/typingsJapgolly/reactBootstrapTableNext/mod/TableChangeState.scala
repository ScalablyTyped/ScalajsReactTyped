package typingsJapgolly.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBootstrapTableNext.anon.Comparator
import typingsJapgolly.reactBootstrapTableNext.anon.NewValue
import typingsJapgolly.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc
import typingsJapgolly.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableChangeState[T] extends StObject {
  
  var cellEdit: NewValue
  
  var data: js.Array[T]
  
  var filters: StringDictionary[Comparator]
  
  var page: Double
  
  var sizePerPage: Double
  
  var sortField: String
  
  var sortOrder: asc | desc
}
object TableChangeState {
  
  inline def apply[T](
    cellEdit: NewValue,
    data: js.Array[T],
    filters: StringDictionary[Comparator],
    page: Double,
    sizePerPage: Double,
    sortField: String,
    sortOrder: asc | desc
  ): TableChangeState[T] = {
    val __obj = js.Dynamic.literal(cellEdit = cellEdit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], sizePerPage = sizePerPage.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableChangeState[T]]
  }
  
  extension [Self <: TableChangeState[?], T](x: Self & TableChangeState[T]) {
    
    inline def setCellEdit(value: NewValue): Self = StObject.set(x, "cellEdit", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFilters(value: StringDictionary[Comparator]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setSizePerPage(value: Double): Self = StObject.set(x, "sizePerPage", value.asInstanceOf[js.Any])
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
