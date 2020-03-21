package typingsJapgolly.elasticElasticsearch.poolMod

import typingsJapgolly.elasticElasticsearch.TypeofConnection
import typingsJapgolly.elasticElasticsearch.connectionMod.AgentOptions
import typingsJapgolly.node.tlsMod.SecureContextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConnectionPoolOptions extends js.Object {
  var Connection: TypeofConnection = js.native
  var agent: js.UndefOr[AgentOptions] = js.native
  var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.native
  var pingTimeout: js.UndefOr[Double] = js.native
  var resurrectStrategy: js.UndefOr[String] = js.native
  var ssl: js.UndefOr[SecureContextOptions] = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
}

