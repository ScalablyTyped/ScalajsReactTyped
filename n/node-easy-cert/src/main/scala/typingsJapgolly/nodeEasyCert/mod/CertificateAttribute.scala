package typingsJapgolly.nodeEasyCert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeEasyCert.mod.CertificateAttributeName
  - typingsJapgolly.nodeEasyCert.mod.CertificateAttributeShortName
*/
trait CertificateAttribute extends js.Object

object CertificateAttribute {
  @scala.inline
  def CertificateAttributeName(name: String, value: String): CertificateAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateAttribute]
  }
  @scala.inline
  def CertificateAttributeShortName(shortName: String, value: String): CertificateAttribute = {
    val __obj = js.Dynamic.literal(shortName = shortName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateAttribute]
  }
}

