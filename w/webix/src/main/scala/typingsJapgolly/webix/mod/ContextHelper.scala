package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextHelper extends StObject {
  
  def attachTo(view: Any): Unit
  
  def getContext(): Any
  
  def setContext(context: Any): Unit
}
object ContextHelper {
  
  @JSImport("webix", "ContextHelper")
  @js.native
  val ^ : ContextHelper = js.native
  
  extension [Self <: ContextHelper](x: Self) {
    
    inline def setAttachTo(value: Any => Callback): Self = StObject.set(x, "attachTo", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGetContext(value: CallbackTo[Any]): Self = StObject.set(x, "getContext", value.toJsFn)
    
    inline def setSetContext(value: Any => Callback): Self = StObject.set(x, "setContext", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
