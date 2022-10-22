package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register listeners which are called whenever a document event (see {@link EventObject} ) occurs
  * @deprecated Deprecated
  * @see XDocumentEventBroadcaster
  */
trait XEventBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * registers the given listener
    * @param Listener listener which is interested on such events
    */
  def addEventListener(Listener: XEventListener): Unit
  
  /**
    * unregisters the given listener
    * @param Listener listener which isn't interested on such events any longer
    */
  def removeEventListener(Listener: XEventListener): Unit
}
object XEventBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): XEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[XEventBroadcaster]
  }
  
  extension [Self <: XEventBroadcaster](x: Self) {
    
    inline def setAddEventListener(value: XEventListener => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction1((t0: XEventListener) => value(t0).runNow()))
    
    inline def setRemoveEventListener(value: XEventListener => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1((t0: XEventListener) => value(t0).runNow()))
  }
}
