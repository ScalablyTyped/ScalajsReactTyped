package typingsJapgolly.cancan.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var createError: js.UndefOr[js.Function0[_]] = js.undefined
  var instanceOf: js.UndefOr[js.Function2[/* instance */ js.Any, /* model */ js.Any, Boolean]] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    createError: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    instanceOf: (/* instance */ js.Any, /* model */ js.Any) => CallbackTo[Boolean] = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    createError.foreach(p => __obj.updateDynamic("createError")(p.toJsFn))
    if (instanceOf != null) __obj.updateDynamic("instanceOf")(js.Any.fromFunction2((t0: /* instance */ js.Any, t1: /* model */ js.Any) => instanceOf(t0, t1).runNow()))
    __obj.asInstanceOf[Option]
  }
}

