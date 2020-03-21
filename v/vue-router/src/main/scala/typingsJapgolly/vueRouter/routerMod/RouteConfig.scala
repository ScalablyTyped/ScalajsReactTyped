package typingsJapgolly.vueRouter.routerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vueRouter.vueRouterBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfig extends js.Object {
  var alias: js.UndefOr[String | js.Array[String]] = js.undefined
  var beforeEnter: js.UndefOr[NavigationGuard[Vue]] = js.undefined
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  var component: js.UndefOr[Component] = js.undefined
  var components: js.UndefOr[Dictionary[Component]] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: String
  var pathToRegexpOptions: js.UndefOr[PathToRegexpOptions] = js.undefined
  var props: js.UndefOr[Boolean | js.Object | RoutePropsFunction] = js.undefined
  var redirect: js.UndefOr[RedirectOption] = js.undefined
}

object RouteConfig {
  @scala.inline
  def apply(
    path: String,
    alias: String | js.Array[String] = null,
    beforeEnter: (/* to */ Route, /* from */ Route, /* next */ js.Function1[
      /* to */ js.UndefOr[RawLocation | `false` | (js.Function1[Vue, js.Any]) | Unit], 
      Unit
    ]) => CallbackTo[js.Any] = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[RouteConfig] = null,
    component: Component = null,
    components: Dictionary[Component] = null,
    meta: js.Any = null,
    name: String = null,
    pathToRegexpOptions: PathToRegexpOptions = null,
    props: Boolean | js.Object | RoutePropsFunction = null,
    redirect: RedirectOption = null
  ): RouteConfig = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (beforeEnter != null) __obj.updateDynamic("beforeEnter")(js.Any.fromFunction3((t0: /* to */ typingsJapgolly.vueRouter.routerMod.Route, t1: /* from */ typingsJapgolly.vueRouter.routerMod.Route, t2: /* next */ js.Function1[
  /* to */ js.UndefOr[
    typingsJapgolly.vueRouter.routerMod.RawLocation | typingsJapgolly.vueRouter.vueRouterBooleans.`false` | (js.Function1[typingsJapgolly.vue.vueMod.Vue, js.Any]) | scala.Unit
  ], 
  scala.Unit]) => beforeEnter(t0, t1, t2).runNow()))
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pathToRegexpOptions != null) __obj.updateDynamic("pathToRegexpOptions")(pathToRegexpOptions.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfig]
  }
}

