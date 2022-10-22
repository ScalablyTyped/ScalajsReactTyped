package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive window events.
  * @see XActivateListener
  */
trait XTopWindowListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a window is activated. */
  def windowActivated(e: EventObject): Unit
  
  /** is invoked when a window has been closed. */
  def windowClosed(e: EventObject): Unit
  
  /**
    * is invoked when a window is in the process of being closed.
    *
    * The close operation can be overridden at this point.
    */
  def windowClosing(e: EventObject): Unit
  
  /** is invoked when a window is deactivated. */
  def windowDeactivated(e: EventObject): Unit
  
  /** is invoked when a window is iconified. */
  def windowMinimized(e: EventObject): Unit
  
  /** is invoked when a window is deiconified. */
  def windowNormalized(e: EventObject): Unit
  
  /** is invoked when a window has been opened. */
  def windowOpened(e: EventObject): Unit
}
object XTopWindowListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    windowActivated: EventObject => Callback,
    windowClosed: EventObject => Callback,
    windowClosing: EventObject => Callback,
    windowDeactivated: EventObject => Callback,
    windowMinimized: EventObject => Callback,
    windowNormalized: EventObject => Callback,
    windowOpened: EventObject => Callback
  ): XTopWindowListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, windowActivated = js.Any.fromFunction1((t0: EventObject) => windowActivated(t0).runNow()), windowClosed = js.Any.fromFunction1((t0: EventObject) => windowClosed(t0).runNow()), windowClosing = js.Any.fromFunction1((t0: EventObject) => windowClosing(t0).runNow()), windowDeactivated = js.Any.fromFunction1((t0: EventObject) => windowDeactivated(t0).runNow()), windowMinimized = js.Any.fromFunction1((t0: EventObject) => windowMinimized(t0).runNow()), windowNormalized = js.Any.fromFunction1((t0: EventObject) => windowNormalized(t0).runNow()), windowOpened = js.Any.fromFunction1((t0: EventObject) => windowOpened(t0).runNow()))
    __obj.asInstanceOf[XTopWindowListener]
  }
  
  extension [Self <: XTopWindowListener](x: Self) {
    
    inline def setWindowActivated(value: EventObject => Callback): Self = StObject.set(x, "windowActivated", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setWindowClosed(value: EventObject => Callback): Self = StObject.set(x, "windowClosed", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setWindowClosing(value: EventObject => Callback): Self = StObject.set(x, "windowClosing", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setWindowDeactivated(value: EventObject => Callback): Self = StObject.set(x, "windowDeactivated", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setWindowMinimized(value: EventObject => Callback): Self = StObject.set(x, "windowMinimized", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setWindowNormalized(value: EventObject => Callback): Self = StObject.set(x, "windowNormalized", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setWindowOpened(value: EventObject => Callback): Self = StObject.set(x, "windowOpened", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
