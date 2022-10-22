package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Behavior[T] extends StObject {
  
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  def attach(target: T): Unit
  
  /**
    * Called when the behavior is detached from its target
    */
  def detach(): Unit
  
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  def init(): Unit
  
  /** gets or sets behavior's name */
  var name: String
}
object Behavior {
  
  inline def apply[T](attach: T => Callback, detach: Callback, init: Callback, name: String): Behavior[T] = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1((t0: T) => attach(t0).runNow()), detach = detach.toJsFn, init = init.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior[T]]
  }
  
  extension [Self <: Behavior[?], T](x: Self & Behavior[T]) {
    
    inline def setAttach(value: T => Callback): Self = StObject.set(x, "attach", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setDetach(value: Callback): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
