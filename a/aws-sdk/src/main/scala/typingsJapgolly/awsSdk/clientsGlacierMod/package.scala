package typingsJapgolly.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.SQL
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessControlPolicyList = js.Array[Grant]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ArchiveRetrieval
  - typingsJapgolly.awsSdk.awsSdkStrings.InventoryRetrieval
  - typingsJapgolly.awsSdk.awsSdkStrings.Select_
  - java.lang.String
*/
type ActionCode = _ActionCode | String

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
type CannedACL = _CannedACL | String

type DataRetrievalRulesList = js.Array[DataRetrievalRule]

type DateTime = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.awsColonkms
  - typingsJapgolly.awsSdk.awsSdkStrings.AES256
  - java.lang.String
*/
type EncryptionType = _EncryptionType | String

type ExpressionType = SQL | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USE
  - typingsJapgolly.awsSdk.awsSdkStrings.IGNORE
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type FileHeaderInfo = _FileHeaderInfo | String

type JobList = js.Array[GlacierJobDescription]

type NotificationEventList = js.Array[String]

type NullableLong = Double

type PartList = js.Array[PartListElement]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_CONTROL
  - typingsJapgolly.awsSdk.awsSdkStrings.WRITE
  - typingsJapgolly.awsSdk.awsSdkStrings.WRITE_ACP
  - typingsJapgolly.awsSdk.awsSdkStrings.READ
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_ACP
  - java.lang.String
*/
type Permission = _Permission | String

type ProvisionedCapacityList = js.Array[ProvisionedCapacityDescription]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.ASNEEDED
  - java.lang.String
*/
type QuoteFields = _QuoteFields | String

type Size = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type StatusCode = _StatusCode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
  - java.lang.String
*/
type StorageClass = _StorageClass | String

type Stream = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

type TagKey = String

type TagKeyList = js.Array[String]

type TagMap = StringDictionary[TagValue]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AmazonCustomerByEmail
  - typingsJapgolly.awsSdk.awsSdkStrings.CanonicalUser
  - typingsJapgolly.awsSdk.awsSdkStrings.Group_
  - java.lang.String
*/
type Type = _Type | String

type UploadsList = js.Array[UploadListElement]

type VaultList = js.Array[DescribeVaultOutput]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2012-06-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type hashmap = StringDictionary[String]

type httpstatus = Double

type long = Double
