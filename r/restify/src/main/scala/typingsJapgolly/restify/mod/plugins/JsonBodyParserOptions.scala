package typingsJapgolly.restify.mod.plugins

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonBodyParserOptions extends js.Object {
  var bodyReader: js.UndefOr[Boolean] = js.undefined
  var mapParams: js.UndefOr[Boolean] = js.undefined
  var overrideParams: js.UndefOr[Boolean] = js.undefined
  var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.undefined
}

object JsonBodyParserOptions {
  @scala.inline
  def apply(
    bodyReader: js.UndefOr[Boolean] = js.undefined,
    mapParams: js.UndefOr[Boolean] = js.undefined,
    overrideParams: js.UndefOr[Boolean] = js.undefined,
    reviver: (/* key */ js.Any, /* value */ js.Any) => CallbackTo[js.Any] = null
  ): JsonBodyParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bodyReader)) __obj.updateDynamic("bodyReader")(bodyReader.asInstanceOf[js.Any])
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams.asInstanceOf[js.Any])
    if (reviver != null) __obj.updateDynamic("reviver")(js.Any.fromFunction2((t0: /* key */ js.Any, t1: /* value */ js.Any) => reviver(t0, t1).runNow()))
    __obj.asInstanceOf[JsonBodyParserOptions]
  }
}

