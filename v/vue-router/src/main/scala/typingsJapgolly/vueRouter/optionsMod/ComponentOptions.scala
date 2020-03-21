package typingsJapgolly.vueRouter.optionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vueRouter.mod.default
import typingsJapgolly.vueRouter.routerMod.NavigationGuard
import typingsJapgolly.vueRouter.routerMod.RawLocation
import typingsJapgolly.vueRouter.routerMod.Route
import typingsJapgolly.vueRouter.vueRouterBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var beforeRouteEnter: js.UndefOr[NavigationGuard[V]] = js.undefined
  var beforeRouteLeave: js.UndefOr[NavigationGuard[V]] = js.undefined
  var beforeRouteUpdate: js.UndefOr[NavigationGuard[V]] = js.undefined
  var router: js.UndefOr[default] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: Vue */](
    beforeRouteEnter: (/* to */ Route, /* from */ Route, /* next */ js.Function1[
      /* to */ js.UndefOr[RawLocation | `false` | (js.Function1[V, js.Any]) | Unit], 
      Unit
    ]) => CallbackTo[js.Any] = null,
    beforeRouteLeave: (/* to */ Route, /* from */ Route, /* next */ js.Function1[
      /* to */ js.UndefOr[RawLocation | `false` | (js.Function1[V, js.Any]) | Unit], 
      Unit
    ]) => CallbackTo[js.Any] = null,
    beforeRouteUpdate: (/* to */ Route, /* from */ Route, /* next */ js.Function1[
      /* to */ js.UndefOr[RawLocation | `false` | (js.Function1[V, js.Any]) | Unit], 
      Unit
    ]) => CallbackTo[js.Any] = null,
    router: default = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (beforeRouteEnter != null) __obj.updateDynamic("beforeRouteEnter")(js.Any.fromFunction3((t0: /* to */ typingsJapgolly.vueRouter.routerMod.Route, t1: /* from */ typingsJapgolly.vueRouter.routerMod.Route, t2: /* next */ js.Function1[
  /* to */ js.UndefOr[
    typingsJapgolly.vueRouter.routerMod.RawLocation | typingsJapgolly.vueRouter.vueRouterBooleans.`false` | (js.Function1[V, js.Any]) | scala.Unit
  ], 
  scala.Unit]) => beforeRouteEnter(t0, t1, t2).runNow()))
    if (beforeRouteLeave != null) __obj.updateDynamic("beforeRouteLeave")(js.Any.fromFunction3((t0: /* to */ typingsJapgolly.vueRouter.routerMod.Route, t1: /* from */ typingsJapgolly.vueRouter.routerMod.Route, t2: /* next */ js.Function1[
  /* to */ js.UndefOr[
    typingsJapgolly.vueRouter.routerMod.RawLocation | typingsJapgolly.vueRouter.vueRouterBooleans.`false` | (js.Function1[V, js.Any]) | scala.Unit
  ], 
  scala.Unit]) => beforeRouteLeave(t0, t1, t2).runNow()))
    if (beforeRouteUpdate != null) __obj.updateDynamic("beforeRouteUpdate")(js.Any.fromFunction3((t0: /* to */ typingsJapgolly.vueRouter.routerMod.Route, t1: /* from */ typingsJapgolly.vueRouter.routerMod.Route, t2: /* next */ js.Function1[
  /* to */ js.UndefOr[
    typingsJapgolly.vueRouter.routerMod.RawLocation | typingsJapgolly.vueRouter.vueRouterBooleans.`false` | (js.Function1[V, js.Any]) | scala.Unit
  ], 
  scala.Unit]) => beforeRouteUpdate(t0, t1, t2).runNow()))
    if (router != null) __obj.updateDynamic("router")(router.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

