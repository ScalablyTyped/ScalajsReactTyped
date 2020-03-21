package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvocation extends js.Object {
  var caller: js.UndefOr[Double] = js.undefined
  var procedure: String
  var progress: js.UndefOr[js.Function2[/* args */ js.Array[_], /* kwargs */ js.Any, Unit]] = js.undefined
}

object IInvocation {
  @scala.inline
  def apply(
    procedure: String,
    caller: Int | Double = null,
    progress: (/* args */ js.Array[js.Any], /* kwargs */ js.Any) => Callback = null
  ): IInvocation = {
    val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
    if (caller != null) __obj.updateDynamic("caller")(caller.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2((t0: /* args */ js.Array[js.Any], t1: /* kwargs */ js.Any) => progress(t0, t1).runNow()))
    __obj.asInstanceOf[IInvocation]
  }
}

