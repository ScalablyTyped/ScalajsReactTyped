package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a detached signature for a signed CMS message. */
trait CmsDetachedSignature extends StObject {
  
  /** Gets the list of certificates that are used for chain building for the signer certificate. */
  var certificates: IVectorView[Certificate]
  
  /** Gets the list of signers that are used for creating or verifying the signature. */
  var signers: IVectorView[CmsSignerInfo]
  
  /**
    * Verifies a signed CMS message against the original streaming input.
    * @param data The original input stream for the signed CMS message.
    * @return An asynchronous operation to retrieve the result of the signature validation operation.
    */
  def verifySignatureAsync(data: IInputStream): IPromiseWithIAsyncOperation[SignatureValidationResult]
}
object CmsDetachedSignature {
  
  inline def apply(
    certificates: IVectorView[Certificate],
    signers: IVectorView[CmsSignerInfo],
    verifySignatureAsync: IInputStream => IPromiseWithIAsyncOperation[SignatureValidationResult]
  ): CmsDetachedSignature = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], verifySignatureAsync = js.Any.fromFunction1(verifySignatureAsync))
    __obj.asInstanceOf[CmsDetachedSignature]
  }
  
  extension [Self <: CmsDetachedSignature](x: Self) {
    
    inline def setCertificates(value: IVectorView[Certificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setSigners(value: IVectorView[CmsSignerInfo]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    inline def setVerifySignatureAsync(value: IInputStream => IPromiseWithIAsyncOperation[SignatureValidationResult]): Self = StObject.set(x, "verifySignatureAsync", js.Any.fromFunction1(value))
  }
}
