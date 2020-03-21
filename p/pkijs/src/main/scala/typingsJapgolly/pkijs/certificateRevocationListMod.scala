package typingsJapgolly.pkijs

import org.scalajs.dom.crypto.CryptoKey
import typingsJapgolly.asn1js.mod.BitString
import typingsJapgolly.asn1js.mod.Sequence
import typingsJapgolly.std.AlgorithmIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/CertificateRevocationList", JSImport.Namespace)
@js.native
object certificateRevocationListMod extends js.Object {
  @js.native
  trait CertificateRevocationList extends js.Object {
    var crlExtension: js.UndefOr[js.Array[typingsJapgolly.pkijs.extensionMod.default]] = js.native
    var issuer: typingsJapgolly.pkijs.relativeDistinguishedNamesMod.default = js.native
    var nextUpdate: js.UndefOr[typingsJapgolly.pkijs.timeMod.default] = js.native
    var revokedCertificates: js.UndefOr[js.Array[typingsJapgolly.pkijs.revokedCertificateMod.default]] = js.native
    var signature: AlgorithmIdentifier = js.native
    var signatureAlgorithm: AlgorithmIdentifier = js.native
    var signatureValue: BitString = js.native
    var tbs: scala.scalajs.js.typedarray.ArrayBuffer = js.native
    var thisUpdate: typingsJapgolly.pkijs.timeMod.default = js.native
    var version: js.UndefOr[Double] = js.native
    def encodeTBS(): Sequence = js.native
    def fromSchema(schema: js.Any): Unit = js.native
    def isCertificateRevoked(certificate: typingsJapgolly.pkijs.certificateMod.default): Boolean = js.native
    /**
      * Make a signature for existing CRL data
      * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
      * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
      */
    def sign(privateKey: CryptoKey): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
    def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
    def toJSON(): js.Any = js.native
    /**
      * Convert current object to asn1js object and set correct values
      * 
      * @param {boolean} [encodeFlag]
      * @returns {*}
      */
    def toSchema(): js.Any = js.native
    def toSchema(encodeFlag: Boolean): js.Any = js.native
    /**
      * Verify existing signature
      * @param {{[issuerCertificate]: Certificate, [publicKeyInfo]: PublicKeyInfo}} parameters
      * @returns {*}
      */
    def verify(parameters: AnonIssuerCertificate): js.Thenable[Boolean] = js.native
  }
  
  @js.native
  class default () extends CertificateRevocationList {
    def this(params: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def defaultValues(memberName: String): js.Any = js.native
    def schema(): js.Any = js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
}

