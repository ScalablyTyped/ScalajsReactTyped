package typingsJapgolly.jsrsasign

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrayArray extends js.Object {
  var array: js.Array[ObjectIdentifierParam | HexParam | NameParam]
}

object AnonArrayArray {
  @scala.inline
  def apply(array: js.Array[ObjectIdentifierParam | HexParam | NameParam]): AnonArrayArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArrayArray]
  }
}

