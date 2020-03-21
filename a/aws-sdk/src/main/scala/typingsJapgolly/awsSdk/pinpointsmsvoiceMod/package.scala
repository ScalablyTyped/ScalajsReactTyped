package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinpointsmsvoiceMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.pinpointsmsvoiceMod.ClientApiVersions
  type ConfigurationSets = js.Array[typingsJapgolly.awsSdk.pinpointsmsvoiceMod.WordCharactersWithDelimiters]
  type EventDestinations = js.Array[typingsJapgolly.awsSdk.pinpointsmsvoiceMod.EventDestination]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIATED_CALL
    - typingsJapgolly.awsSdk.awsSdkStrings.RINGING
    - typingsJapgolly.awsSdk.awsSdkStrings.ANSWERED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_CALL
    - typingsJapgolly.awsSdk.awsSdkStrings.BUSY
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_ANSWER
    - java.lang.String
  */
  type EventType = typingsJapgolly.awsSdk.pinpointsmsvoiceMod._EventType | java.lang.String
  type EventTypes = js.Array[typingsJapgolly.awsSdk.pinpointsmsvoiceMod.EventType]
  type NextTokenString = java.lang.String
  type NonEmptyString = java.lang.String
  type String = java.lang.String
  type WordCharactersWithDelimiters = java.lang.String
  type _String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-09-05`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.pinpointsmsvoiceMod._apiVersion | java.lang.String
}
