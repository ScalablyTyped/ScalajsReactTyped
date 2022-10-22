package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiObserver[T] extends StObject {
  
  /* private */ var _observables: Any
  
  /* private */ var _observers: Any
  
  /**
    * Release associated resources
    */
  def dispose(): Unit
}
object MultiObserver {
  
  inline def apply[T](_observables: Any, _observers: Any, dispose: Callback): MultiObserver[T] = {
    val __obj = js.Dynamic.literal(_observables = _observables.asInstanceOf[js.Any], _observers = _observers.asInstanceOf[js.Any], dispose = dispose.toJsFn)
    __obj.asInstanceOf[MultiObserver[T]]
  }
  
  extension [Self <: MultiObserver[?], T](x: Self & MultiObserver[T]) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def set_observables(value: Any): Self = StObject.set(x, "_observables", value.asInstanceOf[js.Any])
    
    inline def set_observers(value: Any): Self = StObject.set(x, "_observers", value.asInstanceOf[js.Any])
  }
}
