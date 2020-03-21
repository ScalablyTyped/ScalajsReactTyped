package typingsJapgolly.nextReduxWrapper.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var deserializeState: js.UndefOr[js.Function1[/* any */ js.Any, _]] = js.undefined
  var overrideIsServer: js.UndefOr[Boolean] = js.undefined
  var serializeState: js.UndefOr[js.Function1[/* any */ js.Any, _]] = js.undefined
  var storeKey: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    deserializeState: /* any */ js.Any => CallbackTo[js.Any] = null,
    overrideIsServer: js.UndefOr[Boolean] = js.undefined,
    serializeState: /* any */ js.Any => CallbackTo[js.Any] = null,
    storeKey: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (deserializeState != null) __obj.updateDynamic("deserializeState")(js.Any.fromFunction1((t0: /* any */ js.Any) => deserializeState(t0).runNow()))
    if (!js.isUndefined(overrideIsServer)) __obj.updateDynamic("overrideIsServer")(overrideIsServer.asInstanceOf[js.Any])
    if (serializeState != null) __obj.updateDynamic("serializeState")(js.Any.fromFunction1((t0: /* any */ js.Any) => serializeState(t0).runNow()))
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

