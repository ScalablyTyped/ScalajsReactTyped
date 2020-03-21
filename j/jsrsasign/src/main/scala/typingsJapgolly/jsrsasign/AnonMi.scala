package typingsJapgolly.jsrsasign

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMi extends js.Object {
  var certreq: Boolean
  var mi: MessageImprint
  var nonce: IntegerParam | BigIntegerParam | HexParam | Double
  var policy: ObjectIdentifierParam | HexParam | NameParam
}

object AnonMi {
  @scala.inline
  def apply(
    certreq: Boolean,
    mi: MessageImprint,
    nonce: IntegerParam | BigIntegerParam | HexParam | Double,
    policy: ObjectIdentifierParam | HexParam | NameParam
  ): AnonMi = {
    val __obj = js.Dynamic.literal(certreq = certreq.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMi]
  }
}

