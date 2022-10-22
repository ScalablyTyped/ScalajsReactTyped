package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** registers item listeners at controls like the com::sun::star::awt::Roadmap */
trait XItemEventBroadcaster
  extends StObject
     with XInterface {
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
}
object XItemEventBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addItemListener: XItemListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeItemListener: XItemListener => Callback
  ): XItemEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addItemListener = js.Any.fromFunction1((t0: XItemListener) => addItemListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeItemListener = js.Any.fromFunction1((t0: XItemListener) => removeItemListener(t0).runNow()))
    __obj.asInstanceOf[XItemEventBroadcaster]
  }
  
  extension [Self <: XItemEventBroadcaster](x: Self) {
    
    inline def setAddItemListener(value: XItemListener => Callback): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1((t0: XItemListener) => value(t0).runNow()))
    
    inline def setRemoveItemListener(value: XItemListener => Callback): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1((t0: XItemListener) => value(t0).runNow()))
  }
}
