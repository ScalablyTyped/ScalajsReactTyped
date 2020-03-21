package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mediastoredataMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.mediastoredataMod.ClientApiVersions
  type ContentRangePattern = java.lang.String
  type ContentType = java.lang.String
  type ETag = java.lang.String
  type ItemList = js.Array[typingsJapgolly.awsSdk.mediastoredataMod.Item]
  type ItemName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OBJECT
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER
    - java.lang.String
  */
  type ItemType = typingsJapgolly.awsSdk.mediastoredataMod._ItemType | java.lang.String
  type ListLimit = scala.Double
  type ListPathNaming = java.lang.String
  type NonNegativeLong = scala.Double
  type PaginationToken = java.lang.String
  type PathNaming = java.lang.String
  type PayloadBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.mediastoredataMod.Blob | java.lang.String | typingsJapgolly.node.streamMod.Readable
  type RangePattern = java.lang.String
  type SHA256Hash = java.lang.String
  type StorageClass = typingsJapgolly.awsSdk.awsSdkStrings.TEMPORAL | java.lang.String
  type StringPrimitive = java.lang.String
  type TimeStamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING
    - java.lang.String
  */
  type UploadAvailability = typingsJapgolly.awsSdk.mediastoredataMod._UploadAvailability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-09-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.mediastoredataMod._apiVersion | java.lang.String
  type statusCode = scala.Double
}
