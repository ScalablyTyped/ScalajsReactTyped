package typingsJapgolly.httpGracefulShutdown.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var development: js.UndefOr[Boolean] = js.undefined
  var `finally`: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShutdown: js.UndefOr[js.Function1[/* signal */ String, js.Promise[Unit]]] = js.undefined
  var signals: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    development: js.UndefOr[Boolean] = js.undefined,
    `finally`: js.UndefOr[Callback] = js.undefined,
    onShutdown: /* signal */ String => CallbackTo[js.Promise[Unit]] = null,
    signals: String = null,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(development)) __obj.updateDynamic("development")(development.asInstanceOf[js.Any])
    `finally`.foreach(p => __obj.updateDynamic("finally")(p.toJsFn))
    if (onShutdown != null) __obj.updateDynamic("onShutdown")(js.Any.fromFunction1((t0: /* signal */ java.lang.String) => onShutdown(t0).runNow()))
    if (signals != null) __obj.updateDynamic("signals")(signals.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

