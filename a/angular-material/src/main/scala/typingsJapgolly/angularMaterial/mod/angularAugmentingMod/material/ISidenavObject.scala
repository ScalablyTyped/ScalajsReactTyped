package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISidenavObject extends StObject {
  
  def close(): IPromise[Unit]
  
  def isLockedOpen(): Boolean
  
  def isOpen(): Boolean
  
  def onClose(onClose: js.Function0[Unit]): Unit
  
  def open(): IPromise[Unit]
  
  def toggle(): IPromise[Unit]
}
object ISidenavObject {
  
  inline def apply(
    close: CallbackTo[IPromise[Unit]],
    isLockedOpen: CallbackTo[Boolean],
    isOpen: CallbackTo[Boolean],
    onClose: js.Function0[Unit] => Callback,
    open: CallbackTo[IPromise[Unit]],
    toggle: CallbackTo[IPromise[Unit]]
  ): ISidenavObject = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, isLockedOpen = isLockedOpen.toJsFn, isOpen = isOpen.toJsFn, onClose = js.Any.fromFunction1((t0: js.Function0[Unit]) => onClose(t0).runNow()), open = open.toJsFn, toggle = toggle.toJsFn)
    __obj.asInstanceOf[ISidenavObject]
  }
  
  extension [Self <: ISidenavObject](x: Self) {
    
    inline def setClose(value: CallbackTo[IPromise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setIsLockedOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLockedOpen", value.toJsFn)
    
    inline def setIsOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpen", value.toJsFn)
    
    inline def setOnClose(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOpen(value: CallbackTo[IPromise[Unit]]): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setToggle(value: CallbackTo[IPromise[Unit]]): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
