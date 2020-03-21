package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.CustomServeOptions
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/custom/serve", JSImport.Namespace)
@js.native
object customServeMod extends js.Object {
  @js.native
  class CustomServeRunner protected () extends ServeRunner[CustomServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
  
}

