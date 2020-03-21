package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectparticipantMod {
  type ChatContent = java.lang.String
  type ChatContentType = java.lang.String
  type ChatItemId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MESSAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTION_ACK
    - java.lang.String
  */
  type ChatItemType = typingsJapgolly.awsSdk.connectparticipantMod._ChatItemType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.connectparticipantMod.ClientApiVersions
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WEBSOCKET
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTION_CREDENTIALS
    - java.lang.String
  */
  type ConnectionType = typingsJapgolly.awsSdk.connectparticipantMod._ConnectionType | java.lang.String
  type ConnectionTypeList = js.Array[typingsJapgolly.awsSdk.connectparticipantMod.ConnectionType]
  type ContactId = java.lang.String
  type DisplayName = java.lang.String
  type ISO8601Datetime = java.lang.String
  type Instant = java.lang.String
  type MaxResults = scala.Double
  type MostRecent = scala.Double
  type NextToken = java.lang.String
  type ParticipantId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENT
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
    - java.lang.String
  */
  type ParticipantRole = typingsJapgolly.awsSdk.connectparticipantMod._ParticipantRole | java.lang.String
  type ParticipantToken = java.lang.String
  type PreSignedConnectionUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FORWARD
    - typingsJapgolly.awsSdk.awsSdkStrings.BACKWARD
    - java.lang.String
  */
  type ScanDirection = typingsJapgolly.awsSdk.connectparticipantMod._ScanDirection | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
    - java.lang.String
  */
  type SortKey = typingsJapgolly.awsSdk.connectparticipantMod._SortKey | java.lang.String
  type Transcript = js.Array[typingsJapgolly.awsSdk.connectparticipantMod.Item]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-09-07`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.connectparticipantMod._apiVersion | java.lang.String
}
