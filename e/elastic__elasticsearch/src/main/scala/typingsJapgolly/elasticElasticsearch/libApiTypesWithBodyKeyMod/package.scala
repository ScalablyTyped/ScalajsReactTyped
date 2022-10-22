package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.auto
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.checksum
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.score
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.styled
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AggregateName = String

type AggregationsAdjacencyMatrixAggregate = AggregationsMultiBucketAggregateBase[AggregationsAdjacencyMatrixBucket]

type AggregationsAdjacencyMatrixBucketKeys = AggregationsMultiBucketBase

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCardinalityAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHdrPercentilesAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHdrPercentileRanksAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTDigestPercentilesAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTDigestPercentileRanksAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsPercentilesBucketAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMedianAbsoluteDeviationAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMinAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMaxAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSumAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsAvgAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsWeightedAvgAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsValueCountAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSimpleValueAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsDerivativeAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsBucketMetricValueAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStatsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStatsBucketAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsExtendedStatsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsExtendedStatsBucketAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoBoundsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoCentroidAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHistogramAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsDateHistogramAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsAutoDateHistogramAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsVariableWidthHistogramAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStringTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsLongTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsDoubleTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsUnmappedTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsLongRareTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStringRareTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsUnmappedRareTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMultiTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMissingAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsNestedAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsReverseNestedAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGlobalAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsFilterAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsChildrenAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsParentAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSamplerAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsUnmappedSamplerAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoHashGridAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoTileGridAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsRangeAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsDateRangeAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoDistanceAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsIpRangeAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsFiltersAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsAdjacencyMatrixAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSignificantLongTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSignificantStringTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsUnmappedSignificantTermsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCompositeAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsScriptedMetricAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTopHitsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsInferenceAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStringStatsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsBoxPlotAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTopMetricsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTTestAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsRateAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCumulativeCardinalityAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMatrixStatsAggregate
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoLineAggregate
*/
type AggregationsAggregate = _AggregationsAggregate | AggregationsHdrPercentilesAggregate | AggregationsHdrPercentileRanksAggregate | AggregationsTDigestPercentilesAggregate | AggregationsTDigestPercentileRanksAggregate | AggregationsPercentilesBucketAggregate | AggregationsMedianAbsoluteDeviationAggregate | AggregationsMinAggregate | AggregationsMaxAggregate | AggregationsSumAggregate | AggregationsAvgAggregate | AggregationsWeightedAvgAggregate | AggregationsValueCountAggregate | AggregationsSimpleValueAggregate | AggregationsStatsBucketAggregate | AggregationsExtendedStatsBucketAggregate | AggregationsHistogramAggregate | AggregationsDateHistogramAggregate | AggregationsVariableWidthHistogramAggregate | AggregationsStringTermsAggregate | AggregationsLongTermsAggregate | AggregationsDoubleTermsAggregate | AggregationsUnmappedTermsAggregate | AggregationsLongRareTermsAggregate | AggregationsStringRareTermsAggregate | AggregationsUnmappedRareTermsAggregate | AggregationsMultiTermsAggregate | AggregationsGeoHashGridAggregate | AggregationsGeoTileGridAggregate | AggregationsRangeAggregate | AggregationsDateRangeAggregate | AggregationsGeoDistanceAggregate | AggregationsIpRangeAggregate | AggregationsFiltersAggregate | AggregationsAdjacencyMatrixAggregate | AggregationsSignificantLongTermsAggregate | AggregationsSignificantStringTermsAggregate | AggregationsUnmappedSignificantTermsAggregate

type AggregationsAggregateOrder = (Partial[Record[Field, SortOrder]]) | (js.Array[Partial[Record[Field, SortOrder]]])

type AggregationsAverageAggregation = AggregationsFormatMetricAggregationBase

type AggregationsAverageBucketAggregation = AggregationsPipelineAggregationBase

type AggregationsAvgAggregate = AggregationsSingleMetricAggregateBase

type AggregationsBucketAggregationBase = AggregationsAggregation

type AggregationsBuckets[TBucket] = (Record[String, TBucket]) | js.Array[TBucket]

type AggregationsBucketsPath = String | js.Array[String] | (Record[String, String])

type AggregationsCategorizeTextAnalyzer = String | AggregationsCustomCategorizeTextAnalyzer

type AggregationsChildrenAggregateKeys = AggregationsSingleBucketAggregateBase

