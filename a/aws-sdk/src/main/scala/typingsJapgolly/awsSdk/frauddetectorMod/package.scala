package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object frauddetectorMod {
  type BatchCreateVariableErrorList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.BatchCreateVariableError]
  type BatchGetVariableErrorList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.BatchGetVariableError]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.frauddetectorMod.ClientApiVersions
  type CsvIndexToVariableMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
    - typingsJapgolly.awsSdk.awsSdkStrings.MODEL_SCORE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL_MODEL_SCORE
    - java.lang.String
  */
  type DataSource = typingsJapgolly.awsSdk.frauddetectorMod._DataSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STRING
    - typingsJapgolly.awsSdk.awsSdkStrings.INTEGER
    - typingsJapgolly.awsSdk.awsSdkStrings.FLOAT
    - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
    - java.lang.String
  */
  type DataType = typingsJapgolly.awsSdk.frauddetectorMod._DataType | java.lang.String
  type DetectorList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.Detector]
  type DetectorVersionMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DRAFT
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type DetectorVersionStatus = typingsJapgolly.awsSdk.frauddetectorMod._DetectorVersionStatus | java.lang.String
  type DetectorVersionSummaryList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.DetectorVersionSummary]
  type DetectorsMaxResults = scala.Double
  type EventAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.frauddetectorMod.attributeValue]
  type ExternalModelEndpointDataBlobMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.frauddetectorMod.ModelEndpointDataBlob]
  type ExternalModelList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.ExternalModel]
  type ExternalModelsMaxResults = scala.Double
  type IsOpaque = scala.Boolean
  type JsonKeyToVariableMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LabelMapper = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.frauddetectorMod.ListOfStrings]
  type Language = typingsJapgolly.awsSdk.awsSdkStrings.DETECTORPL | java.lang.String
  type ListOfModelScores = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.ModelScores]
  type ListOfModelVersions = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.ModelVersion]
  type ListOfStrings = js.Array[java.lang.String]
  type MaxResults = scala.Double
  type MetricsMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISSOCIATED
    - java.lang.String
  */
  type ModelEndpointStatus = typingsJapgolly.awsSdk.frauddetectorMod._ModelEndpointStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_CSV
    - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_JSON
    - java.lang.String
  */
  type ModelInputDataFormat = typingsJapgolly.awsSdk.frauddetectorMod._ModelInputDataFormat | java.lang.String
  type ModelList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.Model]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_CSV
    - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_JSONLINES
    - java.lang.String
  */
  type ModelOutputDataFormat = typingsJapgolly.awsSdk.frauddetectorMod._ModelOutputDataFormat | java.lang.String
  type ModelPredictionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.frauddetectorMod.float]
  type ModelSource = typingsJapgolly.awsSdk.awsSdkStrings.SAGEMAKER | java.lang.String
  type ModelTypeEnum = typingsJapgolly.awsSdk.awsSdkStrings.ONLINE_FRAUD_INSIGHTS | java.lang.String
  type ModelVariableIndex = scala.Double
  type ModelVariablesList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.ModelVariable]
  type ModelVersionDetailList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.ModelVersionDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TRAINING_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.TRAINING_COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATE_REQUESTED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ModelVersionStatus = typingsJapgolly.awsSdk.frauddetectorMod._ModelVersionStatus | java.lang.String
  type NameList = js.Array[java.lang.String]
  type NonEmptyListOfStrings = js.Array[java.lang.String]
  type OutcomeList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.Outcome]
  type OutcomesMaxResults = scala.Double
  type RuleDetailList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.RuleDetail]
  type RuleList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.Rule]
  type RulesMaxResults = scala.Double
  type VariableEntryList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.VariableEntry]
  type VariableList = js.Array[typingsJapgolly.awsSdk.frauddetectorMod.Variable]
  type VariablesMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-11-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.frauddetectorMod._apiVersion | java.lang.String
  type attributeKey = java.lang.String
  type attributeValue = java.lang.String
  type blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.frauddetectorMod.Blob_ | java.lang.String
  type contentType = java.lang.String
  type description = java.lang.String
  type float = scala.Double
  type iamRoleArn = java.lang.String
  type identifier = java.lang.String
  type integer = scala.Double
  type nonEmptyString = java.lang.String
  type ruleExpression = java.lang.String
  type s3BucketLocation = java.lang.String
  type time = java.lang.String
}
