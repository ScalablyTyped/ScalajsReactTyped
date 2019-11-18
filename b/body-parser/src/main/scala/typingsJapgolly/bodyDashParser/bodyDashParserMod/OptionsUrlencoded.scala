package typingsJapgolly.bodyDashParser.bodyDashParserMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsUrlencoded extends Options {
  var extended: js.UndefOr[Boolean] = js.undefined
  var parameterLimit: js.UndefOr[Double] = js.undefined
}

object OptionsUrlencoded {
  @scala.inline
  def apply(
    extended: js.UndefOr[Boolean] = js.undefined,
    inflate: js.UndefOr[Boolean] = js.undefined,
    limit: Double | String = null,
    parameterLimit: Int | Double = null,
    `type`: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _]) = null,
    verify: (/* req */ IncomingMessage, /* res */ ServerResponse, /* buf */ Buffer, /* encoding */ String) => Callback = null
  ): OptionsUrlencoded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended.asInstanceOf[js.Any])
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (parameterLimit != null) __obj.updateDynamic("parameterLimit")(parameterLimit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4((t0: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* res */ typingsJapgolly.node.httpMod.ServerResponse, t2: /* buf */ typingsJapgolly.node.Buffer, t3: /* encoding */ java.lang.String) => verify(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[OptionsUrlencoded]
  }
}

