package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface to manipulate Security Environment */
trait XSEInitializer
  extends StObject
     with XInterface {
  
  /**
    * Creates a security context.
    * @param aString reserved for internal use.
    * @returns the security context created
    */
  def createSecurityContext(aString: String): XXMLSecurityContext
  
  /**
    * Frees a security context.
    * @param securityContext the security context to be freed
    */
  def freeSecurityContext(securityContext: XXMLSecurityContext): Unit
}
object XSEInitializer {
  
  inline def apply(
    acquire: Callback,
    createSecurityContext: String => XXMLSecurityContext,
    freeSecurityContext: XXMLSecurityContext => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XSEInitializer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createSecurityContext = js.Any.fromFunction1(createSecurityContext), freeSecurityContext = js.Any.fromFunction1((t0: XXMLSecurityContext) => freeSecurityContext(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSEInitializer]
  }
  
  extension [Self <: XSEInitializer](x: Self) {
    
    inline def setCreateSecurityContext(value: String => XXMLSecurityContext): Self = StObject.set(x, "createSecurityContext", js.Any.fromFunction1(value))
    
    inline def setFreeSecurityContext(value: XXMLSecurityContext => Callback): Self = StObject.set(x, "freeSecurityContext", js.Any.fromFunction1((t0: XXMLSecurityContext) => value(t0).runNow()))
  }
}
