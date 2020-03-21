package typingsJapgolly.feathersjsExpress

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.feathersjsFeathers.mod.Application
import typingsJapgolly.feathersjsFeathers.mod.Id
import typingsJapgolly.feathersjsFeathers.mod.NullableId
import typingsJapgolly.feathersjsFeathers.mod.Paginated
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
trait PartialServiceMethodsanyS extends js.Object {
  var create: js.UndefOr[js.Function1[/* data */ Partial[_], js.Promise[_ | js.Array[_]]]] = js.undefined
  var find: js.UndefOr[js.Function0[js.Promise[_ | js.Array[_] | Paginated[_]]]] = js.undefined
  var get: js.UndefOr[js.Function1[/* id */ Id, js.Promise[_]]] = js.undefined
  var patch: js.UndefOr[js.Function2[/* id */ NullableId, /* data */ Partial[_], js.Promise[_]]] = js.undefined
  var remove: js.UndefOr[js.Function1[/* id */ NullableId, js.Promise[_]]] = js.undefined
  var setup: js.UndefOr[js.Function2[/* app */ Application[_], /* path */ String, Unit]] = js.undefined
  var update: js.UndefOr[js.Function2[/* id */ NullableId, /* data */ js.Any, js.Promise[_]]] = js.undefined
}

object PartialServiceMethodsanyS {
  @scala.inline
  def apply(
    create: /* data */ Partial[js.Any] => CallbackTo[js.Promise[js.Any | js.Array[js.Any]]] = null,
    find: js.UndefOr[CallbackTo[js.Promise[js.Any | js.Array[js.Any] | Paginated[js.Any]]]] = js.undefined,
    get: /* id */ Id => CallbackTo[js.Promise[js.Any]] = null,
    patch: (/* id */ NullableId, /* data */ Partial[js.Any]) => CallbackTo[js.Promise[js.Any]] = null,
    remove: /* id */ NullableId => CallbackTo[js.Promise[js.Any]] = null,
    setup: (/* app */ Application[js.Any], /* path */ String) => Callback = null,
    update: (/* id */ NullableId, /* data */ js.Any) => CallbackTo[js.Promise[js.Any]] = null
  ): PartialServiceMethodsanyS = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.std.Partial[js.Any]) => create(t0).runNow()))
    find.foreach(p => __obj.updateDynamic("find")(p.toJsFn))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* id */ typingsJapgolly.feathersjsFeathers.mod.Id) => get(t0).runNow()))
    if (patch != null) __obj.updateDynamic("patch")(js.Any.fromFunction2((t0: /* id */ typingsJapgolly.feathersjsFeathers.mod.NullableId, t1: /* data */ typingsJapgolly.std.Partial[js.Any]) => patch(t0, t1).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* id */ typingsJapgolly.feathersjsFeathers.mod.NullableId) => remove(t0).runNow()))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction2((t0: /* app */ typingsJapgolly.feathersjsFeathers.mod.Application[js.Any], t1: /* path */ java.lang.String) => setup(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* id */ typingsJapgolly.feathersjsFeathers.mod.NullableId, t1: /* data */ js.Any) => update(t0, t1).runNow()))
    __obj.asInstanceOf[PartialServiceMethodsanyS]
  }
}

