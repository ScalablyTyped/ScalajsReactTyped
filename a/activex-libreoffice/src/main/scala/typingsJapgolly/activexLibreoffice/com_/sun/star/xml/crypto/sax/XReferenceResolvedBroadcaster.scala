package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Reference Resolved Broadcaster.
  *
  * This interface is used to manipulate reference resolved listener.
  */
trait XReferenceResolvedBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * Adds a new reference resolved listener for a element collector.
    *
    * When the element collector has completely collected that element, this listener will receive a notification.
    * @param referenceId the id of the element collector for which the new listener is added
    * @param listener the listener to be added
    */
  def addReferenceResolvedListener(referenceId: Double, listener: XReferenceResolvedListener): Unit
  
  /**
    * Removes a listener from a element collector.
    *
    * When a listener is removed, it will not receive notification when collection completes.
    * @param referenceId the id of the element collector from which the listener is removed
    * @param listener the listener to be removed
    */
  def removeReferenceResolvedListener(referenceId: Double, listener: XReferenceResolvedListener): Unit
}
object XReferenceResolvedBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addReferenceResolvedListener: (Double, XReferenceResolvedListener) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeReferenceResolvedListener: (Double, XReferenceResolvedListener) => Callback
  ): XReferenceResolvedBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addReferenceResolvedListener = js.Any.fromFunction2((t0: Double, t1: XReferenceResolvedListener) => (addReferenceResolvedListener(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeReferenceResolvedListener = js.Any.fromFunction2((t0: Double, t1: XReferenceResolvedListener) => (removeReferenceResolvedListener(t0, t1)).runNow()))
    __obj.asInstanceOf[XReferenceResolvedBroadcaster]
  }
  
  extension [Self <: XReferenceResolvedBroadcaster](x: Self) {
    
    inline def setAddReferenceResolvedListener(value: (Double, XReferenceResolvedListener) => Callback): Self = StObject.set(x, "addReferenceResolvedListener", js.Any.fromFunction2((t0: Double, t1: XReferenceResolvedListener) => (value(t0, t1)).runNow()))
    
    inline def setRemoveReferenceResolvedListener(value: (Double, XReferenceResolvedListener) => Callback): Self = StObject.set(x, "removeReferenceResolvedListener", js.Any.fromFunction2((t0: Double, t1: XReferenceResolvedListener) => (value(t0, t1)).runNow()))
  }
}
