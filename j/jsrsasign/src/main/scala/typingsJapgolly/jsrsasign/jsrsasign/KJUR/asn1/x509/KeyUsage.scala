package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsJapgolly.jsrsasign.AnonBin
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * KeyUsage ASN.1 structure class
  * @param params associative array of parameters (ex. {'bin': '11', 'critical': true})
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.KeyUsage")
@js.native
class KeyUsage () extends Extension {
  def this(params: AnonBin) = this()
  def getExtnValueHex(): String = js.native
  def setPurposeArray(purposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Unit = js.native
}

