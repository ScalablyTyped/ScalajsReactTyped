package typingsJapgolly.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionDescription = String

type ActionId = String

type ActionParameterDescription = String

type ActionParameterMap = StringDictionary[ActionParameter]

type ActionParameterName = String

type ActionParameterRequired = Boolean

type ActionSummaryList = js.Array[ActionSummary]

type ActionTargetMap = StringDictionary[ActionTarget]

type ActionTargetName = String

type ClientToken = String

type CloudWatchLogGroupArn = String

type CreateExperimentTemplateActionInputMap = StringDictionary[CreateExperimentTemplateActionInput]

type CreateExperimentTemplateStopConditionInputList = js.Array[CreateExperimentTemplateStopConditionInput]

type CreateExperimentTemplateTargetInputMap = StringDictionary[CreateExperimentTemplateTargetInput]

type CreationTime = js.Date

type ExperimentActionDescription = String

type ExperimentActionEndTime = js.Date

type ExperimentActionMap = StringDictionary[ExperimentAction]

type ExperimentActionName = String

type ExperimentActionParameter = String

type ExperimentActionParameterMap = StringDictionary[ExperimentActionParameter]

type ExperimentActionParameterName = String

type ExperimentActionStartAfter = String

type ExperimentActionStartAfterList = js.Array[ExperimentActionStartAfter]

type ExperimentActionStartTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.pending__
  - typingsJapgolly.awsSdk.awsSdkStrings.initiating_
  - typingsJapgolly.awsSdk.awsSdkStrings.running__
  - typingsJapgolly.awsSdk.awsSdkStrings.completed__
  - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
  - typingsJapgolly.awsSdk.awsSdkStrings.stopping__
  - typingsJapgolly.awsSdk.awsSdkStrings.stopped__
  - typingsJapgolly.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type ExperimentActionStatus = _ExperimentActionStatus | String

type ExperimentActionStatusReason = String

type ExperimentActionTargetMap = StringDictionary[ExperimentTargetName]

type ExperimentActionTargetName = String

type ExperimentEndTime = js.Date

type ExperimentId = String

type ExperimentStartTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.pending__
  - typingsJapgolly.awsSdk.awsSdkStrings.initiating_
  - typingsJapgolly.awsSdk.awsSdkStrings.running__
  - typingsJapgolly.awsSdk.awsSdkStrings.completed__
  - typingsJapgolly.awsSdk.awsSdkStrings.stopping__
  - typingsJapgolly.awsSdk.awsSdkStrings.stopped__
  - typingsJapgolly.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type ExperimentStatus = _ExperimentStatus | String

type ExperimentStatusReason = String

type ExperimentStopConditionList = js.Array[ExperimentStopCondition]

type ExperimentSummaryList = js.Array[ExperimentSummary]

type ExperimentTargetFilterList = js.Array[ExperimentTargetFilter]

type ExperimentTargetFilterPath = String

type ExperimentTargetFilterValue = String

type ExperimentTargetFilterValues = js.Array[ExperimentTargetFilterValue]

type ExperimentTargetMap = StringDictionary[ExperimentTarget]

type ExperimentTargetName = String

type ExperimentTargetParameterMap = StringDictionary[ExperimentTargetParameterValue]

type ExperimentTargetParameterName = String

type ExperimentTargetParameterValue = String

type ExperimentTargetSelectionMode = String

type ExperimentTemplateActionDescription = String

type ExperimentTemplateActionMap = StringDictionary[ExperimentTemplateAction]

type ExperimentTemplateActionName = String

type ExperimentTemplateActionParameter = String

type ExperimentTemplateActionParameterMap = StringDictionary[ExperimentTemplateActionParameter]

type ExperimentTemplateActionParameterName = String

type ExperimentTemplateActionStartAfter = String

type ExperimentTemplateActionStartAfterList = js.Array[ExperimentTemplateActionStartAfter]

type ExperimentTemplateActionTargetMap = StringDictionary[ExperimentTemplateTargetName]

type ExperimentTemplateActionTargetName = String

type ExperimentTemplateDescription = String

type ExperimentTemplateId = String

type ExperimentTemplateStopConditionList = js.Array[ExperimentTemplateStopCondition]

type ExperimentTemplateSummaryList = js.Array[ExperimentTemplateSummary]

type ExperimentTemplateTargetFilterInputList = js.Array[ExperimentTemplateTargetInputFilter]

type ExperimentTemplateTargetFilterList = js.Array[ExperimentTemplateTargetFilter]

type ExperimentTemplateTargetFilterPath = String

type ExperimentTemplateTargetFilterValue = String

type ExperimentTemplateTargetFilterValues = js.Array[ExperimentTemplateTargetFilterValue]

type ExperimentTemplateTargetMap = StringDictionary[ExperimentTemplateTarget]

type ExperimentTemplateTargetName = String

type ExperimentTemplateTargetParameterMap = StringDictionary[ExperimentTemplateTargetParameterValue]

type ExperimentTemplateTargetParameterName = String

type ExperimentTemplateTargetParameterValue = String

type ExperimentTemplateTargetSelectionMode = String

type LastUpdateTime = js.Date

type ListActionsMaxResults = Double

type ListExperimentTemplatesMaxResults = Double

type ListExperimentsMaxResults = Double

type ListTargetResourceTypesMaxResults = Double

type LogSchemaVersion = Double

type NextToken = String

type ResourceArn = String

type ResourceArnList = js.Array[ResourceArn]

type RoleArn = String

type S3BucketName = String

type S3ObjectKey = String

type StopConditionSource = String

type StopConditionValue = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TargetResourceTypeDescription = String

type TargetResourceTypeId = String

type TargetResourceTypeParameterDescription = String

type TargetResourceTypeParameterMap = StringDictionary[TargetResourceTypeParameter]

type TargetResourceTypeParameterName = String

type TargetResourceTypeParameterRequired = Boolean

type TargetResourceTypeSummaryList = js.Array[TargetResourceTypeSummary]

type UpdateExperimentTemplateActionInputMap = StringDictionary[UpdateExperimentTemplateActionInputItem]

type UpdateExperimentTemplateStopConditionInputList = js.Array[UpdateExperimentTemplateStopConditionInput]

type UpdateExperimentTemplateTargetInputMap = StringDictionary[UpdateExperimentTemplateTargetInput]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-12-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
