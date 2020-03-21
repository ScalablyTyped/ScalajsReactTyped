package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.baseMod.Meta
import typingsJapgolly.expressValidator.contextItemMod.ContextItem
import typingsJapgolly.expressValidator.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/bail", JSImport.Namespace)
@js.native
object bailMod extends js.Object {
  @js.native
  class Bail () extends ContextItem {
    def run(context: Context): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
  }
  
}

