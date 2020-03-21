package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.MigrationDeprecations
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeprecations extends js.Object {
  @JSName("deprecations")
  var deprecations_Original: ApiMethod[MigrationDeprecations, _] = js.native
  // Promise API
  def deprecations(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deprecations(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deprecations(params: MigrationDeprecations): js.Promise[ApiResponse[_, _]] = js.native
  def deprecations(params: MigrationDeprecations, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deprecations(params: MigrationDeprecations, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deprecations(params: MigrationDeprecations, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

