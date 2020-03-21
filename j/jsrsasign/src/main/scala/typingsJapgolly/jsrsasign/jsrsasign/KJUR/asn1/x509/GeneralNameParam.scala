package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsrsasign.AnonRfc822
  - typingsJapgolly.jsrsasign.AnonDns
  - typingsJapgolly.jsrsasign.AnonUriString
  - typingsJapgolly.jsrsasign.AnonDn
  - typingsJapgolly.jsrsasign.AnonLdapdn
  - typingsJapgolly.jsrsasign.AnonCertissuerString
  - typingsJapgolly.jsrsasign.AnonCertsubj
*/
trait GeneralNameParam extends js.Object

object GeneralNameParam {
  @scala.inline
  def AnonDn(dn: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonDns(dns: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonCertsubj(certsubj: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonRfc822(rfc822: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(rfc822 = rfc822.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonLdapdn(ldapdn: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonUriString(uri: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonCertissuerString(certissuer: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(certissuer = certissuer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
}

