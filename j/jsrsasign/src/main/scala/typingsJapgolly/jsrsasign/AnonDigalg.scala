package typingsJapgolly.jsrsasign

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.cms.SignerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDigalg extends js.Object {
  var digalg: String
  var obj: SignerInfo
  var sattrs: String
  var si: String
  var sigalg: String
  var sigval: String
  var version: String
}

object AnonDigalg {
  @scala.inline
  def apply(
    digalg: String,
    obj: SignerInfo,
    sattrs: String,
    si: String,
    sigalg: String,
    sigval: String,
    version: String
  ): AnonDigalg = {
    val __obj = js.Dynamic.literal(digalg = digalg.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], sattrs = sattrs.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sigval = sigval.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDigalg]
  }
}

