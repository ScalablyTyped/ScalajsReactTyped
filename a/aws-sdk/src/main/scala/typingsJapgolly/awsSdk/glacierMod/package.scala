package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object glacierMod {
  type AccessControlPolicyList = js.Array[typingsJapgolly.awsSdk.glacierMod.Grant]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ArchiveRetrieval
    - typingsJapgolly.awsSdk.awsSdkStrings.InventoryRetrieval
    - typingsJapgolly.awsSdk.awsSdkStrings.Select_
    - java.lang.String
  */
  type ActionCode = typingsJapgolly.awsSdk.glacierMod._ActionCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.private__
    - typingsJapgolly.awsSdk.awsSdkStrings.`public-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`public-read-write`
    - typingsJapgolly.awsSdk.awsSdkStrings.`aws-exec-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`authenticated-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type CannedACL = typingsJapgolly.awsSdk.glacierMod._CannedACL | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.glacierMod.ClientApiVersions
  type DataRetrievalRulesList = js.Array[typingsJapgolly.awsSdk.glacierMod.DataRetrievalRule]
  type DateTime = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.awsColonkms
    - typingsJapgolly.awsSdk.awsSdkStrings.AES256
    - java.lang.String
  */
  type EncryptionType = typingsJapgolly.awsSdk.glacierMod._EncryptionType | java.lang.String
  type ExpressionType = typingsJapgolly.awsSdk.awsSdkStrings.SQL | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USE
    - typingsJapgolly.awsSdk.awsSdkStrings.IGNORE
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type FileHeaderInfo = typingsJapgolly.awsSdk.glacierMod._FileHeaderInfo | java.lang.String
  type JobList = js.Array[typingsJapgolly.awsSdk.glacierMod.GlacierJobDescription]
  type NotificationEventList = js.Array[java.lang.String]
  type NullableLong = scala.Double
  type PartList = js.Array[typingsJapgolly.awsSdk.glacierMod.PartListElement]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL_CONTROL
    - typingsJapgolly.awsSdk.awsSdkStrings.WRITE
    - typingsJapgolly.awsSdk.awsSdkStrings.WRITE_ACP
    - typingsJapgolly.awsSdk.awsSdkStrings.READ
    - typingsJapgolly.awsSdk.awsSdkStrings.READ_ACP
    - java.lang.String
  */
  type Permission = typingsJapgolly.awsSdk.glacierMod._Permission | java.lang.String
  type ProvisionedCapacityList = js.Array[typingsJapgolly.awsSdk.glacierMod.ProvisionedCapacityDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.ASNEEDED
    - java.lang.String
  */
  type QuoteFields = typingsJapgolly.awsSdk.glacierMod._QuoteFields | java.lang.String
  type Size = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type StatusCode = typingsJapgolly.awsSdk.glacierMod._StatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
    - java.lang.String
  */
  type StorageClass = typingsJapgolly.awsSdk.glacierMod._StorageClass | java.lang.String
  type Stream = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.glacierMod.Blob | java.lang.String | typingsJapgolly.node.streamMod.Readable
  type TagKey = java.lang.String
  type TagKeyList = js.Array[java.lang.String]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.glacierMod.TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AmazonCustomerByEmail
    - typingsJapgolly.awsSdk.awsSdkStrings.CanonicalUser
    - typingsJapgolly.awsSdk.awsSdkStrings.Group_
    - java.lang.String
  */
  type Type = typingsJapgolly.awsSdk.glacierMod._Type | java.lang.String
  type UploadsList = js.Array[typingsJapgolly.awsSdk.glacierMod.UploadListElement]
  type VaultList = js.Array[typingsJapgolly.awsSdk.glacierMod.DescribeVaultOutput]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2012-06-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.glacierMod._apiVersion | java.lang.String
  type hashmap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type httpstatus = scala.Double
  type long = scala.Double
}
