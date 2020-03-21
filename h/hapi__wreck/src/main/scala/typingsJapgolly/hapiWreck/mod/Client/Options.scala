package typingsJapgolly.hapiWreck.mod.Client

import japgolly.scalajs.react.Callback
import typingsJapgolly.hapiWreck.hapiWreckBooleans.`false`
import typingsJapgolly.hapiWreck.hapiWreckStrings.force
import typingsJapgolly.hapiWreck.hapiWreckStrings.strict
import typingsJapgolly.hapiWreck.mod.Client.request.Payload
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typingsJapgolly.hapiWreck.mod.Client.request.Options
     with typingsJapgolly.hapiWreck.mod.Client.read.Options {
  /**
    * An object containing the node agents used for pooling connections for `http` and `https`.
    */
  val agents: js.UndefOr[Agents] = js.undefined
  /**
    * Enables events.
    * 
    * @default false
    */
  val events: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines how to handle gzipped payloads.
    *
    * @default false
    */
  /* InferMemberOverrides */
  override val gunzip: js.UndefOr[Boolean | force] = js.undefined
  /**
    * The number of milliseconds to wait while reading data before aborting handling of the response.
    * 
    * @default 0
    */
  /* InferMemberOverrides */
  override val timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    agent: Agent | typingsJapgolly.node.httpsMod.Agent | `false` = null,
    agents: Agents = null,
    baseUrl: String = null,
    beforeRedirect: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ Record[String, String], /* redirectOptions */ typingsJapgolly.hapiWreck.mod.Client.request.Options, /* next */ js.Function0[Unit]) => Callback = null,
    ciphers: String = null,
    events: js.UndefOr[Boolean] = js.undefined,
    gunzip: Boolean | force = null,
    headers: Record[String, String] = null,
    json: Boolean | strict | force = null,
    maxBytes: Int | Double = null,
    payload: Payload = null,
    redirect303: js.UndefOr[Boolean] = js.undefined,
    redirectMethod: String = null,
    redirected: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Callback = null,
    redirects: Double | `false` = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureProtocol: String = null,
    socketPath: String = null,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (agents != null) __obj.updateDynamic("agents")(agents.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(js.Any.fromFunction6((t0: /* redirectMethod */ java.lang.String, t1: /* statusCode */ scala.Double, t2: /* location */ java.lang.String, t3: /* resHeaders */ typingsJapgolly.std.Record[java.lang.String, java.lang.String], t4: /* redirectOptions */ typingsJapgolly.hapiWreck.mod.Client.request.Options, t5: /* next */ js.Function0[scala.Unit]) => beforeRedirect(t0, t1, t2, t3, t4, t5).runNow()))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (gunzip != null) __obj.updateDynamic("gunzip")(gunzip.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(redirect303)) __obj.updateDynamic("redirect303")(redirect303.asInstanceOf[js.Any])
    if (redirectMethod != null) __obj.updateDynamic("redirectMethod")(redirectMethod.asInstanceOf[js.Any])
    if (redirected != null) __obj.updateDynamic("redirected")(js.Any.fromFunction3((t0: /* statusCode */ scala.Double, t1: /* location */ java.lang.String, t2: /* req */ typingsJapgolly.node.httpMod.ClientRequest) => redirected(t0, t1, t2).runNow()))
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

