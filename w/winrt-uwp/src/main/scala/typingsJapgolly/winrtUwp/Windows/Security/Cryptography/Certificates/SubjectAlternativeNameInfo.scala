package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about a subject alternative name. */
trait SubjectAlternativeNameInfo extends StObject {
  
  /** Gets the distinguished name. */
  var distinguishedName: IVectorView[String]
  
  /** Gets the DNS name. */
  var dnsName: IVectorView[String]
  
  /** Gets the email name. */
  var emailName: IVectorView[String]
  
  /** Gets the IP address. */
  var ipAddress: IVectorView[String]
  
  /** Gets the principal name. */
  var principalName: IVectorView[String]
  
  /** Gets the URL. */
  var url: IVectorView[String]
}
object SubjectAlternativeNameInfo {
  
  inline def apply(
    distinguishedName: IVectorView[String],
    dnsName: IVectorView[String],
    emailName: IVectorView[String],
    ipAddress: IVectorView[String],
    principalName: IVectorView[String],
    url: IVectorView[String]
  ): SubjectAlternativeNameInfo = {
    val __obj = js.Dynamic.literal(distinguishedName = distinguishedName.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], emailName = emailName.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], principalName = principalName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAlternativeNameInfo]
  }
  
  extension [Self <: SubjectAlternativeNameInfo](x: Self) {
    
    inline def setDistinguishedName(value: IVectorView[String]): Self = StObject.set(x, "distinguishedName", value.asInstanceOf[js.Any])
    
    inline def setDnsName(value: IVectorView[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    inline def setEmailName(value: IVectorView[String]): Self = StObject.set(x, "emailName", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: IVectorView[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setPrincipalName(value: IVectorView[String]): Self = StObject.set(x, "principalName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: IVectorView[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
