package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MonitoringBulk
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBulk extends js.Object {
  @JSName("bulk")
  var bulk_Original: ApiMethod[MonitoringBulk[_], _] = js.native
  // Promise API
  def bulk(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def bulk(callback: callbackFn[_]): TransportRequestCallback = js.native
  def bulk(params: MonitoringBulk[_]): js.Promise[ApiResponse[_, _]] = js.native
  def bulk(params: MonitoringBulk[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def bulk(params: MonitoringBulk[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def bulk(params: MonitoringBulk[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

