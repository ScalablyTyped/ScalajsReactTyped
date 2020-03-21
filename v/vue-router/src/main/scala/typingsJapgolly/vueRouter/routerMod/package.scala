package typingsJapgolly.vueRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type Component = (typingsJapgolly.vue.optionsMod.ComponentOptions[
    typingsJapgolly.vue.vueMod.Vue, 
    typingsJapgolly.vue.optionsMod.DefaultData[typingsJapgolly.vue.vueMod.Vue], 
    typingsJapgolly.vue.optionsMod.DefaultMethods[typingsJapgolly.vue.vueMod.Vue], 
    typingsJapgolly.vue.optionsMod.DefaultComputed, 
    typingsJapgolly.vue.optionsMod.PropsDefinition[typingsJapgolly.vue.optionsMod.DefaultProps], 
    typingsJapgolly.vue.optionsMod.DefaultProps
  ]) | typingsJapgolly.vue.vueMod.VueConstructor[typingsJapgolly.vue.vueMod.Vue] | (typingsJapgolly.vue.optionsMod.AsyncComponent[
    typingsJapgolly.vue.optionsMod.DefaultData[scala.Nothing], 
    typingsJapgolly.vue.optionsMod.DefaultMethods[scala.Nothing], 
    typingsJapgolly.vue.optionsMod.DefaultComputed, 
    typingsJapgolly.vue.optionsMod.DefaultProps
  ])
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorHandler = js.Function1[/* err */ js.Error, scala.Unit]
  type NavigationGuard[V /* <: typingsJapgolly.vue.vueMod.Vue */] = js.Function3[
    /* to */ typingsJapgolly.vueRouter.routerMod.Route, 
    /* from */ typingsJapgolly.vueRouter.routerMod.Route, 
    /* next */ js.Function1[
      /* to */ js.UndefOr[
        typingsJapgolly.vueRouter.routerMod.RawLocation | typingsJapgolly.vueRouter.vueRouterBooleans.`false` | (js.Function1[/* vm */ V, js.Any]) | scala.Unit
      ], 
      scala.Unit
    ], 
    js.Any
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vueRouter.routerMod.Position
    - typingsJapgolly.vueRouter.AnonOffset
    - scala.Unit
  */
  type PositionResult = typingsJapgolly.vueRouter.routerMod._PositionResult | scala.Unit
  type RawLocation = java.lang.String | typingsJapgolly.vueRouter.routerMod.Location
  type RedirectOption = typingsJapgolly.vueRouter.routerMod.RawLocation | (js.Function1[
    /* to */ typingsJapgolly.vueRouter.routerMod.Route, 
    typingsJapgolly.vueRouter.routerMod.RawLocation
  ])
  type RoutePropsFunction = js.Function1[/* route */ typingsJapgolly.vueRouter.routerMod.Route, js.Object]
}
