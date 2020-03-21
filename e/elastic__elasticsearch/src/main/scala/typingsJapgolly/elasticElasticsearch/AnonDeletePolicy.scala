package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.EnrichDeletePolicy
import typingsJapgolly.elasticElasticsearch.requestParamsMod.EnrichExecutePolicy
import typingsJapgolly.elasticElasticsearch.requestParamsMod.EnrichGetPolicy
import typingsJapgolly.elasticElasticsearch.requestParamsMod.EnrichPutPolicy
import typingsJapgolly.elasticElasticsearch.requestParamsMod.EnrichStats
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeletePolicy extends js.Object {
  @JSName("deletePolicy")
  var deletePolicy_Original: ApiMethod[EnrichDeletePolicy, _] = js.native
  @JSName("delete_policy")
  var delete_policy_Original: ApiMethod[EnrichDeletePolicy, _] = js.native
  @JSName("executePolicy")
  var executePolicy_Original: ApiMethod[EnrichExecutePolicy, _] = js.native
  @JSName("execute_policy")
  var execute_policy_Original: ApiMethod[EnrichExecutePolicy, _] = js.native
  @JSName("getPolicy")
  var getPolicy_Original: ApiMethod[EnrichGetPolicy, _] = js.native
  @JSName("get_policy")
  var get_policy_Original: ApiMethod[EnrichGetPolicy, _] = js.native
  @JSName("putPolicy")
  var putPolicy_Original: ApiMethod[EnrichPutPolicy[_], _] = js.native
  @JSName("put_policy")
  var put_policy_Original: ApiMethod[EnrichPutPolicy[_], _] = js.native
  @JSName("stats")
  var stats_Original: ApiMethod[EnrichStats, _] = js.native
  // Promise API
  def deletePolicy(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deletePolicy(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deletePolicy(params: EnrichDeletePolicy): js.Promise[ApiResponse[_, _]] = js.native
  def deletePolicy(params: EnrichDeletePolicy, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deletePolicy(params: EnrichDeletePolicy, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deletePolicy(params: EnrichDeletePolicy, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_policy(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_policy(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_policy(params: EnrichDeletePolicy): js.Promise[ApiResponse[_, _]] = js.native
  def delete_policy(params: EnrichDeletePolicy, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_policy(params: EnrichDeletePolicy, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_policy(params: EnrichDeletePolicy, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def executePolicy(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def executePolicy(callback: callbackFn[_]): TransportRequestCallback = js.native
  def executePolicy(params: EnrichExecutePolicy): js.Promise[ApiResponse[_, _]] = js.native
  def executePolicy(params: EnrichExecutePolicy, callback: callbackFn[_]): TransportRequestCallback = js.native
  def executePolicy(params: EnrichExecutePolicy, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def executePolicy(params: EnrichExecutePolicy, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def execute_policy(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def execute_policy(callback: callbackFn[_]): TransportRequestCallback = js.native
  def execute_policy(params: EnrichExecutePolicy): js.Promise[ApiResponse[_, _]] = js.native
  def execute_policy(params: EnrichExecutePolicy, callback: callbackFn[_]): TransportRequestCallback = js.native
  def execute_policy(params: EnrichExecutePolicy, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def execute_policy(params: EnrichExecutePolicy, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getPolicy(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getPolicy(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getPolicy(params: EnrichGetPolicy): js.Promise[ApiResponse[_, _]] = js.native
  def getPolicy(params: EnrichGetPolicy, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getPolicy(params: EnrichGetPolicy, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getPolicy(params: EnrichGetPolicy, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_policy(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_policy(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_policy(params: EnrichGetPolicy): js.Promise[ApiResponse[_, _]] = js.native
  def get_policy(params: EnrichGetPolicy, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_policy(params: EnrichGetPolicy, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_policy(params: EnrichGetPolicy, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putPolicy(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putPolicy(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putPolicy(params: EnrichPutPolicy[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putPolicy(params: EnrichPutPolicy[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putPolicy(params: EnrichPutPolicy[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putPolicy(params: EnrichPutPolicy[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_policy(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_policy(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_policy(params: EnrichPutPolicy[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_policy(params: EnrichPutPolicy[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_policy(params: EnrichPutPolicy[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_policy(params: EnrichPutPolicy[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: EnrichStats): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: EnrichStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: EnrichStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: EnrichStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

