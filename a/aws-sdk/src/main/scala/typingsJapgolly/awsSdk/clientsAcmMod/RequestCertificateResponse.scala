package typingsJapgolly.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCertificateResponse extends StObject {
  
  /**
    * String that contains the ARN of the issued certificate. This must be of the form:  arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012 
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
}
object RequestCertificateResponse {
  
  inline def apply(): RequestCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestCertificateResponse]
  }
  
  extension [Self <: RequestCertificateResponse](x: Self) {
    
    inline def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
  }
}
