package typingsJapgolly.jsrsasign.mod.KJUR.asn1.x509

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GeneralNames ASN.1 structure class
  * @example
  * gns = new KJUR.asn1.x509.GeneralNames([{'uri': 'http://aaa.com/'}, {'uri': 'http://bbb.com/'}]);
  *
  * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
  */
@JSImport("jsrsasign", "KJUR.asn1.x509.GeneralNames")
@js.native
class GeneralNames protected ()
  extends typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNames {
  def this(paramsArray: js.Array[UriParam]) = this()
}

