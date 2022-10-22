package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecExprMod.ExprRef
import typingsJapgolly.vegaTypings.typesSpecMarkMod.Compare
import typingsJapgolly.vegaTypings.typesSpecScaleMod.SortOrder
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order
  extends StObject
     with Compare {
  
  var field: String | ExprRef | SignalRef
  
  var order: js.UndefOr[SortOrder] = js.undefined
}
object Order {
  
  inline def apply(field: String | ExprRef | SignalRef): Order = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setField(value: String | ExprRef | SignalRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
