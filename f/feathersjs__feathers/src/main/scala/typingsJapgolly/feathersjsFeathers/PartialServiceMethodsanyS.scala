package typingsJapgolly.feathersjsFeathers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.feathersjsFeathers.mod.Application
import typingsJapgolly.feathersjsFeathers.mod.Id
import typingsJapgolly.feathersjsFeathers.mod.NullableId
import typingsJapgolly.feathersjsFeathers.mod.Paginated
import typingsJapgolly.feathersjsFeathers.mod.Params
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
trait PartialServiceMethodsanyS extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* data */ Partial[_] | js.Array[Partial[_]], 
      /* params */ js.UndefOr[Params], 
      js.Promise[_ | js.Array[_]]
    ]
  ] = js.undefined
  var find: js.UndefOr[
    js.Function1[/* params */ js.UndefOr[Params], js.Promise[_ | js.Array[_] | Paginated[_]]]
  ] = js.undefined
  var get: js.UndefOr[js.Function2[/* id */ Id, /* params */ js.UndefOr[Params], js.Promise[_]]] = js.undefined
  var patch: js.UndefOr[
    js.Function3[
      /* id */ NullableId, 
      /* data */ Partial[_], 
      /* params */ js.UndefOr[Params], 
      js.Promise[_]
    ]
  ] = js.undefined
  var remove: js.UndefOr[
    js.Function2[/* id */ NullableId, /* params */ js.UndefOr[Params], js.Promise[_]]
  ] = js.undefined
  var setup: js.UndefOr[js.Function2[/* app */ Application[_], /* path */ String, Unit]] = js.undefined
  var update: js.UndefOr[
    js.Function3[/* id */ NullableId, /* data */ js.Any, /* params */ js.UndefOr[Params], js.Promise[_]]
  ] = js.undefined
}

object PartialServiceMethodsanyS {
  @scala.inline
  def apply(
    create: (/* data */ Partial[js.Any] | js.Array[Partial[js.Any]], /* params */ js.UndefOr[Params]) => CallbackTo[js.Promise[js.Any | js.Array[js.Any]]] = null,
    find: /* params */ js.UndefOr[Params] => CallbackTo[js.Promise[js.Any | js.Array[js.Any] | Paginated[js.Any]]] = null,
    get: (/* id */ Id, /* params */ js.UndefOr[Params]) => CallbackTo[js.Promise[js.Any]] = null,
    patch: (/* id */ NullableId, /* data */ Partial[js.Any], /* params */ js.UndefOr[Params]) => CallbackTo[js.Promise[js.Any]] = null,
    remove: (/* id */ NullableId, /* params */ js.UndefOr[Params]) => CallbackTo[js.Promise[js.Any]] = null,
    setup: (/* app */ Application[js.Any], /* path */ String) => Callback = null,
    update: (/* id */ NullableId, /* data */ js.Any, /* params */ js.UndefOr[Params]) => CallbackTo[js.Promise[js.Any]] = null
  ): PartialServiceMethodsanyS = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.std.Partial[js.Any] | js.Array[typingsJapgolly.std.Partial[js.Any]], t1: /* params */ js.UndefOr[typingsJapgolly.feathersjsFeathers.mod.Params]) => create(t0, t1).runNow()))
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.feathersjsFeathers.mod.Params]) => find(t0).runNow()))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction2((t0: /* id */ typingsJapgolly.feathersjsFeathers.mod.Id, t1: /* params */ js.UndefOr[typingsJapgolly.feathersjsFeathers.mod.Params]) => get(t0, t1).runNow()))
    if (patch != null) __obj.updateDynamic("patch")(js.Any.fromFunction3((t0: /* id */ typingsJapgolly.feathersjsFeathers.mod.NullableId, t1: /* data */ typingsJapgolly.std.Partial[js.Any], t2: /* params */ js.UndefOr[typingsJapgolly.feathersjsFeathers.mod.Params]) => patch(t0, t1, t2).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* id */ typingsJapgolly.feathersjsFeathers.mod.NullableId, t1: /* params */ js.UndefOr[typingsJapgolly.feathersjsFeathers.mod.Params]) => remove(t0, t1).runNow()))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction2((t0: /* app */ typingsJapgolly.feathersjsFeathers.mod.Application[js.Any], t1: /* path */ java.lang.String) => setup(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3((t0: /* id */ typingsJapgolly.feathersjsFeathers.mod.NullableId, t1: /* data */ js.Any, t2: /* params */ js.UndefOr[typingsJapgolly.feathersjsFeathers.mod.Params]) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[PartialServiceMethodsanyS]
  }
}

