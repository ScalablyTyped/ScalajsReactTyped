package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisvideoMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PUT_MEDIA
    - typingsJapgolly.awsSdk.awsSdkStrings.GET_MEDIA
    - typingsJapgolly.awsSdk.awsSdkStrings.LIST_FRAGMENTS
    - typingsJapgolly.awsSdk.awsSdkStrings.GET_MEDIA_FOR_FRAGMENT_LIST
    - typingsJapgolly.awsSdk.awsSdkStrings.GET_HLS_STREAMING_SESSION_URL
    - typingsJapgolly.awsSdk.awsSdkStrings.GET_DASH_STREAMING_SESSION_URL
    - java.lang.String
  */
  type APIName = typingsJapgolly.awsSdk.kinesisvideoMod._APIName | java.lang.String
  type ChannelInfoList = js.Array[typingsJapgolly.awsSdk.kinesisvideoMod.ChannelInfo]
  type ChannelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WSS
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPS
    - java.lang.String
  */
  type ChannelProtocol = typingsJapgolly.awsSdk.kinesisvideoMod._ChannelProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MASTER
    - typingsJapgolly.awsSdk.awsSdkStrings.VIEWER
    - java.lang.String
  */
  type ChannelRole = typingsJapgolly.awsSdk.kinesisvideoMod._ChannelRole | java.lang.String
  type ChannelType = typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_MASTER | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.kinesisvideoMod.ClientApiVersions
  type ComparisonOperator = typingsJapgolly.awsSdk.awsSdkStrings.BEGINS_WITH | java.lang.String
  type DataEndpoint = java.lang.String
  type DataRetentionChangeInHours = scala.Double
  type DataRetentionInHours = scala.Double
  type DeviceName = java.lang.String
  type KmsKeyId = java.lang.String
  type ListOfProtocols = js.Array[typingsJapgolly.awsSdk.kinesisvideoMod.ChannelProtocol]
  type ListStreamsInputLimit = scala.Double
  type MediaType = java.lang.String
  type MessageTtlSeconds = scala.Double
  type NextToken = java.lang.String
  type ResourceARN = java.lang.String
  type ResourceEndpoint = java.lang.String
  type ResourceEndpointList = js.Array[typingsJapgolly.awsSdk.kinesisvideoMod.ResourceEndpointListItem]
  type ResourceTags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.kinesisvideoMod.TagValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.kinesisvideoMod._Status | java.lang.String
  type StreamInfoList = js.Array[typingsJapgolly.awsSdk.kinesisvideoMod.StreamInfo]
  type StreamName = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.kinesisvideoMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.kinesisvideoMod.Tag]
  type TagOnCreateList = js.Array[typingsJapgolly.awsSdk.kinesisvideoMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INCREASE_DATA_RETENTION
    - typingsJapgolly.awsSdk.awsSdkStrings.DECREASE_DATA_RETENTION
    - java.lang.String
  */
  type UpdateDataRetentionOperation = typingsJapgolly.awsSdk.kinesisvideoMod._UpdateDataRetentionOperation | java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-09-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.kinesisvideoMod._apiVersion | java.lang.String
}
