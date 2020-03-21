package typingsJapgolly.nano.mod

import typingsJapgolly.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var cookie: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[js.Function2[/* id */ String, /* args */ js.Any, Unit]] = js.undefined
  var parseUrl: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[js.Function1[/* params */ js.Any, Unit]] = js.undefined
  var requestDefaults: js.UndefOr[CoreOptions] = js.undefined
  var url: String
}

object Configuration {
  @scala.inline
  def apply(
    url: String,
    cookie: String = null,
    log: (/* id */ String, /* args */ js.Any) => japgolly.scalajs.react.Callback = null,
    parseUrl: js.UndefOr[Boolean] = js.undefined,
    request: /* params */ js.Any => japgolly.scalajs.react.Callback = null,
    requestDefaults: CoreOptions = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* args */ js.Any) => log(t0, t1).runNow()))
    if (!js.isUndefined(parseUrl)) __obj.updateDynamic("parseUrl")(parseUrl.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1((t0: /* params */ js.Any) => request(t0).runNow()))
    if (requestDefaults != null) __obj.updateDynamic("requestDefaults")(requestDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

