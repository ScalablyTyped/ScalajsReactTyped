package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataState extends StObject {
  
  def getState(): Any
  
  def setState(state: Any): Unit
}
object DataState {
  
  @JSImport("webix", "DataState")
  @js.native
  val ^ : DataState = js.native
  
  extension [Self <: DataState](x: Self) {
    
    inline def setGetState(value: CallbackTo[Any]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setSetState(value: Any => Callback): Self = StObject.set(x, "setState", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
