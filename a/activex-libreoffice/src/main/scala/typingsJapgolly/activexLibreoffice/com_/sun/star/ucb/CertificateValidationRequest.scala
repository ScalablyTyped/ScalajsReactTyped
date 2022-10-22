package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.com_.sun.star.security.XCertificate
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error specifying an invalid certificate. */
trait CertificateValidationRequest
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** The certificate itself. */
  var Certificate: XCertificate
  
  /** This value describes the validity of the certificate. */
  var CertificateValidity: Double
  
  /** The host name. */
  var HostName: String
}
object CertificateValidationRequest {
  
  inline def apply(
    Certificate: XCertificate,
    CertificateValidity: Double,
    Classification: InteractionClassification,
    Context: XInterface,
    HostName: String,
    Message: String
  ): CertificateValidationRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], CertificateValidity = CertificateValidity.asInstanceOf[js.Any], Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], HostName = HostName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateValidationRequest]
  }
  
  extension [Self <: CertificateValidationRequest](x: Self) {
    
    inline def setCertificate(value: XCertificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateValidity(value: Double): Self = StObject.set(x, "CertificateValidity", value.asInstanceOf[js.Any])
    
    inline def setHostName(value: String): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
  }
}
