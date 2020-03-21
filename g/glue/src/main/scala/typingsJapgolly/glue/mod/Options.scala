package typingsJapgolly.glue.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.hapi.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var preConnections: js.UndefOr[
    js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.undefined
  var preRegister: js.UndefOr[
    js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.undefined
  var relativeTo: String
}

object Options {
  @scala.inline
  def apply(
    relativeTo: String,
    preConnections: (/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit]) => Callback = null,
    preRegister: (/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit]) => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
    if (preConnections != null) __obj.updateDynamic("preConnections")(js.Any.fromFunction2((t0: /* Server */ typingsJapgolly.hapi.mod.Server, t1: /* next */ js.Function1[/* err */ js.Any, scala.Unit]) => preConnections(t0, t1).runNow()))
    if (preRegister != null) __obj.updateDynamic("preRegister")(js.Any.fromFunction2((t0: /* Server */ typingsJapgolly.hapi.mod.Server, t1: /* next */ js.Function1[/* err */ js.Any, scala.Unit]) => preRegister(t0, t1).runNow()))
    __obj.asInstanceOf[Options]
  }
}

