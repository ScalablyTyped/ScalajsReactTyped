package typingsJapgolly.vue

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  @js.native
  trait PluginObject[T]
    extends /* key */ StringDictionary[js.Any] {
    @JSName("install")
    var install_Original: PluginFunction[T] = js.native
    def install(Vue: VueConstructor[Vue]): Unit = js.native
    def install(Vue: VueConstructor[Vue], options: T): Unit = js.native
  }
  
  type PluginFunction[T] = js.Function2[/* Vue */ VueConstructor[Vue], /* options */ js.UndefOr[T], Unit]
}

