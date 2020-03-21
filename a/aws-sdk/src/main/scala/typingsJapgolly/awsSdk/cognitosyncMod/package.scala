package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cognitosyncMod {
  type ApplicationArn = java.lang.String
  type ApplicationArnList = js.Array[typingsJapgolly.awsSdk.cognitosyncMod.ApplicationArn]
  type AssumeRoleArn = java.lang.String
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - java.lang.String
  */
  type BulkPublishStatus = typingsJapgolly.awsSdk.cognitosyncMod._BulkPublishStatus | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cognitosyncMod.ClientApiVersions
  type ClientContext = java.lang.String
  type CognitoEventType = java.lang.String
  type DatasetList = js.Array[typingsJapgolly.awsSdk.cognitosyncMod.Dataset]
  type DatasetName = java.lang.String
  type Date = js.Date
  type DeviceId = java.lang.String
  type Events = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitosyncMod.LambdaFunctionArn]
  type IdentityId = java.lang.String
  type IdentityPoolId = java.lang.String
  type IdentityPoolUsageList = js.Array[typingsJapgolly.awsSdk.cognitosyncMod.IdentityPoolUsage]
  type Integer = scala.Double
  type IntegerString = scala.Double
  type LambdaFunctionArn = java.lang.String
  type Long = scala.Double
  type MergedDatasetNameList = js.Array[typingsJapgolly.awsSdk.cognitosyncMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.replace_
    - typingsJapgolly.awsSdk.awsSdkStrings.remove__
    - java.lang.String
  */
  type Operation = typingsJapgolly.awsSdk.cognitosyncMod._Operation | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.APNS
    - typingsJapgolly.awsSdk.awsSdkStrings.APNS_SANDBOX
    - typingsJapgolly.awsSdk.awsSdkStrings.GCM
    - typingsJapgolly.awsSdk.awsSdkStrings.ADM
    - java.lang.String
  */
  type Platform = typingsJapgolly.awsSdk.cognitosyncMod._Platform | java.lang.String
  type PushToken = java.lang.String
  type RecordKey = java.lang.String
  type RecordList = js.Array[typingsJapgolly.awsSdk.cognitosyncMod.Record]
  type RecordPatchList = js.Array[typingsJapgolly.awsSdk.cognitosyncMod.RecordPatch]
  type RecordValue = java.lang.String
  type StreamName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type StreamingStatus = typingsJapgolly.awsSdk.cognitosyncMod._StreamingStatus | java.lang.String
  type String = java.lang.String
  type SyncSessionToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-06-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cognitosyncMod._apiVersion | java.lang.String
}
