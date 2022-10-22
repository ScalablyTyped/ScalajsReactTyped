package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Decryption Result Listener.
  *
  * This interface is used to receive the result information of a decryption operation.
  */
trait XDecryptionResultListener
  extends StObject
     with XInterface {
  
  /**
    * Notifies the decryption result.
    * @param securityId the security id of the encryption to be decrypted
    * @param decryptionResult the result information
    */
  def decrypted(securityId: Double, decryptionResult: SecurityOperationStatus): Unit
}
object XDecryptionResultListener {
  
  inline def apply(
    acquire: Callback,
    decrypted: (Double, SecurityOperationStatus) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDecryptionResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, decrypted = js.Any.fromFunction2((t0: Double, t1: SecurityOperationStatus) => (decrypted(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDecryptionResultListener]
  }
  
  extension [Self <: XDecryptionResultListener](x: Self) {
    
    inline def setDecrypted(value: (Double, SecurityOperationStatus) => Callback): Self = StObject.set(x, "decrypted", js.Any.fromFunction2((t0: Double, t1: SecurityOperationStatus) => (value(t0, t1)).runNow()))
  }
}