type AggregationsCumulativeCardinalityAggregation = AggregationsPipelineAggregationBase

type AggregationsCumulativeSumAggregation = AggregationsPipelineAggregationBase

type AggregationsDateHistogramAggregate = AggregationsMultiBucketAggregateBase[AggregationsDateHistogramBucket]

type AggregationsDateRangeAggregate = AggregationsRangeAggregate

type AggregationsDerivativeAggregation = AggregationsPipelineAggregationBase

type AggregationsDoubleTermsAggregate = AggregationsTermsAggregateBase[AggregationsDoubleTermsBucket]

type AggregationsExtendedStatsBucketAggregate = AggregationsExtendedStatsAggregate

type AggregationsFieldDateMath = DateMath | double

type AggregationsFilterAggregateKeys = AggregationsSingleBucketAggregateBase

type AggregationsFiltersAggregate = AggregationsMultiBucketAggregateBase[AggregationsFiltersBucket]

type AggregationsFiltersBucketKeys = AggregationsMultiBucketBase

type AggregationsGeoDistanceAggregate = AggregationsRangeAggregate

type AggregationsGeoHashGridAggregate = AggregationsMultiBucketAggregateBase[AggregationsGeoHashGridBucket]

type AggregationsGeoTileGridAggregate = AggregationsMultiBucketAggregateBase[AggregationsGeoTileGridBucket]

type AggregationsGlobalAggregateKeys = AggregationsSingleBucketAggregateBase

type AggregationsGlobalAggregation = AggregationsBucketAggregationBase

type AggregationsHdrPercentileRanksAggregate = AggregationsPercentilesAggregateBase

type AggregationsHdrPercentilesAggregate = AggregationsPercentilesAggregateBase

type AggregationsHistogramAggregate = AggregationsMultiBucketAggregateBase[AggregationsHistogramBucket]

type AggregationsIpRangeAggregate = AggregationsMultiBucketAggregateBase[AggregationsIpRangeBucket]

type AggregationsKeyedPercentiles = Record[String, String | long | Null]

type AggregationsLongRareTermsAggregate = AggregationsMultiBucketAggregateBase[AggregationsLongRareTermsBucket]

type AggregationsLongTermsAggregate = AggregationsTermsAggregateBase[AggregationsLongTermsBucket]

type AggregationsMaxAggregate = AggregationsSingleMetricAggregateBase

type AggregationsMaxAggregation = AggregationsFormatMetricAggregationBase

type AggregationsMaxBucketAggregation = AggregationsPipelineAggregationBase

type AggregationsMedianAbsoluteDeviationAggregate = AggregationsSingleMetricAggregateBase

type AggregationsMinAggregate = AggregationsSingleMetricAggregateBase

type AggregationsMinAggregation = AggregationsFormatMetricAggregationBase

type AggregationsMinBucketAggregation = AggregationsPipelineAggregationBase

type AggregationsMissing = String | integer | double | Boolean

type AggregationsMissingAggregateKeys = AggregationsSingleBucketAggregateBase

type AggregationsMultiTermsAggregate = AggregationsTermsAggregateBase[AggregationsMultiTermsBucket]

type AggregationsNestedAggregateKeys = AggregationsSingleBucketAggregateBase

type AggregationsParentAggregateKeys = AggregationsSingleBucketAggregateBase

type AggregationsPercentiles = AggregationsKeyedPercentiles | js.Array[AggregationsArrayPercentilesItem]

type AggregationsPercentilesBucketAggregate = AggregationsPercentilesAggregateBase

type AggregationsRangeAggregate = AggregationsMultiBucketAggregateBase[AggregationsRangeBucket]

type AggregationsReverseNestedAggregateKeys = AggregationsSingleBucketAggregateBase

type AggregationsSamplerAggregateKeys = AggregationsSingleBucketAggregateBase

type AggregationsSignificantLongTermsAggregate = AggregationsMultiBucketAggregateBase[AggregationsSignificantLongTermsBucket]

type AggregationsSignificantStringTermsAggregate = AggregationsMultiBucketAggregateBase[AggregationsSignificantStringTermsBucket]

type AggregationsSimpleValueAggregate = AggregationsSingleMetricAggregateBase

type AggregationsStatsAggregation = AggregationsFormatMetricAggregationBase

type AggregationsStatsBucketAggregate = AggregationsStatsAggregate

