package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a notifier for changes of XPropertySetInfos.
  * @see PropertySetInfoChangeEvent
  * @see XPropertySetInfoChangeListener
  */
trait XPropertySetInfoChangeNotifier
  extends StObject
     with XInterface {
  
  /**
    * registers a listener for PropertySetInfoChangeEvents.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addPropertySetInfoChangeListener(Listener: XPropertySetInfoChangeListener): Unit
  
  /**
    * removes a listener for PropertySetInfoChangeEvents.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removePropertySetInfoChangeListener(Listener: XPropertySetInfoChangeListener): Unit
}
object XPropertySetInfoChangeNotifier {
  
  inline def apply(
    acquire: Callback,
    addPropertySetInfoChangeListener: XPropertySetInfoChangeListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertySetInfoChangeListener: XPropertySetInfoChangeListener => Callback
  ): XPropertySetInfoChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addPropertySetInfoChangeListener = js.Any.fromFunction1((t0: XPropertySetInfoChangeListener) => addPropertySetInfoChangeListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertySetInfoChangeListener = js.Any.fromFunction1((t0: XPropertySetInfoChangeListener) => removePropertySetInfoChangeListener(t0).runNow()))
    __obj.asInstanceOf[XPropertySetInfoChangeNotifier]
  }
  
  extension [Self <: XPropertySetInfoChangeNotifier](x: Self) {
    
    inline def setAddPropertySetInfoChangeListener(value: XPropertySetInfoChangeListener => Callback): Self = StObject.set(x, "addPropertySetInfoChangeListener", js.Any.fromFunction1((t0: XPropertySetInfoChangeListener) => value(t0).runNow()))
    
    inline def setRemovePropertySetInfoChangeListener(value: XPropertySetInfoChangeListener => Callback): Self = StObject.set(x, "removePropertySetInfoChangeListener", js.Any.fromFunction1((t0: XPropertySetInfoChangeListener) => value(t0).runNow()))
  }
}
