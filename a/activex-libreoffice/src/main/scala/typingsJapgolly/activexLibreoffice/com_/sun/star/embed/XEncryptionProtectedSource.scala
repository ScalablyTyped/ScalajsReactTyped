package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface allows to set a password for an object. */
trait XEncryptionProtectedSource
  extends StObject
     with XInterface {
  
  /**
    * removes encryption from the object.
    * @throws com::sun::star::io::IOException in case encryption could not be removed
    */
  def removeEncryption(): Unit
  
  /**
    * sets a password for the object.
    * @param sPassword the new password
    * @throws com::sun::star::io::IOException in case password could not be set
    */
  def setEncryptionPassword(sPassword: String): Unit
}
object XEncryptionProtectedSource {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEncryption: Callback,
    setEncryptionPassword: String => Callback
  ): XEncryptionProtectedSource = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEncryption = removeEncryption.toJsFn, setEncryptionPassword = js.Any.fromFunction1((t0: String) => setEncryptionPassword(t0).runNow()))
    __obj.asInstanceOf[XEncryptionProtectedSource]
  }
  
  extension [Self <: XEncryptionProtectedSource](x: Self) {
    
    inline def setRemoveEncryption(value: Callback): Self = StObject.set(x, "removeEncryption", value.toJsFn)
    
    inline def setSetEncryptionPassword(value: String => Callback): Self = StObject.set(x, "setEncryptionPassword", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