type AggregationsStatsBucketAggregation = AggregationsPipelineAggregationBase

type AggregationsStringRareTermsAggregate = AggregationsMultiBucketAggregateBase[AggregationsStringRareTermsBucket]

type AggregationsStringTermsAggregate = AggregationsTermsAggregateBase[AggregationsStringTermsBucket]

type AggregationsSumAggregate = AggregationsSingleMetricAggregateBase

type AggregationsSumAggregation = AggregationsFormatMetricAggregationBase

type AggregationsSumBucketAggregation = AggregationsPipelineAggregationBase

type AggregationsTDigestPercentileRanksAggregate = AggregationsPercentilesAggregateBase

type AggregationsTDigestPercentilesAggregate = AggregationsPercentilesAggregateBase

type AggregationsTermsExclude = String | js.Array[String]

type AggregationsTermsInclude = String | js.Array[String] | AggregationsTermsPartition

type AggregationsUnmappedRareTermsAggregate = AggregationsMultiBucketAggregateBase[Unit]

type AggregationsUnmappedSamplerAggregateKeys = AggregationsSingleBucketAggregateBase

type AggregationsUnmappedSignificantTermsAggregate = AggregationsMultiBucketAggregateBase[Unit]

type AggregationsUnmappedTermsAggregate = AggregationsTermsAggregateBase[Unit]

type AggregationsValueCountAggregate = AggregationsSingleMetricAggregateBase

type AggregationsValueCountAggregation = AggregationsFormattableMetricAggregation

type AggregationsVariableWidthHistogramAggregate = AggregationsMultiBucketAggregateBase[AggregationsVariableWidthHistogramBucket]

type AggregationsWeightedAvgAggregate = AggregationsSingleMetricAggregateBase

type AnalysisCharFilter = String | AnalysisCharFilterDefinition

type AnalysisStopWords = String | js.Array[String]

type AnalysisTokenFilter = String | AnalysisTokenFilterDefinition

type AnalysisTokenizer = String | AnalysisTokenizerDefinition

type AsyncSearchDeleteResponse = AcknowledgedResponseBase

type AsyncSearchGetResponse[TDocument, TAggregations] = AsyncSearchAsyncSearchDocumentResponseBase[TDocument, TAggregations]

type AsyncSearchStatusResponse = AsyncSearchStatusStatusResponseBase

type AsyncSearchSubmitResponse[TDocument, TAggregations] = AsyncSearchAsyncSearchDocumentResponseBase[TDocument, TAggregations]

type AutoscalingDeleteAutoscalingPolicyResponse = AcknowledgedResponseBase

type AutoscalingGetAutoscalingCapacityRequest = RequestBase

type AutoscalingGetAutoscalingPolicyResponse = AutoscalingAutoscalingPolicy

type AutoscalingPutAutoscalingPolicyResponse = AcknowledgedResponseBase

type BulkCreateOperation = BulkWriteOperation

type BulkDeleteOperation = BulkOperationBase

type BulkIndexOperation = BulkWriteOperation

type ByteSize = long | String

type CatAliasesResponse = js.Array[CatAliasesAliasesRecord]

type CatAllocationResponse = js.Array[CatAllocationAllocationRecord]

type CatCatAnonalyDetectorColumns = CatCatAnomalyDetectorColumn | js.Array[CatCatAnomalyDetectorColumn]

type CatCatDatafeedColumns = CatCatDatafeedColumn | js.Array[CatCatDatafeedColumn]

type CatCatDfaColumns = CatCatDfaColumn | js.Array[CatCatDfaColumn]

type CatCatTrainedModelsColumns = CatCatTrainedModelsColumn | js.Array[CatCatTrainedModelsColumn]

type CatCatTransformColumns = CatCatTransformColumn | js.Array[CatCatTransformColumn]

type CatComponentTemplatesResponse = js.Array[CatComponentTemplatesComponentTemplate]

type CatCountResponse = js.Array[CatCountCountRecord]

type CatFielddataResponse = js.Array[CatFielddataFielddataRecord]

type CatHealthResponse = js.Array[CatHealthHealthRecord]

type CatHelpRequest = CatCatRequestBase

type CatHelpResponse = js.Array[CatHelpHelpRecord]

type CatIndicesResponse = js.Array[CatIndicesIndicesRecord]

type CatMasterRequest = CatCatRequestBase

