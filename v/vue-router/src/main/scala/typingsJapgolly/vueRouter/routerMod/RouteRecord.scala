package typingsJapgolly.vueRouter.routerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteRecord extends js.Object {
  var beforeEnter: js.UndefOr[
    js.Function3[
      /* route */ Route, 
      /* redirect */ js.Function1[/* location */ RawLocation, Unit], 
      /* next */ js.Function0[Unit], 
      _
    ]
  ] = js.undefined
  var components: Dictionary[Component]
  var instances: Dictionary[Vue]
  var matchAs: js.UndefOr[String] = js.undefined
  var meta: js.Any
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[RouteRecord] = js.undefined
  var path: String
  var props: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction])
  var redirect: js.UndefOr[RedirectOption] = js.undefined
  var regex: js.RegExp
}

object RouteRecord {
  @scala.inline
  def apply(
    components: Dictionary[Component],
    instances: Dictionary[Vue],
    meta: js.Any,
    path: String,
    props: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction]),
    regex: js.RegExp,
    beforeEnter: (/* route */ Route, /* redirect */ js.Function1[/* location */ RawLocation, Unit], /* next */ js.Function0[Unit]) => CallbackTo[js.Any] = null,
    matchAs: String = null,
    name: String = null,
    parent: RouteRecord = null,
    redirect: RedirectOption = null
  ): RouteRecord = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    if (beforeEnter != null) __obj.updateDynamic("beforeEnter")(js.Any.fromFunction3((t0: /* route */ typingsJapgolly.vueRouter.routerMod.Route, t1: /* redirect */ js.Function1[/* location */ typingsJapgolly.vueRouter.routerMod.RawLocation, scala.Unit], t2: /* next */ js.Function0[scala.Unit]) => beforeEnter(t0, t1, t2).runNow()))
    if (matchAs != null) __obj.updateDynamic("matchAs")(matchAs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecord]
  }
}

