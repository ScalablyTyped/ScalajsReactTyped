package typingsJapgolly.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableHeadRow extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.undefined
}
object MUIDataTableHeadRow {
  
  inline def apply(): MUIDataTableHeadRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableHeadRow]
  }
  
  extension [Self <: MUIDataTableHeadRow](x: Self) {
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
  }
}
