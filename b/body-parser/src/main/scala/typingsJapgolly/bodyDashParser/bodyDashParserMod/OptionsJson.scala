package typingsJapgolly.bodyDashParser.bodyDashParserMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsJson extends Options {
  var reviver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object OptionsJson {
  @scala.inline
  def apply(
    inflate: js.UndefOr[Boolean] = js.undefined,
    limit: Double | String = null,
    reviver: (/* key */ String, /* value */ js.Any) => CallbackTo[js.Any] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    `type`: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _]) = null,
    verify: (/* req */ IncomingMessage, /* res */ ServerResponse, /* buf */ Buffer, /* encoding */ String) => Callback = null
  ): OptionsJson = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (reviver != null) __obj.updateDynamic("reviver")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ js.Any) => reviver(t0, t1).runNow()))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4((t0: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* res */ typingsJapgolly.node.httpMod.ServerResponse, t2: /* buf */ typingsJapgolly.node.Buffer, t3: /* encoding */ java.lang.String) => verify(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[OptionsJson]
  }
}

