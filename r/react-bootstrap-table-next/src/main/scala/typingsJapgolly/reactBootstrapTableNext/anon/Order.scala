package typingsJapgolly.reactBootstrapTableNext.anon

import typingsJapgolly.reactBootstrapTableNext.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  var dataField: js.UndefOr[Any] = js.undefined
  
  var order: SortOrder
  
  var sortCaret: js.UndefOr[Any] = js.undefined
  
  var sortFunc: js.UndefOr[Any] = js.undefined
}
object Order {
  
  inline def apply(order: SortOrder): Order = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setDataField(value: Any): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setSortCaret(value: Any): Self = StObject.set(x, "sortCaret", value.asInstanceOf[js.Any])
    
    inline def setSortCaretUndefined: Self = StObject.set(x, "sortCaret", js.undefined)
    
    inline def setSortFunc(value: Any): Self = StObject.set(x, "sortFunc", value.asInstanceOf[js.Any])
    
    inline def setSortFuncUndefined: Self = StObject.set(x, "sortFunc", js.undefined)
  }
}
