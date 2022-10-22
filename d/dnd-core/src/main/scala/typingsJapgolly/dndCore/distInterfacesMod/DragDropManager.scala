package typingsJapgolly.dndCore.distInterfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropManager extends StObject {
  
  def dispatch(action: Any): Unit
  
  def getActions(): DragDropActions
  
  def getBackend(): Backend
  
  def getMonitor(): DragDropMonitor
  
  def getRegistry(): HandlerRegistry
}
object DragDropManager {
  
  inline def apply(
    dispatch: Any => Callback,
    getActions: CallbackTo[DragDropActions],
    getBackend: CallbackTo[Backend],
    getMonitor: CallbackTo[DragDropMonitor],
    getRegistry: CallbackTo[HandlerRegistry]
  ): DragDropManager = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1((t0: Any) => dispatch(t0).runNow()), getActions = getActions.toJsFn, getBackend = getBackend.toJsFn, getMonitor = getMonitor.toJsFn, getRegistry = getRegistry.toJsFn)
    __obj.asInstanceOf[DragDropManager]
  }
  
  extension [Self <: DragDropManager](x: Self) {
    
    inline def setDispatch(value: Any => Callback): Self = StObject.set(x, "dispatch", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGetActions(value: CallbackTo[DragDropActions]): Self = StObject.set(x, "getActions", value.toJsFn)
    
    inline def setGetBackend(value: CallbackTo[Backend]): Self = StObject.set(x, "getBackend", value.toJsFn)
    
    inline def setGetMonitor(value: CallbackTo[DragDropMonitor]): Self = StObject.set(x, "getMonitor", value.toJsFn)
    
    inline def setGetRegistry(value: CallbackTo[HandlerRegistry]): Self = StObject.set(x, "getRegistry", value.toJsFn)
  }
}
