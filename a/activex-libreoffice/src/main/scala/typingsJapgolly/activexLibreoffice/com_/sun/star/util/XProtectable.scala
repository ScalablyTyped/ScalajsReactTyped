package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to protect objects from modifications. */
trait XProtectable
  extends StObject
     with XInterface {
  
  /** @returns the current state of protection. */
  def isProtected(): Boolean
  
  /**
    * activates the protection.
    * @param aPassword a string to specify new password.
    */
  def protect(aPassword: String): Unit
  
  /**
    * removes the protection.
    * @param aPassword a string to match with the current password.
    * @throws com::sun::star::lang::IllegalArgumentException if invalid password is specified.
    */
  def unprotect(aPassword: String): Unit
}
object XProtectable {
  
  inline def apply(
    acquire: Callback,
    isProtected: CallbackTo[Boolean],
    protect: String => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    unprotect: String => Callback
  ): XProtectable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, isProtected = isProtected.toJsFn, protect = js.Any.fromFunction1((t0: String) => protect(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, unprotect = js.Any.fromFunction1((t0: String) => unprotect(t0).runNow()))
    __obj.asInstanceOf[XProtectable]
  }
  
  extension [Self <: XProtectable](x: Self) {
    
    inline def setIsProtected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isProtected", value.toJsFn)
    
    inline def setProtect(value: String => Callback): Self = StObject.set(x, "protect", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUnprotect(value: String => Callback): Self = StObject.set(x, "unprotect", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
