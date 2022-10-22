package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts changes when data from backend sources has changed.
  * @see XBackendChangesListener
  */
trait XBackendChangesNotifier
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive events when changes occurred.
    * @param aListener specifies the listener object.
    * @param component The name of the component the listener is monitoring changes for.
    */
  def addChangesListener(aListener: XBackendChangesListener, component: String): Unit
  
  /**
    * removes the specified listener.
    * @param aListener specifies the listener object.
    * @param component The name of the component the listener is monitoring changes for.
    */
  def removeChangesListener(aListener: XBackendChangesListener, component: String): Unit
}
object XBackendChangesNotifier {
  
  inline def apply(
    acquire: Callback,
    addChangesListener: (XBackendChangesListener, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeChangesListener: (XBackendChangesListener, String) => Callback
  ): XBackendChangesNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addChangesListener = js.Any.fromFunction2((t0: XBackendChangesListener, t1: String) => (addChangesListener(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChangesListener = js.Any.fromFunction2((t0: XBackendChangesListener, t1: String) => (removeChangesListener(t0, t1)).runNow()))
    __obj.asInstanceOf[XBackendChangesNotifier]
  }
  
  extension [Self <: XBackendChangesNotifier](x: Self) {
    
    inline def setAddChangesListener(value: (XBackendChangesListener, String) => Callback): Self = StObject.set(x, "addChangesListener", js.Any.fromFunction2((t0: XBackendChangesListener, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRemoveChangesListener(value: (XBackendChangesListener, String) => Callback): Self = StObject.set(x, "removeChangesListener", js.Any.fromFunction2((t0: XBackendChangesListener, t1: String) => (value(t0, t1)).runNow()))
  }
}
