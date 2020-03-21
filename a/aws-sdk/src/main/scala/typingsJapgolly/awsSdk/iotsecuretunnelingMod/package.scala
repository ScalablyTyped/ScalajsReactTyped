package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotsecuretunnelingMod {
  type AmazonResourceName = java.lang.String
  type ClientAccessToken = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.iotsecuretunnelingMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTED
    - java.lang.String
  */
  type ConnectionStatus = typingsJapgolly.awsSdk.iotsecuretunnelingMod._ConnectionStatus | java.lang.String
  type DateType = js.Date
  type DeleteFlag = scala.Boolean
  type Description = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Service = java.lang.String
  type ServiceList = js.Array[typingsJapgolly.awsSdk.iotsecuretunnelingMod.Service]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.iotsecuretunnelingMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.iotsecuretunnelingMod.Tag]
  type TagValue = java.lang.String
  type ThingName = java.lang.String
  type TimeoutInMin = scala.Double
  type TunnelArn = java.lang.String
  type TunnelId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type TunnelStatus = typingsJapgolly.awsSdk.iotsecuretunnelingMod._TunnelStatus | java.lang.String
  type TunnelSummaryList = js.Array[typingsJapgolly.awsSdk.iotsecuretunnelingMod.TunnelSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-10-05`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.iotsecuretunnelingMod._apiVersion | java.lang.String
}
