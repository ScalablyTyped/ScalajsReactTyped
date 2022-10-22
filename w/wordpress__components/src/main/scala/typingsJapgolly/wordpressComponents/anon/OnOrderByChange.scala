package typingsJapgolly.wordpressComponents.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wordpressComponents.queryControlsMod.QueryControls.Order
import typingsJapgolly.wordpressComponents.queryControlsMod.QueryControls.OrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnOrderByChange extends StObject {
  
  def onOrderByChange(orderBy: OrderBy): Unit
  
  def onOrderChange(order: Order): Unit
  
  var order: Order
  
  var orderBy: OrderBy
}
object OnOrderByChange {
  
  inline def apply(
    onOrderByChange: OrderBy => Callback,
    onOrderChange: Order => Callback,
    order: Order,
    orderBy: OrderBy
  ): OnOrderByChange = {
    val __obj = js.Dynamic.literal(onOrderByChange = js.Any.fromFunction1((t0: OrderBy) => onOrderByChange(t0).runNow()), onOrderChange = js.Any.fromFunction1((t0: Order) => onOrderChange(t0).runNow()), order = order.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOrderByChange]
  }
  
  extension [Self <: OnOrderByChange](x: Self) {
    
    inline def setOnOrderByChange(value: OrderBy => Callback): Self = StObject.set(x, "onOrderByChange", js.Any.fromFunction1((t0: OrderBy) => value(t0).runNow()))
    
    inline def setOnOrderChange(value: Order => Callback): Self = StObject.set(x, "onOrderChange", js.Any.fromFunction1((t0: Order) => value(t0).runNow()))
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
  }
}
