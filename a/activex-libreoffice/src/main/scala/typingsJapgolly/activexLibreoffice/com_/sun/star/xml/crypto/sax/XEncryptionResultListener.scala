package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Encryption Result Listener.
  *
  * This interface is used to receive the result information of an encryption operation.
  */
trait XEncryptionResultListener
  extends StObject
     with XInterface {
  
  /**
    * Notifies the encryption result.
    * @param securityId the security id of the encryption
    * @param encryptionResult the result information
    */
  def encrypted(securityId: Double, encryptionResult: SecurityOperationStatus): Unit
}
object XEncryptionResultListener {
  
  inline def apply(
    acquire: Callback,
    encrypted: (Double, SecurityOperationStatus) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XEncryptionResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, encrypted = js.Any.fromFunction2((t0: Double, t1: SecurityOperationStatus) => (encrypted(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEncryptionResultListener]
  }
  
  extension [Self <: XEncryptionResultListener](x: Self) {
    
    inline def setEncrypted(value: (Double, SecurityOperationStatus) => Callback): Self = StObject.set(x, "encrypted", js.Any.fromFunction2((t0: Double, t1: SecurityOperationStatus) => (value(t0, t1)).runNow()))
  }
}
