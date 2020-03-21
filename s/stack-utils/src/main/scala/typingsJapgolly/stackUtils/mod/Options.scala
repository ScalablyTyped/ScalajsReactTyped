package typingsJapgolly.stackUtils.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var internals: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  var wrapCallSite: js.UndefOr[js.Function1[/* callSite */ CallSite, CallSite]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: String = null,
    internals: js.Array[js.RegExp] = null,
    wrapCallSite: /* callSite */ CallSite => CallbackTo[CallSite] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (internals != null) __obj.updateDynamic("internals")(internals.asInstanceOf[js.Any])
    if (wrapCallSite != null) __obj.updateDynamic("wrapCallSite")(js.Any.fromFunction1((t0: /* callSite */ typingsJapgolly.stackUtils.mod.CallSite) => wrapCallSite(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

