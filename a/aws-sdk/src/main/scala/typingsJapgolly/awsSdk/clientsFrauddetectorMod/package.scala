package typingsJapgolly.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.DETECTORPL
import typingsJapgolly.awsSdk.awsSdkStrings.SAGEMAKER
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ATIMetricDataPointsList = js.Array[ATIMetricDataPoint]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS_INITIALIZING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCEL_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AsyncJobStatus = _AsyncJobStatus | String

type BatchCreateVariableErrorList = js.Array[BatchCreateVariableError]

type BatchGetVariableErrorList = js.Array[BatchGetVariableError]

type BatchImportList = js.Array[BatchImport]

type BatchPredictionList = js.Array[BatchPrediction]

type Boolean = scala.Boolean

type CsvIndexToVariableMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
  - typingsJapgolly.awsSdk.awsSdkStrings.MODEL_SCORE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL_MODEL_SCORE
  - java.lang.String
*/
type DataSource = _DataSource | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEGER
  - typingsJapgolly.awsSdk.awsSdkStrings.FLOAT
  - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
  - java.lang.String
*/
type DataType = _DataType | String

type DeleteAuditHistory = scala.Boolean

type DetectorList = js.Array[Detector]

type DetectorVersionMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DRAFT
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type DetectorVersionStatus = _DetectorVersionStatus | String

type DetectorVersionSummaryList = js.Array[DetectorVersionSummary]

type DetectorsMaxResults = Double

type EvaluatedRuleList = js.Array[EvaluatedRule]

type EventAttributeMap = StringDictionary[attributeValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type EventIngestion = _EventIngestion | String

type EventPredictionsMaxResults = Double

type EventVariableMap = StringDictionary[variableValue]

type ExternalModelEndpointDataBlobMap = StringDictionary[ModelEndpointDataBlob]

type ExternalModelList = js.Array[ExternalModel]

type ExternalModelPredictionMap = StringDictionary[String]

type ExternalModelsMaxResults = Double

type Integer_ = Double

type JsonKeyToVariableMap = StringDictionary[String]

type KmsEncryptionKeyArn = String

type Language = DETECTORPL | String

type ListOfAggregatedLogOddsMetrics = js.Array[AggregatedLogOddsMetric]

type ListOfAggregatedVariablesImpactExplanations = js.Array[AggregatedVariablesImpactExplanation]

type ListOfEvaluatedExternalModels = js.Array[EvaluatedExternalModel]

type ListOfEvaluatedModelVersions = js.Array[EvaluatedModelVersion]

type ListOfEventPredictionSummaries = js.Array[EventPredictionSummary]

type ListOfEventVariableSummaries = js.Array[EventVariableSummary]

type ListOfExternalModelOutputs = js.Array[ExternalModelOutputs]

type ListOfLogOddsMetrics = js.Array[LogOddsMetric]

type ListOfModelScores = js.Array[ModelScores]

type ListOfModelVersionEvaluations = js.Array[ModelVersionEvaluation]

type ListOfModelVersions = js.Array[ModelVersion]

type ListOfRuleResults = js.Array[RuleResult]

type ListOfStrings = js.Array[String]

type Long = Double

type MapOfStrings = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISSOCIATED
  - java.lang.String
*/
type ModelEndpointStatus = _ModelEndpointStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_JSON
  - java.lang.String
*/
type ModelInputDataFormat = _ModelInputDataFormat | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_JSONLINES
  - java.lang.String
*/
type ModelOutputDataFormat = _ModelOutputDataFormat | String

type ModelPredictionMap = StringDictionary[float]

type ModelSource = SAGEMAKER | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ONLINE_FRAUD_INSIGHTS
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSACTION_FRAUD_INSIGHTS
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_TAKEOVER_INSIGHTS
  - java.lang.String
*/
type ModelTypeEnum = _ModelTypeEnum | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.TRAINING_CANCELLED
  - java.lang.String
*/
type ModelVersionStatus = _ModelVersionStatus | String

type NameList = js.Array[String]

type NonEmptyListOfStrings = js.Array[String]

type OFIMetricDataPointsList = js.Array[OFIMetricDataPoint]

type OutcomeList = js.Array[Outcome]

type OutcomesMaxResults = Double

type RuleDetailList = js.Array[RuleDetail]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL_MATCHED
  - typingsJapgolly.awsSdk.awsSdkStrings.FIRST_MATCHED
  - java.lang.String
*/
type RuleExecutionMode = _RuleExecutionMode | String

type RuleList = js.Array[Rule]

type RulesMaxResults = Double

type TFIMetricDataPointsList = js.Array[TFIMetricDataPoint]

type TagsMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL_EVENTS
  - typingsJapgolly.awsSdk.awsSdkStrings.INGESTED_EVENTS
  - java.lang.String
*/
type TrainingDataSourceEnum = _TrainingDataSourceEnum | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IGNORE
  - typingsJapgolly.awsSdk.awsSdkStrings.FRAUD
  - typingsJapgolly.awsSdk.awsSdkStrings.LEGIT
  - java.lang.String
*/
type UnlabeledEventsTreatment = _UnlabeledEventsTreatment | String

type UseEventVariables = scala.Boolean

type VariableEntryList = js.Array[VariableEntry]

type VariableList = js.Array[Variable]

type VariablesMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-11-15`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type attributeKey = String

type attributeValue = String

type batchImportsMaxPageSize = Double

type batchPredictionsMaxPageSize = Double

type blob = Buffer | js.typedarray.Uint8Array | Blob_ | String

type contentType = String

type description = String

type entityRestrictedString = String

type entityTypeList = js.Array[EntityType]

type entityTypesMaxResults = Double

type eventTypeList = js.Array[EventType]

type eventTypesMaxResults = Double

type fieldValidationMessageList = js.Array[FieldValidationMessage]

type fileValidationMessageList = js.Array[FileValidationMessage]

type filterString = String

type float = Double

type floatVersionString = String

type fraudDetectorArn = String

type iamRoleArn = String

type identifier = String

type integer = Double

type labelList = js.Array[Label]

type labelMapper = StringDictionary[ListOfStrings]

type labelsMaxResults = Double

type listOfEntities = js.Array[Entity]

type listOfVariableImpactExplanations = js.Array[VariableImpactExplanation]

type metricDataPointsList = js.Array[MetricDataPoint]

type modelIdentifier = String

type modelInputTemplate = String

type modelList = js.Array[Model]

type modelVersionDetailList = js.Array[ModelVersionDetail]

type modelsMaxPageSize = Double

type ruleExpression = String

type s3BucketLocation = String

type sageMakerEndpointIdentifier = String

type sensitiveString = String

type tagKey = String

type tagKeyList = js.Array[tagKey]

type tagList = js.Array[Tag]

type tagValue = String

type time = String

type utcTimestampISO8601 = String

type variableName = String

type variableValue = String

type wholeNumberVersionString = String
