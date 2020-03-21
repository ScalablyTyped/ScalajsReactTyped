package typingsJapgolly.vueRouter.routerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var fallback: js.UndefOr[Boolean] = js.undefined
  var linkActiveClass: js.UndefOr[String] = js.undefined
  var linkExactActiveClass: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[RouterMode] = js.undefined
  var parseQuery: js.UndefOr[js.Function1[/* query */ String, js.Object]] = js.undefined
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  var scrollBehavior: js.UndefOr[
    js.Function3[
      /* to */ Route, 
      /* from */ Route, 
      /* savedPosition */ Position | Unit, 
      js.UndefOr[PositionResult | js.Promise[PositionResult] | Null]
    ]
  ] = js.undefined
  var stringifyQuery: js.UndefOr[js.Function1[/* query */ js.Object, String]] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    base: String = null,
    fallback: js.UndefOr[Boolean] = js.undefined,
    linkActiveClass: String = null,
    linkExactActiveClass: String = null,
    mode: RouterMode = null,
    parseQuery: /* query */ String => CallbackTo[js.Object] = null,
    routes: js.Array[RouteConfig] = null,
    scrollBehavior: (/* to */ Route, /* from */ Route, /* savedPosition */ Position | Unit) => CallbackTo[js.UndefOr[PositionResult | js.Promise[PositionResult] | Null]] = null,
    stringifyQuery: /* query */ js.Object => CallbackTo[String] = null
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (linkActiveClass != null) __obj.updateDynamic("linkActiveClass")(linkActiveClass.asInstanceOf[js.Any])
    if (linkExactActiveClass != null) __obj.updateDynamic("linkExactActiveClass")(linkExactActiveClass.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (parseQuery != null) __obj.updateDynamic("parseQuery")(js.Any.fromFunction1((t0: /* query */ java.lang.String) => parseQuery(t0).runNow()))
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (scrollBehavior != null) __obj.updateDynamic("scrollBehavior")(js.Any.fromFunction3((t0: /* to */ typingsJapgolly.vueRouter.routerMod.Route, t1: /* from */ typingsJapgolly.vueRouter.routerMod.Route, t2: /* savedPosition */ typingsJapgolly.vueRouter.routerMod.Position | scala.Unit) => scrollBehavior(t0, t1, t2).runNow()))
    if (stringifyQuery != null) __obj.updateDynamic("stringifyQuery")(js.Any.fromFunction1((t0: /* query */ js.Object) => stringifyQuery(t0).runNow()))
    __obj.asInstanceOf[RouterOptions]
  }
}

