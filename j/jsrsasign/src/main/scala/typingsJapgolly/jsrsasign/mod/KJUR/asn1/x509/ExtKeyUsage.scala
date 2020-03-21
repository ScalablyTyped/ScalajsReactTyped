package typingsJapgolly.jsrsasign.mod.KJUR.asn1.x509

import typingsJapgolly.jsrsasign.AnonArrayArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * KeyUsage ASN.1 structure class
  * @param params associative array of parameters
  * @example
  * e1 = new KJUR.asn1.x509.ExtKeyUsage({
  *   critical: true,
  *   array: [
  *     {oid: '2.5.29.37.0'},  // anyExtendedKeyUsage
  *     {name: 'clientAuth'}
  *   ]
  * });
  * // id-ce-extKeyUsage OBJECT IDENTIFIER ::= { id-ce 37 }
  * // ExtKeyUsageSyntax ::= SEQUENCE SIZE (1..MAX) OF KeyPurposeId
  * // KeyPurposeId ::= OBJECT IDENTIFIER
  */
@JSImport("jsrsasign", "KJUR.asn1.x509.ExtKeyUsage")
@js.native
class ExtKeyUsage ()
  extends typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509.ExtKeyUsage {
  def this(params: AnonArrayArray) = this()
}

