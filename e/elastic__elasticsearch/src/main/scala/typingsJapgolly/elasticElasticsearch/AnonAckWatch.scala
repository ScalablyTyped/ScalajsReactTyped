package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.WatcherAckWatch
import typingsJapgolly.elasticElasticsearch.requestParamsMod.WatcherActivateWatch
import typingsJapgolly.elasticElasticsearch.requestParamsMod.WatcherDeactivateWatch
import typingsJapgolly.elasticElasticsearch.requestParamsMod.WatcherDeleteWatch
import typingsJapgolly.elasticElasticsearch.requestParamsMod.WatcherExecuteWatch
import typingsJapgolly.elasticElasticsearch.requestParamsMod.WatcherGetWatch
import typingsJapgolly.elasticElasticsearch.requestParamsMod.WatcherPutWatch
import typingsJapgolly.elasticElasticsearch.requestParamsMod.WatcherStart
import typingsJapgolly.elasticElasticsearch.requestParamsMod.WatcherStats
import typingsJapgolly.elasticElasticsearch.requestParamsMod.WatcherStop
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAckWatch extends js.Object {
  @JSName("ackWatch")
  var ackWatch_Original: ApiMethod[WatcherAckWatch, _] = js.native
  @JSName("ack_watch")
  var ack_watch_Original: ApiMethod[WatcherAckWatch, _] = js.native
  @JSName("activateWatch")
  var activateWatch_Original: ApiMethod[WatcherActivateWatch, _] = js.native
  @JSName("activate_watch")
  var activate_watch_Original: ApiMethod[WatcherActivateWatch, _] = js.native
  @JSName("deactivateWatch")
  var deactivateWatch_Original: ApiMethod[WatcherDeactivateWatch, _] = js.native
  @JSName("deactivate_watch")
  var deactivate_watch_Original: ApiMethod[WatcherDeactivateWatch, _] = js.native
  @JSName("deleteWatch")
  var deleteWatch_Original: ApiMethod[WatcherDeleteWatch, _] = js.native
  @JSName("delete_watch")
  var delete_watch_Original: ApiMethod[WatcherDeleteWatch, _] = js.native
  @JSName("executeWatch")
  var executeWatch_Original: ApiMethod[WatcherExecuteWatch[_], _] = js.native
  @JSName("execute_watch")
  var execute_watch_Original: ApiMethod[WatcherExecuteWatch[_], _] = js.native
  @JSName("getWatch")
  var getWatch_Original: ApiMethod[WatcherGetWatch, _] = js.native
  @JSName("get_watch")
  var get_watch_Original: ApiMethod[WatcherGetWatch, _] = js.native
  @JSName("putWatch")
  var putWatch_Original: ApiMethod[WatcherPutWatch[_], _] = js.native
  @JSName("put_watch")
  var put_watch_Original: ApiMethod[WatcherPutWatch[_], _] = js.native
  @JSName("start")
  var start_Original: ApiMethod[WatcherStart, _] = js.native
  @JSName("stats")
  var stats_Original: ApiMethod[WatcherStats, _] = js.native
  @JSName("stop")
  var stop_Original: ApiMethod[WatcherStop, _] = js.native
  // Promise API
  def ackWatch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def ackWatch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def ackWatch(params: WatcherAckWatch): js.Promise[ApiResponse[_, _]] = js.native
  def ackWatch(params: WatcherAckWatch, callback: callbackFn[_]): TransportRequestCallback = js.native
  def ackWatch(params: WatcherAckWatch, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def ackWatch(params: WatcherAckWatch, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def ack_watch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def ack_watch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def ack_watch(params: WatcherAckWatch): js.Promise[ApiResponse[_, _]] = js.native
  def ack_watch(params: WatcherAckWatch, callback: callbackFn[_]): TransportRequestCallback = js.native
  def ack_watch(params: WatcherAckWatch, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def ack_watch(params: WatcherAckWatch, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def activateWatch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def activateWatch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def activateWatch(params: WatcherActivateWatch): js.Promise[ApiResponse[_, _]] = js.native
  def activateWatch(params: WatcherActivateWatch, callback: callbackFn[_]): TransportRequestCallback = js.native
  def activateWatch(params: WatcherActivateWatch, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def activateWatch(params: WatcherActivateWatch, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def activate_watch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def activate_watch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def activate_watch(params: WatcherActivateWatch): js.Promise[ApiResponse[_, _]] = js.native
  def activate_watch(params: WatcherActivateWatch, callback: callbackFn[_]): TransportRequestCallback = js.native
  def activate_watch(params: WatcherActivateWatch, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def activate_watch(params: WatcherActivateWatch, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deactivateWatch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deactivateWatch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deactivateWatch(params: WatcherDeactivateWatch): js.Promise[ApiResponse[_, _]] = js.native
  def deactivateWatch(params: WatcherDeactivateWatch, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deactivateWatch(params: WatcherDeactivateWatch, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deactivateWatch(params: WatcherDeactivateWatch, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deactivate_watch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deactivate_watch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deactivate_watch(params: WatcherDeactivateWatch): js.Promise[ApiResponse[_, _]] = js.native
  def deactivate_watch(params: WatcherDeactivateWatch, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deactivate_watch(params: WatcherDeactivateWatch, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deactivate_watch(params: WatcherDeactivateWatch, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteWatch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteWatch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteWatch(params: WatcherDeleteWatch): js.Promise[ApiResponse[_, _]] = js.native
  def deleteWatch(params: WatcherDeleteWatch, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteWatch(params: WatcherDeleteWatch, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteWatch(params: WatcherDeleteWatch, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_watch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_watch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_watch(params: WatcherDeleteWatch): js.Promise[ApiResponse[_, _]] = js.native
  def delete_watch(params: WatcherDeleteWatch, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_watch(params: WatcherDeleteWatch, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_watch(params: WatcherDeleteWatch, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def executeWatch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def executeWatch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def executeWatch(params: WatcherExecuteWatch[_]): js.Promise[ApiResponse[_, _]] = js.native
  def executeWatch(params: WatcherExecuteWatch[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def executeWatch(params: WatcherExecuteWatch[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def executeWatch(params: WatcherExecuteWatch[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def execute_watch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def execute_watch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def execute_watch(params: WatcherExecuteWatch[_]): js.Promise[ApiResponse[_, _]] = js.native
  def execute_watch(params: WatcherExecuteWatch[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def execute_watch(params: WatcherExecuteWatch[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def execute_watch(params: WatcherExecuteWatch[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getWatch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getWatch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getWatch(params: WatcherGetWatch): js.Promise[ApiResponse[_, _]] = js.native
  def getWatch(params: WatcherGetWatch, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getWatch(params: WatcherGetWatch, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getWatch(params: WatcherGetWatch, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_watch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_watch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_watch(params: WatcherGetWatch): js.Promise[ApiResponse[_, _]] = js.native
  def get_watch(params: WatcherGetWatch, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_watch(params: WatcherGetWatch, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_watch(params: WatcherGetWatch, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putWatch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putWatch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putWatch(params: WatcherPutWatch[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putWatch(params: WatcherPutWatch[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putWatch(params: WatcherPutWatch[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putWatch(params: WatcherPutWatch[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_watch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_watch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_watch(params: WatcherPutWatch[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_watch(params: WatcherPutWatch[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_watch(params: WatcherPutWatch[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_watch(params: WatcherPutWatch[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def start(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def start(callback: callbackFn[_]): TransportRequestCallback = js.native
  def start(params: WatcherStart): js.Promise[ApiResponse[_, _]] = js.native
  def start(params: WatcherStart, callback: callbackFn[_]): TransportRequestCallback = js.native
  def start(params: WatcherStart, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def start(params: WatcherStart, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: WatcherStats): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: WatcherStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: WatcherStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: WatcherStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stop(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stop(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop(params: WatcherStop): js.Promise[ApiResponse[_, _]] = js.native
  def stop(params: WatcherStop, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop(params: WatcherStop, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stop(params: WatcherStop, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

