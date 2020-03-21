package typingsJapgolly.elasticElasticsearch.mod

import typingsJapgolly.elasticElasticsearch.AnonBody
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend API
@js.native
trait ClientExtendsCallbackOptions extends js.Object {
  var ConfigurationError: typingsJapgolly.elasticElasticsearch.errorsMod.ConfigurationError = js.native
  var result: AnonBody = js.native
  def makeRequest(params: TransportRequestParams): js.Promise[Unit] | Unit = js.native
  def makeRequest(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[Unit] | Unit = js.native
}

