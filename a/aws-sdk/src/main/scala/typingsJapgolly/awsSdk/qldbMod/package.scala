package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qldbMod {
  type Arn = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.qldbMod.ClientApiVersions
  type DeletionProtection = scala.Boolean
  type Digest = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.qldbMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type ExportStatus = typingsJapgolly.awsSdk.qldbMod._ExportStatus | java.lang.String
  type IonText = java.lang.String
  type JournalS3ExportList = js.Array[typingsJapgolly.awsSdk.qldbMod.JournalS3ExportDescription]
  type LedgerList = js.Array[typingsJapgolly.awsSdk.qldbMod.LedgerSummary]
  type LedgerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type LedgerState = typingsJapgolly.awsSdk.qldbMod._LedgerState | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PermissionsMode = typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_ALL | java.lang.String
  type S3Bucket = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SSE_KMS
    - typingsJapgolly.awsSdk.awsSdkStrings.SSE_S3
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_ENCRYPTION
    - java.lang.String
  */
  type S3ObjectEncryptionType = typingsJapgolly.awsSdk.qldbMod._S3ObjectEncryptionType | java.lang.String
  type S3Prefix = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.qldbMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.qldbMod.TagValue]
  type Timestamp = js.Date
  type UniqueId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-01-02`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.qldbMod._apiVersion | java.lang.String
}
