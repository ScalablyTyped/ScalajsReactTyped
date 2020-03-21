package typingsJapgolly.resourcejs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpMethodOptions extends js.Object {
  var after: js.UndefOr[HttpHandler] = js.undefined
  var before: js.UndefOr[HttpHandler] = js.undefined
}

object HttpMethodOptions {
  @scala.inline
  def apply(
    after: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    before: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null
  ): HttpMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => after(t0, t1, t2).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => before(t0, t1, t2).runNow()))
    __obj.asInstanceOf[HttpMethodOptions]
  }
}

