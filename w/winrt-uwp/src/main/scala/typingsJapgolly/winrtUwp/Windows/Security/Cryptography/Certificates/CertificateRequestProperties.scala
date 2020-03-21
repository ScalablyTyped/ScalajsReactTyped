package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the properties of a certificate request. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateRequestProperties")
@js.native
/** Creates and initializes a new instance of the CertificateRequestProperties . */
class CertificateRequestProperties () extends js.Object {
  /** Gets or sets the CA exchange certificate that is used to encrypt a key attestation certificate request. */
  var attestationCredentialCertificate: Certificate = js.native
  /** Gets or sets the container name. */
  var containerName: String = js.native
  /** Gets or sets the prefix of the container name. */
  var containerNamePrefix: String = js.native
  /** Gets or sets the name of the elliptic curve. */
  var curveName: String = js.native
  /** Gets or sets the parameters of the elliptic curve. */
  var curveParameters: Double = js.native
  /** Gets or sets a value that specifies whether the private key created for the request can be exported. */
  var exportable: ExportOption = js.native
  /** Gets or sets the display name of the enrolled certificate. */
  var friendlyName: String = js.native
  /** Gets or sets the hash algorithm used when creating the certificate request signature. */
  var hashAlgorithmName: String = js.native
  /** Gets or sets the public key algorithm. */
  var keyAlgorithmName: String = js.native
  /** Gets or sets the level of strong key protection. */
  var keyProtectionLevel: KeyProtectionLevel = js.native
  /** Gets or sets the size, in bits, of the private key to be generated. */
  var keySize: Double = js.native
  /** Gets or sets the name of the key storage provider (KSP) that will be used to generate the private key. */
  var keyStorageProviderName: String = js.native
  /** Gets or sets the operation that can be performed by the private key created for this certificate request. The default value is Signing. */
  var keyUsages: EnrollKeyUsages = js.native
  /** Gets or sets the certificate used to sign the certificate request. */
  var signingCertificate: Certificate = js.native
  /** Gets or sets the name of the smart card reader used to create the certificate request. */
  var smartcardReaderName: String = js.native
  /** Gets or sets the subject name. */
  var subject: String = js.native
  /** Gets or sets whether to use the existing key. */
  var useExistingKey: Boolean = js.native
}

