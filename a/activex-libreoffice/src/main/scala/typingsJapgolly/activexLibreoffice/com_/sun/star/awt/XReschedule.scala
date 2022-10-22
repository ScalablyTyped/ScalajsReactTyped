package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XReschedule} interface can be used to give control to the main thread to allow events processing.
  * @deprecated DeprecatedThis interface was only implemented in an intermediate developer release anyway.
  * @since OOo 2.0
  */
trait XReschedule
  extends StObject
     with XInterface {
  
  /** Allow the main thread to process some events. */
  def reschedule(): Unit
}
object XReschedule {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback, reschedule: Callback): XReschedule = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reschedule = reschedule.toJsFn)
    __obj.asInstanceOf[XReschedule]
  }
  
  extension [Self <: XReschedule](x: Self) {
    
    inline def setReschedule(value: Callback): Self = StObject.set(x, "reschedule", value.toJsFn)
  }
}
