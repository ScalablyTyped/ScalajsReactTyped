package typingsJapgolly.oktaOktaVue.mod

import typingsJapgolly.oktaOktaVue.mod.OktaVuePlugin.OktaVueOptions
import typingsJapgolly.vue.pluginMod.PluginFunction
import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@okta/okta-vue", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): PluginFunction[VueConstructor[Vue]] = js.native
  def handleCallback(): VueConstructor[Vue] = js.native
  def install(vm: VueConstructor[Vue], options: OktaVueOptions): PluginFunction[VueConstructor[Vue]] = js.native
}

