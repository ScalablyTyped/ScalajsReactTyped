package typingsJapgolly.wordpressDependencyExtractionWebpackPlugin.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var injectPolyfill: js.UndefOr[Boolean] = js.undefined
  var requestToExternal: js.UndefOr[js.Function1[/* request */ String, String | js.Array[String] | Unit]] = js.undefined
  var requestToHandle: js.UndefOr[js.Function1[/* request */ String, String | Unit]] = js.undefined
  var useDefaults: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    injectPolyfill: js.UndefOr[Boolean] = js.undefined,
    requestToExternal: /* request */ String => CallbackTo[String | js.Array[String] | Unit] = null,
    requestToHandle: /* request */ String => CallbackTo[String | Unit] = null,
    useDefaults: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(injectPolyfill)) __obj.updateDynamic("injectPolyfill")(injectPolyfill.asInstanceOf[js.Any])
    if (requestToExternal != null) __obj.updateDynamic("requestToExternal")(js.Any.fromFunction1((t0: /* request */ java.lang.String) => requestToExternal(t0).runNow()))
    if (requestToHandle != null) __obj.updateDynamic("requestToHandle")(js.Any.fromFunction1((t0: /* request */ java.lang.String) => requestToHandle(t0).runNow()))
    if (!js.isUndefined(useDefaults)) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

