package typingsJapgolly.elasticElasticsearch.transportMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchBooleans.`false`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typingsJapgolly.elasticElasticsearch.poolMod.CloudConnectionPool
import typingsJapgolly.elasticElasticsearch.poolMod.ConnectionPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  var _isSniffing: Boolean = js.native
  var _nextSniff: Double = js.native
  var _sniffEnabled: Boolean = js.native
  var compression: gzip | `false` = js.native
  var connectionPool: ConnectionPool | CloudConnectionPool = js.native
  @JSName("emit")
  var emit_Original: emitFn with noopFn = js.native
  var maxRetries: Double = js.native
  var opaqueIdPrefix: String | Null = js.native
  var requestTimeout: Double = js.native
  var serializer: typingsJapgolly.elasticElasticsearch.serializerMod.default = js.native
  var sniffEndpoint: String = js.native
  var sniffInterval: Double = js.native
  var sniffOnConnectionFault: Boolean = js.native
  var suggestCompression: Boolean = js.native
  def emit(args: js.Any*): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def getConnection(opts: TransportGetConnectionOptions): typingsJapgolly.elasticElasticsearch.connectionMod.default | Null = js.native
  def request(params: TransportRequestParams): TransportRequestCallback = js.native
  def request(params: TransportRequestParams, options: TransportRequestOptions): TransportRequestCallback = js.native
  def request(
    params: TransportRequestParams,
    options: TransportRequestOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ ApiResponse[_, _], Unit]
  ): TransportRequestCallback = js.native
  @JSName("request")
  def request_Promise(params: TransportRequestParams): js.Promise[ApiResponse[_, _]] = js.native
  @JSName("request")
  def request_Promise(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def sniff(): Unit = js.native
  def sniff(opts: TransportSniffOptions): Unit = js.native
  def sniff(opts: TransportSniffOptions, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

