package typingsJapgolly.webix.webix

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
  
  inline def apply(getState: CallbackTo[Any], setState: Any => Callback): DataState = {
    val __obj = js.Dynamic.literal(getState = getState.toJsFn, setState = js.Any.fromFunction1((t0: Any) => setState(t0).runNow()))
    __obj.asInstanceOf[DataState]
  }
  
  extension [Self <: DataState](x: Self) {
    
    inline def setGetState(value: CallbackTo[Any]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setSetState(value: Any => Callback): Self = StObject.set(x, "setState", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
