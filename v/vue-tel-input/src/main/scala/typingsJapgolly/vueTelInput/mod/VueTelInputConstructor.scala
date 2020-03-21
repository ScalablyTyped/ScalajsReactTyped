package typingsJapgolly.vueTelInput.mod

import typingsJapgolly.vue.pluginMod.PluginFunction
import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTelInputConstructor extends VueConstructor[Vue] {
  var computed: VueTelInputComputed = js.native
  var directives: VueTelInputDirective = js.native
  @JSName("install")
  var install_Original: PluginFunction[scala.Nothing] = js.native
  var methods: VueTelInputMethods = js.native
  var props: VueTelInputProps = js.native
  var watch: VueTelInputWatch = js.native
  def data(): VueTelInputData = js.native
  def install(Vue: VueConstructor[Vue]): Unit = js.native
  def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = js.native
}

