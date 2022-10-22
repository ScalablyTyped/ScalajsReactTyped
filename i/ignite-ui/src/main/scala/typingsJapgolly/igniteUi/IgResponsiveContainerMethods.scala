package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgResponsiveContainerMethods extends StObject {
  
  /**
    * Adds a callback to the callback collection.
    *
    * @param callback The function to call when requirements are met.
    * @param owner The owner object of the function.
    * @param reactionStep The sensitivity of the size change recognition.
    * @param reactionDirection The dimensions the changes of which to be traced.
    */
  def addCallback(callback: js.Function, owner: js.Object, reactionStep: Double, reactionDirection: js.Object): Unit
  
  /**
    * Destroys the ResponsiveContainer widget
    */
  def destroy(): Unit
  
  /**
    * Removes a callback from the callbacks collection.
    *
    * @param callbackId The callback id to remove.
    */
  def removeCallback(callbackId: Double): Unit
  
  /**
    * Starts the automatic size check procedure
    */
  def startPoller(): Unit
  
  /**
    * Stops the automatic size check procedure
    */
  def stopPoller(): Unit
}
object IgResponsiveContainerMethods {
  
  inline def apply(
    addCallback: (js.Function, js.Object, Double, js.Object) => Callback,
    destroy: Callback,
    removeCallback: Double => Callback,
    startPoller: Callback,
    stopPoller: Callback
  ): IgResponsiveContainerMethods = {
    val __obj = js.Dynamic.literal(addCallback = js.Any.fromFunction4((t0: js.Function, t1: js.Object, t2: Double, t3: js.Object) => (addCallback(t0, t1, t2, t3)).runNow()), destroy = destroy.toJsFn, removeCallback = js.Any.fromFunction1((t0: Double) => removeCallback(t0).runNow()), startPoller = startPoller.toJsFn, stopPoller = stopPoller.toJsFn)
    __obj.asInstanceOf[IgResponsiveContainerMethods]
  }
  
  extension [Self <: IgResponsiveContainerMethods](x: Self) {
    
    inline def setAddCallback(value: (js.Function, js.Object, Double, js.Object) => Callback): Self = StObject.set(x, "addCallback", js.Any.fromFunction4((t0: js.Function, t1: js.Object, t2: Double, t3: js.Object) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setRemoveCallback(value: Double => Callback): Self = StObject.set(x, "removeCallback", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartPoller(value: Callback): Self = StObject.set(x, "startPoller", value.toJsFn)
    
    inline def setStopPoller(value: Callback): Self = StObject.set(x, "stopPoller", value.toJsFn)
  }
}
