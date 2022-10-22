package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionMixin extends StObject {
  
  def clearInteractionHandle(clearHandle: Double): Unit
  
  def createInteractionHandle(): Double
  
  /**
    * Schedule work for after all interactions have completed.
    *
    */
  def runAfterInteractions(callback: js.Function0[Any]): Unit
}
object InteractionMixin {
  
  inline def apply(
    clearInteractionHandle: Double => Callback,
    createInteractionHandle: CallbackTo[Double],
    runAfterInteractions: js.Function0[Any] => Callback
  ): InteractionMixin = {
    val __obj = js.Dynamic.literal(clearInteractionHandle = js.Any.fromFunction1((t0: Double) => clearInteractionHandle(t0).runNow()), createInteractionHandle = createInteractionHandle.toJsFn, runAfterInteractions = js.Any.fromFunction1((t0: js.Function0[Any]) => runAfterInteractions(t0).runNow()))
    __obj.asInstanceOf[InteractionMixin]
  }
  
  extension [Self <: InteractionMixin](x: Self) {
    
    inline def setClearInteractionHandle(value: Double => Callback): Self = StObject.set(x, "clearInteractionHandle", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setCreateInteractionHandle(value: CallbackTo[Double]): Self = StObject.set(x, "createInteractionHandle", value.toJsFn)
    
    inline def setRunAfterInteractions(value: js.Function0[Any] => Callback): Self = StObject.set(x, "runAfterInteractions", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
  }
}
