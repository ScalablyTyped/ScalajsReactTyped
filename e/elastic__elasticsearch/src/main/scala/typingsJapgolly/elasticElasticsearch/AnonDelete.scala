package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.LicenseDelete
import typingsJapgolly.elasticElasticsearch.requestParamsMod.LicenseGet
import typingsJapgolly.elasticElasticsearch.requestParamsMod.LicenseGetBasicStatus
import typingsJapgolly.elasticElasticsearch.requestParamsMod.LicenseGetTrialStatus
import typingsJapgolly.elasticElasticsearch.requestParamsMod.LicensePost
import typingsJapgolly.elasticElasticsearch.requestParamsMod.LicensePostStartBasic
import typingsJapgolly.elasticElasticsearch.requestParamsMod.LicensePostStartTrial
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelete extends js.Object {
  @JSName("delete")
  var delete_Original: ApiMethod[LicenseDelete, _] = js.native
  @JSName("getBasicStatus")
  var getBasicStatus_Original: ApiMethod[LicenseGetBasicStatus, _] = js.native
  @JSName("getTrialStatus")
  var getTrialStatus_Original: ApiMethod[LicenseGetTrialStatus, _] = js.native
  @JSName("get")
  var get_Original: ApiMethod[LicenseGet, _] = js.native
  @JSName("get_basic_status")
  var get_basic_status_Original: ApiMethod[LicenseGetBasicStatus, _] = js.native
  @JSName("get_trial_status")
  var get_trial_status_Original: ApiMethod[LicenseGetTrialStatus, _] = js.native
  @JSName("postStartBasic")
  var postStartBasic_Original: ApiMethod[LicensePostStartBasic, _] = js.native
  @JSName("postStartTrial")
  var postStartTrial_Original: ApiMethod[LicensePostStartTrial, _] = js.native
  @JSName("post")
  var post_Original: ApiMethod[LicensePost[_], _] = js.native
  @JSName("post_start_basic")
  var post_start_basic_Original: ApiMethod[LicensePostStartBasic, _] = js.native
  @JSName("post_start_trial")
  var post_start_trial_Original: ApiMethod[LicensePostStartTrial, _] = js.native
  // Promise API
  def delete(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete(params: LicenseDelete): js.Promise[ApiResponse[_, _]] = js.native
  def delete(params: LicenseDelete, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete(params: LicenseDelete, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete(params: LicenseDelete, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get(params: LicenseGet): js.Promise[ApiResponse[_, _]] = js.native
  def get(params: LicenseGet, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get(params: LicenseGet, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get(params: LicenseGet, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getBasicStatus(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getBasicStatus(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getBasicStatus(params: LicenseGetBasicStatus): js.Promise[ApiResponse[_, _]] = js.native
  def getBasicStatus(params: LicenseGetBasicStatus, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getBasicStatus(params: LicenseGetBasicStatus, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getBasicStatus(params: LicenseGetBasicStatus, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getTrialStatus(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getTrialStatus(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTrialStatus(params: LicenseGetTrialStatus): js.Promise[ApiResponse[_, _]] = js.native
  def getTrialStatus(params: LicenseGetTrialStatus, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTrialStatus(params: LicenseGetTrialStatus, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getTrialStatus(params: LicenseGetTrialStatus, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_basic_status(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_basic_status(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_basic_status(params: LicenseGetBasicStatus): js.Promise[ApiResponse[_, _]] = js.native
  def get_basic_status(params: LicenseGetBasicStatus, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_basic_status(params: LicenseGetBasicStatus, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_basic_status(params: LicenseGetBasicStatus, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_trial_status(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_trial_status(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_trial_status(params: LicenseGetTrialStatus): js.Promise[ApiResponse[_, _]] = js.native
  def get_trial_status(params: LicenseGetTrialStatus, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_trial_status(params: LicenseGetTrialStatus, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_trial_status(params: LicenseGetTrialStatus, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def post(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def post(callback: callbackFn[_]): TransportRequestCallback = js.native
  def post(params: LicensePost[_]): js.Promise[ApiResponse[_, _]] = js.native
  def post(params: LicensePost[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def post(params: LicensePost[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def post(params: LicensePost[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def postStartBasic(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def postStartBasic(callback: callbackFn[_]): TransportRequestCallback = js.native
  def postStartBasic(params: LicensePostStartBasic): js.Promise[ApiResponse[_, _]] = js.native
  def postStartBasic(params: LicensePostStartBasic, callback: callbackFn[_]): TransportRequestCallback = js.native
  def postStartBasic(params: LicensePostStartBasic, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def postStartBasic(params: LicensePostStartBasic, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def postStartTrial(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def postStartTrial(callback: callbackFn[_]): TransportRequestCallback = js.native
  def postStartTrial(params: LicensePostStartTrial): js.Promise[ApiResponse[_, _]] = js.native
  def postStartTrial(params: LicensePostStartTrial, callback: callbackFn[_]): TransportRequestCallback = js.native
  def postStartTrial(params: LicensePostStartTrial, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def postStartTrial(params: LicensePostStartTrial, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def post_start_basic(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def post_start_basic(callback: callbackFn[_]): TransportRequestCallback = js.native
  def post_start_basic(params: LicensePostStartBasic): js.Promise[ApiResponse[_, _]] = js.native
  def post_start_basic(params: LicensePostStartBasic, callback: callbackFn[_]): TransportRequestCallback = js.native
  def post_start_basic(params: LicensePostStartBasic, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def post_start_basic(params: LicensePostStartBasic, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def post_start_trial(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def post_start_trial(callback: callbackFn[_]): TransportRequestCallback = js.native
  def post_start_trial(params: LicensePostStartTrial): js.Promise[ApiResponse[_, _]] = js.native
  def post_start_trial(params: LicensePostStartTrial, callback: callbackFn[_]): TransportRequestCallback = js.native
  def post_start_trial(params: LicensePostStartTrial, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def post_start_trial(params: LicensePostStartTrial, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

