package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelEdit[K, D]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var cancelEdit: Boolean
  
  var cellContext: typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]
}
object CancelEdit {
  
  inline def apply[K, D](
    cancelEdit: Boolean,
    cellContext: typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]
  ): CancelEdit[K, D] = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], cellContext = cellContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEdit[K, D]]
  }
  
  extension [Self <: CancelEdit[?, ?], K, D](x: Self & (CancelEdit[K, D])) {
    
    inline def setCancelEdit(value: Boolean): Self = StObject.set(x, "cancelEdit", value.asInstanceOf[js.Any])
    
    inline def setCellContext(value: typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]): Self = StObject.set(x, "cellContext", value.asInstanceOf[js.Any])
  }
}
