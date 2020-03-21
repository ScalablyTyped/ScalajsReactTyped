package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudtrailMod {
  type Boolean = scala.Boolean
  type ByteBuffer = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.cloudtrailMod.Blob | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cloudtrailMod.ClientApiVersions
  type DataResourceValues = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.String]
  type DataResources = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.DataResource]
  type Date = js.Date
  type EventCategory = typingsJapgolly.awsSdk.awsSdkStrings.insight | java.lang.String
  type EventSelectors = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.EventSelector]
  type EventsList = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.Event]
  type ExcludeManagementEventSources = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.String]
  type InsightSelectors = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.InsightSelector]
  type InsightType = typingsJapgolly.awsSdk.awsSdkStrings.ApiCallRateInsight | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EventId
    - typingsJapgolly.awsSdk.awsSdkStrings.EventName
    - typingsJapgolly.awsSdk.awsSdkStrings.ReadOnly
    - typingsJapgolly.awsSdk.awsSdkStrings.Username_
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceType
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceName
    - typingsJapgolly.awsSdk.awsSdkStrings.EventSource
    - typingsJapgolly.awsSdk.awsSdkStrings.AccessKeyId
    - java.lang.String
  */
  type LookupAttributeKey = typingsJapgolly.awsSdk.cloudtrailMod._LookupAttributeKey | java.lang.String
  type LookupAttributesList = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.LookupAttribute]
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PublicKeyList = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.PublicKey]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ReadOnly
    - typingsJapgolly.awsSdk.awsSdkStrings.WriteOnly
    - typingsJapgolly.awsSdk.awsSdkStrings.All_
    - java.lang.String
  */
  type ReadWriteType = typingsJapgolly.awsSdk.cloudtrailMod._ReadWriteType | java.lang.String
  type ResourceIdList = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.String]
  type ResourceList = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.Resource]
  type ResourceTagList = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.ResourceTag]
  type String = java.lang.String
  type TagsList = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.Tag]
  type TrailList = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.Trail]
  type TrailNameList = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.String]
  type Trails = js.Array[typingsJapgolly.awsSdk.cloudtrailMod.TrailInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-11-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cloudtrailMod._apiVersion | java.lang.String
}
