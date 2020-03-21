package typingsJapgolly.resourcejs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestOptions extends HttpMethodOptions {
  var afterGet: js.UndefOr[HttpHandler] = js.undefined
  var afterIndex: js.UndefOr[HttpHandler] = js.undefined
  var afterPatch: js.UndefOr[HttpHandler] = js.undefined
  var afterPost: js.UndefOr[HttpHandler] = js.undefined
  var afterPut: js.UndefOr[HttpHandler] = js.undefined
  var beforeGet: js.UndefOr[HttpHandler] = js.undefined
  var beforeIndex: js.UndefOr[HttpHandler] = js.undefined
  var beforePatch: js.UndefOr[HttpHandler] = js.undefined
  var beforePost: js.UndefOr[HttpHandler] = js.undefined
  var beforePut: js.UndefOr[HttpHandler] = js.undefined
}

object RestOptions {
  @scala.inline
  def apply(
    after: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    afterGet: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    afterIndex: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    afterPatch: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    afterPost: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    afterPut: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    before: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    beforeGet: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    beforeIndex: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    beforePatch: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    beforePost: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null,
    beforePut: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Callback = null
  ): RestOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => after(t0, t1, t2).runNow()))
    if (afterGet != null) __obj.updateDynamic("afterGet")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => afterGet(t0, t1, t2).runNow()))
    if (afterIndex != null) __obj.updateDynamic("afterIndex")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => afterIndex(t0, t1, t2).runNow()))
    if (afterPatch != null) __obj.updateDynamic("afterPatch")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => afterPatch(t0, t1, t2).runNow()))
    if (afterPost != null) __obj.updateDynamic("afterPost")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => afterPost(t0, t1, t2).runNow()))
    if (afterPut != null) __obj.updateDynamic("afterPut")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => afterPut(t0, t1, t2).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => before(t0, t1, t2).runNow()))
    if (beforeGet != null) __obj.updateDynamic("beforeGet")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => beforeGet(t0, t1, t2).runNow()))
    if (beforeIndex != null) __obj.updateDynamic("beforeIndex")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => beforeIndex(t0, t1, t2).runNow()))
    if (beforePatch != null) __obj.updateDynamic("beforePatch")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => beforePatch(t0, t1, t2).runNow()))
    if (beforePost != null) __obj.updateDynamic("beforePost")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => beforePost(t0, t1, t2).runNow()))
    if (beforePut != null) __obj.updateDynamic("beforePut")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.resourcejs.mod.Request, t1: /* res */ typingsJapgolly.resourcejs.mod.Response, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => beforePut(t0, t1, t2).runNow()))
    __obj.asInstanceOf[RestOptions]
  }
}

