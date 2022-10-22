package typingsJapgolly.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionInvocations = js.Array[ActionInvocation]

type ActionList = js.Array[Action]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRE_CREATE_HOSTED_CONFIGURATION_VERSION
  - typingsJapgolly.awsSdk.awsSdkStrings.PRE_START_DEPLOYMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEPLOYMENT_START
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEPLOYMENT_STEP
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEPLOYMENT_BAKING
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEPLOYMENT_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEPLOYMENT_ROLLED_BACK
  - java.lang.String
*/
type ActionPoint = _ActionPoint | java.lang.String

type ActionsMap = StringDictionary[ActionList]

type ApplicationList = js.Array[Application]

type AppliedExtensions = js.Array[AppliedExtension]

type Arn = java.lang.String

type Boolean = scala.Boolean

type ConfigurationProfileSummaryList = js.Array[ConfigurationProfileSummary]

type ConfigurationProfileType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PERCENTAGE_UPDATED
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.BAKE_TIME_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_COMPLETED
  - java.lang.String
*/
type DeploymentEventType = _DeploymentEventType | java.lang.String

type DeploymentEvents = js.Array[DeploymentEvent]

type DeploymentList = js.Array[DeploymentSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BAKING
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLING_BACK
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLED_BACK
  - java.lang.String
*/
type DeploymentState = _DeploymentState | java.lang.String

type DeploymentStrategyId = java.lang.String

type DeploymentStrategyList = js.Array[DeploymentStrategy]

type Description = java.lang.String

type EnvironmentList = js.Array[Environment]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_DEPLOYMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYING
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLING_BACK
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLED_BACK
  - java.lang.String
*/
type EnvironmentState = _EnvironmentState | java.lang.String

type ExtensionAssociationSummaries = js.Array[ExtensionAssociationSummary]

type ExtensionSummaries = js.Array[ExtensionSummary]

type GrowthFactor = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LINEAR
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPONENTIAL
  - java.lang.String
*/
type GrowthType = _GrowthType | java.lang.String

type HostedConfigurationVersionSummaryList = js.Array[HostedConfigurationVersionSummary]

type Id = java.lang.String

type Identifier = java.lang.String

type Integer = Double

type Iso8601DateTime = js.Date

type LongName = java.lang.String

type MaxResults = Double

type MinutesBetween0And24Hours = Double

type MonitorList = js.Array[Monitor]

type Name = java.lang.String

type NextToken = java.lang.String

type ParameterMap = StringDictionary[Parameter]

type ParameterValueMap = StringDictionary[StringWithLengthBetween1And2048]

type Percentage = Double

type QueryName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.SSM_DOCUMENT
  - java.lang.String
*/
type ReplicateTo = _ReplicateTo | java.lang.String

type RoleArn = java.lang.String

type String = java.lang.String

type StringWithLengthBetween0And32768 = java.lang.String

type StringWithLengthBetween1And2048 = java.lang.String

type StringWithLengthBetween1And255 = java.lang.String

type StringWithLengthBetween1And64 = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.APPCONFIG
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDWATCH_ALARM
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type TriggeredBy = _TriggeredBy | java.lang.String

type Uri = java.lang.String

type ValidatorList = js.Array[Validator]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON_SCHEMA
  - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA
  - java.lang.String
*/
type ValidatorType = _ValidatorType | java.lang.String

type ValidatorTypeList = js.Array[ValidatorType]

type Version = java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-10-09`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
