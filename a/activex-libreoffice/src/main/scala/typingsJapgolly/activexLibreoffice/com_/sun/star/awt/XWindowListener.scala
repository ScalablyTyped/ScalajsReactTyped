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
  *
  * Component events are provided **only** for notification purposes. Moves and resizes will be handled internally by the window component, so that GUI
  * layout works properly regardless of whether a program registers such a listener or not.
  */
trait XWindowListener
  extends StObject
     with XEventListener {
  
  /** is invoked when the window has been hidden. */
  def windowHidden(e: EventObject): Unit
  
  /** is invoked when the window has been moved. */
  def windowMoved(e: WindowEvent): Unit
  
  /** is invoked when the window has been resized. */
  def windowResized(e: WindowEvent): Unit
  
  /** is invoked when the window has been shown. */
  def windowShown(e: EventObject): Unit
}
object XWindowListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    windowHidden: EventObject => Callback,
    windowMoved: WindowEvent => Callback,
    windowResized: WindowEvent => Callback,
    windowShown: EventObject => Callback
  ): XWindowListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, windowHidden = js.Any.fromFunction1((t0: EventObject) => windowHidden(t0).runNow()), windowMoved = js.Any.fromFunction1((t0: WindowEvent) => windowMoved(t0).runNow()), windowResized = js.Any.fromFunction1((t0: WindowEvent) => windowResized(t0).runNow()), windowShown = js.Any.fromFunction1((t0: EventObject) => windowShown(t0).runNow()))
    __obj.asInstanceOf[XWindowListener]
  }
  
  extension [Self <: XWindowListener](x: Self) {
    
    inline def setWindowHidden(value: EventObject => Callback): Self = StObject.set(x, "windowHidden", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setWindowMoved(value: WindowEvent => Callback): Self = StObject.set(x, "windowMoved", js.Any.fromFunction1((t0: WindowEvent) => value(t0).runNow()))
    
    inline def setWindowResized(value: WindowEvent => Callback): Self = StObject.set(x, "windowResized", js.Any.fromFunction1((t0: WindowEvent) => value(t0).runNow()))
    
    inline def setWindowShown(value: EventObject => Callback): Self = StObject.set(x, "windowShown", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
