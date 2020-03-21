package typingsJapgolly.vueClassComponent

import typingsJapgolly.vue.optionsMod.ComponentOptions
import typingsJapgolly.vue.optionsMod.DefaultComputed
import typingsJapgolly.vue.optionsMod.DefaultData
import typingsJapgolly.vue.optionsMod.DefaultMethods
import typingsJapgolly.vue.optionsMod.DefaultProps
import typingsJapgolly.vue.optionsMod.PropsDefinition
import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vueClassComponent.declarationsMod.VueClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component/lib/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @JSName("$internalHooks")
  val internalHooks: js.Array[String] = js.native
  def componentFactory(Component: VueClass[Vue]): VueClass[Vue] = js.native
  def componentFactory(
    Component: VueClass[Vue],
    options: ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): VueClass[Vue] = js.native
}

