package typingsJapgolly.unityWebapi

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnityLauncher extends StObject {
  
  def addAction(name: String, onActionInvoked: js.Function): Any
  
  def clearCount(): Any
  
  def clearProgress(): Any
  
  def removeAction(name: String): Any
  
  def removeActions(): Any
  
  def setCount(count: Double): Any
  
  def setProgress(progress: Double): Any
  
  def setUrgent(urgent: Boolean): Any
}
object UnityLauncher {
  
  inline def apply(
    addAction: (String, js.Function) => Any,
    clearCount: CallbackTo[Any],
    clearProgress: CallbackTo[Any],
    removeAction: String => Any,
    removeActions: CallbackTo[Any],
    setCount: Double => Any,
    setProgress: Double => Any,
    setUrgent: Boolean => Any
  ): UnityLauncher = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction2(addAction), clearCount = clearCount.toJsFn, clearProgress = clearProgress.toJsFn, removeAction = js.Any.fromFunction1(removeAction), removeActions = removeActions.toJsFn, setCount = js.Any.fromFunction1(setCount), setProgress = js.Any.fromFunction1(setProgress), setUrgent = js.Any.fromFunction1(setUrgent))
    __obj.asInstanceOf[UnityLauncher]
  }
  
  extension [Self <: UnityLauncher](x: Self) {
    
    inline def setAddAction(value: (String, js.Function) => Any): Self = StObject.set(x, "addAction", js.Any.fromFunction2(value))
    
    inline def setClearCount(value: CallbackTo[Any]): Self = StObject.set(x, "clearCount", value.toJsFn)
    
    inline def setClearProgress(value: CallbackTo[Any]): Self = StObject.set(x, "clearProgress", value.toJsFn)
    
    inline def setRemoveAction(value: String => Any): Self = StObject.set(x, "removeAction", js.Any.fromFunction1(value))
    
    inline def setRemoveActions(value: CallbackTo[Any]): Self = StObject.set(x, "removeActions", value.toJsFn)
    
    inline def setSetCount(value: Double => Any): Self = StObject.set(x, "setCount", js.Any.fromFunction1(value))
    
    inline def setSetProgress(value: Double => Any): Self = StObject.set(x, "setProgress", js.Any.fromFunction1(value))
    
    inline def setSetUrgent(value: Boolean => Any): Self = StObject.set(x, "setUrgent", js.Any.fromFunction1(value))
  }
}
