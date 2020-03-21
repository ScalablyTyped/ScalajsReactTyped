package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.TasksCancel
import typingsJapgolly.elasticElasticsearch.requestParamsMod.TasksGet
import typingsJapgolly.elasticElasticsearch.requestParamsMod.TasksList
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancel extends js.Object {
  @JSName("cancel")
  var cancel_Original: ApiMethod[TasksCancel, _] = js.native
  @JSName("get")
  var get_Original: ApiMethod[TasksGet, _] = js.native
  @JSName("list")
  var list_Original: ApiMethod[TasksList, _] = js.native
  // Promise API
  def cancel(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def cancel(callback: callbackFn[_]): TransportRequestCallback = js.native
  def cancel(params: TasksCancel): js.Promise[ApiResponse[_, _]] = js.native
  def cancel(params: TasksCancel, callback: callbackFn[_]): TransportRequestCallback = js.native
  def cancel(params: TasksCancel, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def cancel(params: TasksCancel, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get(params: TasksGet): js.Promise[ApiResponse[_, _]] = js.native
  def get(params: TasksGet, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get(params: TasksGet, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get(params: TasksGet, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def list(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def list(callback: callbackFn[_]): TransportRequestCallback = js.native
  def list(params: TasksList): js.Promise[ApiResponse[_, _]] = js.native
  def list(params: TasksList, callback: callbackFn[_]): TransportRequestCallback = js.native
  def list(params: TasksList, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def list(params: TasksList, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

