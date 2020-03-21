package typingsJapgolly.wpapi.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  var delete: js.UndefOr[TransportFunction] = js.undefined
  var get: js.UndefOr[TransportFunction] = js.undefined
  var head: js.UndefOr[TransportFunction] = js.undefined
  var post: js.UndefOr[TransportFunction] = js.undefined
  var put: js.UndefOr[TransportFunction] = js.undefined
}

object Transport {
  @scala.inline
  def apply(
    delete: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => CallbackTo[js.Promise[js.Any]] = null,
    get: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => CallbackTo[js.Promise[js.Any]] = null,
    head: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => CallbackTo[js.Promise[js.Any]] = null,
    post: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => CallbackTo[js.Promise[js.Any]] = null,
    put: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => CallbackTo[js.Promise[js.Any]] = null
  ): Transport = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: /* wpreq */ typingsJapgolly.wpapi.mod.WPRequest, t1: /* cb */ js.UndefOr[typingsJapgolly.wpapi.mod.WPRequestCallback]) => delete(t0, t1).runNow()))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction2((t0: /* wpreq */ typingsJapgolly.wpapi.mod.WPRequest, t1: /* cb */ js.UndefOr[typingsJapgolly.wpapi.mod.WPRequestCallback]) => get(t0, t1).runNow()))
    if (head != null) __obj.updateDynamic("head")(js.Any.fromFunction2((t0: /* wpreq */ typingsJapgolly.wpapi.mod.WPRequest, t1: /* cb */ js.UndefOr[typingsJapgolly.wpapi.mod.WPRequestCallback]) => head(t0, t1).runNow()))
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction2((t0: /* wpreq */ typingsJapgolly.wpapi.mod.WPRequest, t1: /* cb */ js.UndefOr[typingsJapgolly.wpapi.mod.WPRequestCallback]) => post(t0, t1).runNow()))
    if (put != null) __obj.updateDynamic("put")(js.Any.fromFunction2((t0: /* wpreq */ typingsJapgolly.wpapi.mod.WPRequest, t1: /* cb */ js.UndefOr[typingsJapgolly.wpapi.mod.WPRequestCallback]) => put(t0, t1).runNow()))
    __obj.asInstanceOf[Transport]
  }
}

