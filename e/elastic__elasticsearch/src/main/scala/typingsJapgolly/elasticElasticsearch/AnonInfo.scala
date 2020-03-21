package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.XpackInfo
import typingsJapgolly.elasticElasticsearch.requestParamsMod.XpackUsage
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInfo extends js.Object {
  @JSName("info")
  var info_Original: ApiMethod[XpackInfo, _] = js.native
  @JSName("usage")
  var usage_Original: ApiMethod[XpackUsage, _] = js.native
  // Promise API
  def info(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def info(callback: callbackFn[_]): TransportRequestCallback = js.native
  def info(params: XpackInfo): js.Promise[ApiResponse[_, _]] = js.native
  def info(params: XpackInfo, callback: callbackFn[_]): TransportRequestCallback = js.native
  def info(params: XpackInfo, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def info(params: XpackInfo, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def usage(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def usage(callback: callbackFn[_]): TransportRequestCallback = js.native
  def usage(params: XpackUsage): js.Promise[ApiResponse[_, _]] = js.native
  def usage(params: XpackUsage, callback: callbackFn[_]): TransportRequestCallback = js.native
  def usage(params: XpackUsage, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def usage(params: XpackUsage, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

