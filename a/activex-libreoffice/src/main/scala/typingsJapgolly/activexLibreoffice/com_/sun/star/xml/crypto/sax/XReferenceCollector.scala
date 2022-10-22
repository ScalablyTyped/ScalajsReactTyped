package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Signature Collector.
  *
  * This interface is used to control collecting a signature.
  */
trait XReferenceCollector
  extends StObject
     with XInterface {
  
  /**
    * Sets the reference count of the signature.
    * @param count the reference count of the signature
    */
  def setReferenceCount(count: Double): Unit
  
  /**
    * Set the keeper id of the element collector of the referenced element.
    * @param id the keeper id of the element collector, which is collecting a referenced element
    */
  def setReferenceId(id: Double): Unit
}
object XReferenceCollector {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setReferenceCount: Double => Callback,
    setReferenceId: Double => Callback
  ): XReferenceCollector = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setReferenceCount = js.Any.fromFunction1((t0: Double) => setReferenceCount(t0).runNow()), setReferenceId = js.Any.fromFunction1((t0: Double) => setReferenceId(t0).runNow()))
    __obj.asInstanceOf[XReferenceCollector]
  }
  
  extension [Self <: XReferenceCollector](x: Self) {
    
    inline def setSetReferenceCount(value: Double => Callback): Self = StObject.set(x, "setReferenceCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetReferenceId(value: Double => Callback): Self = StObject.set(x, "setReferenceId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