type CatMasterResponse = js.Array[CatMasterMasterRecord]

type CatMlDataFrameAnalyticsResponse = js.Array[CatMlDataFrameAnalyticsDataFrameAnalyticsRecord]

type CatMlDatafeedsResponse = js.Array[CatMlDatafeedsDatafeedsRecord]

type CatMlJobsResponse = js.Array[CatMlJobsJobsRecord]

type CatMlTrainedModelsResponse = js.Array[CatMlTrainedModelsTrainedModelsRecord]

type CatNodeattrsRequest = CatCatRequestBase

type CatNodeattrsResponse = js.Array[CatNodeattrsNodeAttributesRecord]

type CatNodesResponse = js.Array[CatNodesNodesRecord]

type CatPendingTasksRequest = CatCatRequestBase

type CatPendingTasksResponse = js.Array[CatPendingTasksPendingTasksRecord]

type CatPluginsRequest = CatCatRequestBase

type CatPluginsResponse = js.Array[CatPluginsPluginsRecord]

type CatRecoveryResponse = js.Array[CatRecoveryRecoveryRecord]

type CatRepositoriesRequest = CatCatRequestBase

type CatRepositoriesResponse = js.Array[CatRepositoriesRepositoriesRecord]

type CatSegmentsResponse = js.Array[CatSegmentsSegmentsRecord]

type CatShardsResponse = js.Array[CatShardsShardsRecord]

type CatSnapshotsResponse = js.Array[CatSnapshotsSnapshotsRecord]

type CatTasksResponse = js.Array[CatTasksTasksRecord]

type CatTemplatesResponse = js.Array[CatTemplatesTemplatesRecord]

type CatThreadPoolResponse = js.Array[CatThreadPoolThreadPoolRecord]

type CatTransformsResponse = js.Array[CatTransformsTransformsRecord]

type CategoryId = String

type CcrDeleteAutoFollowPatternResponse = AcknowledgedResponseBase

type CcrPauseAutoFollowPatternResponse = AcknowledgedResponseBase

type CcrPauseFollowResponse = AcknowledgedResponseBase

type CcrPutAutoFollowPatternResponse = AcknowledgedResponseBase

type CcrResumeAutoFollowPatternResponse = AcknowledgedResponseBase

type CcrResumeFollowResponse = AcknowledgedResponseBase

type CcrStatsRequest = RequestBase

type CcrUnfollowResponse = AcknowledgedResponseBase

type ClusterDeleteComponentTemplateResponse = AcknowledgedResponseBase

type ClusterDeleteVotingConfigExclusionsResponse = Boolean

type ClusterExistsComponentTemplateResponse = Boolean

type ClusterPostVotingConfigExclusionsResponse = Boolean

type ClusterPutComponentTemplateResponse = AcknowledgedResponseBase

type ClusterRemoteInfoRequest = RequestBase

type ClusterRemoteInfoResponse = Record[String, ClusterRemoteInfoClusterRemoteInfo]

type ClusterStateResponse = Any

type ClusterStatsResponse = ClusterStatsStatsResponseBase

type CreateResponse = WriteResponseBase

type DanglingIndicesDeleteDanglingIndexResponse = AcknowledgedResponseBase

type DanglingIndicesImportDanglingIndexResponse = AcknowledgedResponseBase

type DanglingIndicesListDanglingIndicesRequest = RequestBase

type DataStreamName = String

type DataStreamNames = DataStreamName | js.Array[DataStreamName]

type DateFormat = String

type DateMath = String

type DateTime = String | EpochTime[UnitMillis]

type DeleteByQueryRethrottleResponse = TasksTaskListResponseBase

type DeleteResponse = WriteResponseBase

type DeleteScriptResponse = AcknowledgedResponseBase

type Distance = String

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchInts.`-1`
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchInts.`0`
*/
type Duration = _Duration | String

type DurationLarge = String

type DurationValue[Unit] = Unit

type EnrichDeletePolicyResponse = AcknowledgedResponseBase

type EnrichPutPolicyResponse = AcknowledgedResponseBase

type EnrichStatsRequest = RequestBase

type EpochTime[Unit] = Unit

type EqlDeleteResponse = AcknowledgedResponseBase

type EqlGetResponse[TEvent] = EqlEqlSearchResponseBase[TEvent]

type EqlSearchResponse[TEvent] = EqlEqlSearchResponseBase[TEvent]

