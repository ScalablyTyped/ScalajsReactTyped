package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListColumnFilterable extends StObject {
  
  var cell: js.UndefOr[TreeListColumnFilterableCell] = js.undefined
  
  var ui: js.UndefOr[String | js.Function] = js.undefined
}
object TreeListColumnFilterable {
  
  inline def apply(): TreeListColumnFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumnFilterable]
  }
  
  extension [Self <: TreeListColumnFilterable](x: Self) {
    
    inline def setCell(value: TreeListColumnFilterableCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setUi(value: String | js.Function): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
