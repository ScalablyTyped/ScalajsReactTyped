package typingsJapgolly.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vueMod {
  type CombinedVueInstance[Instance /* <: typingsJapgolly.vue.vueMod.Vue */, Data, Methods, Computed, Props] = Data with Methods with Computed with Props with Instance
  type ExtendedVue[Instance /* <: typingsJapgolly.vue.vueMod.Vue */, Data, Methods, Computed, Props] = typingsJapgolly.vue.vueMod.VueConstructor[
    (typingsJapgolly.vue.vueMod.CombinedVueInstance[Instance, Data, Methods, Computed, Props]) with typingsJapgolly.vue.vueMod.Vue
  ]
}
