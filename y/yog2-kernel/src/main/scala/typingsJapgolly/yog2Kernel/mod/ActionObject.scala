package typingsJapgolly.yog2Kernel.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject
  extends /* key */ StringDictionary[js.Any] {
  var copy: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var del: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var delete: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var get: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var head: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var link: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var lock: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var options: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var patch: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var post: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var propfind: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var purge: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var put: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var unlick: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var unlock: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var view: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
}

object ActionObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    copy: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    del: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    delete: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    get: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    head: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    link: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    lock: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    options: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    patch: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    post: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    propfind: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    purge: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    put: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    unlick: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    unlock: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    view: (/* req */ typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null
  ): ActionObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => copy(t0, t1, t2).runNow()))
    if (del != null) __obj.updateDynamic("del")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => del(t0, t1, t2).runNow()))
    if (delete != null) __obj.updateDynamic("delete")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => delete(t0, t1, t2).runNow()))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => get(t0, t1, t2).runNow()))
    if (head != null) __obj.updateDynamic("head")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => head(t0, t1, t2).runNow()))
    if (link != null) __obj.updateDynamic("link")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => link(t0, t1, t2).runNow()))
    if (lock != null) __obj.updateDynamic("lock")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => lock(t0, t1, t2).runNow()))
    if (options != null) __obj.updateDynamic("options")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => options(t0, t1, t2).runNow()))
    if (patch != null) __obj.updateDynamic("patch")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => patch(t0, t1, t2).runNow()))
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => post(t0, t1, t2).runNow()))
    if (propfind != null) __obj.updateDynamic("propfind")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => propfind(t0, t1, t2).runNow()))
    if (purge != null) __obj.updateDynamic("purge")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => purge(t0, t1, t2).runNow()))
    if (put != null) __obj.updateDynamic("put")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => put(t0, t1, t2).runNow()))
    if (unlick != null) __obj.updateDynamic("unlick")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => unlick(t0, t1, t2).runNow()))
    if (unlock != null) __obj.updateDynamic("unlock")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => unlock(t0, t1, t2).runNow()))
    if (view != null) __obj.updateDynamic("view")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => view(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ActionObject]
  }
}

