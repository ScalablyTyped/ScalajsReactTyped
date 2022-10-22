package typingsJapgolly.popperjsCore.libTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.popperjsCore.anon.PartialOptionsGenericany
import typingsJapgolly.popperjsCore.anon.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  def destroy(): Unit
  
  def forceUpdate(): Unit
  
  def setOptions(setOptionsAction: SetAction[PartialOptionsGenericany]): js.Promise[PartialState]
  
  var state: State
  
  def update(): js.Promise[PartialState]
}
object Instance {
  
  inline def apply(
    destroy: Callback,
    forceUpdate: Callback,
    setOptions: SetAction[PartialOptionsGenericany] => js.Promise[PartialState],
    state: State,
    update: CallbackTo[js.Promise[PartialState]]
  ): Instance = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, forceUpdate = forceUpdate.toJsFn, setOptions = js.Any.fromFunction1(setOptions), state = state.asInstanceOf[js.Any], update = update.toJsFn)
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setForceUpdate(value: Callback): Self = StObject.set(x, "forceUpdate", value.toJsFn)
    
    inline def setSetOptions(value: SetAction[PartialOptionsGenericany] => js.Promise[PartialState]): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: CallbackTo[js.Promise[PartialState]]): Self = StObject.set(x, "update", value.toJsFn)
  }
}
