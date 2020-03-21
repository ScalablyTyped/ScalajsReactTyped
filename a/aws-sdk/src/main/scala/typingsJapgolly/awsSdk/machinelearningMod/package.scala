package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object machinelearningMod {
  type Algorithm = typingsJapgolly.awsSdk.awsSdkStrings.sgd | java.lang.String
  type AwsUserArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CreatedAt
    - typingsJapgolly.awsSdk.awsSdkStrings.LastUpdatedAt
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.IAMUser
    - typingsJapgolly.awsSdk.awsSdkStrings.MLModelId
    - typingsJapgolly.awsSdk.awsSdkStrings.DataSourceId
    - typingsJapgolly.awsSdk.awsSdkStrings.DataURI
    - java.lang.String
  */
  type BatchPredictionFilterVariable = typingsJapgolly.awsSdk.machinelearningMod._BatchPredictionFilterVariable | java.lang.String
  type BatchPredictions = js.Array[typingsJapgolly.awsSdk.machinelearningMod.BatchPrediction]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.machinelearningMod.ClientApiVersions
  type ComparatorValue = java.lang.String
  type ComputeStatistics = scala.Boolean
  type DataRearrangement = java.lang.String
  type DataSchema = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CreatedAt
    - typingsJapgolly.awsSdk.awsSdkStrings.LastUpdatedAt
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.DataLocationS3
    - typingsJapgolly.awsSdk.awsSdkStrings.IAMUser
    - java.lang.String
  */
  type DataSourceFilterVariable = typingsJapgolly.awsSdk.machinelearningMod._DataSourceFilterVariable | java.lang.String
  type DataSources = js.Array[typingsJapgolly.awsSdk.machinelearningMod.DataSource]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PredictiveModelType
    - typingsJapgolly.awsSdk.awsSdkStrings.Algorithm
    - java.lang.String
  */
  type DetailsAttributes = typingsJapgolly.awsSdk.machinelearningMod._DetailsAttributes | java.lang.String
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.machinelearningMod.DetailsValue]
  type DetailsValue = java.lang.String
  type EDPPipelineId = java.lang.String
  type EDPResourceRole = java.lang.String
  type EDPSecurityGroupId = java.lang.String
  type EDPSecurityGroupIds = js.Array[typingsJapgolly.awsSdk.machinelearningMod.EDPSecurityGroupId]
  type EDPServiceRole = java.lang.String
  type EDPSubnetId = java.lang.String
  type EntityId = java.lang.String
  type EntityName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.INPROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type EntityStatus = typingsJapgolly.awsSdk.machinelearningMod._EntityStatus | java.lang.String
  type EpochTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CreatedAt
    - typingsJapgolly.awsSdk.awsSdkStrings.LastUpdatedAt
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.IAMUser
    - typingsJapgolly.awsSdk.awsSdkStrings.MLModelId
    - typingsJapgolly.awsSdk.awsSdkStrings.DataSourceId
    - typingsJapgolly.awsSdk.awsSdkStrings.DataURI
    - java.lang.String
  */
  type EvaluationFilterVariable = typingsJapgolly.awsSdk.machinelearningMod._EvaluationFilterVariable | java.lang.String
  type Evaluations = js.Array[typingsJapgolly.awsSdk.machinelearningMod.Evaluation]
  type IntegerType = scala.Double
  type Label = java.lang.String
  type LongType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CreatedAt
    - typingsJapgolly.awsSdk.awsSdkStrings.LastUpdatedAt
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.IAMUser
    - typingsJapgolly.awsSdk.awsSdkStrings.TrainingDataSourceId
    - typingsJapgolly.awsSdk.awsSdkStrings.RealtimeEndpointStatus
    - typingsJapgolly.awsSdk.awsSdkStrings.MLModelType
    - typingsJapgolly.awsSdk.awsSdkStrings.Algorithm
    - typingsJapgolly.awsSdk.awsSdkStrings.TrainingDataURI
    - java.lang.String
  */
  type MLModelFilterVariable = typingsJapgolly.awsSdk.machinelearningMod._MLModelFilterVariable | java.lang.String
  type MLModelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REGRESSION
    - typingsJapgolly.awsSdk.awsSdkStrings.BINARY
    - typingsJapgolly.awsSdk.awsSdkStrings.MULTICLASS
    - java.lang.String
  */
  type MLModelType = typingsJapgolly.awsSdk.machinelearningMod._MLModelType | java.lang.String
  type MLModels = js.Array[typingsJapgolly.awsSdk.machinelearningMod.MLModel]
  type Message = java.lang.String
  type PageLimit = scala.Double
  type PerformanceMetricsProperties = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.machinelearningMod.PerformanceMetricsPropertyValue]
  type PerformanceMetricsPropertyKey = java.lang.String
  type PerformanceMetricsPropertyValue = java.lang.String
  type PresignedS3Url = java.lang.String
  type RDSDatabaseName = java.lang.String
  type RDSDatabasePassword = java.lang.String
  type RDSDatabaseUsername = java.lang.String
  type RDSInstanceIdentifier = java.lang.String
  type RDSSelectSqlQuery = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RealtimeEndpointStatus = typingsJapgolly.awsSdk.machinelearningMod._RealtimeEndpointStatus | java.lang.String
  type Recipe = java.lang.String
  type Record = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.machinelearningMod.VariableValue]
  type RedshiftClusterIdentifier = java.lang.String
  type RedshiftDatabaseName = java.lang.String
  type RedshiftDatabasePassword = java.lang.String
  type RedshiftDatabaseUsername = java.lang.String
  type RedshiftSelectSqlQuery = java.lang.String
  type RoleARN = java.lang.String
  type S3Url = java.lang.String
  type ScoreThreshold = scala.Double
  type ScoreValue = scala.Double
  type ScoreValuePerLabelMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.machinelearningMod.ScoreValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.asc_
    - typingsJapgolly.awsSdk.awsSdkStrings.dsc
    - java.lang.String
  */
  type SortOrder = typingsJapgolly.awsSdk.machinelearningMod._SortOrder | java.lang.String
  type StringType = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.machinelearningMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.machinelearningMod.Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BatchPrediction
    - typingsJapgolly.awsSdk.awsSdkStrings.DataSource
    - typingsJapgolly.awsSdk.awsSdkStrings.Evaluation_
    - typingsJapgolly.awsSdk.awsSdkStrings.MLModel
    - java.lang.String
  */
  type TaggableResourceType = typingsJapgolly.awsSdk.machinelearningMod._TaggableResourceType | java.lang.String
  type TrainingParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.machinelearningMod.StringType]
  type VariableName = java.lang.String
  type VariableValue = java.lang.String
  type Verbose = scala.Boolean
  type VipURL = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-12-12`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.machinelearningMod._apiVersion | java.lang.String
  type floatLabel = scala.Double
}
