package typingsJapgolly.wreck.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.wreck.AnonHttp
import typingsJapgolly.wreck.wreckBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var agent: js.UndefOr[AnonHttp | `false`] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var beforeRedirect: js.UndefOr[
    js.Function6[
      /* redirectMethod */ String, 
      /* statusCode */ Double, 
      /* location */ String, 
      /* resHeaders */ StringDictionary[js.Any], 
      /* redirectOptions */ js.Any, 
      /* next */ js.Function0[js.Object], 
      Unit
    ]
  ] = js.undefined
  var ciphers: js.UndefOr[String] = js.undefined
  var downstreamRes: js.UndefOr[js.Any] = js.undefined
  var events: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var maxBytes: js.UndefOr[Double] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var redirect303: js.UndefOr[Boolean] = js.undefined
  var redirected: js.UndefOr[
    js.Function3[/* statusCode */ Double, /* location */ String, /* req */ ClientRequest, Unit]
  ] = js.undefined
  var redirects: js.UndefOr[Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  var secureProtocol: js.UndefOr[String] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    agent: AnonHttp | `false` = null,
    baseUrl: String = null,
    beforeRedirect: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ StringDictionary[js.Any], /* redirectOptions */ js.Any, /* next */ js.Function0[js.Object]) => Callback = null,
    ciphers: String = null,
    downstreamRes: js.Any = null,
    events: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[js.Any] = null,
    maxBytes: Int | Double = null,
    payload: js.Any = null,
    redirect303: js.UndefOr[Boolean] = js.undefined,
    redirected: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Callback = null,
    redirects: Int | Double = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureProtocol: String = null,
    socketPath: String = null,
    timeout: Int | Double = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(js.Any.fromFunction6((t0: /* redirectMethod */ java.lang.String, t1: /* statusCode */ scala.Double, t2: /* location */ java.lang.String, t3: /* resHeaders */ org.scalablytyped.runtime.StringDictionary[js.Any], t4: /* redirectOptions */ js.Any, t5: /* next */ js.Function0[js.Object]) => beforeRedirect(t0, t1, t2, t3, t4, t5).runNow()))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (downstreamRes != null) __obj.updateDynamic("downstreamRes")(downstreamRes.asInstanceOf[js.Any])
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(redirect303)) __obj.updateDynamic("redirect303")(redirect303.asInstanceOf[js.Any])
    if (redirected != null) __obj.updateDynamic("redirected")(js.Any.fromFunction3((t0: /* statusCode */ scala.Double, t1: /* location */ java.lang.String, t2: /* req */ typingsJapgolly.node.httpMod.ClientRequest) => redirected(t0, t1, t2).runNow()))
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

