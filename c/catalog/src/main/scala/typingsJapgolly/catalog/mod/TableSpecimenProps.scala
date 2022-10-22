package typingsJapgolly.catalog.mod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSpecimenProps extends StObject {
  
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  var rows: js.Array[StringDictionary[Node]]
}
object TableSpecimenProps {
  
  inline def apply(rows: js.Array[StringDictionary[Node]]): TableSpecimenProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSpecimenProps]
  }
  
  extension [Self <: TableSpecimenProps](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setRows(value: js.Array[StringDictionary[Node]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: StringDictionary[Node]*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
