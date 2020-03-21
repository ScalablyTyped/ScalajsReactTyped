package typingsJapgolly.vueTheMask.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.vue.optionsMod.Component
import typingsJapgolly.vue.optionsMod.DefaultComputed
import typingsJapgolly.vue.optionsMod.DefaultData
import typingsJapgolly.vue.optionsMod.DefaultMethods
import typingsJapgolly.vue.optionsMod.DefaultProps
import typingsJapgolly.vue.optionsMod.DirectiveBinding
import typingsJapgolly.vue.optionsMod.DirectiveFunction
import typingsJapgolly.vue.pluginMod.PluginObject
import typingsJapgolly.vue.vnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTheMaskPlugin
  extends PluginObject[js.UndefOr[scala.Nothing]] {
  var TheMask: Component[
    DefaultData[scala.Nothing], 
    DefaultMethods[scala.Nothing], 
    DefaultComputed, 
    DefaultProps
  ] = js.native
  @JSName("mask")
  var mask_Original: DirectiveFunction = js.native
  def mask(el: HTMLElement, binding: DirectiveBinding, vnode: VNode, oldVnode: VNode): Unit = js.native
}

@JSImport("vue-the-mask", "VueTheMaskPlugin")
@js.native
object VueTheMaskPlugin extends js.Object {
  type VueStatic = js.Function0[Unit]
}

