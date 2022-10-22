package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputePressureObserverWrapper extends StObject {
  
  /* private */ var _observer: Any
  
  /**
    * Method that must be called to begin observing changes, and triggering callbacks.
    * @param source defines the source to observe
    */
  def observe(source: IComputePressureSource): Unit
  
  /**
    * Method that must be called to stop observing changes and triggering callbacks (cleanup function).
    * @param source defines the source to unobserve
    */
  def unobserve(source: IComputePressureSource): Unit
}
object ComputePressureObserverWrapper {
  
  inline def apply(
    _observer: Any,
    observe: IComputePressureSource => Callback,
    unobserve: IComputePressureSource => Callback
  ): ComputePressureObserverWrapper = {
    val __obj = js.Dynamic.literal(_observer = _observer.asInstanceOf[js.Any], observe = js.Any.fromFunction1((t0: IComputePressureSource) => observe(t0).runNow()), unobserve = js.Any.fromFunction1((t0: IComputePressureSource) => unobserve(t0).runNow()))
    __obj.asInstanceOf[ComputePressureObserverWrapper]
  }
  
  extension [Self <: ComputePressureObserverWrapper](x: Self) {
    
    inline def setObserve(value: IComputePressureSource => Callback): Self = StObject.set(x, "observe", js.Any.fromFunction1((t0: IComputePressureSource) => value(t0).runNow()))
    
    inline def setUnobserve(value: IComputePressureSource => Callback): Self = StObject.set(x, "unobserve", js.Any.fromFunction1((t0: IComputePressureSource) => value(t0).runNow()))
    
    inline def set_observer(value: Any): Self = StObject.set(x, "_observer", value.asInstanceOf[js.Any])
  }
}
