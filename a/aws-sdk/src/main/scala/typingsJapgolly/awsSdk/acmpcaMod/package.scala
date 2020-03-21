package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object acmpcaMod {
  type AccountId = java.lang.String
  type ActionList = js.Array[typingsJapgolly.awsSdk.acmpcaMod.ActionType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IssueCertificate
    - typingsJapgolly.awsSdk.awsSdkStrings.GetCertificate
    - typingsJapgolly.awsSdk.awsSdkStrings.ListPermissions
    - java.lang.String
  */
  type ActionType = typingsJapgolly.awsSdk.acmpcaMod._ActionType | java.lang.String
  type Arn = java.lang.String
  type AuditReportId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - typingsJapgolly.awsSdk.awsSdkStrings.CSV
    - java.lang.String
  */
  type AuditReportResponseFormat = typingsJapgolly.awsSdk.acmpcaMod._AuditReportResponseFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AuditReportStatus = typingsJapgolly.awsSdk.acmpcaMod._AuditReportStatus | java.lang.String
  type Boolean = scala.Boolean
  type CertificateAuthorities = js.Array[typingsJapgolly.awsSdk.acmpcaMod.CertificateAuthority]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_CERTIFICATE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CertificateAuthorityStatus = typingsJapgolly.awsSdk.acmpcaMod._CertificateAuthorityStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ROOT
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBORDINATE
    - java.lang.String
  */
  type CertificateAuthorityType = typingsJapgolly.awsSdk.acmpcaMod._CertificateAuthorityType | java.lang.String
  type CertificateBody = java.lang.String
  type CertificateBodyBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.acmpcaMod.Blob | java.lang.String
  type CertificateChain = java.lang.String
  type CertificateChainBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.acmpcaMod.Blob | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.acmpcaMod.ClientApiVersions
  type CountryCodeString = java.lang.String
  type CsrBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.acmpcaMod.Blob | java.lang.String
  type CsrBody = java.lang.String
  type DistinguishedNameQualifierString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUEST_TIMED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.UNSUPPORTED_ALGORITHM
    - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type FailureReason = typingsJapgolly.awsSdk.acmpcaMod._FailureReason | java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer1To5000 = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_2048
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_4096
    - typingsJapgolly.awsSdk.awsSdkStrings.EC_prime256v1
    - typingsJapgolly.awsSdk.awsSdkStrings.EC_secp384r1
    - java.lang.String
  */
  type KeyAlgorithm = typingsJapgolly.awsSdk.acmpcaMod._KeyAlgorithm | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PermanentDeletionTimeInDays = scala.Double
  type PermissionList = js.Array[typingsJapgolly.awsSdk.acmpcaMod.Permission]
  type PositiveLong = scala.Double
  type Principal = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_COMPROMISE
    - typingsJapgolly.awsSdk.awsSdkStrings.CERTIFICATE_AUTHORITY_COMPROMISE
    - typingsJapgolly.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUPERSEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN
    - typingsJapgolly.awsSdk.awsSdkStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type RevocationReason = typingsJapgolly.awsSdk.acmpcaMod._RevocationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SHA256WITHECDSA
    - typingsJapgolly.awsSdk.awsSdkStrings.SHA384WITHECDSA
    - typingsJapgolly.awsSdk.awsSdkStrings.SHA512WITHECDSA
    - typingsJapgolly.awsSdk.awsSdkStrings.SHA256WITHRSA
    - typingsJapgolly.awsSdk.awsSdkStrings.SHA384WITHRSA
    - typingsJapgolly.awsSdk.awsSdkStrings.SHA512WITHRSA
    - java.lang.String
  */
  type SigningAlgorithm = typingsJapgolly.awsSdk.acmpcaMod._SigningAlgorithm | java.lang.String
  type String = java.lang.String
  type String128 = java.lang.String
  type String16 = java.lang.String
  type String253 = java.lang.String
  type String3 = java.lang.String
  type String3To255 = java.lang.String
  type String40 = java.lang.String
  type String5 = java.lang.String
  type String64 = java.lang.String
  type TStamp = js.Date
  type TagKey = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.acmpcaMod.Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.END_DATE
    - typingsJapgolly.awsSdk.awsSdkStrings.ABSOLUTE
    - typingsJapgolly.awsSdk.awsSdkStrings.DAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.MONTHS
    - typingsJapgolly.awsSdk.awsSdkStrings.YEARS
    - java.lang.String
  */
  type ValidityPeriodType = typingsJapgolly.awsSdk.acmpcaMod._ValidityPeriodType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-08-22`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.acmpcaMod._apiVersion | java.lang.String
}
