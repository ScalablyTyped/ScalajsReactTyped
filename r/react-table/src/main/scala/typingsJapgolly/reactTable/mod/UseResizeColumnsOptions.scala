package typingsJapgolly.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseResizeColumnsOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetResize: js.UndefOr[Boolean] = js.undefined
  
  var disableResizing: js.UndefOr[Boolean] = js.undefined
}
object UseResizeColumnsOptions {
  
  inline def apply[D /* <: js.Object */](): UseResizeColumnsOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseResizeColumnsOptions[D]]
  }
  
  extension [Self <: UseResizeColumnsOptions[?], D /* <: js.Object */](x: Self & UseResizeColumnsOptions[D]) {
    
    inline def setAutoResetResize(value: Boolean): Self = StObject.set(x, "autoResetResize", value.asInstanceOf[js.Any])
    
    inline def setAutoResetResizeUndefined: Self = StObject.set(x, "autoResetResize", js.undefined)
    
    inline def setDisableResizing(value: Boolean): Self = StObject.set(x, "disableResizing", value.asInstanceOf[js.Any])
    
    inline def setDisableResizingUndefined: Self = StObject.set(x, "disableResizing", js.undefined)
  }
}
