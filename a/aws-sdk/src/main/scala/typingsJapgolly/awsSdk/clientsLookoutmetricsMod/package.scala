package typingsJapgolly.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVG
  - typingsJapgolly.awsSdk.awsSdkStrings.SUM
  - java.lang.String
*/
type AggregationFunction = _AggregationFunction | String

type AlertDescription = String

type AlertName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type AlertStatus = _AlertStatus | String

type AlertSummaryList = js.Array[AlertSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SNS
  - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA
  - java.lang.String
*/
type AlertType = _AlertType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_SCHEDULE
  - java.lang.String
*/
type AnomalyDetectionTaskStatus = _AnomalyDetectionTaskStatus | String

type AnomalyDetectionTaskStatusMessage = String

type AnomalyDetectorDataQualityMetricList = js.Array[AnomalyDetectorDataQualityMetric]

type AnomalyDetectorDescription = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATION_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.BACK_TEST_ACTIVATION_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETION_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATION_FAILURE
  - java.lang.String
*/
type AnomalyDetectorFailureType = _AnomalyDetectorFailureType | String

type AnomalyDetectorName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.LEARNING
  - typingsJapgolly.awsSdk.awsSdkStrings.BACK_TEST_ACTIVATING
  - typingsJapgolly.awsSdk.awsSdkStrings.BACK_TEST_ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.BACK_TEST_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATING
  - java.lang.String
*/
type AnomalyDetectorStatus = _AnomalyDetectorStatus | String

type AnomalyDetectorSummaryList = js.Array[AnomalyDetectorSummary]

type AnomalyGroupSummaryList = js.Array[AnomalyGroupSummary]

type Arn = String

type AthenaDataCatalog = String

type AthenaDatabaseName = String

type AthenaS3ResultsPath = String

type AthenaTableName = String

type AthenaWorkGroupName = String

type BinaryAttributeValue = String

type BinaryListAttributeValue = js.Array[BinaryAttributeValue]

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.GZIP
  - java.lang.String
*/
type CSVFileCompression = _CSVFileCompression | String

type Charset = String

type ColumnName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type Confidence = _Confidence | String

type DataItem = String

type DataQualityMetricDescription = String

type DataQualityMetricList = js.Array[DataQualityMetric]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_COMPLETENESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DIMENSION_UNIQUENESS
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_SERIES_COUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ROWS_PROCESSED
  - typingsJapgolly.awsSdk.awsSdkStrings.ROWS_PARTIAL_COMPLIANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_ROWS_COMPLIANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKTEST_TRAINING_DATA_START_TIME_STAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKTEST_TRAINING_DATA_END_TIME_STAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKTEST_INFERENCE_DATA_START_TIME_STAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKTEST_INFERENCE_DATA_END_TIME_STAMP
  - java.lang.String
*/
type DataQualityMetricType = _DataQualityMetricType | String

type DatabaseHost = String

type DatabasePort = scala.Double

type DateTimeFormat = String

type Delimiter = String

type DimensionContributionList = js.Array[DimensionContribution]

type DimensionFilterList = js.Array[DimensionFilter]

type DimensionList = js.Array[ColumnName]

type DimensionNameValueList = js.Array[DimensionNameValue]

type DimensionValue = String

type DimensionValueContributionList = js.Array[DimensionValueContribution]

type DimensionValueList = js.Array[DimensionValue]

type Double = scala.Double

type ErrorMessage = String

type ExecutionList = js.Array[ExecutionStatus]

type FilterList = js.Array[Filter]

type FilterOperation = EQUALS | String

type FlowName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.P1D
  - typingsJapgolly.awsSdk.awsSdkStrings.PT1H
  - typingsJapgolly.awsSdk.awsSdkStrings.PT10M
  - typingsJapgolly.awsSdk.awsSdkStrings.PT5M
  - java.lang.String
*/
type Frequency = _Frequency | String

type HeaderList = js.Array[ColumnName]

type HeaderValue = String

type HeaderValueList = js.Array[HeaderValue]

type HistoricalDataPath = String

type HistoricalDataPathList = js.Array[HistoricalDataPath]

type Integer = scala.Double

type InterMetricImpactList = js.Array[InterMetricImpactDetails]

type ItemizedMetricStatsList = js.Array[ItemizedMetricStats]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.GZIP
  - java.lang.String
*/
type JsonFileCompression = _JsonFileCompression | String

type KmsKeyArn = String

type MaxResults = scala.Double

type Message = String

type MetricChangePercentage = scala.Double

type MetricLevelImpactList = js.Array[MetricLevelImpact]

type MetricList = js.Array[Metric]

type MetricName = String

type MetricNameList = js.Array[MetricName]

type MetricSetDataQualityMetricList = js.Array[MetricSetDataQualityMetric]

type MetricSetDescription = String

type MetricSetDimensionFilterList = js.Array[MetricSetDimensionFilter]

type MetricSetName = String

type MetricSetSummaryList = js.Array[MetricSetSummary]

type MetricValue = scala.Double

type MetricValueList = js.Array[MetricValue]

type Namespace = String

type NextToken = String

type NumberAttributeValue = String

type NumberListAttributeValue = js.Array[NumberAttributeValue]

type Offset = scala.Double

type PoirotSecretManagerArn = String

type QuoteSymbol = String

type RDSDatabaseIdentifier = String

type RDSDatabaseName = String

type RedshiftClusterIdentifier = String

type RedshiftDatabaseName = String

type RelatedColumnName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CAUSE_OF_INPUT_ANOMALY_GROUP
  - typingsJapgolly.awsSdk.awsSdkStrings.EFFECT_OF_INPUT_ANOMALY_GROUP
  - java.lang.String
*/
type RelationshipType = _RelationshipType | String

type SampleRow = js.Array[DataItem]

type SampleRows = js.Array[SampleRow]

type Score = scala.Double

type SecurityGroupId = String

type SecurityGroupIdList = js.Array[SecurityGroupId]

type SensitivityThreshold = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LONG_TEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.SHORT_TEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type SnsFormat = _SnsFormat | String

type StringAttributeValue = String

type StringListAttributeValue = js.Array[StringAttributeValue]

type SubnetId = String

type SubnetIdList = js.Array[SubnetId]

type TableName = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TemplatedPath = String

type TemplatedPathList = js.Array[TemplatedPath]

type TimeSeriesFeedbackList = js.Array[TimeSeriesFeedback]

type TimeSeriesId = String

type TimeSeriesList = js.Array[TimeSeries]

type Timestamp = js.Date

type TimestampList = js.Array[TimestampString]

type TimestampString = String

type Timezone = String

type UUID = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
