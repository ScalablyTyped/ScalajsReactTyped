package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive keyboard focus events.
  *
  * The window which has the keyboard focus is the window which gets the keyboard events.
  */
trait XFocusListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when a window gains the keyboard focus.
    * @see XActivateListener.windowActivated
    */
  def focusGained(e: FocusEvent): Unit
  
  /**
    * is invoked when a window loses the keyboard focus.
    * @see XActivateListener.windowDeactivated
    */
  def focusLost(e: FocusEvent): Unit
}
object XFocusListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    focusGained: FocusEvent => Callback,
    focusLost: FocusEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XFocusListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), focusGained = js.Any.fromFunction1((t0: FocusEvent) => focusGained(t0).runNow()), focusLost = js.Any.fromFunction1((t0: FocusEvent) => focusLost(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFocusListener]
  }
  
  extension [Self <: XFocusListener](x: Self) {
    
    inline def setFocusGained(value: FocusEvent => Callback): Self = StObject.set(x, "focusGained", js.Any.fromFunction1((t0: FocusEvent) => value(t0).runNow()))
    
    inline def setFocusLost(value: FocusEvent => Callback): Self = StObject.set(x, "focusLost", js.Any.fromFunction1((t0: FocusEvent) => value(t0).runNow()))
  }
}
