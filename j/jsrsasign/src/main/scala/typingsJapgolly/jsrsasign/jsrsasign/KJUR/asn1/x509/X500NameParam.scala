package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X500NameParam extends js.Object {
  var C: String
  var CN: String
  var O: String
}

object X500NameParam {
  @scala.inline
  def apply(C: String, CN: String, O: String): X500NameParam = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[X500NameParam]
  }
}

