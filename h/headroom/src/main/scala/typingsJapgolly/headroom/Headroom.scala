package typingsJapgolly.headroom

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headroom extends StObject {
  
  /** destroy the headroom instance, removing event listeners and any classes added */
  def destroy(): Unit
  
  /** freeze the headroom instance's state (pinned or unpinned), and no longer respond to scroll events */
  def freeze(): Unit
  
  /** initialise */
  def init(): Unit
  
  /** forcibly set the headroom instance's state to pinned */
  def pin(): Unit
  
  /** resume responding to scroll events */
  def unfreeze(): Unit
  
  /** forcibly set the headroom instance's state to unpinned */
  def unpin(): Unit
}
object Headroom {
  
  inline def apply(
    destroy: Callback,
    freeze: Callback,
    init: Callback,
    pin: Callback,
    unfreeze: Callback,
    unpin: Callback
  ): Headroom = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, freeze = freeze.toJsFn, init = init.toJsFn, pin = pin.toJsFn, unfreeze = unfreeze.toJsFn, unpin = unpin.toJsFn)
    __obj.asInstanceOf[Headroom]
  }
  
  extension [Self <: Headroom](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setFreeze(value: Callback): Self = StObject.set(x, "freeze", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setPin(value: Callback): Self = StObject.set(x, "pin", value.toJsFn)
    
    inline def setUnfreeze(value: Callback): Self = StObject.set(x, "unfreeze", value.toJsFn)
    
    inline def setUnpin(value: Callback): Self = StObject.set(x, "unpin", value.toJsFn)
  }
}
