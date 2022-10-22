package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows receive window-related events, additional to the ones received by an {@link XWindowListener} */
trait XWindowListener2
  extends StObject
     with XWindowListener {
  
  /** is called when the window has been disabled. */
  def windowDisabled(e: EventObject): Unit
  
  /** is called when the window has been enabled. */
  def windowEnabled(e: EventObject): Unit
}
object XWindowListener2 {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    windowDisabled: EventObject => Callback,
    windowEnabled: EventObject => Callback,
    windowHidden: EventObject => Callback,
    windowMoved: WindowEvent => Callback,
    windowResized: WindowEvent => Callback,
    windowShown: EventObject => Callback
  ): XWindowListener2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, windowDisabled = js.Any.fromFunction1((t0: EventObject) => windowDisabled(t0).runNow()), windowEnabled = js.Any.fromFunction1((t0: EventObject) => windowEnabled(t0).runNow()), windowHidden = js.Any.fromFunction1((t0: EventObject) => windowHidden(t0).runNow()), windowMoved = js.Any.fromFunction1((t0: WindowEvent) => windowMoved(t0).runNow()), windowResized = js.Any.fromFunction1((t0: WindowEvent) => windowResized(t0).runNow()), windowShown = js.Any.fromFunction1((t0: EventObject) => windowShown(t0).runNow()))
    __obj.asInstanceOf[XWindowListener2]
  }
  
  extension [Self <: XWindowListener2](x: Self) {
    
    inline def setWindowDisabled(value: EventObject => Callback): Self = StObject.set(x, "windowDisabled", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setWindowEnabled(value: EventObject => Callback): Self = StObject.set(x, "windowEnabled", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