type ExistsResponse = Boolean

type ExistsSourceResponse = Boolean

type ExpandWildcards = ExpandWildcard | js.Array[ExpandWildcard]

type FeaturesGetFeaturesRequest = RequestBase

type FeaturesResetFeaturesRequest = RequestBase

type Field = String

type FieldValue = long | double | String | Boolean

type Fields = Field | js.Array[Field]

type FleetCheckpoint = long

type Fuzziness = String | integer

type GeoHash = String

type GeoHashPrecision = Double | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LatLonGeoLocation
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GeoHashLocation
  - js.Array[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.double]
  - java.lang.String
*/
type GeoLocation = _GeoLocation | js.Array[double] | String

type GeoShape = Any

type GeoTile = String

type GeoTilePrecision = Double

type GetResponse[TDocument] = GetGetResult[TDocument]

type GetScriptContextRequest = RequestBase

type GetScriptLanguagesRequest = RequestBase

type GetSourceResponse[TDocument] = TDocument

type Host = String

type HttpHeaders = Record[String, String | js.Array[String]]

type Id = String

type Ids = Id | js.Array[Id]

type IlmActions = Any

type IlmDeleteLifecycleResponse = AcknowledgedResponseBase

type IlmGetLifecycleResponse = Record[String, IlmGetLifecycleLifecycle]

type IlmGetStatusRequest = RequestBase

type IlmMoveToStepResponse = AcknowledgedResponseBase

type IlmPutLifecycleResponse = AcknowledgedResponseBase

type IlmRetryResponse = AcknowledgedResponseBase

type IlmStartResponse = AcknowledgedResponseBase

type IlmStopResponse = AcknowledgedResponseBase

type IndexAlias = String

type IndexName = String

type IndexPattern = String

type IndexPatterns = js.Array[IndexPattern]

type IndexResponse = WriteResponseBase

type Indices = IndexName | js.Array[IndexName]

type IndicesAnalyzeTextToAnalyze = String | js.Array[String]

type IndicesClearCacheResponse = ShardsOperationResponseBase

type IndicesCreateDataStreamResponse = AcknowledgedResponseBase

type IndicesDeleteAliasResponse = AcknowledgedResponseBase

type IndicesDeleteDataStreamResponse = AcknowledgedResponseBase

type IndicesDeleteIndexTemplateResponse = AcknowledgedResponseBase

type IndicesDeleteResponse = IndicesResponseBase

type IndicesDeleteTemplateResponse = AcknowledgedResponseBase

type IndicesDiskUsageResponse = Any

type IndicesExistsAliasResponse = Boolean

type IndicesExistsIndexTemplateResponse = Boolean

type IndicesExistsResponse = Boolean

type IndicesExistsTemplateResponse = Boolean

type IndicesFieldUsageStatsResponse = IndicesFieldUsageStatsFieldsUsageBody

type IndicesFlushResponse = ShardsOperationResponseBase

type IndicesForcemergeResponse = ShardsOperationResponseBase

type IndicesGetAliasResponse = Record[IndexName, IndicesGetAliasIndexAliases]

type IndicesGetFeatures = IndicesGetFeature | js.Array[IndicesGetFeature]

type IndicesGetFieldMappingResponse = Record[IndexName, IndicesGetFieldMappingTypeFieldMappings]

type IndicesGetMappingResponse = Record[IndexName, IndicesGetMappingIndexMappingRecord]

type IndicesGetResponse = Record[IndexName, IndicesIndexState]

type IndicesGetSettingsResponse = Record[IndexName, IndicesIndexState]

type IndicesGetTemplateResponse = Record[String, IndicesTemplateMapping]

type IndicesIndexCheckOnStartup = Boolean | checksum

type IndicesMigrateToDataStreamResponse = AcknowledgedResponseBase

type IndicesModifyDataStreamResponse = AcknowledgedResponseBase

type IndicesPromoteDataStreamResponse = Any

type IndicesPutAliasResponse = AcknowledgedResponseBase

type IndicesPutIndexTemplateResponse = AcknowledgedResponseBase

type IndicesPutMappingResponse = IndicesResponseBase

type IndicesPutSettingsResponse = AcknowledgedResponseBase

type IndicesPutTemplateResponse = AcknowledgedResponseBase

type IndicesRecoveryResponse = Record[IndexName, IndicesRecoveryRecoveryStatus]

