package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsrsasign.anon.Rfc822
  - typingsJapgolly.jsrsasign.anon.Dns
  - typingsJapgolly.jsrsasign.anon.UriString
  - typingsJapgolly.jsrsasign.anon.Dn
  - typingsJapgolly.jsrsasign.anon.Ldapdn
  - typingsJapgolly.jsrsasign.anon.CertissuerString
  - typingsJapgolly.jsrsasign.anon.Certsubj
*/
trait GeneralNameParam extends StObject
object GeneralNameParam {
  
  inline def CertissuerString(certissuer: String): typingsJapgolly.jsrsasign.anon.CertissuerString = {
    val __obj = js.Dynamic.literal(certissuer = certissuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.CertissuerString]
  }
  
  inline def Certsubj(certsubj: String): typingsJapgolly.jsrsasign.anon.Certsubj = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Certsubj]
  }
  
  inline def Dn(dn: String): typingsJapgolly.jsrsasign.anon.Dn = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Dn]
  }
  
  inline def Dns(dns: String): typingsJapgolly.jsrsasign.anon.Dns = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Dns]
  }
  
  inline def Ldapdn(ldapdn: String): typingsJapgolly.jsrsasign.anon.Ldapdn = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Ldapdn]
  }
  
  inline def Rfc822(rfc822: String): typingsJapgolly.jsrsasign.anon.Rfc822 = {
    val __obj = js.Dynamic.literal(rfc822 = rfc822.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Rfc822]
  }
  
  inline def UriString(uri: String): typingsJapgolly.jsrsasign.anon.UriString = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.UriString]
  }
}
