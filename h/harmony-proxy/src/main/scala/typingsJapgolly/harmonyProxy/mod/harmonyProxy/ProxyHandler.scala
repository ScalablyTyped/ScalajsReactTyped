package typingsJapgolly.harmonyProxy.mod.harmonyProxy

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyHandler[T] extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _]
  ] = js.undefined
  var construct: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _]
  ] = js.undefined
  var defineProperty: js.UndefOr[
    js.Function3[/* target */ T, /* p */ PropertyKey, /* attributes */ js.PropertyDescriptor, Boolean]
  ] = js.undefined
  var deleteProperty: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, Boolean]] = js.undefined
  var enumerate: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.undefined
  var get: js.UndefOr[js.Function3[/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any, _]] = js.undefined
  var getOwnPropertyDescriptor: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, js.PropertyDescriptor]] = js.undefined
  var getPrototypeOf: js.UndefOr[js.Function1[/* target */ T, _]] = js.undefined
  var has: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, Boolean]] = js.undefined
  var isExtensible: js.UndefOr[js.Function1[/* target */ T, Boolean]] = js.undefined
  var ownKeys: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.undefined
  var preventExtensions: js.UndefOr[js.Function1[/* target */ T, Boolean]] = js.undefined
  var set: js.UndefOr[
    js.Function4[/* target */ T, /* p */ PropertyKey, /* value */ js.Any, /* receiver */ js.Any, Boolean]
  ] = js.undefined
  var setPrototypeOf: js.UndefOr[js.Function2[/* target */ T, /* v */ js.Any, Boolean]] = js.undefined
}

object ProxyHandler {
  @scala.inline
  def apply[T](
    apply: (/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    construct: (/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    defineProperty: (/* target */ T, /* p */ PropertyKey, /* attributes */ js.PropertyDescriptor) => CallbackTo[Boolean] = null,
    deleteProperty: (/* target */ T, /* p */ PropertyKey) => CallbackTo[Boolean] = null,
    enumerate: /* target */ T => CallbackTo[js.Array[PropertyKey]] = null,
    get: (/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any) => CallbackTo[js.Any] = null,
    getOwnPropertyDescriptor: (/* target */ T, /* p */ PropertyKey) => CallbackTo[js.PropertyDescriptor] = null,
    getPrototypeOf: /* target */ T => CallbackTo[js.Any] = null,
    has: (/* target */ T, /* p */ PropertyKey) => CallbackTo[Boolean] = null,
    isExtensible: /* target */ T => CallbackTo[Boolean] = null,
    ownKeys: /* target */ T => CallbackTo[js.Array[PropertyKey]] = null,
    preventExtensions: /* target */ T => CallbackTo[Boolean] = null,
    set: (/* target */ T, /* p */ PropertyKey, /* value */ js.Any, /* receiver */ js.Any) => CallbackTo[Boolean] = null,
    setPrototypeOf: (/* target */ T, /* v */ js.Any) => CallbackTo[Boolean] = null
  ): ProxyHandler[T] = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction3((t0: /* target */ T, t1: /* thisArg */ js.Any, t2: /* argArray */ js.UndefOr[js.Any]) => apply(t0, t1, t2).runNow()))
    if (construct != null) __obj.updateDynamic("construct")(js.Any.fromFunction3((t0: /* target */ T, t1: /* thisArg */ js.Any, t2: /* argArray */ js.UndefOr[js.Any]) => construct(t0, t1, t2).runNow()))
    if (defineProperty != null) __obj.updateDynamic("defineProperty")(js.Any.fromFunction3((t0: /* target */ T, t1: /* p */ typingsJapgolly.harmonyProxy.mod.harmonyProxy.PropertyKey, t2: /* attributes */ js.PropertyDescriptor) => defineProperty(t0, t1, t2).runNow()))
    if (deleteProperty != null) __obj.updateDynamic("deleteProperty")(js.Any.fromFunction2((t0: /* target */ T, t1: /* p */ typingsJapgolly.harmonyProxy.mod.harmonyProxy.PropertyKey) => deleteProperty(t0, t1).runNow()))
    if (enumerate != null) __obj.updateDynamic("enumerate")(js.Any.fromFunction1((t0: /* target */ T) => enumerate(t0).runNow()))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction3((t0: /* target */ T, t1: /* p */ typingsJapgolly.harmonyProxy.mod.harmonyProxy.PropertyKey, t2: /* receiver */ js.Any) => get(t0, t1, t2).runNow()))
    if (getOwnPropertyDescriptor != null) __obj.updateDynamic("getOwnPropertyDescriptor")(js.Any.fromFunction2((t0: /* target */ T, t1: /* p */ typingsJapgolly.harmonyProxy.mod.harmonyProxy.PropertyKey) => getOwnPropertyDescriptor(t0, t1).runNow()))
    if (getPrototypeOf != null) __obj.updateDynamic("getPrototypeOf")(js.Any.fromFunction1((t0: /* target */ T) => getPrototypeOf(t0).runNow()))
    if (has != null) __obj.updateDynamic("has")(js.Any.fromFunction2((t0: /* target */ T, t1: /* p */ typingsJapgolly.harmonyProxy.mod.harmonyProxy.PropertyKey) => has(t0, t1).runNow()))
    if (isExtensible != null) __obj.updateDynamic("isExtensible")(js.Any.fromFunction1((t0: /* target */ T) => isExtensible(t0).runNow()))
    if (ownKeys != null) __obj.updateDynamic("ownKeys")(js.Any.fromFunction1((t0: /* target */ T) => ownKeys(t0).runNow()))
    if (preventExtensions != null) __obj.updateDynamic("preventExtensions")(js.Any.fromFunction1((t0: /* target */ T) => preventExtensions(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction4((t0: /* target */ T, t1: /* p */ typingsJapgolly.harmonyProxy.mod.harmonyProxy.PropertyKey, t2: /* value */ js.Any, t3: /* receiver */ js.Any) => set(t0, t1, t2, t3).runNow()))
    if (setPrototypeOf != null) __obj.updateDynamic("setPrototypeOf")(js.Any.fromFunction2((t0: /* target */ T, t1: /* v */ js.Any) => setPrototypeOf(t0, t1).runNow()))
    __obj.asInstanceOf[ProxyHandler[T]]
  }
}

