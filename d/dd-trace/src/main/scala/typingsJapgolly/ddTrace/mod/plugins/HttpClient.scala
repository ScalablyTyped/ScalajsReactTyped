package typingsJapgolly.ddTrace.mod.plugins

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ddTrace.Anon0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait HttpClient extends Http_ {
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[Anon0] = js.undefined
  /**
    * Use the remote endpoint host as the service name instead of the default.
    *
    * @default false
    */
  var splitByDomain: js.UndefOr[Boolean] = js.undefined
}

object HttpClient {
  @scala.inline
  def apply(
    analytics: Boolean | Double = null,
    blacklist: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])]) = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[String] = null,
    hooks: Anon0 = null,
    service: String = null,
    splitByDomain: js.UndefOr[Boolean] = js.undefined,
    validateStatus: /* code */ Double => CallbackTo[Boolean] = null,
    whitelist: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])]) = null
  ): HttpClient = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (!js.isUndefined(splitByDomain)) __obj.updateDynamic("splitByDomain")(splitByDomain.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1((t0: /* code */ scala.Double) => validateStatus(t0).runNow()))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpClient]
  }
}

