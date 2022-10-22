package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the docking interface for a window component.
  *
  * A window can either be docked where it resides as a child window in an application frame window or it can be floating where it will reside in its own
  * decorated top level window.
  */
trait XDockableWindow
  extends StObject
     with XInterface {
  
  /** adds a docking listener to the object. only a single listener may be registered at any time. */
  def addDockableWindowListener(xListener: XDockableWindowListener): Unit
  
  /**
    * enable or disable docking, docking is disabled by default
    * @param bEnable `TRUE` specifies that docking is enabled `FALSE` specifies that docking is disabled and no {@link com.sun.star.awt.XDockableWindowListene
    */
  def enableDocking(bEnable: Boolean): Unit
  
  /**
    * queries the current window state
    * @returns `TRUE` if the window is floating `FALSE` if the window is docked
    */
  def isFloating(): Boolean
  
  /**
    * queries the current pop-up mode
    * @returns `TRUE` if the window is in pop-up mode `FALSE` if the window is not in pop-up mode
    */
  def isInPopupMode(): Boolean
  
  /**
    * queries the current locking state
    * @returns `TRUE` if the window is locked `FALSE` if the window is not locked
    */
  def isLocked(): Boolean
  
  /** prevents the window from being undocked this has no effect if the window is floating */
  def lock(): Unit
  
  /** removes the specified docking listener from the object. */
  def removeDockableWindowListener(xListener: XDockableWindowListener): Unit
  
  /**
    * toggle between floating and docked state
    * @param bFloating specifies the new floating mode: `TRUE` means floating, `FALSE` means docked
    */
  def setFloatingMode(bFloating: Boolean): Unit
  
  /**
    * shows the window in a menu like style, i.e. without decoration a special indicator will allow for tearing off the window see {@link
    * com.sun.star.awt.XDockableWindowListener} for the corresponding events
    * @param WindowRect specifies the position and size of the pop-up window in frame coordinates
    */
  def startPopupMode(WindowRect: Rectangle): Unit
  
  /** enables undocking this has no effect if the window is floating */
  def unlock(): Unit
}
object XDockableWindow {
  
  inline def apply(
    acquire: Callback,
    addDockableWindowListener: XDockableWindowListener => Callback,
    enableDocking: Boolean => Callback,
    isFloating: CallbackTo[Boolean],
    isInPopupMode: CallbackTo[Boolean],
    isLocked: CallbackTo[Boolean],
    lock: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeDockableWindowListener: XDockableWindowListener => Callback,
    setFloatingMode: Boolean => Callback,
    startPopupMode: Rectangle => Callback,
    unlock: Callback
  ): XDockableWindow = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addDockableWindowListener = js.Any.fromFunction1((t0: XDockableWindowListener) => addDockableWindowListener(t0).runNow()), enableDocking = js.Any.fromFunction1((t0: Boolean) => enableDocking(t0).runNow()), isFloating = isFloating.toJsFn, isInPopupMode = isInPopupMode.toJsFn, isLocked = isLocked.toJsFn, lock = lock.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDockableWindowListener = js.Any.fromFunction1((t0: XDockableWindowListener) => removeDockableWindowListener(t0).runNow()), setFloatingMode = js.Any.fromFunction1((t0: Boolean) => setFloatingMode(t0).runNow()), startPopupMode = js.Any.fromFunction1((t0: Rectangle) => startPopupMode(t0).runNow()), unlock = unlock.toJsFn)
    __obj.asInstanceOf[XDockableWindow]
  }
  
  extension [Self <: XDockableWindow](x: Self) {
    
    inline def setAddDockableWindowListener(value: XDockableWindowListener => Callback): Self = StObject.set(x, "addDockableWindowListener", js.Any.fromFunction1((t0: XDockableWindowListener) => value(t0).runNow()))
    
    inline def setEnableDocking(value: Boolean => Callback): Self = StObject.set(x, "enableDocking", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setIsFloating(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFloating", value.toJsFn)
    
    inline def setIsInPopupMode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInPopupMode", value.toJsFn)
    
    inline def setIsLocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLocked", value.toJsFn)
    
    inline def setLock(value: Callback): Self = StObject.set(x, "lock", value.toJsFn)
    
    inline def setRemoveDockableWindowListener(value: XDockableWindowListener => Callback): Self = StObject.set(x, "removeDockableWindowListener", js.Any.fromFunction1((t0: XDockableWindowListener) => value(t0).runNow()))
    
    inline def setSetFloatingMode(value: Boolean => Callback): Self = StObject.set(x, "setFloatingMode", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setStartPopupMode(value: Rectangle => Callback): Self = StObject.set(x, "startPopupMode", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
    
    inline def setUnlock(value: Callback): Self = StObject.set(x, "unlock", value.toJsFn)
  }
}
