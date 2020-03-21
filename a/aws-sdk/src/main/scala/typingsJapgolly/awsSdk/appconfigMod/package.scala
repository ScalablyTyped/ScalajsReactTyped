package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appconfigMod {
  type ApplicationList = js.Array[typingsJapgolly.awsSdk.appconfigMod.Application]
  type Arn = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.appconfigMod.ClientApiVersions
  type ConfigurationProfileSummaryList = js.Array[typingsJapgolly.awsSdk.appconfigMod.ConfigurationProfileSummary]
  type DeploymentList = js.Array[typingsJapgolly.awsSdk.appconfigMod.DeploymentSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BAKING
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYING
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.ROLLING_BACK
    - typingsJapgolly.awsSdk.awsSdkStrings.ROLLED_BACK
    - java.lang.String
  */
  type DeploymentState = typingsJapgolly.awsSdk.appconfigMod._DeploymentState | java.lang.String
  type DeploymentStrategyId = java.lang.String
  type DeploymentStrategyList = js.Array[typingsJapgolly.awsSdk.appconfigMod.DeploymentStrategy]
  type Description = java.lang.String
  type EnvironmentList = js.Array[typingsJapgolly.awsSdk.appconfigMod.Environment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_DEPLOYMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYING
    - typingsJapgolly.awsSdk.awsSdkStrings.ROLLING_BACK
    - typingsJapgolly.awsSdk.awsSdkStrings.ROLLED_BACK
    - java.lang.String
  */
  type EnvironmentState = typingsJapgolly.awsSdk.appconfigMod._EnvironmentState | java.lang.String
  type GrowthFactor = scala.Double
  type GrowthType = typingsJapgolly.awsSdk.awsSdkStrings.LINEAR | java.lang.String
  type Id = java.lang.String
  type Integer = scala.Double
  type Iso8601DateTime = js.Date
  type MaxResults = scala.Double
  type MinutesBetween0And24Hours = scala.Double
  type MonitorList = js.Array[typingsJapgolly.awsSdk.appconfigMod.Monitor]
  type Name = java.lang.String
  type NextToken = java.lang.String
  type Percentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.SSM_DOCUMENT
    - java.lang.String
  */
  type ReplicateTo = typingsJapgolly.awsSdk.appconfigMod._ReplicateTo | java.lang.String
  type String = java.lang.String
  type StringWithLengthBetween0And32768 = java.lang.String
  type StringWithLengthBetween1And64 = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.appconfigMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.appconfigMod.TagValue]
  type TagValue = java.lang.String
  type Uri = java.lang.String
  type ValidatorList = js.Array[typingsJapgolly.awsSdk.appconfigMod.Validator]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON_SCHEMA
    - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA
    - java.lang.String
  */
  type ValidatorType = typingsJapgolly.awsSdk.appconfigMod._ValidatorType | java.lang.String
  type ValidatorTypeList = js.Array[typingsJapgolly.awsSdk.appconfigMod.ValidatorType]
  type Version = java.lang.String
  type _Blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.appconfigMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-10-09`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.appconfigMod._apiVersion | java.lang.String
}
