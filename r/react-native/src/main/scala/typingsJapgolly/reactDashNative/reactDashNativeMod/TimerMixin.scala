package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDashNative.Fn_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerMixin extends js.Object {
  var cancelAnimationFrame: js.Function1[/* handle */ Double, Unit]
  var clearImmediate: js.Function1[/* handle */ Double, Unit]
  var clearInterval: js.Function1[/* handle */ Double, Unit]
  var clearTimeout: js.Function1[/* handle */ Double, Unit]
  var requestAnimationFrame: js.Function1[/* callback */ js.Function1[/* time */ Double, Unit], Double]
  var setImmediate: js.Function1[/* handler */ js.Function1[/* repeated */ js.Any, Unit], Double]
  var setInterval: Fn_Args
  var setTimeout: Fn_Args
}

object TimerMixin {
  @scala.inline
  def apply(
    cancelAnimationFrame: /* handle */ Double => Callback,
    clearImmediate: /* handle */ Double => Callback,
    clearInterval: /* handle */ Double => Callback,
    clearTimeout: /* handle */ Double => Callback,
    requestAnimationFrame: /* callback */ js.Function1[/* time */ Double, Unit] => CallbackTo[Double],
    setImmediate: /* handler */ js.Function1[/* repeated */ js.Any, Unit] => CallbackTo[Double],
    setInterval: Fn_Args,
    setTimeout: Fn_Args
  ): TimerMixin = {
    val __obj = js.Dynamic.literal(setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
    __obj.updateDynamic("cancelAnimationFrame")(js.Any.fromFunction1((t0: /* handle */ scala.Double) => cancelAnimationFrame(t0).runNow()))
    __obj.updateDynamic("clearImmediate")(js.Any.fromFunction1((t0: /* handle */ scala.Double) => clearImmediate(t0).runNow()))
    __obj.updateDynamic("clearInterval")(js.Any.fromFunction1((t0: /* handle */ scala.Double) => clearInterval(t0).runNow()))
    __obj.updateDynamic("clearTimeout")(js.Any.fromFunction1((t0: /* handle */ scala.Double) => clearTimeout(t0).runNow()))
    __obj.updateDynamic("requestAnimationFrame")(js.Any.fromFunction1((t0: /* callback */ js.Function1[/* time */ scala.Double, scala.Unit]) => requestAnimationFrame(t0).runNow()))
    __obj.updateDynamic("setImmediate")(js.Any.fromFunction1((t0: /* handler */ js.Function1[/* repeated */ js.Any, scala.Unit]) => setImmediate(t0).runNow()))
    __obj.asInstanceOf[TimerMixin]
  }
}

