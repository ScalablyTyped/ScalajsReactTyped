package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a signature attached to a signed CMS message. */
trait CmsAttachedSignature extends StObject {
  
  /** Gets the list of certificates that are used for chain building for the signer certificate. */
  var certificates: IVectorView[Certificate]
  
  /** Gets the content of the signed CMS message. */
  var content: Double
  
  /** Gets the list of signers that are used for creating or verifying the signature. */
  var signers: IVectorView[CmsSignerInfo]
  
  /**
    * Verifies the signature contained in the signed CMS message.
    * @return The result of the signature verification operation.
    */
  def verifySignature(): SignatureValidationResult
}
object CmsAttachedSignature {
  
  inline def apply(
    certificates: IVectorView[Certificate],
    content: Double,
    signers: IVectorView[CmsSignerInfo],
    verifySignature: CallbackTo[SignatureValidationResult]
  ): CmsAttachedSignature = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], verifySignature = verifySignature.toJsFn)
    __obj.asInstanceOf[CmsAttachedSignature]
  }
  
  extension [Self <: CmsAttachedSignature](x: Self) {
    
    inline def setCertificates(value: IVectorView[Certificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Double): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setSigners(value: IVectorView[CmsSignerInfo]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    inline def setVerifySignature(value: CallbackTo[SignatureValidationResult]): Self = StObject.set(x, "verifySignature", value.toJsFn)
  }
}
