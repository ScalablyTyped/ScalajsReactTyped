package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCertificateMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the certificate.
    */
  var CertificateArn: String
}
object DeleteCertificateMessage {
  
  inline def apply(CertificateArn: String): DeleteCertificateMessage = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateMessage]
  }
  
  extension [Self <: DeleteCertificateMessage](x: Self) {
    
    inline def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
  }
}
