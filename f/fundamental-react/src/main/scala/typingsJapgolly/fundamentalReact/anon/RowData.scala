package typingsJapgolly.fundamentalReact.anon

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowData extends StObject {
  
  var rowData: js.Array[String | Node]
}
object RowData {
  
  inline def apply(rowData: js.Array[String | Node]): RowData = {
    val __obj = js.Dynamic.literal(rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowData]
  }
  
  extension [Self <: RowData](x: Self) {
    
    inline def setRowData(value: js.Array[String | Node]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowDataVarargs(value: (String | Node)*): Self = StObject.set(x, "rowData", js.Array(value*))
  }
}
