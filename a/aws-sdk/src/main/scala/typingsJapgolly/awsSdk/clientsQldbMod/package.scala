package typingsJapgolly.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = String

type Boolean = scala.Boolean

type DeletionProtection = scala.Boolean

type Digest = Buffer | js.typedarray.Uint8Array | Blob | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.KMS_KEY_INACCESSIBLE
  - java.lang.String
*/
type EncryptionStatus = _EncryptionStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.KINESIS_STREAM_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_PERMISSION_REVOKED
  - java.lang.String
*/
type ErrorCause = _ErrorCause | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type ExportStatus = _ExportStatus | String

type IonText = String

type JournalKinesisStreamDescriptionList = js.Array[JournalKinesisStreamDescription]

type JournalS3ExportList = js.Array[JournalS3ExportDescription]

type KmsKey = String

type LedgerList = js.Array[LedgerSummary]

type LedgerName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type LedgerState = _LedgerState | String

type MaxResults = Double

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ION_BINARY
  - typingsJapgolly.awsSdk.awsSdkStrings.ION_TEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type OutputFormat = _OutputFormat | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - java.lang.String
*/
type PermissionsMode = _PermissionsMode | String

type S3Bucket = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SSE_KMS
  - typingsJapgolly.awsSdk.awsSdkStrings.SSE_S3
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_ENCRYPTION
  - java.lang.String
*/
type S3ObjectEncryptionType = _S3ObjectEncryptionType | String

type S3Prefix = String

type StreamName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPAIRED
  - java.lang.String
*/
type StreamStatus = _StreamStatus | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagValue = String

type Tags = StringDictionary[TagValue]

type Timestamp = js.Date

type UniqueId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-01-02`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
