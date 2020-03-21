package typingsJapgolly.resourcejs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualOptions extends HttpMethodOptions {
  var path: js.UndefOr[String] = js.undefined
}

object VirtualOptions {
  @scala.inline
  def apply(
    after: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    before: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    path: String = null
  ): VirtualOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => after(t0, t1, t2).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => before(t0, t1, t2).runNow()))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualOptions]
  }
}

