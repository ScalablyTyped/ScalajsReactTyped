package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a notifier for changes of XCommandInfos.
  * @author Kai Sommerfeld
  * @see CommandInfoChangeEvent
  * @see XCommandInfoChangeListener
  * @version 1.0
  */
trait XCommandInfoChangeNotifier
  extends StObject
     with XInterface {
  
  /**
    * registers a listener for CommandInfoChangeEvents.
    * @param Listener the listener to add.
    */
  def addCommandInfoChangeListener(Listener: XCommandInfoChangeListener): Unit
  
  /**
    * removes a listener for CommandInfoChangeEvents.
    * @param Listener the listener to remove.
    */
  def removeCommandInfoChangeListener(Listener: XCommandInfoChangeListener): Unit
}
object XCommandInfoChangeNotifier {
  
  inline def apply(
    acquire: Callback,
    addCommandInfoChangeListener: XCommandInfoChangeListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeCommandInfoChangeListener: XCommandInfoChangeListener => Callback
  ): XCommandInfoChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addCommandInfoChangeListener = js.Any.fromFunction1((t0: XCommandInfoChangeListener) => addCommandInfoChangeListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeCommandInfoChangeListener = js.Any.fromFunction1((t0: XCommandInfoChangeListener) => removeCommandInfoChangeListener(t0).runNow()))
    __obj.asInstanceOf[XCommandInfoChangeNotifier]
  }
  
  extension [Self <: XCommandInfoChangeNotifier](x: Self) {
    
    inline def setAddCommandInfoChangeListener(value: XCommandInfoChangeListener => Callback): Self = StObject.set(x, "addCommandInfoChangeListener", js.Any.fromFunction1((t0: XCommandInfoChangeListener) => value(t0).runNow()))
    
    inline def setRemoveCommandInfoChangeListener(value: XCommandInfoChangeListener => Callback): Self = StObject.set(x, "removeCommandInfoChangeListener", js.Any.fromFunction1((t0: XCommandInfoChangeListener) => value(t0).runNow()))
  }
}
