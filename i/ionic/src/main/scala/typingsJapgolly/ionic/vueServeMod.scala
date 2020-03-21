package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.VueServeOptions
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/vue/serve", JSImport.Namespace)
@js.native
object vueServeMod extends js.Object {
  @js.native
  class VueServeRunner protected () extends ServeRunner[VueServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
  
}

