package typingsJapgolly.rxjs.distTypesInternalTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionLike
  extends StObject
     with Unsubscribable {
  
  val closed: Boolean
}
object SubscriptionLike {
  
  inline def apply(closed: Boolean, unsubscribe: Callback): SubscriptionLike = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = unsubscribe.toJsFn)
    __obj.asInstanceOf[SubscriptionLike]
  }
  
  extension [Self <: SubscriptionLike](x: Self) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
  }
}
