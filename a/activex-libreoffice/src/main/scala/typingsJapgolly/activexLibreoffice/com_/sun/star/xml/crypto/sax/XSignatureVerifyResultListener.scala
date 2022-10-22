package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Signature Verify Result Listener.
  *
  * This interface is used to receive the result information of a signature verification.
  */
trait XSignatureVerifyResultListener
  extends StObject
     with XInterface {
  
  /**
    * Notifies the signature verify result.
    * @param securityId the security id of the signature
    * @param verifyResult the result information
    */
  def signatureVerified(securityId: Double, verifyResult: SecurityOperationStatus): Unit
}
object XSignatureVerifyResultListener {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    signatureVerified: (Double, SecurityOperationStatus) => Callback
  ): XSignatureVerifyResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, signatureVerified = js.Any.fromFunction2((t0: Double, t1: SecurityOperationStatus) => (signatureVerified(t0, t1)).runNow()))
    __obj.asInstanceOf[XSignatureVerifyResultListener]
  }
  
  extension [Self <: XSignatureVerifyResultListener](x: Self) {
    
    inline def setSignatureVerified(value: (Double, SecurityOperationStatus) => Callback): Self = StObject.set(x, "signatureVerified", js.Any.fromFunction2((t0: Double, t1: SecurityOperationStatus) => (value(t0, t1)).runNow()))
  }
}
