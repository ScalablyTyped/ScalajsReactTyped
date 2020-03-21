package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mqMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.REBOOT_IN_PROGRESS
    - java.lang.String
  */
  type BrokerState = typingsJapgolly.awsSdk.mqMod._BrokerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EBS
    - typingsJapgolly.awsSdk.awsSdkStrings.EFS
    - java.lang.String
  */
  type BrokerStorageType = typingsJapgolly.awsSdk.mqMod._BrokerStorageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type ChangeType = typingsJapgolly.awsSdk.mqMod._ChangeType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.mqMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MONDAY
    - typingsJapgolly.awsSdk.awsSdkStrings.TUESDAY
    - typingsJapgolly.awsSdk.awsSdkStrings.WEDNESDAY
    - typingsJapgolly.awsSdk.awsSdkStrings.THURSDAY
    - typingsJapgolly.awsSdk.awsSdkStrings.FRIDAY
    - typingsJapgolly.awsSdk.awsSdkStrings.SATURDAY
    - typingsJapgolly.awsSdk.awsSdkStrings.SUNDAY
    - java.lang.String
  */
  type DayOfWeek = typingsJapgolly.awsSdk.mqMod._DayOfWeek | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_INSTANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE_STANDBY_MULTI_AZ
    - java.lang.String
  */
  type DeploymentMode = typingsJapgolly.awsSdk.mqMod._DeploymentMode | java.lang.String
  type EngineType = typingsJapgolly.awsSdk.awsSdkStrings.ACTIVEMQ | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DISALLOWED_ELEMENT_REMOVED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISALLOWED_ATTRIBUTE_REMOVED
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_ATTRIBUTE_VALUE_REMOVED
    - java.lang.String
  */
  type SanitizationWarningReason = typingsJapgolly.awsSdk.mqMod._SanitizationWarningReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-11-27`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.mqMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type integer = scala.Double
  type integerMin5Max100 = scala.Double
  type listOfAvailabilityZone = js.Array[typingsJapgolly.awsSdk.mqMod.AvailabilityZone]
  type listOfBrokerEngineType = js.Array[typingsJapgolly.awsSdk.mqMod.BrokerEngineType]
  type listOfBrokerInstance = js.Array[typingsJapgolly.awsSdk.mqMod.BrokerInstance]
  type listOfBrokerInstanceOption = js.Array[typingsJapgolly.awsSdk.mqMod.BrokerInstanceOption]
  type listOfBrokerSummary = js.Array[typingsJapgolly.awsSdk.mqMod.BrokerSummary]
  type listOfConfiguration = js.Array[typingsJapgolly.awsSdk.mqMod.Configuration]
  type listOfConfigurationId = js.Array[typingsJapgolly.awsSdk.mqMod.ConfigurationId]
  type listOfConfigurationRevision = js.Array[typingsJapgolly.awsSdk.mqMod.ConfigurationRevision]
  type listOfDeploymentMode = js.Array[typingsJapgolly.awsSdk.mqMod.DeploymentMode]
  type listOfEngineVersion = js.Array[typingsJapgolly.awsSdk.mqMod.EngineVersion]
  type listOfSanitizationWarning = js.Array[typingsJapgolly.awsSdk.mqMod.SanitizationWarning]
  type listOfString = js.Array[typingsJapgolly.awsSdk.mqMod.string]
  type listOfUser = js.Array[typingsJapgolly.awsSdk.mqMod.User]
  type listOfUserSummary = js.Array[typingsJapgolly.awsSdk.mqMod.UserSummary]
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.mqMod.string]
  type string = java.lang.String
  type timestampIso8601 = js.Date
}
