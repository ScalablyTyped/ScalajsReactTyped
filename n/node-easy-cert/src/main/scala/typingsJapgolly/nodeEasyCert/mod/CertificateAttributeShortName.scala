package typingsJapgolly.nodeEasyCert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAttributeShortName extends CertificateAttribute {
  var shortName: String
  var value: String
}

object CertificateAttributeShortName {
  @scala.inline
  def apply(shortName: String, value: String): CertificateAttributeShortName = {
    val __obj = js.Dynamic.literal(shortName = shortName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateAttributeShortName]
  }
}

