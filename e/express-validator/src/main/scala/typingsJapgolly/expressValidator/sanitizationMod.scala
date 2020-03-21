package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.baseMod.CustomSanitizer
import typingsJapgolly.expressValidator.baseMod.Meta
import typingsJapgolly.expressValidator.baseMod.StandardSanitizer
import typingsJapgolly.expressValidator.contextItemMod.ContextItem
import typingsJapgolly.expressValidator.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/sanitization", JSImport.Namespace)
@js.native
object sanitizationMod extends js.Object {
  @js.native
  class Sanitization protected () extends ContextItem {
    def this(sanitizer: CustomSanitizer | StandardSanitizer, custom: Boolean) = this()
    def this(sanitizer: CustomSanitizer | StandardSanitizer, custom: Boolean, options: js.Array[_]) = this()
    val custom: js.Any = js.native
    val options: js.Any = js.native
    val sanitizer: js.Any = js.native
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
  }
  
}

