package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object acmMod {
  type Arn = java.lang.String
  type CertificateBody = java.lang.String
  type CertificateBodyBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.acmMod.Blob | java.lang.String
  type CertificateChain = java.lang.String
  type CertificateChainBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.acmMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsJapgolly.awsSdk.awsSdkStrings.ISSUED
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_TIMED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.REVOKED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CertificateStatus = typingsJapgolly.awsSdk.acmMod._CertificateStatus | java.lang.String
  type CertificateStatuses = js.Array[typingsJapgolly.awsSdk.acmMod.CertificateStatus]
  type CertificateSummaryList = js.Array[typingsJapgolly.awsSdk.acmMod.CertificateSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type CertificateTransparencyLoggingPreference = typingsJapgolly.awsSdk.acmMod._CertificateTransparencyLoggingPreference | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORTED
    - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_ISSUED
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type CertificateType = typingsJapgolly.awsSdk.acmMod._CertificateType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.acmMod.ClientApiVersions
  type DomainList = js.Array[typingsJapgolly.awsSdk.acmMod.DomainNameString]
  type DomainNameString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DomainStatus = typingsJapgolly.awsSdk.acmMod._DomainStatus | java.lang.String
  type DomainValidationList = js.Array[typingsJapgolly.awsSdk.acmMod.DomainValidation]
  type DomainValidationOptionList = js.Array[typingsJapgolly.awsSdk.acmMod.DomainValidationOption]
  type ExtendedKeyUsageFilterList = js.Array[typingsJapgolly.awsSdk.acmMod.ExtendedKeyUsageName]
  type ExtendedKeyUsageList = js.Array[typingsJapgolly.awsSdk.acmMod.ExtendedKeyUsage]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TLS_WEB_SERVER_AUTHENTICATION
    - typingsJapgolly.awsSdk.awsSdkStrings.TLS_WEB_CLIENT_AUTHENTICATION
    - typingsJapgolly.awsSdk.awsSdkStrings.CODE_SIGNING
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_PROTECTION
    - typingsJapgolly.awsSdk.awsSdkStrings.TIME_STAMPING
    - typingsJapgolly.awsSdk.awsSdkStrings.OCSP_SIGNING
    - typingsJapgolly.awsSdk.awsSdkStrings.IPSEC_END_SYSTEM
    - typingsJapgolly.awsSdk.awsSdkStrings.IPSEC_TUNNEL
    - typingsJapgolly.awsSdk.awsSdkStrings.IPSEC_USER
    - typingsJapgolly.awsSdk.awsSdkStrings.ANY
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type ExtendedKeyUsageName = typingsJapgolly.awsSdk.acmMod._ExtendedKeyUsageName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_AVAILABLE_CONTACTS
    - typingsJapgolly.awsSdk.awsSdkStrings.ADDITIONAL_VERIFICATION_REQUIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_NOT_ALLOWED
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_PUBLIC_DOMAIN
    - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_VALIDATION_DENIED
    - typingsJapgolly.awsSdk.awsSdkStrings.CAA_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.PCA_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.PCA_INVALID_ARN
    - typingsJapgolly.awsSdk.awsSdkStrings.PCA_INVALID_STATE
    - typingsJapgolly.awsSdk.awsSdkStrings.PCA_REQUEST_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.PCA_NAME_CONSTRAINTS_VALIDATION
    - typingsJapgolly.awsSdk.awsSdkStrings.PCA_RESOURCE_NOT_FOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.PCA_INVALID_ARGS
    - typingsJapgolly.awsSdk.awsSdkStrings.PCA_INVALID_DURATION
    - typingsJapgolly.awsSdk.awsSdkStrings.PCA_ACCESS_DENIED
    - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type FailureReason = typingsJapgolly.awsSdk.acmMod._FailureReason | java.lang.String
  type IdempotencyToken = java.lang.String
  type InUseList = js.Array[typingsJapgolly.awsSdk.acmMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_2048
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_1024
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_4096
    - typingsJapgolly.awsSdk.awsSdkStrings.EC_prime256v1
    - typingsJapgolly.awsSdk.awsSdkStrings.EC_secp384r1
    - typingsJapgolly.awsSdk.awsSdkStrings.EC_secp521r1
    - java.lang.String
  */
  type KeyAlgorithm = typingsJapgolly.awsSdk.acmMod._KeyAlgorithm | java.lang.String
  type KeyAlgorithmList = js.Array[typingsJapgolly.awsSdk.acmMod.KeyAlgorithm]
  type KeyUsageFilterList = js.Array[typingsJapgolly.awsSdk.acmMod.KeyUsageName]
  type KeyUsageList = js.Array[typingsJapgolly.awsSdk.acmMod.KeyUsage]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DIGITAL_SIGNATURE
    - typingsJapgolly.awsSdk.awsSdkStrings.NON_REPUDIATION
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_ENCIPHERMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.DATA_ENCIPHERMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_AGREEMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.CERTIFICATE_SIGNING
    - typingsJapgolly.awsSdk.awsSdkStrings.CRL_SIGNING
    - typingsJapgolly.awsSdk.awsSdkStrings.ENCIPHER_ONLY
    - typingsJapgolly.awsSdk.awsSdkStrings.DECIPHER_ONLY
    - typingsJapgolly.awsSdk.awsSdkStrings.ANY
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type KeyUsageName = typingsJapgolly.awsSdk.acmMod._KeyUsageName | java.lang.String
  type MaxItems = scala.Double
  type NextToken = java.lang.String
  type PassphraseBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.acmMod.Blob | java.lang.String
  type PrivateKey = java.lang.String
  type PrivateKeyBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.acmMod.Blob | java.lang.String
  type RecordType = typingsJapgolly.awsSdk.awsSdkStrings.CNAME | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ELIGIBLE
    - typingsJapgolly.awsSdk.awsSdkStrings.INELIGIBLE
    - java.lang.String
  */
  type RenewalEligibility = typingsJapgolly.awsSdk.acmMod._RenewalEligibility | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_AUTO_RENEWAL
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RenewalStatus = typingsJapgolly.awsSdk.acmMod._RenewalStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_COMPROMISE
    - typingsJapgolly.awsSdk.awsSdkStrings.CA_COMPROMISE
    - typingsJapgolly.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUPERCEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
    - typingsJapgolly.awsSdk.awsSdkStrings.CERTIFICATE_HOLD
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE_FROM_CRL
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN
    - typingsJapgolly.awsSdk.awsSdkStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type RevocationReason = typingsJapgolly.awsSdk.acmMod._RevocationReason | java.lang.String
  type String = java.lang.String
  type TStamp = js.Date
  type TagKey = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.acmMod.Tag]
  type TagValue = java.lang.String
  type ValidationEmailList = js.Array[typingsJapgolly.awsSdk.acmMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
    - typingsJapgolly.awsSdk.awsSdkStrings.DNS
    - java.lang.String
  */
  type ValidationMethod = typingsJapgolly.awsSdk.acmMod._ValidationMethod | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-12-08`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.acmMod._apiVersion | java.lang.String
}
