package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecScaleMod.SortOrder
import typingsJapgolly.vegaTypings.typesSpecScaleMod._SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderSortOrder
  extends StObject
     with _SortField {
  
  var order: SortOrder
}
object OrderSortOrder {
  
  inline def apply(order: SortOrder): OrderSortOrder = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderSortOrder]
  }
  
  extension [Self <: OrderSortOrder](x: Self) {
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
