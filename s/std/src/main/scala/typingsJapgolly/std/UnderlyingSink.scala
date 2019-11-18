package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderlyingSink[W] extends js.Object {
  var abort: js.UndefOr[WritableStreamErrorCallback] = js.undefined
  var close: js.UndefOr[WritableStreamDefaultControllerCloseCallback] = js.undefined
  var start: js.UndefOr[WritableStreamDefaultControllerStartCallback] = js.undefined
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
  var write: js.UndefOr[WritableStreamDefaultControllerWriteCallback[W]] = js.undefined
}

object UnderlyingSink {
  @scala.inline
  def apply[W](
    abort: /* reason */ js.Any => CallbackTo[Unit | js.Thenable[Unit]] = null,
    close: js.UndefOr[CallbackTo[Unit | js.Thenable[Unit]]] = js.undefined,
    start: /* controller */ WritableStreamDefaultController => CallbackTo[Unit | js.Thenable[Unit]] = null,
    `type`: js.UndefOr[scala.Nothing] = js.undefined,
    write: (W, /* controller */ WritableStreamDefaultController) => CallbackTo[Unit | js.Thenable[Unit]] = null
  ): UnderlyingSink[W] = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1((t0: /* reason */ js.Any) => abort(t0).runNow()))
    close.foreach(p => __obj.updateDynamic("close")(p.toJsFn))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* controller */ typingsJapgolly.std.WritableStreamDefaultController) => start(t0).runNow()))
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction2((t0: W, t1: /* controller */ typingsJapgolly.std.WritableStreamDefaultController) => write(t0, t1).runNow()))
    __obj.asInstanceOf[UnderlyingSink[W]]
  }
}

