package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.anon.PickX509CheckOptionssubje
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.tlsMod.PeerCertificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates an X509 certificate and provides read-only access to
  * its information.
  *
  * ```js
  * const { X509Certificate } = await import('crypto');
  *
  * const x509 = new X509Certificate('{... pem encoded cert ...}');
  *
  * console.log(x509.subject);
  * ```
  * @since v15.6.0
  */
@JSImport("crypto", "X509Certificate")
@js.native
open class X509Certificate protected () extends StObject {
  def this(buffer: BinaryLike) = this()
  
  /**
    * Will be \`true\` if this is a Certificate Authority (CA) certificate.
    * @since v15.6.0
    */
  val ca: Boolean = js.native
  
  /**
    * Checks whether the certificate matches the given email address.
    *
    * If the `'subject'` option is undefined or set to `'default'`, the certificate
    * subject is only considered if the subject alternative name extension either does
    * not exist or does not contain any email addresses.
    *
    * If the `'subject'` option is set to `'always'` and if the subject alternative
    * name extension either does not exist or does not contain a matching email
    * address, the certificate subject is considered.
    *
    * If the `'subject'` option is set to `'never'`, the certificate subject is never
    * considered, even if the certificate contains no subject alternative names.
    * @since v15.6.0
    * @return Returns `email` if the certificate matches, `undefined` if it does not.
    */
  def checkEmail(email: String): js.UndefOr[String] = js.native
  def checkEmail(email: String, options: PickX509CheckOptionssubje): js.UndefOr[String] = js.native
  
  /**
    * Checks whether the certificate matches the given host name.
    *
    * If the certificate matches the given host name, the matching subject name is
    * returned. The returned name might be an exact match (e.g., `foo.example.com`)
    * or it might contain wildcards (e.g., `*.example.com`). Because host name
    * comparisons are case-insensitive, the returned subject name might also differ
    * from the given `name` in capitalization.
    *
    * If the `'subject'` option is undefined or set to `'default'`, the certificate
    * subject is only considered if the subject alternative name extension either does
    * not exist or does not contain any DNS names. This behavior is consistent with [RFC 2818](https://www.rfc-editor.org/rfc/rfc2818.txt) ("HTTP Over TLS").
    *
    * If the `'subject'` option is set to `'always'` and if the subject alternative
    * name extension either does not exist or does not contain a matching DNS name,
    * the certificate subject is considered.
    *
    * If the `'subject'` option is set to `'never'`, the certificate subject is never
    * considered, even if the certificate contains no subject alternative names.
    * @since v15.6.0
    * @return Returns a subject name that matches `name`, or `undefined` if no subject name matches `name`.
    */
  def checkHost(name: String): js.UndefOr[String] = js.native
  def checkHost(name: String, options: X509CheckOptions): js.UndefOr[String] = js.native
  
  /**
    * Checks whether the certificate matches the given IP address (IPv4 or IPv6).
    *
    * Only [RFC 5280](https://www.rfc-editor.org/rfc/rfc5280.txt) `iPAddress` subject alternative names are considered, and they
    * must match the given `ip` address exactly. Other subject alternative names as
    * well as the subject field of the certificate are ignored.
    * @since v15.6.0
    * @return Returns `ip` if the certificate matches, `undefined` if it does not.
    */
  def checkIP(ip: String): js.UndefOr[String] = js.native
  
  /**
    * Checks whether this certificate was issued by the given `otherCert`.
    * @since v15.6.0
    */
  def checkIssued(otherCert: X509Certificate): Boolean = js.native
  
  /**
    * Checks whether the public key for this certificate is consistent with
    * the given private key.
    * @since v15.6.0
    * @param privateKey A private key.
    */
  def checkPrivateKey(privateKey: KeyObject): Boolean = js.native
  
  /**
    * The SHA-1 fingerprint of this certificate.
    *
    * Because SHA-1 is cryptographically broken and because the security of SHA-1 is
    * significantly worse than that of algorithms that are commonly used to sign
    * certificates, consider using `x509.fingerprint256` instead.
    * @since v15.6.0
    */
  val fingerprint: String = js.native
  
  /**
    * The SHA-256 fingerprint of this certificate.
    * @since v15.6.0
    */
  val fingerprint256: String = js.native
  
  /**
    * The SHA-512 fingerprint of this certificate.
    * @since v16.14.0
    */
  val fingerprint512: String = js.native
  
  /**
    * The information access content of this certificate or `undefined` if not
    * available.
    * @since v15.6.0
    */
  val infoAccess: js.UndefOr[String] = js.native
  
  /**
    * The issuer identification included in this certificate.
    * @since v15.6.0
    */
  val issuer: String = js.native
  
  /**
    * The issuer certificate or `undefined` if the issuer certificate is not
    * available.
    * @since v15.9.0
    */
  val issuerCertificate: js.UndefOr[X509Certificate] = js.native
  
  /**
    * An array detailing the key usages for this certificate.
    * @since v15.6.0
    */
  val keyUsage: js.Array[String] = js.native
  
  /**
    * The public key `KeyObject` for this certificate.
    * @since v15.6.0
    */
  val publicKey: KeyObject = js.native
  
  /**
    * A `Buffer` containing the DER encoding of this certificate.
    * @since v15.6.0
    */
  val raw: Buffer = js.native
  
  /**
    * The serial number of this certificate.
    *
    * Serial numbers are assigned by certificate authorities and do not uniquely
    * identify certificates. Consider using `x509.fingerprint256` as a unique
    * identifier instead.
    * @since v15.6.0
    */
  val serialNumber: String = js.native
  
  /**
    * The complete subject of this certificate.
    * @since v15.6.0
    */
  val subject: String = js.native
  
  /**
    * The subject alternative name specified for this certificate or `undefined`
    * if not available.
    * @since v15.6.0
    */
  val subjectAltName: js.UndefOr[String] = js.native
  
  /**
    * There is no standard JSON encoding for X509 certificates. The`toJSON()` method returns a string containing the PEM encoded
    * certificate.
    * @since v15.6.0
    */
  def toJSON(): String = js.native
  
  /**
    * Returns information about this certificate using the legacy `certificate object` encoding.
    * @since v15.6.0
    */
  def toLegacyObject(): PeerCertificate = js.native
  
  /**
    * The date/time from which this certificate is considered valid.
    * @since v15.6.0
    */
  val validFrom: String = js.native
  
  /**
    * The date/time until which this certificate is considered valid.
    * @since v15.6.0
    */
  val validTo: String = js.native
  
  /**
    * Verifies that this certificate was signed by the given public key.
    * Does not perform any other validation checks on the certificate.
    * @since v15.6.0
    * @param publicKey A public key.
    */
  def verify(publicKey: KeyObject): Boolean = js.native
}