type IndicesRefreshResponse = ShardsOperationResponseBase

type IndicesUpdateAliasesResponse = AcknowledgedResponseBase

type InfoRequest = RequestBase

type IngestDeletePipelineResponse = AcknowledgedResponseBase

type IngestDropProcessor = IngestProcessorBase

type IngestGeoIpStatsRequest = RequestBase

type IngestGetPipelineResponse = Record[String, IngestPipeline]

type IngestProcessorGrokRequest = RequestBase

type IngestPutPipelineResponse = AcknowledgedResponseBase

type Ip = String

type KnnSearchQueryVector = js.Array[double]

type LicenseDeleteRequest = RequestBase

type LicenseDeleteResponse = AcknowledgedResponseBase

type LicenseGetBasicStatusRequest = RequestBase

type LicenseGetTrialStatusRequest = RequestBase

type LogstashDeletePipelineResponse = Boolean

type LogstashGetPipelineResponse = Record[Id, LogstashPipeline]

type LogstashPutPipelineResponse = Boolean

type MapboxVectorTiles = js.typedarray.ArrayBuffer

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.strict
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.runtime
*/
type MappingDynamicMapping = _MappingDynamicMapping | Boolean

type MappingRuntimeFields = Record[Field, MappingRuntimeField]

type Metadata = Record[String, Any]

type Metrics = String | js.Array[String]

type MigrationGetFeatureUpgradeStatusRequest = RequestBase

type MigrationPostFeatureUpgradeRequest = RequestBase

type MinimumShouldMatch = integer | String

type MlCategorizationAnalyzer = String | MlCategorizationAnalyzerDefinition

type MlCustomSettings = Any

type MlDeleteCalendarEventResponse = AcknowledgedResponseBase

type MlDeleteCalendarResponse = AcknowledgedResponseBase

type MlDeleteDataFrameAnalyticsResponse = AcknowledgedResponseBase

type MlDeleteDatafeedResponse = AcknowledgedResponseBase

type MlDeleteFilterResponse = AcknowledgedResponseBase

type MlDeleteForecastResponse = AcknowledgedResponseBase

type MlDeleteJobResponse = AcknowledgedResponseBase

type MlDeleteModelSnapshotResponse = AcknowledgedResponseBase

type MlDeleteTrainedModelAliasResponse = AcknowledgedResponseBase

type MlDeleteTrainedModelResponse = AcknowledgedResponseBase

type MlInfoRequest = RequestBase

type MlPredictedValue = String | double | Boolean | integer

type MlPutTrainedModelAliasResponse = AcknowledgedResponseBase

type MlPutTrainedModelDefinitionPartResponse = AcknowledgedResponseBase

type MlPutTrainedModelResponse = MlTrainedModelConfig

type MlPutTrainedModelVocabularyResponse = AcknowledgedResponseBase

type MlResetJobResponse = AcknowledgedResponseBase

type MlSetUpgradeModeResponse = AcknowledgedResponseBase

type MlValidateDetectorResponse = AcknowledgedResponseBase

type MlValidateResponse = AcknowledgedResponseBase

type MsearchResponse[TDocument, TAggregations] = MsearchMultiSearchResult[TDocument]

type MsearchTemplateResponse[TDocument, TAggregations] = MsearchMultiSearchResult[TDocument]

type MultiTermQueryRewrite = String

type Name = String

type Names = Name | js.Array[Name]

type Namespace = String

type NodeId = String

type NodeIds = NodeId | js.Array[NodeId]

type NodeName = String

type NodeRoles = js.Array[NodeRole]

type NodesClearRepositoriesMeteringArchiveResponse = NodesClearRepositoriesMeteringArchiveResponseBase

type NodesGetRepositoriesMeteringInfoResponse = NodesGetRepositoriesMeteringInfoResponseBase

type NodesInfoResponse = NodesInfoResponseBase

type NodesReloadSecureSettingsResponse = NodesReloadSecureSettingsResponseBase

type NodesStatsResponse = NodesStatsResponseBase

type NodesUsageResponse = NodesUsageResponseBase

type Password = String

type Percentage = String | float

type PingRequest = RequestBase

type PingResponse = Boolean

type PipelineName = String

type PropertyName = String

type PutScriptResponse = AcknowledgedResponseBase

type QueryDslDateDecayFunctionKeys = QueryDslDecayFunctionBase

