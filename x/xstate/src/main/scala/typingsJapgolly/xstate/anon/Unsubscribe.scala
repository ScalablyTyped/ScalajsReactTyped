package typingsJapgolly.xstate.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unsubscribe extends StObject {
  
  def unsubscribe(): Unit
}
object Unsubscribe {
  
  inline def apply(unsubscribe: Callback): Unsubscribe = {
    val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
    __obj.asInstanceOf[Unsubscribe]
  }
  
  extension [Self <: Unsubscribe](x: Self) {
    
    inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
  }
}
