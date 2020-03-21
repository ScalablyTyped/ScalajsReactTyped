package typingsJapgolly.followRedirects.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappableRequest extends js.Object {
  var abort: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var flushHeaders: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var getHeader: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var setNoDelay: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var setSocketKeepAlive: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var setTimeout: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  def removeHeader(args: js.Any*): js.Any
  def setHeader(args: js.Any*): js.Any
}

object WrappableRequest {
  @scala.inline
  def apply(
    removeHeader: /* repeated */ js.Any => CallbackTo[js.Any],
    setHeader: /* repeated */ js.Any => CallbackTo[js.Any],
    abort: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    flushHeaders: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    getHeader: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    setNoDelay: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    setSocketKeepAlive: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    setTimeout: /* repeated */ js.Any => CallbackTo[js.Any] = null
  ): WrappableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeHeader")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => removeHeader(t0).runNow()))
    __obj.updateDynamic("setHeader")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => setHeader(t0).runNow()))
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => abort(t0).runNow()))
    if (flushHeaders != null) __obj.updateDynamic("flushHeaders")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => flushHeaders(t0).runNow()))
    if (getHeader != null) __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getHeader(t0).runNow()))
    if (setNoDelay != null) __obj.updateDynamic("setNoDelay")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => setNoDelay(t0).runNow()))
    if (setSocketKeepAlive != null) __obj.updateDynamic("setSocketKeepAlive")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => setSocketKeepAlive(t0).runNow()))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => setTimeout(t0).runNow()))
    __obj.asInstanceOf[WrappableRequest]
  }
}

