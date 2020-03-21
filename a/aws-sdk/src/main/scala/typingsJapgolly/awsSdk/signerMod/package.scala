package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object signerMod {
  type BucketName = java.lang.String
  type Category = typingsJapgolly.awsSdk.awsSdkStrings.AWSIoT | java.lang.String
  type CertificateArn = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.signerMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CompletedAt = js.Date
  type CreatedAt = js.Date
  type DisplayName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA
    - typingsJapgolly.awsSdk.awsSdkStrings.ECDSA
    - java.lang.String
  */
  type EncryptionAlgorithm = typingsJapgolly.awsSdk.signerMod._EncryptionAlgorithm | java.lang.String
  type EncryptionAlgorithms = js.Array[typingsJapgolly.awsSdk.signerMod.EncryptionAlgorithm]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SHA1
    - typingsJapgolly.awsSdk.awsSdkStrings.SHA256
    - java.lang.String
  */
  type HashAlgorithm = typingsJapgolly.awsSdk.signerMod._HashAlgorithm | java.lang.String
  type HashAlgorithms = js.Array[typingsJapgolly.awsSdk.signerMod.HashAlgorithm]
  type ImageFormat = typingsJapgolly.awsSdk.awsSdkStrings.JSON | java.lang.String
  type ImageFormats = js.Array[typingsJapgolly.awsSdk.signerMod.ImageFormat]
  type JobId = java.lang.String
  type Key_ = java.lang.String
  type MaxResults = scala.Double
  type MaxSizeInMB = scala.Double
  type NextToken = java.lang.String
  type PlatformId = java.lang.String
  type Prefix = java.lang.String
  type ProfileName = java.lang.String
  type RequestedBy = java.lang.String
  type SigningJobs = js.Array[typingsJapgolly.awsSdk.signerMod.SigningJob]
  type SigningParameterKey = java.lang.String
  type SigningParameterValue = java.lang.String
  type SigningParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.signerMod.SigningParameterValue]
  type SigningPlatforms = js.Array[typingsJapgolly.awsSdk.signerMod.SigningPlatform]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Canceled_
    - java.lang.String
  */
  type SigningProfileStatus = typingsJapgolly.awsSdk.signerMod._SigningProfileStatus | java.lang.String
  type SigningProfiles = js.Array[typingsJapgolly.awsSdk.signerMod.SigningProfile]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type SigningStatus = typingsJapgolly.awsSdk.signerMod._SigningStatus | java.lang.String
  type StatusReason = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.signerMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.signerMod.TagValue]
  type TagValue = java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-08-25`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.signerMod._apiVersion | java.lang.String
  type bool = scala.Boolean
  type key = java.lang.String
}
