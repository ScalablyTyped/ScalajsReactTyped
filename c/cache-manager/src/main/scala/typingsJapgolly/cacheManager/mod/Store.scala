package typingsJapgolly.cacheManager.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  var del: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var keys: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var mget: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var mset: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var reset: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var setex: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var ttl: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  // These functions will just be bound to the Cache object if they exist so args can be anything
  def get[T](args: js.Any*): js.Promise[_]
  def set[T](args: js.Any*): js.Promise[_]
}

object Store {
  @scala.inline
  def apply(
    get: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]],
    set: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]],
    del: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    keys: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    mget: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    mset: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    reset: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    setex: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    ttl: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null
  ): Store = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => set(t0).runNow()))
    if (del != null) __obj.updateDynamic("del")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => del(t0).runNow()))
    if (keys != null) __obj.updateDynamic("keys")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => keys(t0).runNow()))
    if (mget != null) __obj.updateDynamic("mget")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => mget(t0).runNow()))
    if (mset != null) __obj.updateDynamic("mset")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => mset(t0).runNow()))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => reset(t0).runNow()))
    if (setex != null) __obj.updateDynamic("setex")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => setex(t0).runNow()))
    if (ttl != null) __obj.updateDynamic("ttl")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => ttl(t0).runNow()))
    __obj.asInstanceOf[Store]
  }
}

