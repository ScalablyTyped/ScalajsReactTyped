package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive activate events.
  * @see XFocusListener
  * @see XTopWindowListener
  */
trait XActivateListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when a window is activated.
    *
    * A window is activated if a child or itself got the focus.
    * @see XFocusListener.focusGained
    */
  def windowActivated(e: EventObject): Unit
  
  /**
    * is invoked when a window is deactivated.
    *
    * A window is deactivated if a child or itself lost the focus.
    * @see XFocusListener.focusLost
    */
  def windowDeactivated(e: EventObject): Unit
}
object XActivateListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    windowActivated: EventObject => Callback,
    windowDeactivated: EventObject => Callback
  ): XActivateListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, windowActivated = js.Any.fromFunction1((t0: EventObject) => windowActivated(t0).runNow()), windowDeactivated = js.Any.fromFunction1((t0: EventObject) => windowDeactivated(t0).runNow()))
    __obj.asInstanceOf[XActivateListener]
  }
  
  extension [Self <: XActivateListener](x: Self) {
    
    inline def setWindowActivated(value: EventObject => Callback): Self = StObject.set(x, "windowActivated", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setWindowDeactivated(value: EventObject => Callback): Self = StObject.set(x, "windowDeactivated", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
