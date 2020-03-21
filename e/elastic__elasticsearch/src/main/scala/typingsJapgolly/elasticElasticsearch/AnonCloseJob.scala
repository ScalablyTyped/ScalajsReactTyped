package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlCloseJob
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteCalendar
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteCalendarEvent
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteCalendarJob
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteDataFrameAnalytics
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteDatafeed
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteExpiredData
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteFilter
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteForecast
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteJob
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteModelSnapshot
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlDeleteTrainedModel
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlEvaluateDataFrame
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlExplainDataFrameAnalytics
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlFindFileStructure
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlFlushJob
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlForecast
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetBuckets
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetCalendarEvents
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetCalendars
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetCategories
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetDataFrameAnalytics
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetDataFrameAnalyticsStats
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetDatafeedStats
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetDatafeeds
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetFilters
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetInfluencers
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetJobStats
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetJobs
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetModelSnapshots
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetOverallBuckets
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetRecords
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetTrainedModels
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlGetTrainedModelsStats
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlInfo
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlOpenJob
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlPostCalendarEvents
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlPostData
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlPreviewDatafeed
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlPutCalendar
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlPutCalendarJob
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlPutDataFrameAnalytics
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlPutDatafeed
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlPutFilter
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlPutJob
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlPutTrainedModel
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlRevertModelSnapshot
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlSetUpgradeMode
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlStartDataFrameAnalytics
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlStartDatafeed
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlStopDataFrameAnalytics
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlStopDatafeed
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlUpdateDatafeed
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlUpdateFilter
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlUpdateJob
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlUpdateModelSnapshot
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlValidate
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MlValidateDetector
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCloseJob extends js.Object {
  @JSName("closeJob")
  var closeJob_Original: ApiMethod[MlCloseJob[_], _] = js.native
  @JSName("close_job")
  var close_job_Original: ApiMethod[MlCloseJob[_], _] = js.native
  @JSName("deleteCalendarEvent")
  var deleteCalendarEvent_Original: ApiMethod[MlDeleteCalendarEvent, _] = js.native
  @JSName("deleteCalendarJob")
  var deleteCalendarJob_Original: ApiMethod[MlDeleteCalendarJob, _] = js.native
  @JSName("deleteCalendar")
  var deleteCalendar_Original: ApiMethod[MlDeleteCalendar, _] = js.native
  @JSName("deleteDataFrameAnalytics")
  var deleteDataFrameAnalytics_Original: ApiMethod[MlDeleteDataFrameAnalytics, _] = js.native
  @JSName("deleteDatafeed")
  var deleteDatafeed_Original: ApiMethod[MlDeleteDatafeed, _] = js.native
  @JSName("deleteExpiredData")
  var deleteExpiredData_Original: ApiMethod[MlDeleteExpiredData, _] = js.native
  @JSName("deleteFilter")
  var deleteFilter_Original: ApiMethod[MlDeleteFilter, _] = js.native
  @JSName("deleteForecast")
  var deleteForecast_Original: ApiMethod[MlDeleteForecast, _] = js.native
  @JSName("deleteJob")
  var deleteJob_Original: ApiMethod[MlDeleteJob, _] = js.native
  @JSName("deleteModelSnapshot")
  var deleteModelSnapshot_Original: ApiMethod[MlDeleteModelSnapshot, _] = js.native
  @JSName("deleteTrainedModel")
  var deleteTrainedModel_Original: ApiMethod[MlDeleteTrainedModel, _] = js.native
  @JSName("delete_calendar")
  var delete_calendar_Original: ApiMethod[MlDeleteCalendar, _] = js.native
  @JSName("delete_calendar_event")
  var delete_calendar_event_Original: ApiMethod[MlDeleteCalendarEvent, _] = js.native
  @JSName("delete_calendar_job")
  var delete_calendar_job_Original: ApiMethod[MlDeleteCalendarJob, _] = js.native
  @JSName("delete_data_frame_analytics")
  var delete_data_frame_analytics_Original: ApiMethod[MlDeleteDataFrameAnalytics, _] = js.native
  @JSName("delete_datafeed")
  var delete_datafeed_Original: ApiMethod[MlDeleteDatafeed, _] = js.native
  @JSName("delete_expired_data")
  var delete_expired_data_Original: ApiMethod[MlDeleteExpiredData, _] = js.native
  @JSName("delete_filter")
  var delete_filter_Original: ApiMethod[MlDeleteFilter, _] = js.native
  @JSName("delete_forecast")
  var delete_forecast_Original: ApiMethod[MlDeleteForecast, _] = js.native
  @JSName("delete_job")
  var delete_job_Original: ApiMethod[MlDeleteJob, _] = js.native
  @JSName("delete_model_snapshot")
  var delete_model_snapshot_Original: ApiMethod[MlDeleteModelSnapshot, _] = js.native
  @JSName("delete_trained_model")
  var delete_trained_model_Original: ApiMethod[MlDeleteTrainedModel, _] = js.native
  @JSName("evaluateDataFrame")
  var evaluateDataFrame_Original: ApiMethod[MlEvaluateDataFrame[_], _] = js.native
  @JSName("evaluate_data_frame")
  var evaluate_data_frame_Original: ApiMethod[MlEvaluateDataFrame[_], _] = js.native
  @JSName("explainDataFrameAnalytics")
  var explainDataFrameAnalytics_Original: ApiMethod[MlExplainDataFrameAnalytics[_], _] = js.native
  @JSName("explain_data_frame_analytics")
  var explain_data_frame_analytics_Original: ApiMethod[MlExplainDataFrameAnalytics[_], _] = js.native
  @JSName("findFileStructure")
  var findFileStructure_Original: ApiMethod[MlFindFileStructure[_], _] = js.native
  @JSName("find_file_structure")
  var find_file_structure_Original: ApiMethod[MlFindFileStructure[_], _] = js.native
  @JSName("flushJob")
  var flushJob_Original: ApiMethod[MlFlushJob[_], _] = js.native
  @JSName("flush_job")
  var flush_job_Original: ApiMethod[MlFlushJob[_], _] = js.native
  @JSName("forecast")
  var forecast_Original: ApiMethod[MlForecast, _] = js.native
  @JSName("getBuckets")
  var getBuckets_Original: ApiMethod[MlGetBuckets[_], _] = js.native
  @JSName("getCalendarEvents")
  var getCalendarEvents_Original: ApiMethod[MlGetCalendarEvents, _] = js.native
  @JSName("getCalendars")
  var getCalendars_Original: ApiMethod[MlGetCalendars[_], _] = js.native
  @JSName("getCategories")
  var getCategories_Original: ApiMethod[MlGetCategories[_], _] = js.native
  @JSName("getDataFrameAnalyticsStats")
  var getDataFrameAnalyticsStats_Original: ApiMethod[MlGetDataFrameAnalyticsStats, _] = js.native
  @JSName("getDataFrameAnalytics")
  var getDataFrameAnalytics_Original: ApiMethod[MlGetDataFrameAnalytics, _] = js.native
  @JSName("getDatafeedStats")
  var getDatafeedStats_Original: ApiMethod[MlGetDatafeedStats, _] = js.native
  @JSName("getDatafeeds")
  var getDatafeeds_Original: ApiMethod[MlGetDatafeeds, _] = js.native
  @JSName("getFilters")
  var getFilters_Original: ApiMethod[MlGetFilters, _] = js.native
  @JSName("getInfluencers")
  var getInfluencers_Original: ApiMethod[MlGetInfluencers[_], _] = js.native
  @JSName("getJobStats")
  var getJobStats_Original: ApiMethod[MlGetJobStats, _] = js.native
  @JSName("getJobs")
  var getJobs_Original: ApiMethod[MlGetJobs, _] = js.native
  @JSName("getModelSnapshots")
  var getModelSnapshots_Original: ApiMethod[MlGetModelSnapshots[_], _] = js.native
  @JSName("getOverallBuckets")
  var getOverallBuckets_Original: ApiMethod[MlGetOverallBuckets[_], _] = js.native
  @JSName("getRecords")
  var getRecords_Original: ApiMethod[MlGetRecords[_], _] = js.native
  @JSName("getTrainedModelsStats")
  var getTrainedModelsStats_Original: ApiMethod[MlGetTrainedModelsStats, _] = js.native
  @JSName("getTrainedModels")
  var getTrainedModels_Original: ApiMethod[MlGetTrainedModels, _] = js.native
  @JSName("get_buckets")
  var get_buckets_Original: ApiMethod[MlGetBuckets[_], _] = js.native
  @JSName("get_calendar_events")
  var get_calendar_events_Original: ApiMethod[MlGetCalendarEvents, _] = js.native
  @JSName("get_calendars")
  var get_calendars_Original: ApiMethod[MlGetCalendars[_], _] = js.native
  @JSName("get_categories")
  var get_categories_Original: ApiMethod[MlGetCategories[_], _] = js.native
  @JSName("get_data_frame_analytics")
  var get_data_frame_analytics_Original: ApiMethod[MlGetDataFrameAnalytics, _] = js.native
  @JSName("get_data_frame_analytics_stats")
  var get_data_frame_analytics_stats_Original: ApiMethod[MlGetDataFrameAnalyticsStats, _] = js.native
  @JSName("get_datafeed_stats")
  var get_datafeed_stats_Original: ApiMethod[MlGetDatafeedStats, _] = js.native
  @JSName("get_datafeeds")
  var get_datafeeds_Original: ApiMethod[MlGetDatafeeds, _] = js.native
  @JSName("get_filters")
  var get_filters_Original: ApiMethod[MlGetFilters, _] = js.native
  @JSName("get_influencers")
  var get_influencers_Original: ApiMethod[MlGetInfluencers[_], _] = js.native
  @JSName("get_job_stats")
  var get_job_stats_Original: ApiMethod[MlGetJobStats, _] = js.native
  @JSName("get_jobs")
  var get_jobs_Original: ApiMethod[MlGetJobs, _] = js.native
  @JSName("get_model_snapshots")
  var get_model_snapshots_Original: ApiMethod[MlGetModelSnapshots[_], _] = js.native
  @JSName("get_overall_buckets")
  var get_overall_buckets_Original: ApiMethod[MlGetOverallBuckets[_], _] = js.native
  @JSName("get_records")
  var get_records_Original: ApiMethod[MlGetRecords[_], _] = js.native
  @JSName("get_trained_models")
  var get_trained_models_Original: ApiMethod[MlGetTrainedModels, _] = js.native
  @JSName("get_trained_models_stats")
  var get_trained_models_stats_Original: ApiMethod[MlGetTrainedModelsStats, _] = js.native
  @JSName("info")
  var info_Original: ApiMethod[MlInfo, _] = js.native
  @JSName("openJob")
  var openJob_Original: ApiMethod[MlOpenJob, _] = js.native
  @JSName("open_job")
  var open_job_Original: ApiMethod[MlOpenJob, _] = js.native
  @JSName("postCalendarEvents")
  var postCalendarEvents_Original: ApiMethod[MlPostCalendarEvents[_], _] = js.native
  @JSName("postData")
  var postData_Original: ApiMethod[MlPostData[_], _] = js.native
  @JSName("post_calendar_events")
  var post_calendar_events_Original: ApiMethod[MlPostCalendarEvents[_], _] = js.native
  @JSName("post_data")
  var post_data_Original: ApiMethod[MlPostData[_], _] = js.native
  @JSName("previewDatafeed")
  var previewDatafeed_Original: ApiMethod[MlPreviewDatafeed, _] = js.native
  @JSName("preview_datafeed")
  var preview_datafeed_Original: ApiMethod[MlPreviewDatafeed, _] = js.native
  @JSName("putCalendarJob")
  var putCalendarJob_Original: ApiMethod[MlPutCalendarJob, _] = js.native
  @JSName("putCalendar")
  var putCalendar_Original: ApiMethod[MlPutCalendar[_], _] = js.native
  @JSName("putDataFrameAnalytics")
  var putDataFrameAnalytics_Original: ApiMethod[MlPutDataFrameAnalytics[_], _] = js.native
  @JSName("putDatafeed")
  var putDatafeed_Original: ApiMethod[MlPutDatafeed[_], _] = js.native
  @JSName("putFilter")
  var putFilter_Original: ApiMethod[MlPutFilter[_], _] = js.native
  @JSName("putJob")
  var putJob_Original: ApiMethod[MlPutJob[_], _] = js.native
  @JSName("putTrainedModel")
  var putTrainedModel_Original: ApiMethod[MlPutTrainedModel[_], _] = js.native
  @JSName("put_calendar")
  var put_calendar_Original: ApiMethod[MlPutCalendar[_], _] = js.native
  @JSName("put_calendar_job")
  var put_calendar_job_Original: ApiMethod[MlPutCalendarJob, _] = js.native
  @JSName("put_data_frame_analytics")
  var put_data_frame_analytics_Original: ApiMethod[MlPutDataFrameAnalytics[_], _] = js.native
  @JSName("put_datafeed")
  var put_datafeed_Original: ApiMethod[MlPutDatafeed[_], _] = js.native
  @JSName("put_filter")
  var put_filter_Original: ApiMethod[MlPutFilter[_], _] = js.native
  @JSName("put_job")
  var put_job_Original: ApiMethod[MlPutJob[_], _] = js.native
  @JSName("put_trained_model")
  var put_trained_model_Original: ApiMethod[MlPutTrainedModel[_], _] = js.native
  @JSName("revertModelSnapshot")
  var revertModelSnapshot_Original: ApiMethod[MlRevertModelSnapshot[_], _] = js.native
  @JSName("revert_model_snapshot")
  var revert_model_snapshot_Original: ApiMethod[MlRevertModelSnapshot[_], _] = js.native
  @JSName("setUpgradeMode")
  var setUpgradeMode_Original: ApiMethod[MlSetUpgradeMode, _] = js.native
  @JSName("set_upgrade_mode")
  var set_upgrade_mode_Original: ApiMethod[MlSetUpgradeMode, _] = js.native
  @JSName("startDataFrameAnalytics")
  var startDataFrameAnalytics_Original: ApiMethod[MlStartDataFrameAnalytics[_], _] = js.native
  @JSName("startDatafeed")
  var startDatafeed_Original: ApiMethod[MlStartDatafeed[_], _] = js.native
  @JSName("start_data_frame_analytics")
  var start_data_frame_analytics_Original: ApiMethod[MlStartDataFrameAnalytics[_], _] = js.native
  @JSName("start_datafeed")
  var start_datafeed_Original: ApiMethod[MlStartDatafeed[_], _] = js.native
  @JSName("stopDataFrameAnalytics")
  var stopDataFrameAnalytics_Original: ApiMethod[MlStopDataFrameAnalytics[_], _] = js.native
  @JSName("stopDatafeed")
  var stopDatafeed_Original: ApiMethod[MlStopDatafeed, _] = js.native
  @JSName("stop_data_frame_analytics")
  var stop_data_frame_analytics_Original: ApiMethod[MlStopDataFrameAnalytics[_], _] = js.native
  @JSName("stop_datafeed")
  var stop_datafeed_Original: ApiMethod[MlStopDatafeed, _] = js.native
  @JSName("updateDatafeed")
  var updateDatafeed_Original: ApiMethod[MlUpdateDatafeed[_], _] = js.native
  @JSName("updateFilter")
  var updateFilter_Original: ApiMethod[MlUpdateFilter[_], _] = js.native
  @JSName("updateJob")
  var updateJob_Original: ApiMethod[MlUpdateJob[_], _] = js.native
  @JSName("updateModelSnapshot")
  var updateModelSnapshot_Original: ApiMethod[MlUpdateModelSnapshot[_], _] = js.native
  @JSName("update_datafeed")
  var update_datafeed_Original: ApiMethod[MlUpdateDatafeed[_], _] = js.native
  @JSName("update_filter")
  var update_filter_Original: ApiMethod[MlUpdateFilter[_], _] = js.native
  @JSName("update_job")
  var update_job_Original: ApiMethod[MlUpdateJob[_], _] = js.native
  @JSName("update_model_snapshot")
  var update_model_snapshot_Original: ApiMethod[MlUpdateModelSnapshot[_], _] = js.native
  @JSName("validateDetector")
  var validateDetector_Original: ApiMethod[MlValidateDetector[_], _] = js.native
  @JSName("validate")
  var validate_Original: ApiMethod[MlValidate[_], _] = js.native
  @JSName("validate_detector")
  var validate_detector_Original: ApiMethod[MlValidateDetector[_], _] = js.native
  // Promise API
  def closeJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def closeJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def closeJob(params: MlCloseJob[_]): js.Promise[ApiResponse[_, _]] = js.native
  def closeJob(params: MlCloseJob[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def closeJob(params: MlCloseJob[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def closeJob(params: MlCloseJob[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def close_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def close_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def close_job(params: MlCloseJob[_]): js.Promise[ApiResponse[_, _]] = js.native
  def close_job(params: MlCloseJob[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def close_job(params: MlCloseJob[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def close_job(params: MlCloseJob[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteCalendar(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteCalendar(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteCalendar(params: MlDeleteCalendar): js.Promise[ApiResponse[_, _]] = js.native
  def deleteCalendar(params: MlDeleteCalendar, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteCalendar(params: MlDeleteCalendar, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteCalendar(params: MlDeleteCalendar, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteCalendarEvent(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteCalendarEvent(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteCalendarEvent(params: MlDeleteCalendarEvent): js.Promise[ApiResponse[_, _]] = js.native
  def deleteCalendarEvent(params: MlDeleteCalendarEvent, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteCalendarEvent(params: MlDeleteCalendarEvent, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteCalendarEvent(params: MlDeleteCalendarEvent, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteCalendarJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteCalendarJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteCalendarJob(params: MlDeleteCalendarJob): js.Promise[ApiResponse[_, _]] = js.native
  def deleteCalendarJob(params: MlDeleteCalendarJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteCalendarJob(params: MlDeleteCalendarJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteCalendarJob(params: MlDeleteCalendarJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteDataFrameAnalytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteDataFrameAnalytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteDataFrameAnalytics(params: MlDeleteDataFrameAnalytics): js.Promise[ApiResponse[_, _]] = js.native
  def deleteDataFrameAnalytics(params: MlDeleteDataFrameAnalytics, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteDataFrameAnalytics(params: MlDeleteDataFrameAnalytics, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteDataFrameAnalytics(params: MlDeleteDataFrameAnalytics, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteDatafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteDatafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteDatafeed(params: MlDeleteDatafeed): js.Promise[ApiResponse[_, _]] = js.native
  def deleteDatafeed(params: MlDeleteDatafeed, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteDatafeed(params: MlDeleteDatafeed, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteDatafeed(params: MlDeleteDatafeed, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteExpiredData(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteExpiredData(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteExpiredData(params: MlDeleteExpiredData): js.Promise[ApiResponse[_, _]] = js.native
  def deleteExpiredData(params: MlDeleteExpiredData, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteExpiredData(params: MlDeleteExpiredData, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteExpiredData(params: MlDeleteExpiredData, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteFilter(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteFilter(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteFilter(params: MlDeleteFilter): js.Promise[ApiResponse[_, _]] = js.native
  def deleteFilter(params: MlDeleteFilter, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteFilter(params: MlDeleteFilter, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteFilter(params: MlDeleteFilter, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteForecast(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteForecast(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteForecast(params: MlDeleteForecast): js.Promise[ApiResponse[_, _]] = js.native
  def deleteForecast(params: MlDeleteForecast, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteForecast(params: MlDeleteForecast, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteForecast(params: MlDeleteForecast, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteJob(params: MlDeleteJob): js.Promise[ApiResponse[_, _]] = js.native
  def deleteJob(params: MlDeleteJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteJob(params: MlDeleteJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteJob(params: MlDeleteJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteModelSnapshot(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteModelSnapshot(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteModelSnapshot(params: MlDeleteModelSnapshot): js.Promise[ApiResponse[_, _]] = js.native
  def deleteModelSnapshot(params: MlDeleteModelSnapshot, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteModelSnapshot(params: MlDeleteModelSnapshot, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteModelSnapshot(params: MlDeleteModelSnapshot, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteTrainedModel(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteTrainedModel(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteTrainedModel(params: MlDeleteTrainedModel): js.Promise[ApiResponse[_, _]] = js.native
  def deleteTrainedModel(params: MlDeleteTrainedModel, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteTrainedModel(params: MlDeleteTrainedModel, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteTrainedModel(params: MlDeleteTrainedModel, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_calendar(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_calendar(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_calendar(params: MlDeleteCalendar): js.Promise[ApiResponse[_, _]] = js.native
  def delete_calendar(params: MlDeleteCalendar, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_calendar(params: MlDeleteCalendar, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_calendar(params: MlDeleteCalendar, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_calendar_event(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_calendar_event(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_calendar_event(params: MlDeleteCalendarEvent): js.Promise[ApiResponse[_, _]] = js.native
  def delete_calendar_event(params: MlDeleteCalendarEvent, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_calendar_event(params: MlDeleteCalendarEvent, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_calendar_event(params: MlDeleteCalendarEvent, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_calendar_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_calendar_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_calendar_job(params: MlDeleteCalendarJob): js.Promise[ApiResponse[_, _]] = js.native
  def delete_calendar_job(params: MlDeleteCalendarJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_calendar_job(params: MlDeleteCalendarJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_calendar_job(params: MlDeleteCalendarJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_data_frame_analytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_data_frame_analytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_data_frame_analytics(params: MlDeleteDataFrameAnalytics): js.Promise[ApiResponse[_, _]] = js.native
  def delete_data_frame_analytics(params: MlDeleteDataFrameAnalytics, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_data_frame_analytics(params: MlDeleteDataFrameAnalytics, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_data_frame_analytics(params: MlDeleteDataFrameAnalytics, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_datafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_datafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_datafeed(params: MlDeleteDatafeed): js.Promise[ApiResponse[_, _]] = js.native
  def delete_datafeed(params: MlDeleteDatafeed, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_datafeed(params: MlDeleteDatafeed, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_datafeed(params: MlDeleteDatafeed, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_expired_data(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_expired_data(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_expired_data(params: MlDeleteExpiredData): js.Promise[ApiResponse[_, _]] = js.native
  def delete_expired_data(params: MlDeleteExpiredData, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_expired_data(params: MlDeleteExpiredData, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_expired_data(params: MlDeleteExpiredData, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_filter(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_filter(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_filter(params: MlDeleteFilter): js.Promise[ApiResponse[_, _]] = js.native
  def delete_filter(params: MlDeleteFilter, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_filter(params: MlDeleteFilter, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_filter(params: MlDeleteFilter, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_forecast(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_forecast(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_forecast(params: MlDeleteForecast): js.Promise[ApiResponse[_, _]] = js.native
  def delete_forecast(params: MlDeleteForecast, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_forecast(params: MlDeleteForecast, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_forecast(params: MlDeleteForecast, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_job(params: MlDeleteJob): js.Promise[ApiResponse[_, _]] = js.native
  def delete_job(params: MlDeleteJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_job(params: MlDeleteJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_job(params: MlDeleteJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_model_snapshot(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_model_snapshot(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_model_snapshot(params: MlDeleteModelSnapshot): js.Promise[ApiResponse[_, _]] = js.native
  def delete_model_snapshot(params: MlDeleteModelSnapshot, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_model_snapshot(params: MlDeleteModelSnapshot, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_model_snapshot(params: MlDeleteModelSnapshot, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_trained_model(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_trained_model(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_trained_model(params: MlDeleteTrainedModel): js.Promise[ApiResponse[_, _]] = js.native
  def delete_trained_model(params: MlDeleteTrainedModel, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_trained_model(params: MlDeleteTrainedModel, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_trained_model(params: MlDeleteTrainedModel, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def evaluateDataFrame(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def evaluateDataFrame(callback: callbackFn[_]): TransportRequestCallback = js.native
  def evaluateDataFrame(params: MlEvaluateDataFrame[_]): js.Promise[ApiResponse[_, _]] = js.native
  def evaluateDataFrame(params: MlEvaluateDataFrame[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def evaluateDataFrame(params: MlEvaluateDataFrame[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def evaluateDataFrame(params: MlEvaluateDataFrame[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def evaluate_data_frame(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def evaluate_data_frame(callback: callbackFn[_]): TransportRequestCallback = js.native
  def evaluate_data_frame(params: MlEvaluateDataFrame[_]): js.Promise[ApiResponse[_, _]] = js.native
  def evaluate_data_frame(params: MlEvaluateDataFrame[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def evaluate_data_frame(params: MlEvaluateDataFrame[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def evaluate_data_frame(params: MlEvaluateDataFrame[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def explainDataFrameAnalytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def explainDataFrameAnalytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def explainDataFrameAnalytics(params: MlExplainDataFrameAnalytics[_]): js.Promise[ApiResponse[_, _]] = js.native
  def explainDataFrameAnalytics(params: MlExplainDataFrameAnalytics[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def explainDataFrameAnalytics(params: MlExplainDataFrameAnalytics[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def explainDataFrameAnalytics(params: MlExplainDataFrameAnalytics[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def explain_data_frame_analytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def explain_data_frame_analytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def explain_data_frame_analytics(params: MlExplainDataFrameAnalytics[_]): js.Promise[ApiResponse[_, _]] = js.native
  def explain_data_frame_analytics(params: MlExplainDataFrameAnalytics[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def explain_data_frame_analytics(params: MlExplainDataFrameAnalytics[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def explain_data_frame_analytics(params: MlExplainDataFrameAnalytics[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def findFileStructure(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def findFileStructure(callback: callbackFn[_]): TransportRequestCallback = js.native
  def findFileStructure(params: MlFindFileStructure[_]): js.Promise[ApiResponse[_, _]] = js.native
  def findFileStructure(params: MlFindFileStructure[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def findFileStructure(params: MlFindFileStructure[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def findFileStructure(params: MlFindFileStructure[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def find_file_structure(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def find_file_structure(callback: callbackFn[_]): TransportRequestCallback = js.native
  def find_file_structure(params: MlFindFileStructure[_]): js.Promise[ApiResponse[_, _]] = js.native
  def find_file_structure(params: MlFindFileStructure[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def find_file_structure(params: MlFindFileStructure[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def find_file_structure(params: MlFindFileStructure[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def flushJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def flushJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def flushJob(params: MlFlushJob[_]): js.Promise[ApiResponse[_, _]] = js.native
  def flushJob(params: MlFlushJob[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def flushJob(params: MlFlushJob[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def flushJob(params: MlFlushJob[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def flush_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def flush_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def flush_job(params: MlFlushJob[_]): js.Promise[ApiResponse[_, _]] = js.native
  def flush_job(params: MlFlushJob[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def flush_job(params: MlFlushJob[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def flush_job(params: MlFlushJob[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def forecast(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def forecast(callback: callbackFn[_]): TransportRequestCallback = js.native
  def forecast(params: MlForecast): js.Promise[ApiResponse[_, _]] = js.native
  def forecast(params: MlForecast, callback: callbackFn[_]): TransportRequestCallback = js.native
  def forecast(params: MlForecast, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def forecast(params: MlForecast, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getBuckets(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getBuckets(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getBuckets(params: MlGetBuckets[_]): js.Promise[ApiResponse[_, _]] = js.native
  def getBuckets(params: MlGetBuckets[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def getBuckets(params: MlGetBuckets[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getBuckets(params: MlGetBuckets[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getCalendarEvents(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getCalendarEvents(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getCalendarEvents(params: MlGetCalendarEvents): js.Promise[ApiResponse[_, _]] = js.native
  def getCalendarEvents(params: MlGetCalendarEvents, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getCalendarEvents(params: MlGetCalendarEvents, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getCalendarEvents(params: MlGetCalendarEvents, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getCalendars(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getCalendars(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getCalendars(params: MlGetCalendars[_]): js.Promise[ApiResponse[_, _]] = js.native
  def getCalendars(params: MlGetCalendars[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def getCalendars(params: MlGetCalendars[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getCalendars(params: MlGetCalendars[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getCategories(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getCategories(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getCategories(params: MlGetCategories[_]): js.Promise[ApiResponse[_, _]] = js.native
  def getCategories(params: MlGetCategories[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def getCategories(params: MlGetCategories[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getCategories(params: MlGetCategories[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getDataFrameAnalytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getDataFrameAnalytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDataFrameAnalytics(params: MlGetDataFrameAnalytics): js.Promise[ApiResponse[_, _]] = js.native
  def getDataFrameAnalytics(params: MlGetDataFrameAnalytics, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDataFrameAnalytics(params: MlGetDataFrameAnalytics, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getDataFrameAnalytics(params: MlGetDataFrameAnalytics, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getDataFrameAnalyticsStats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getDataFrameAnalyticsStats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDataFrameAnalyticsStats(params: MlGetDataFrameAnalyticsStats): js.Promise[ApiResponse[_, _]] = js.native
  def getDataFrameAnalyticsStats(params: MlGetDataFrameAnalyticsStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDataFrameAnalyticsStats(params: MlGetDataFrameAnalyticsStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getDataFrameAnalyticsStats(params: MlGetDataFrameAnalyticsStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getDatafeedStats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getDatafeedStats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDatafeedStats(params: MlGetDatafeedStats): js.Promise[ApiResponse[_, _]] = js.native
  def getDatafeedStats(params: MlGetDatafeedStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDatafeedStats(params: MlGetDatafeedStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getDatafeedStats(params: MlGetDatafeedStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getDatafeeds(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getDatafeeds(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDatafeeds(params: MlGetDatafeeds): js.Promise[ApiResponse[_, _]] = js.native
  def getDatafeeds(params: MlGetDatafeeds, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDatafeeds(params: MlGetDatafeeds, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getDatafeeds(params: MlGetDatafeeds, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getFilters(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getFilters(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getFilters(params: MlGetFilters): js.Promise[ApiResponse[_, _]] = js.native
  def getFilters(params: MlGetFilters, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getFilters(params: MlGetFilters, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getFilters(params: MlGetFilters, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getInfluencers(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getInfluencers(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getInfluencers(params: MlGetInfluencers[_]): js.Promise[ApiResponse[_, _]] = js.native
  def getInfluencers(params: MlGetInfluencers[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def getInfluencers(params: MlGetInfluencers[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getInfluencers(params: MlGetInfluencers[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getJobStats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getJobStats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getJobStats(params: MlGetJobStats): js.Promise[ApiResponse[_, _]] = js.native
  def getJobStats(params: MlGetJobStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getJobStats(params: MlGetJobStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getJobStats(params: MlGetJobStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getJobs(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getJobs(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getJobs(params: MlGetJobs): js.Promise[ApiResponse[_, _]] = js.native
  def getJobs(params: MlGetJobs, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getJobs(params: MlGetJobs, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getJobs(params: MlGetJobs, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getModelSnapshots(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getModelSnapshots(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getModelSnapshots(params: MlGetModelSnapshots[_]): js.Promise[ApiResponse[_, _]] = js.native
  def getModelSnapshots(params: MlGetModelSnapshots[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def getModelSnapshots(params: MlGetModelSnapshots[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getModelSnapshots(params: MlGetModelSnapshots[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getOverallBuckets(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getOverallBuckets(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getOverallBuckets(params: MlGetOverallBuckets[_]): js.Promise[ApiResponse[_, _]] = js.native
  def getOverallBuckets(params: MlGetOverallBuckets[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def getOverallBuckets(params: MlGetOverallBuckets[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getOverallBuckets(params: MlGetOverallBuckets[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getRecords(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getRecords(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRecords(params: MlGetRecords[_]): js.Promise[ApiResponse[_, _]] = js.native
  def getRecords(params: MlGetRecords[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRecords(params: MlGetRecords[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getRecords(params: MlGetRecords[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getTrainedModels(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getTrainedModels(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTrainedModels(params: MlGetTrainedModels): js.Promise[ApiResponse[_, _]] = js.native
  def getTrainedModels(params: MlGetTrainedModels, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTrainedModels(params: MlGetTrainedModels, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getTrainedModels(params: MlGetTrainedModels, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getTrainedModelsStats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getTrainedModelsStats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTrainedModelsStats(params: MlGetTrainedModelsStats): js.Promise[ApiResponse[_, _]] = js.native
  def getTrainedModelsStats(params: MlGetTrainedModelsStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTrainedModelsStats(params: MlGetTrainedModelsStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getTrainedModelsStats(params: MlGetTrainedModelsStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_buckets(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_buckets(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_buckets(params: MlGetBuckets[_]): js.Promise[ApiResponse[_, _]] = js.native
  def get_buckets(params: MlGetBuckets[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_buckets(params: MlGetBuckets[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_buckets(params: MlGetBuckets[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_calendar_events(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_calendar_events(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_calendar_events(params: MlGetCalendarEvents): js.Promise[ApiResponse[_, _]] = js.native
  def get_calendar_events(params: MlGetCalendarEvents, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_calendar_events(params: MlGetCalendarEvents, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_calendar_events(params: MlGetCalendarEvents, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_calendars(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_calendars(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_calendars(params: MlGetCalendars[_]): js.Promise[ApiResponse[_, _]] = js.native
  def get_calendars(params: MlGetCalendars[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_calendars(params: MlGetCalendars[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_calendars(params: MlGetCalendars[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_categories(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_categories(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_categories(params: MlGetCategories[_]): js.Promise[ApiResponse[_, _]] = js.native
  def get_categories(params: MlGetCategories[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_categories(params: MlGetCategories[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_categories(params: MlGetCategories[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_data_frame_analytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_data_frame_analytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_data_frame_analytics(params: MlGetDataFrameAnalytics): js.Promise[ApiResponse[_, _]] = js.native
  def get_data_frame_analytics(params: MlGetDataFrameAnalytics, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_data_frame_analytics(params: MlGetDataFrameAnalytics, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_data_frame_analytics(params: MlGetDataFrameAnalytics, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_data_frame_analytics_stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_data_frame_analytics_stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_data_frame_analytics_stats(params: MlGetDataFrameAnalyticsStats): js.Promise[ApiResponse[_, _]] = js.native
  def get_data_frame_analytics_stats(params: MlGetDataFrameAnalyticsStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_data_frame_analytics_stats(params: MlGetDataFrameAnalyticsStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_data_frame_analytics_stats(params: MlGetDataFrameAnalyticsStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_datafeed_stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_datafeed_stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_datafeed_stats(params: MlGetDatafeedStats): js.Promise[ApiResponse[_, _]] = js.native
  def get_datafeed_stats(params: MlGetDatafeedStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_datafeed_stats(params: MlGetDatafeedStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_datafeed_stats(params: MlGetDatafeedStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_datafeeds(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_datafeeds(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_datafeeds(params: MlGetDatafeeds): js.Promise[ApiResponse[_, _]] = js.native
  def get_datafeeds(params: MlGetDatafeeds, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_datafeeds(params: MlGetDatafeeds, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_datafeeds(params: MlGetDatafeeds, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_filters(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_filters(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_filters(params: MlGetFilters): js.Promise[ApiResponse[_, _]] = js.native
  def get_filters(params: MlGetFilters, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_filters(params: MlGetFilters, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_filters(params: MlGetFilters, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_influencers(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_influencers(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_influencers(params: MlGetInfluencers[_]): js.Promise[ApiResponse[_, _]] = js.native
  def get_influencers(params: MlGetInfluencers[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_influencers(params: MlGetInfluencers[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_influencers(params: MlGetInfluencers[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_job_stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_job_stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_job_stats(params: MlGetJobStats): js.Promise[ApiResponse[_, _]] = js.native
  def get_job_stats(params: MlGetJobStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_job_stats(params: MlGetJobStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_job_stats(params: MlGetJobStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_jobs(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_jobs(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_jobs(params: MlGetJobs): js.Promise[ApiResponse[_, _]] = js.native
  def get_jobs(params: MlGetJobs, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_jobs(params: MlGetJobs, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_jobs(params: MlGetJobs, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_model_snapshots(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_model_snapshots(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_model_snapshots(params: MlGetModelSnapshots[_]): js.Promise[ApiResponse[_, _]] = js.native
  def get_model_snapshots(params: MlGetModelSnapshots[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_model_snapshots(params: MlGetModelSnapshots[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_model_snapshots(params: MlGetModelSnapshots[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_overall_buckets(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_overall_buckets(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_overall_buckets(params: MlGetOverallBuckets[_]): js.Promise[ApiResponse[_, _]] = js.native
  def get_overall_buckets(params: MlGetOverallBuckets[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_overall_buckets(params: MlGetOverallBuckets[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_overall_buckets(params: MlGetOverallBuckets[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_records(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_records(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_records(params: MlGetRecords[_]): js.Promise[ApiResponse[_, _]] = js.native
  def get_records(params: MlGetRecords[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_records(params: MlGetRecords[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_records(params: MlGetRecords[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_trained_models(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_trained_models(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_trained_models(params: MlGetTrainedModels): js.Promise[ApiResponse[_, _]] = js.native
  def get_trained_models(params: MlGetTrainedModels, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_trained_models(params: MlGetTrainedModels, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_trained_models(params: MlGetTrainedModels, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_trained_models_stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_trained_models_stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_trained_models_stats(params: MlGetTrainedModelsStats): js.Promise[ApiResponse[_, _]] = js.native
  def get_trained_models_stats(params: MlGetTrainedModelsStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_trained_models_stats(params: MlGetTrainedModelsStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_trained_models_stats(params: MlGetTrainedModelsStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def info(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def info(callback: callbackFn[_]): TransportRequestCallback = js.native
  def info(params: MlInfo): js.Promise[ApiResponse[_, _]] = js.native
  def info(params: MlInfo, callback: callbackFn[_]): TransportRequestCallback = js.native
  def info(params: MlInfo, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def info(params: MlInfo, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def openJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def openJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def openJob(params: MlOpenJob): js.Promise[ApiResponse[_, _]] = js.native
  def openJob(params: MlOpenJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def openJob(params: MlOpenJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def openJob(params: MlOpenJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def open_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def open_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def open_job(params: MlOpenJob): js.Promise[ApiResponse[_, _]] = js.native
  def open_job(params: MlOpenJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def open_job(params: MlOpenJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def open_job(params: MlOpenJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def postCalendarEvents(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def postCalendarEvents(callback: callbackFn[_]): TransportRequestCallback = js.native
  def postCalendarEvents(params: MlPostCalendarEvents[_]): js.Promise[ApiResponse[_, _]] = js.native
  def postCalendarEvents(params: MlPostCalendarEvents[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def postCalendarEvents(params: MlPostCalendarEvents[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def postCalendarEvents(params: MlPostCalendarEvents[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def postData(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def postData(callback: callbackFn[_]): TransportRequestCallback = js.native
  def postData(params: MlPostData[_]): js.Promise[ApiResponse[_, _]] = js.native
  def postData(params: MlPostData[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def postData(params: MlPostData[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def postData(params: MlPostData[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def post_calendar_events(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def post_calendar_events(callback: callbackFn[_]): TransportRequestCallback = js.native
  def post_calendar_events(params: MlPostCalendarEvents[_]): js.Promise[ApiResponse[_, _]] = js.native
  def post_calendar_events(params: MlPostCalendarEvents[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def post_calendar_events(params: MlPostCalendarEvents[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def post_calendar_events(params: MlPostCalendarEvents[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def post_data(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def post_data(callback: callbackFn[_]): TransportRequestCallback = js.native
  def post_data(params: MlPostData[_]): js.Promise[ApiResponse[_, _]] = js.native
  def post_data(params: MlPostData[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def post_data(params: MlPostData[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def post_data(params: MlPostData[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def previewDatafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def previewDatafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def previewDatafeed(params: MlPreviewDatafeed): js.Promise[ApiResponse[_, _]] = js.native
  def previewDatafeed(params: MlPreviewDatafeed, callback: callbackFn[_]): TransportRequestCallback = js.native
  def previewDatafeed(params: MlPreviewDatafeed, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def previewDatafeed(params: MlPreviewDatafeed, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def preview_datafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def preview_datafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def preview_datafeed(params: MlPreviewDatafeed): js.Promise[ApiResponse[_, _]] = js.native
  def preview_datafeed(params: MlPreviewDatafeed, callback: callbackFn[_]): TransportRequestCallback = js.native
  def preview_datafeed(params: MlPreviewDatafeed, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def preview_datafeed(params: MlPreviewDatafeed, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putCalendar(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putCalendar(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putCalendar(params: MlPutCalendar[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putCalendar(params: MlPutCalendar[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putCalendar(params: MlPutCalendar[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putCalendar(params: MlPutCalendar[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putCalendarJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putCalendarJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putCalendarJob(params: MlPutCalendarJob): js.Promise[ApiResponse[_, _]] = js.native
  def putCalendarJob(params: MlPutCalendarJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def putCalendarJob(params: MlPutCalendarJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putCalendarJob(params: MlPutCalendarJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putDataFrameAnalytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putDataFrameAnalytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putDataFrameAnalytics(params: MlPutDataFrameAnalytics[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putDataFrameAnalytics(params: MlPutDataFrameAnalytics[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putDataFrameAnalytics(params: MlPutDataFrameAnalytics[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putDataFrameAnalytics(params: MlPutDataFrameAnalytics[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putDatafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putDatafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putDatafeed(params: MlPutDatafeed[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putDatafeed(params: MlPutDatafeed[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putDatafeed(params: MlPutDatafeed[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putDatafeed(params: MlPutDatafeed[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putFilter(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putFilter(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putFilter(params: MlPutFilter[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putFilter(params: MlPutFilter[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putFilter(params: MlPutFilter[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putFilter(params: MlPutFilter[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putJob(params: MlPutJob[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putJob(params: MlPutJob[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putJob(params: MlPutJob[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putJob(params: MlPutJob[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putTrainedModel(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putTrainedModel(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putTrainedModel(params: MlPutTrainedModel[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putTrainedModel(params: MlPutTrainedModel[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putTrainedModel(params: MlPutTrainedModel[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putTrainedModel(params: MlPutTrainedModel[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_calendar(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_calendar(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_calendar(params: MlPutCalendar[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_calendar(params: MlPutCalendar[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_calendar(params: MlPutCalendar[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_calendar(params: MlPutCalendar[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_calendar_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_calendar_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_calendar_job(params: MlPutCalendarJob): js.Promise[ApiResponse[_, _]] = js.native
  def put_calendar_job(params: MlPutCalendarJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_calendar_job(params: MlPutCalendarJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_calendar_job(params: MlPutCalendarJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_data_frame_analytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_data_frame_analytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_data_frame_analytics(params: MlPutDataFrameAnalytics[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_data_frame_analytics(params: MlPutDataFrameAnalytics[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_data_frame_analytics(params: MlPutDataFrameAnalytics[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_data_frame_analytics(params: MlPutDataFrameAnalytics[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_datafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_datafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_datafeed(params: MlPutDatafeed[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_datafeed(params: MlPutDatafeed[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_datafeed(params: MlPutDatafeed[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_datafeed(params: MlPutDatafeed[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_filter(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_filter(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_filter(params: MlPutFilter[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_filter(params: MlPutFilter[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_filter(params: MlPutFilter[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_filter(params: MlPutFilter[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_job(params: MlPutJob[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_job(params: MlPutJob[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_job(params: MlPutJob[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_job(params: MlPutJob[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_trained_model(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_trained_model(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_trained_model(params: MlPutTrainedModel[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_trained_model(params: MlPutTrainedModel[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_trained_model(params: MlPutTrainedModel[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_trained_model(params: MlPutTrainedModel[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def revertModelSnapshot(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def revertModelSnapshot(callback: callbackFn[_]): TransportRequestCallback = js.native
  def revertModelSnapshot(params: MlRevertModelSnapshot[_]): js.Promise[ApiResponse[_, _]] = js.native
  def revertModelSnapshot(params: MlRevertModelSnapshot[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def revertModelSnapshot(params: MlRevertModelSnapshot[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def revertModelSnapshot(params: MlRevertModelSnapshot[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def revert_model_snapshot(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def revert_model_snapshot(callback: callbackFn[_]): TransportRequestCallback = js.native
  def revert_model_snapshot(params: MlRevertModelSnapshot[_]): js.Promise[ApiResponse[_, _]] = js.native
  def revert_model_snapshot(params: MlRevertModelSnapshot[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def revert_model_snapshot(params: MlRevertModelSnapshot[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def revert_model_snapshot(params: MlRevertModelSnapshot[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def setUpgradeMode(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def setUpgradeMode(callback: callbackFn[_]): TransportRequestCallback = js.native
  def setUpgradeMode(params: MlSetUpgradeMode): js.Promise[ApiResponse[_, _]] = js.native
  def setUpgradeMode(params: MlSetUpgradeMode, callback: callbackFn[_]): TransportRequestCallback = js.native
  def setUpgradeMode(params: MlSetUpgradeMode, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def setUpgradeMode(params: MlSetUpgradeMode, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def set_upgrade_mode(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def set_upgrade_mode(callback: callbackFn[_]): TransportRequestCallback = js.native
  def set_upgrade_mode(params: MlSetUpgradeMode): js.Promise[ApiResponse[_, _]] = js.native
  def set_upgrade_mode(params: MlSetUpgradeMode, callback: callbackFn[_]): TransportRequestCallback = js.native
  def set_upgrade_mode(params: MlSetUpgradeMode, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def set_upgrade_mode(params: MlSetUpgradeMode, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def startDataFrameAnalytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def startDataFrameAnalytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def startDataFrameAnalytics(params: MlStartDataFrameAnalytics[_]): js.Promise[ApiResponse[_, _]] = js.native
  def startDataFrameAnalytics(params: MlStartDataFrameAnalytics[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def startDataFrameAnalytics(params: MlStartDataFrameAnalytics[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def startDataFrameAnalytics(params: MlStartDataFrameAnalytics[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def startDatafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def startDatafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def startDatafeed(params: MlStartDatafeed[_]): js.Promise[ApiResponse[_, _]] = js.native
  def startDatafeed(params: MlStartDatafeed[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def startDatafeed(params: MlStartDatafeed[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def startDatafeed(params: MlStartDatafeed[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def start_data_frame_analytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def start_data_frame_analytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def start_data_frame_analytics(params: MlStartDataFrameAnalytics[_]): js.Promise[ApiResponse[_, _]] = js.native
  def start_data_frame_analytics(params: MlStartDataFrameAnalytics[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def start_data_frame_analytics(params: MlStartDataFrameAnalytics[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def start_data_frame_analytics(params: MlStartDataFrameAnalytics[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def start_datafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def start_datafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def start_datafeed(params: MlStartDatafeed[_]): js.Promise[ApiResponse[_, _]] = js.native
  def start_datafeed(params: MlStartDatafeed[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def start_datafeed(params: MlStartDatafeed[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def start_datafeed(params: MlStartDatafeed[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stopDataFrameAnalytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stopDataFrameAnalytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stopDataFrameAnalytics(params: MlStopDataFrameAnalytics[_]): js.Promise[ApiResponse[_, _]] = js.native
  def stopDataFrameAnalytics(params: MlStopDataFrameAnalytics[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def stopDataFrameAnalytics(params: MlStopDataFrameAnalytics[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stopDataFrameAnalytics(params: MlStopDataFrameAnalytics[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stopDatafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stopDatafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stopDatafeed(params: MlStopDatafeed): js.Promise[ApiResponse[_, _]] = js.native
  def stopDatafeed(params: MlStopDatafeed, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stopDatafeed(params: MlStopDatafeed, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stopDatafeed(params: MlStopDatafeed, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stop_data_frame_analytics(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stop_data_frame_analytics(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop_data_frame_analytics(params: MlStopDataFrameAnalytics[_]): js.Promise[ApiResponse[_, _]] = js.native
  def stop_data_frame_analytics(params: MlStopDataFrameAnalytics[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop_data_frame_analytics(params: MlStopDataFrameAnalytics[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stop_data_frame_analytics(params: MlStopDataFrameAnalytics[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stop_datafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stop_datafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop_datafeed(params: MlStopDatafeed): js.Promise[ApiResponse[_, _]] = js.native
  def stop_datafeed(params: MlStopDatafeed, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop_datafeed(params: MlStopDatafeed, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stop_datafeed(params: MlStopDatafeed, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def updateDatafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def updateDatafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateDatafeed(params: MlUpdateDatafeed[_]): js.Promise[ApiResponse[_, _]] = js.native
  def updateDatafeed(params: MlUpdateDatafeed[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateDatafeed(params: MlUpdateDatafeed[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def updateDatafeed(params: MlUpdateDatafeed[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def updateFilter(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def updateFilter(callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateFilter(params: MlUpdateFilter[_]): js.Promise[ApiResponse[_, _]] = js.native
  def updateFilter(params: MlUpdateFilter[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateFilter(params: MlUpdateFilter[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def updateFilter(params: MlUpdateFilter[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def updateJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def updateJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateJob(params: MlUpdateJob[_]): js.Promise[ApiResponse[_, _]] = js.native
  def updateJob(params: MlUpdateJob[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateJob(params: MlUpdateJob[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def updateJob(params: MlUpdateJob[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def updateModelSnapshot(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def updateModelSnapshot(callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateModelSnapshot(params: MlUpdateModelSnapshot[_]): js.Promise[ApiResponse[_, _]] = js.native
  def updateModelSnapshot(params: MlUpdateModelSnapshot[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateModelSnapshot(params: MlUpdateModelSnapshot[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def updateModelSnapshot(params: MlUpdateModelSnapshot[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def update_datafeed(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def update_datafeed(callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_datafeed(params: MlUpdateDatafeed[_]): js.Promise[ApiResponse[_, _]] = js.native
  def update_datafeed(params: MlUpdateDatafeed[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_datafeed(params: MlUpdateDatafeed[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def update_datafeed(params: MlUpdateDatafeed[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def update_filter(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def update_filter(callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_filter(params: MlUpdateFilter[_]): js.Promise[ApiResponse[_, _]] = js.native
  def update_filter(params: MlUpdateFilter[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_filter(params: MlUpdateFilter[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def update_filter(params: MlUpdateFilter[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def update_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def update_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_job(params: MlUpdateJob[_]): js.Promise[ApiResponse[_, _]] = js.native
  def update_job(params: MlUpdateJob[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_job(params: MlUpdateJob[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def update_job(params: MlUpdateJob[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def update_model_snapshot(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def update_model_snapshot(callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_model_snapshot(params: MlUpdateModelSnapshot[_]): js.Promise[ApiResponse[_, _]] = js.native
  def update_model_snapshot(params: MlUpdateModelSnapshot[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_model_snapshot(params: MlUpdateModelSnapshot[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def update_model_snapshot(params: MlUpdateModelSnapshot[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def validate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def validate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def validate(params: MlValidate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def validate(params: MlValidate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def validate(params: MlValidate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def validate(params: MlValidate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def validateDetector(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def validateDetector(callback: callbackFn[_]): TransportRequestCallback = js.native
  def validateDetector(params: MlValidateDetector[_]): js.Promise[ApiResponse[_, _]] = js.native
  def validateDetector(params: MlValidateDetector[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def validateDetector(params: MlValidateDetector[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def validateDetector(params: MlValidateDetector[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def validate_detector(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def validate_detector(callback: callbackFn[_]): TransportRequestCallback = js.native
  def validate_detector(params: MlValidateDetector[_]): js.Promise[ApiResponse[_, _]] = js.native
  def validate_detector(params: MlValidateDetector[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def validate_detector(params: MlValidateDetector[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def validate_detector(params: MlValidateDetector[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

