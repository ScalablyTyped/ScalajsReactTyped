package typingsJapgolly.rxjs.distTypesInternalTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unsubscribable
  extends StObject
     with _TeardownLogic {
  
  def unsubscribe(): Unit
}
object Unsubscribable {
  
  inline def apply(unsubscribe: Callback): Unsubscribable = {
    val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
    __obj.asInstanceOf[Unsubscribable]
  }
  
  extension [Self <: Unsubscribable](x: Self) {
    
    inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
  }
}
