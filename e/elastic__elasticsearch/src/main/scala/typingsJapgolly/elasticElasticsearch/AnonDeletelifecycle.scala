package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SlmDeleteLifecycle
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SlmExecuteLifecycle
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SlmExecuteRetention
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SlmGetLifecycle
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SlmGetStats
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SlmGetStatus
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SlmPutLifecycle
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SlmStart
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SlmStop
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeletelifecycle extends js.Object {
  @JSName("deleteLifecycle")
  var deleteLifecycle_Original: ApiMethod[SlmDeleteLifecycle, _] = js.native
  @JSName("delete_lifecycle")
  var delete_lifecycle_Original: ApiMethod[SlmDeleteLifecycle, _] = js.native
  @JSName("executeLifecycle")
  var executeLifecycle_Original: ApiMethod[SlmExecuteLifecycle, _] = js.native
  @JSName("executeRetention")
  var executeRetention_Original: ApiMethod[SlmExecuteRetention, _] = js.native
  @JSName("execute_lifecycle")
  var execute_lifecycle_Original: ApiMethod[SlmExecuteLifecycle, _] = js.native
  @JSName("execute_retention")
  var execute_retention_Original: ApiMethod[SlmExecuteRetention, _] = js.native
  @JSName("getLifecycle")
  var getLifecycle_Original: ApiMethod[SlmGetLifecycle, _] = js.native
  @JSName("getStats")
  var getStats_Original: ApiMethod[SlmGetStats, _] = js.native
  @JSName("getStatus")
  var getStatus_Original: ApiMethod[SlmGetStatus, _] = js.native
  @JSName("get_lifecycle")
  var get_lifecycle_Original: ApiMethod[SlmGetLifecycle, _] = js.native
  @JSName("get_stats")
  var get_stats_Original: ApiMethod[SlmGetStats, _] = js.native
  @JSName("get_status")
  var get_status_Original: ApiMethod[SlmGetStatus, _] = js.native
  @JSName("putLifecycle")
  var putLifecycle_Original: ApiMethod[SlmPutLifecycle[_], _] = js.native
  @JSName("put_lifecycle")
  var put_lifecycle_Original: ApiMethod[SlmPutLifecycle[_], _] = js.native
  @JSName("start")
  var start_Original: ApiMethod[SlmStart, _] = js.native
  @JSName("stop")
  var stop_Original: ApiMethod[SlmStop, _] = js.native
  // Promise API
  def deleteLifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteLifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteLifecycle(params: SlmDeleteLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def deleteLifecycle(params: SlmDeleteLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteLifecycle(params: SlmDeleteLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteLifecycle(params: SlmDeleteLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_lifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_lifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_lifecycle(params: SlmDeleteLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def delete_lifecycle(params: SlmDeleteLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_lifecycle(params: SlmDeleteLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_lifecycle(params: SlmDeleteLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def executeLifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def executeLifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def executeLifecycle(params: SlmExecuteLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def executeLifecycle(params: SlmExecuteLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def executeLifecycle(params: SlmExecuteLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def executeLifecycle(params: SlmExecuteLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def executeRetention(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def executeRetention(callback: callbackFn[_]): TransportRequestCallback = js.native
  def executeRetention(params: SlmExecuteRetention): js.Promise[ApiResponse[_, _]] = js.native
  def executeRetention(params: SlmExecuteRetention, callback: callbackFn[_]): TransportRequestCallback = js.native
  def executeRetention(params: SlmExecuteRetention, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def executeRetention(params: SlmExecuteRetention, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def execute_lifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def execute_lifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def execute_lifecycle(params: SlmExecuteLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def execute_lifecycle(params: SlmExecuteLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def execute_lifecycle(params: SlmExecuteLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def execute_lifecycle(params: SlmExecuteLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def execute_retention(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def execute_retention(callback: callbackFn[_]): TransportRequestCallback = js.native
  def execute_retention(params: SlmExecuteRetention): js.Promise[ApiResponse[_, _]] = js.native
  def execute_retention(params: SlmExecuteRetention, callback: callbackFn[_]): TransportRequestCallback = js.native
  def execute_retention(params: SlmExecuteRetention, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def execute_retention(params: SlmExecuteRetention, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getLifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getLifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getLifecycle(params: SlmGetLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def getLifecycle(params: SlmGetLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getLifecycle(params: SlmGetLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getLifecycle(params: SlmGetLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getStats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getStats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getStats(params: SlmGetStats): js.Promise[ApiResponse[_, _]] = js.native
  def getStats(params: SlmGetStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getStats(params: SlmGetStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getStats(params: SlmGetStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getStatus(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getStatus(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getStatus(params: SlmGetStatus): js.Promise[ApiResponse[_, _]] = js.native
  def getStatus(params: SlmGetStatus, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getStatus(params: SlmGetStatus, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getStatus(params: SlmGetStatus, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_lifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_lifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_lifecycle(params: SlmGetLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def get_lifecycle(params: SlmGetLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_lifecycle(params: SlmGetLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_lifecycle(params: SlmGetLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_stats(params: SlmGetStats): js.Promise[ApiResponse[_, _]] = js.native
  def get_stats(params: SlmGetStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_stats(params: SlmGetStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_stats(params: SlmGetStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_status(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_status(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_status(params: SlmGetStatus): js.Promise[ApiResponse[_, _]] = js.native
  def get_status(params: SlmGetStatus, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_status(params: SlmGetStatus, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_status(params: SlmGetStatus, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putLifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putLifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putLifecycle(params: SlmPutLifecycle[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putLifecycle(params: SlmPutLifecycle[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putLifecycle(params: SlmPutLifecycle[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putLifecycle(params: SlmPutLifecycle[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_lifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_lifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_lifecycle(params: SlmPutLifecycle[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_lifecycle(params: SlmPutLifecycle[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_lifecycle(params: SlmPutLifecycle[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_lifecycle(params: SlmPutLifecycle[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def start(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def start(callback: callbackFn[_]): TransportRequestCallback = js.native
  def start(params: SlmStart): js.Promise[ApiResponse[_, _]] = js.native
  def start(params: SlmStart, callback: callbackFn[_]): TransportRequestCallback = js.native
  def start(params: SlmStart, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def start(params: SlmStart, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stop(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stop(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop(params: SlmStop): js.Promise[ApiResponse[_, _]] = js.native
  def stop(params: SlmStop, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop(params: SlmStop, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stop(params: SlmStop, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

