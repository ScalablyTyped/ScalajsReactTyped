package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.GraphExplore
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExplore extends js.Object {
  @JSName("explore")
  var explore_Original: ApiMethod[GraphExplore[_], _] = js.native
  // Promise API
  def explore(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def explore(callback: callbackFn[_]): TransportRequestCallback = js.native
  def explore(params: GraphExplore[_]): js.Promise[ApiResponse[_, _]] = js.native
  def explore(params: GraphExplore[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def explore(params: GraphExplore[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def explore(params: GraphExplore[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

