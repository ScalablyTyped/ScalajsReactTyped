package typingsJapgolly.jsrsasign.mod.KJUR.asn1

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER Integer
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - int - specify initial ASN.1 value(V) by integer value
  * - bigint - specify initial ASN.1 value(V) by BigInteger object
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
@JSImport("jsrsasign", "KJUR.asn1.DERInteger")
@js.native
class DERInteger ()
  extends typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.DERInteger {
  def this(params: Double) = this()
  def this(params: BigIntegerParam) = this()
  def this(params: HexParam) = this()
  def this(params: IntegerParam) = this()
}

