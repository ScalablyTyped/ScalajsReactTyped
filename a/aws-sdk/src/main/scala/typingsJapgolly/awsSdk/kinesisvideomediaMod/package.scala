package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisvideomediaMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.kinesisvideomediaMod.ClientApiVersions
  type ContentType = java.lang.String
  type ContinuationToken = java.lang.String
  type FragmentNumberString = java.lang.String
  type Payload = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.kinesisvideomediaMod.Blob | java.lang.String | typingsJapgolly.node.streamMod.Readable
  type ResourceARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FRAGMENT_NUMBER
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typingsJapgolly.awsSdk.awsSdkStrings.NOW
    - typingsJapgolly.awsSdk.awsSdkStrings.EARLIEST
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUATION_TOKEN
    - java.lang.String
  */
  type StartSelectorType = typingsJapgolly.awsSdk.kinesisvideomediaMod._StartSelectorType | java.lang.String
  type StreamName = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-09-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.kinesisvideomediaMod._apiVersion | java.lang.String
}
