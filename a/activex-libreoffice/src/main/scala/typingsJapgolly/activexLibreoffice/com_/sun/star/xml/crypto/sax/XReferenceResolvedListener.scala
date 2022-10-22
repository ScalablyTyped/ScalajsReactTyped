package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Reference Resolved Listener.
  *
  * This interface is used to receive the collection completion notification for a element collector.
  */
trait XReferenceResolvedListener
  extends StObject
     with XInterface {
  
  /**
    * Notifies an element has been collected by an element collector.
    * @param referenceId the id of the element collector
    */
  def referenceResolved(referenceId: Double): Unit
}
object XReferenceResolvedListener {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    referenceResolved: Double => Callback,
    release: Callback
  ): XReferenceResolvedListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1((t0: Double) => referenceResolved(t0).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XReferenceResolvedListener]
  }
  
  extension [Self <: XReferenceResolvedListener](x: Self) {
    
    inline def setReferenceResolved(value: Double => Callback): Self = StObject.set(x, "referenceResolved", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
