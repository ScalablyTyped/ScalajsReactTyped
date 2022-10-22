package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Signature Creation Result Listener.
  *
  * This interface is used to receive the result information of a signature creation.
  */
trait XSignatureCreationResultListener
  extends StObject
     with XInterface {
  
  /**
    * Notifies the signature creation result.
    * @param securityId the security id of the signature
    * @param creationResult the result information
    */
  def signatureCreated(securityId: Double, creationResult: SecurityOperationStatus): Unit
}
object XSignatureCreationResultListener {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    signatureCreated: (Double, SecurityOperationStatus) => Callback
  ): XSignatureCreationResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, signatureCreated = js.Any.fromFunction2((t0: Double, t1: SecurityOperationStatus) => (signatureCreated(t0, t1)).runNow()))
    __obj.asInstanceOf[XSignatureCreationResultListener]
  }
  
  extension [Self <: XSignatureCreationResultListener](x: Self) {
    
    inline def setSignatureCreated(value: (Double, SecurityOperationStatus) => Callback): Self = StObject.set(x, "signatureCreated", js.Any.fromFunction2((t0: Double, t1: SecurityOperationStatus) => (value(t0, t1)).runNow()))
  }
}
