package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to add handlers for key and mouse events. A handler is not a passive listener, it can even consume the event.
  * @since OOo 1.1.2
  */
trait XUserInputInterception
  extends StObject
     with XInterface {
  
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.KeyEvent} . Every listener is given the opportunity to consume the event, i.e. prevent
    * the not yet called listeners from being called.
    * @param xHandler If this is a valid reference it is inserted into the list of handlers. It is the task of the caller to not register the same handler twi
    */
  def addKeyHandler(xHandler: XKeyHandler): Unit
  
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.MouseEvent} . Every listener is given the opportunity to consume the event, i.e. prevent
    * the not yet called listeners from being called.
    * @param xHandler If this is a valid reference it is inserted into the list of handlers. It is the task of the caller to not register the same handler twi
    */
  def addMouseClickHandler(xHandler: XMouseClickHandler): Unit
  
  /**
    * Remove the specified listener from the list of listeners.
    * @param xHandler If the reference is empty then nothing will be changed. If the handler has been registered twice (or more) then all references will be r
    */
  def removeKeyHandler(xHandler: XKeyHandler): Unit
  
  /**
    * Remove the specified listener from the list of listeners.
    * @param xHandler If the reference is empty then nothing will be changed. If the handler has been registered twice (or more) then all references will be r
    */
  def removeMouseClickHandler(xHandler: XMouseClickHandler): Unit
}
object XUserInputInterception {
  
  inline def apply(
    acquire: Callback,
    addKeyHandler: XKeyHandler => Callback,
    addMouseClickHandler: XMouseClickHandler => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeKeyHandler: XKeyHandler => Callback,
    removeMouseClickHandler: XMouseClickHandler => Callback
  ): XUserInputInterception = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addKeyHandler = js.Any.fromFunction1((t0: XKeyHandler) => addKeyHandler(t0).runNow()), addMouseClickHandler = js.Any.fromFunction1((t0: XMouseClickHandler) => addMouseClickHandler(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeKeyHandler = js.Any.fromFunction1((t0: XKeyHandler) => removeKeyHandler(t0).runNow()), removeMouseClickHandler = js.Any.fromFunction1((t0: XMouseClickHandler) => removeMouseClickHandler(t0).runNow()))
    __obj.asInstanceOf[XUserInputInterception]
  }
  
  extension [Self <: XUserInputInterception](x: Self) {
    
    inline def setAddKeyHandler(value: XKeyHandler => Callback): Self = StObject.set(x, "addKeyHandler", js.Any.fromFunction1((t0: XKeyHandler) => value(t0).runNow()))
    
    inline def setAddMouseClickHandler(value: XMouseClickHandler => Callback): Self = StObject.set(x, "addMouseClickHandler", js.Any.fromFunction1((t0: XMouseClickHandler) => value(t0).runNow()))
    
    inline def setRemoveKeyHandler(value: XKeyHandler => Callback): Self = StObject.set(x, "removeKeyHandler", js.Any.fromFunction1((t0: XKeyHandler) => value(t0).runNow()))
    
    inline def setRemoveMouseClickHandler(value: XMouseClickHandler => Callback): Self = StObject.set(x, "removeMouseClickHandler", js.Any.fromFunction1((t0: XMouseClickHandler) => value(t0).runNow()))
  }
}
