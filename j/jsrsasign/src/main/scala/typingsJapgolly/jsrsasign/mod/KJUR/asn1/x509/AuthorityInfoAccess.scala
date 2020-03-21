package typingsJapgolly.jsrsasign.mod.KJUR.asn1.x509

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509.ExtensionParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AuthorityInfoAccess ASN.1 structure class
  * @param params associative array of parameters
  * @description
  * ```
  * id-pe OBJECT IDENTIFIER  ::=  { id-pkix 1 }
  * id-pe-authorityInfoAccess OBJECT IDENTIFIER ::= { id-pe 1 }
  * AuthorityInfoAccessSyntax  ::=
  *         SEQUENCE SIZE (1..MAX) OF AccessDescription
  * AccessDescription  ::=  SEQUENCE {
  *         accessMethod          OBJECT IDENTIFIER,
  *         accessLocation        GeneralName  }
  * id-ad OBJECT IDENTIFIER ::= { id-pkix 48 }
  * id-ad-caIssuers OBJECT IDENTIFIER ::= { id-ad 2 }
  * id-ad-ocsp OBJECT IDENTIFIER ::= { id-ad 1 }
  * ```
  * @example
  * e1 = new KJUR.asn1.x509.AuthorityInfoAccess({
  *   array: [{
  *     accessMethod:{'oid': '1.3.6.1.5.5.7.48.1'},
  *     accessLocation:{'uri': 'http://ocsp.cacert.org'}
  *   }]
  * });
  */
@JSImport("jsrsasign", "KJUR.asn1.x509.AuthorityInfoAccess")
@js.native
class AuthorityInfoAccess ()
  extends typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509.AuthorityInfoAccess {
  def this(params: ArrayParam[ExtensionParam]) = this()
}

