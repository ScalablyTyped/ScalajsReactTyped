package typingsJapgolly.gestalt.mod

import typingsJapgolly.gestalt.gestaltStrings.col
import typingsJapgolly.gestalt.gestaltStrings.colgroup
import typingsJapgolly.gestalt.gestaltStrings.row
import typingsJapgolly.gestalt.gestaltStrings.rowgroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHeaderCellProps
  extends StObject
     with TableCellProps {
  
  var scope: js.UndefOr[col | row | colgroup | rowgroup] = js.undefined
}
object TableHeaderCellProps {
  
  inline def apply(): TableHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaderCellProps]
  }
  
  extension [Self <: TableHeaderCellProps](x: Self) {
    
    inline def setScope(value: col | row | colgroup | rowgroup): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
