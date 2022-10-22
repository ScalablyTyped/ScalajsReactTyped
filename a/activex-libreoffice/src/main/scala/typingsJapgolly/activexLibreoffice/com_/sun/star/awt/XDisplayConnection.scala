package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface should be implemented by toolkits that want to give access to their internal message handling loop. */
trait XDisplayConnection
  extends StObject
     with XInterface {
  
  /**
    * returns a identifier.
    * @returns a unique platform dependent identifier for a display connection.
    */
  val Identifier: Any
  
  /**
    * register an error handler for toolkit specific errors.
    * @param errorHandler the handler to register.
    */
  def addErrorHandler(errorHandler: XEventHandler): Unit
  
  /**
    * registers an event handler.
    * @param window the platform specific window id. If empty, the handler should be registered for all windows.
    * @param eventHandler the handler to register.
    * @param eventMask the event mask specifies the events the handler is interested in.
    */
  def addEventHandler(window: Any, eventHandler: XEventHandler, eventMask: Double): Unit
  
  /**
    * returns a identifier.
    * @returns a unique platform dependent identifier for a display connection.
    */
  def getIdentifier(): Any
  
  /**
    * remover an error handler from the handler list.
    * @param errorHandler the handler to remove.
    */
  def removeErrorHandler(errorHandler: XEventHandler): Unit
  
  /**
    * removes a eventHandler from the handler list.
    * @param window the platform specific window id the handler should be unregistered for. If empty, the handler should be unregistered completely.
    * @param eventHandler the handler to remove.
    */
  def removeEventHandler(window: Any, eventHandler: XEventHandler): Unit
}
object XDisplayConnection {
  
  inline def apply(
    Identifier: Any,
    acquire: Callback,
    addErrorHandler: XEventHandler => Callback,
    addEventHandler: (Any, XEventHandler, Double) => Callback,
    getIdentifier: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback,
    removeErrorHandler: XEventHandler => Callback,
    removeEventHandler: (Any, XEventHandler) => Callback
  ): XDisplayConnection = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], acquire = acquire.toJsFn, addErrorHandler = js.Any.fromFunction1((t0: XEventHandler) => addErrorHandler(t0).runNow()), addEventHandler = js.Any.fromFunction3((t0: Any, t1: XEventHandler, t2: Double) => (addEventHandler(t0, t1, t2)).runNow()), getIdentifier = getIdentifier.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeErrorHandler = js.Any.fromFunction1((t0: XEventHandler) => removeErrorHandler(t0).runNow()), removeEventHandler = js.Any.fromFunction2((t0: Any, t1: XEventHandler) => (removeEventHandler(t0, t1)).runNow()))
    __obj.asInstanceOf[XDisplayConnection]
  }
  
  extension [Self <: XDisplayConnection](x: Self) {
    
    inline def setAddErrorHandler(value: XEventHandler => Callback): Self = StObject.set(x, "addErrorHandler", js.Any.fromFunction1((t0: XEventHandler) => value(t0).runNow()))
    
    inline def setAddEventHandler(value: (Any, XEventHandler, Double) => Callback): Self = StObject.set(x, "addEventHandler", js.Any.fromFunction3((t0: Any, t1: XEventHandler, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetIdentifier(value: CallbackTo[Any]): Self = StObject.set(x, "getIdentifier", value.toJsFn)
    
    inline def setIdentifier(value: Any): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setRemoveErrorHandler(value: XEventHandler => Callback): Self = StObject.set(x, "removeErrorHandler", js.Any.fromFunction1((t0: XEventHandler) => value(t0).runNow()))
    
    inline def setRemoveEventHandler(value: (Any, XEventHandler) => Callback): Self = StObject.set(x, "removeEventHandler", js.Any.fromFunction2((t0: Any, t1: XEventHandler) => (value(t0, t1)).runNow()))
  }
}
