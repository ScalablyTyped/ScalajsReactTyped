package typingsJapgolly.vueClickaway

import typingsJapgolly.vue.optionsMod.ComponentOptions
import typingsJapgolly.vue.optionsMod.DefaultComputed
import typingsJapgolly.vue.optionsMod.DefaultData
import typingsJapgolly.vue.optionsMod.DefaultMethods
import typingsJapgolly.vue.optionsMod.DefaultProps
import typingsJapgolly.vue.optionsMod.DirectiveOptions
import typingsJapgolly.vue.optionsMod.PropsDefinition
import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-clickaway", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val directive: DirectiveOptions = js.native
  val mixin: (ComponentOptions[
    Vue, 
    DefaultData[Vue], 
    DefaultMethods[Vue], 
    DefaultComputed, 
    PropsDefinition[DefaultProps], 
    DefaultProps
  ]) | VueConstructor[Vue] = js.native
}

