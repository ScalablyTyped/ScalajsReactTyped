package typingsJapgolly.jsrsasign

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typingsJapgolly.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObj extends js.Object {
  var hex: String
  var obj: RSAKey | DSA | ECDSA
}

object AnonObj {
  @scala.inline
  def apply(hex: String, obj: RSAKey | DSA | ECDSA): AnonObj = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonObj]
  }
}

