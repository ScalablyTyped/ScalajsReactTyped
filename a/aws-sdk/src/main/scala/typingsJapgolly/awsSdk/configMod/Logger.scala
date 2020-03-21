package typingsJapgolly.awsSdk.configMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var write: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* encoding */ js.UndefOr[String], 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ] = js.native
}

object Logger {
  @scala.inline
  def apply(
    log: /* repeated */ js.Any => Callback = null,
    write: (/* chunk */ js.Any, /* encoding */ js.UndefOr[String], /* callback */ js.UndefOr[js.Function0[Unit]]) => Callback = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction3((t0: /* chunk */ js.Any, t1: /* encoding */ js.UndefOr[java.lang.String], t2: /* callback */ js.UndefOr[js.Function0[scala.Unit]]) => write(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

