package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SslCertificates
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCertificates extends js.Object {
  @JSName("certificates")
  var certificates_Original: ApiMethod[SslCertificates, _] = js.native
  // Promise API
  def certificates(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def certificates(callback: callbackFn[_]): TransportRequestCallback = js.native
  def certificates(params: SslCertificates): js.Promise[ApiResponse[_, _]] = js.native
  def certificates(params: SslCertificates, callback: callbackFn[_]): TransportRequestCallback = js.native
  def certificates(params: SslCertificates, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def certificates(params: SslCertificates, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

