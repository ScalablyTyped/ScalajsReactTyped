package typingsJapgolly.elasticElasticsearch.connectionMod

import typingsJapgolly.elasticElasticsearch.poolMod.ApiKeyAuth
import typingsJapgolly.elasticElasticsearch.poolMod.BasicAuth
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var agent: js.UndefOr[AgentOptions | agentFn] = js.undefined
  var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var roles: js.UndefOr[js.Any] = js.undefined
  var ssl: js.UndefOr[typingsJapgolly.node.tlsMod.ConnectionOptions] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var url: URL_
}

object ConnectionOptions {
  @scala.inline
  def apply(
    url: URL_,
    agent: AgentOptions | agentFn = null,
    auth: BasicAuth | ApiKeyAuth = null,
    headers: js.Any = null,
    id: String = null,
    roles: js.Any = null,
    ssl: typingsJapgolly.node.tlsMod.ConnectionOptions = null,
    status: String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