type QueryDslDateDistanceFeatureQuery = QueryDslDistanceFeatureQueryBase[DateMath, Duration]

type QueryDslDistanceFeatureQuery = QueryDslGeoDistanceFeatureQuery | QueryDslDateDistanceFeatureQuery

type QueryDslGeoDecayFunctionKeys = QueryDslDecayFunctionBase

type QueryDslGeoDistanceFeatureQuery = QueryDslDistanceFeatureQueryBase[GeoLocation, Distance]

type QueryDslLike = String | QueryDslLikeDocument

type QueryDslMatchAllQuery = QueryDslQueryBase

type QueryDslMatchNoneQuery = QueryDslQueryBase

type QueryDslNumericDecayFunctionKeys = QueryDslDecayFunctionBase

type QueryDslSimpleQueryStringFlags = QueryDslSimpleQueryStringFlag | String

type QueryDslSpanGapQuery = Partial[Record[Field, integer]]

type QueryDslTermsQueryField = js.Array[FieldValue] | QueryDslTermsLookup

type QueryDslTermsQueryKeys = QueryDslQueryBase

type RankEvalRankEvalMetricMeanReciprocalRank = RankEvalRankEvalMetricRatingTreshold

type RankEvalRankEvalMetricRecall = RankEvalRankEvalMetricRatingTreshold

type Refresh = Boolean | wait_for

type RelationName = String

type RequestBase = SpecUtilsCommonQueryParameters

type RollupGetRollupCapsResponse = Record[IndexName, RollupGetRollupCapsRollupCapabilities]

type RollupGetRollupIndexCapsResponse = Record[IndexName, RollupGetRollupIndexCapsIndexCapabilities]

type RollupPutJobResponse = AcknowledgedResponseBase

type RollupRollupResponse = Any

type Routing = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.InlineScript
  - java.lang.String
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.StoredScriptId
*/
type Script = _Script | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.painless
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.expression
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.mustache
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.java_
  - java.lang.String
*/
type ScriptLanguage = _ScriptLanguage | String

type ScrollId = String

type ScrollIds = ScrollId | js.Array[ScrollId]

type ScrollResponse[TDocument, TAggregations] = SearchResponseBody[TDocument, TAggregations]

type SearchContext = String | GeoLocation

type SearchHighlighterOrder = score

type SearchHighlighterTagsSchema = styled

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.plain
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.fvh
  - typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.unified
  - java.lang.String
*/
type SearchHighlighterType = _SearchHighlighterType | String

type SearchMvtCoordinate = integer

type SearchMvtResponse = js.typedarray.ArrayBuffer

type SearchMvtZoomLevel = integer

type SearchResponse[TDocument, TAggregations] = SearchResponseBody[TDocument, TAggregations]

type SearchSourceConfig = Boolean | SearchSourceFilter | Fields

type SearchSourceConfigParam = Boolean | Fields

type SearchTrackHits = Boolean | integer

type SearchableSnapshotsClearCacheResponse = Any

type SecurityActivateUserProfileResponse = SecurityUserProfileWithMetadata

type SecurityAuthenticateRequest = RequestBase

type SecurityDeletePrivilegesResponse = Record[String, Record[String, SecurityDeletePrivilegesFoundStatus]]

type SecurityDisableUserProfileResponse = AcknowledgedResponseBase

type SecurityEnableUserProfileResponse = AcknowledgedResponseBase

type SecurityEnrollKibanaRequest = RequestBase

type SecurityEnrollNodeRequest = RequestBase

type SecurityGetBuiltinPrivilegesRequest = RequestBase

type SecurityGetPrivilegesResponse = Record[String, Record[String, SecurityPutPrivilegesActions]]

type SecurityGetRoleMappingResponse = Record[String, SecurityRoleMapping]

type SecurityGetRoleResponse = Record[String, SecurityGetRoleRole]

type SecurityGetServiceAccountsResponse = Record[String, SecurityGetServiceAccountsRoleDescriptorWrapper]

type SecurityGetUserProfileResponse = Record[String, SecurityUserProfileWithMetadata]

type SecurityGetUserResponse = Record[String, SecurityUser]

type SecurityHasPrivilegesApplicationsPrivileges = Record[Name, SecurityHasPrivilegesResourcePrivileges]

type SecurityHasPrivilegesPrivileges = Record[String, Boolean]

