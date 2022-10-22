package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This key handler is similar to {@link com.sun.star.awt.XKeyListener} but allows the consumption of key events. If a key event is consumed by one
  * handler both the following handlers, with respect to the list of key handlers of the broadcaster, and a following handling by the broadcaster will not
  * take place.
  * @since OOo 1.1.2
  */
trait XKeyHandler
  extends StObject
     with XEventListener {
  
  /**
    * This function is called by the broadcaster, an {@link com.sun.star.awt.XExtendedToolkit} for instance, after a key has been pressed but before it is
    * released. The return value decides about whether other handlers will be called and a handling by the broadcaster will take place.
    *
    * Consume the event if the action performed by the implementation is mutually exclusive with the default action of the broadcaster or, when known, with
    * that of other handlers.
    *
    * Consuming this event does not prevent the pending key-release event from being broadcasted.
    * @param aEvent The key event informs about the pressed key.
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def keyPressed(aEvent: KeyEvent): Boolean
  
  /**
    * This function is called by the broadcaster, an {@link com.sun.star.awt.XExtendedToolkit} for instance, after a key has been pressed and released. The
    * return value decides about whether other handlers will be called and a handling by the broadcaster will take place.
    *
    * Consume the event if the action performed by the implementation is mutually exclusive with the default action of the broadcaster or, when known, with
    * that of other handlers.
    * @param aEvent The key event informs about the pressed key.
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def keyReleased(aEvent: KeyEvent): Boolean
}
object XKeyHandler {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    keyPressed: KeyEvent => Boolean,
    keyReleased: KeyEvent => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XKeyHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), keyPressed = js.Any.fromFunction1(keyPressed), keyReleased = js.Any.fromFunction1(keyReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XKeyHandler]
  }
  
  extension [Self <: XKeyHandler](x: Self) {
    
    inline def setKeyPressed(value: KeyEvent => Boolean): Self = StObject.set(x, "keyPressed", js.Any.fromFunction1(value))
    
    inline def setKeyReleased(value: KeyEvent => Boolean): Self = StObject.set(x, "keyReleased", js.Any.fromFunction1(value))
  }
}
