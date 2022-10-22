package typingsJapgolly.xstate.libTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  def unsubscribe(): Unit
}
object Subscription {
  
  inline def apply(unsubscribe: Callback): Subscription = {
    val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
  }
}
