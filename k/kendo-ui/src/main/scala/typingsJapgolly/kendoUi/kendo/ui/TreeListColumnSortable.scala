package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListColumnSortable extends StObject {
  
  var compare: js.UndefOr[js.Function] = js.undefined
}
object TreeListColumnSortable {
  
  inline def apply(): TreeListColumnSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumnSortable]
  }
  
  extension [Self <: TreeListColumnSortable](x: Self) {
    
    inline def setCompare(value: js.Function): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
  }
}
