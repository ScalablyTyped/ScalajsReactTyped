package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a cryptography certificate. */
@JSGlobal("Windows.Security.Cryptography.Certificates.Certificate")
@js.native
class Certificate protected () extends js.Object {
  /**
    * Create a new instance of the Certificate class using the specified certificate data.
    * @param certBlob The certificate data as an ASN.1 DER encoded certificate blob (.cer or .p7b).
    */
  def this(certBlob: IBuffer) = this()
  /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension. */
  var enhancedKeyUsages: IVectorView[String] = js.native
  /** Gets or sets the friendly name for the certificate. */
  var friendlyName: String = js.native
  /** Gets a value indicating whether the certificate has a private key. */
  var hasPrivateKey: Boolean = js.native
  /** Gets whether the security device is bound. */
  var isSecurityDeviceBound: Boolean = js.native
  /** Gets a value that indicates whether the private key associated with the certificate is strongly protected. */
  var isStronglyProtected: Boolean = js.native
  /** Gets the name of the certificate issuer. */
  var issuer: String = js.native
  /** Gets the name of the cryptographic algorithm used to create the key. */
  var keyAlgorithmName: String = js.native
  /** Gets the key uses for the certificate. */
  var keyUsages: CertificateKeyUsages = js.native
  /** Gets the serial number of the certificate. */
  var serialNumber: Double = js.native
  /** Gets the signature algorithm name. */
  var signatureAlgorithmName: String = js.native
  /** Gets the signature hash algorithm name. */
  var signatureHashAlgorithmName: String = js.native
  /** Gets the subject name of the certificate. */
  var subject: String = js.native
  /** Gets info on the subject alternative name. */
  var subjectAlternativeName: SubjectAlternativeNameInfo = js.native
  /** Gets the date and time after which the certificate is valid. */
  var validFrom: js.Date = js.native
  /** Gets the date and time after which the certificate is no longer valid. */
  var validTo: js.Date = js.native
  /**
    * Build a certificate chain for the specified certificates starting from the end entity certificate to the root.
    * @param certificates The intermediate certificates to use when building the certificate chain.
    * @return An asynchronous operation to retrieve the CertificateChain object that contains the entire certificate chain.
    */
  def buildChainAsync(certificates: IIterable[Certificate]): IPromiseWithIAsyncOperation[CertificateChain] = js.native
  /**
    * Build a certificate chain for the specified certificates starting from the end entity certificate to the root using the specified chain building parameters.
    * @param certificates The intermediate certificates to use when building the certificate chain.
    * @param parameters The chain building paramaters to use when building the certificate chain.
    * @return An asynchronous operation to retrieve the CertificateChain object that contains the entire certificate chain.
    */
  def buildChainAsync(certificates: IIterable[Certificate], parameters: ChainBuildingParameters): IPromiseWithIAsyncOperation[CertificateChain] = js.native
  /**
    * Gets the ASN.1 DER encoded certificate blob.
    * @return The ASN.1 DER encoded certificate blob.
    */
  def getCertificateBlob(): IBuffer = js.native
  /**
    * Gets the SHA1 hash value for the certificate.
    * @return The SHA1 hash value for the certificate.
    */
  def getHashValue(): js.Array[Double] = js.native
  /**
    * Gets the hash value for the certificate for a specified algorithm.
    * @param hashAlgorithmName The hash algorithm to use for the hash value of the certificate. Only values of "SHA1" or "SHA256" are supported.
    * @return The hash value of the certificate.
    */
  def getHashValue(hashAlgorithmName: String): js.Array[Double] = js.native
}