type SecurityHasPrivilegesResourcePrivileges = Record[Name, SecurityHasPrivilegesPrivileges]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityRoleTemplateQuery
*/
type SecurityIndicesPrivilegesQuery = _SecurityIndicesPrivilegesQuery | String

type SecurityPutPrivilegesResponse = Record[String, Record[String, SecurityCreatedStatus]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityRoleTemplateInlineScript
  - java.lang.String
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.StoredScriptId
*/
type SecurityRoleTemplateScript = _SecurityRoleTemplateScript | String

type SecuritySamlCompleteLogoutResponse = Boolean

type SecurityUpdateUserProfileDataResponse = AcknowledgedResponseBase

type SecurityUserProfileId = String

type SequenceNumber = long

type Service = String

type ShutdownDeleteNodeResponse = AcknowledgedResponseBase

type ShutdownPutNodeResponse = AcknowledgedResponseBase

type Slices = integer | SlicesCalculation

type SlicesCalculation = auto

type SlmDeleteLifecycleResponse = AcknowledgedResponseBase

type SlmExecuteRetentionRequest = RequestBase

type SlmExecuteRetentionResponse = AcknowledgedResponseBase

type SlmGetLifecycleResponse = Record[Id, SlmSnapshotLifecycle]

type SlmGetStatsRequest = RequestBase

type SlmGetStatusRequest = RequestBase

type SlmPutLifecycleResponse = AcknowledgedResponseBase

type SlmStartRequest = RequestBase

type SlmStartResponse = AcknowledgedResponseBase

type SlmStopRequest = RequestBase

type SlmStopResponse = AcknowledgedResponseBase

type SnapshotCloneResponse = AcknowledgedResponseBase

type SnapshotCreateRepositoryResponse = AcknowledgedResponseBase

type SnapshotDeleteRepositoryResponse = AcknowledgedResponseBase

type SnapshotDeleteResponse = AcknowledgedResponseBase

type SnapshotGetRepositoryResponse = Record[String, SnapshotRepository]

type Sort = SortCombinations | js.Array[SortCombinations]

type SortCombinations = Field | SortOptions

type SortResults = js.Array[long | double | String | Null]

type SpecUtilsStringified[T] = T | String

type SqlDeleteAsyncResponse = AcknowledgedResponseBase

type SqlRow = js.Array[Any]

type SslCertificatesRequest = RequestBase

type SslCertificatesResponse = js.Array[SslCertificatesCertificateInformation]

type SuggestionName = String

type TODO = Record[String, Any]

type TaskId = String | integer

type TasksCancelResponse = TasksTaskListResponseBase

type TasksListResponse = TasksTaskListResponseBase

type TasksTaskInfos = js.Array[TasksTaskInfo] | (Record[String, TasksParentTaskInfo])

type TimeOfDay = String

type TimeZone = String

type TransformDeleteTransformResponse = AcknowledgedResponseBase

type TransformPutTransformResponse = AcknowledgedResponseBase

type TransformResetTransformResponse = AcknowledgedResponseBase

type TransformStartTransformResponse = AcknowledgedResponseBase

type TransformStopTransformResponse = AcknowledgedResponseBase

type TransportAddress = String

type UnitFloatMillis = double

type UnitMillis = long

type UnitNanos = long

type UnitSeconds = long

type UpdateResponse[TDocument] = UpdateUpdateWriteResponseBase[TDocument]

type Username = String

type Uuid = String

type VersionNumber = long

type VersionString = String

type WaitForActiveShards = integer | WaitForActiveShardOptions

type WatcherActions = Record[IndexName, WatcherActionStatus]

type WatcherCronExpression = String

type WatcherEmailAction = WatcherEmail

type WatcherHttpInputRequestResult = WatcherHttpInputRequestDefinition

type WatcherPagerDutyAction = WatcherPagerDutyEvent

type WatcherScheduleTimeOfDay = String | WatcherHourAndMinute

type WatcherStartRequest = RequestBase

type WatcherStartResponse = AcknowledgedResponseBase

type WatcherStopRequest = RequestBase

type WatcherStopResponse = AcknowledgedResponseBase

type WatcherWebhookAction = WatcherHttpInputRequestDefinition

type byte = Double

type double = Double

type float = Double

type integer = Double

type long = Double

type short = Double

type uint = Double

type ulong = Double
