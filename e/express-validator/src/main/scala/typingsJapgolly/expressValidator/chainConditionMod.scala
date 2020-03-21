package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.baseMod.Meta
import typingsJapgolly.expressValidator.contextItemMod.ContextItem
import typingsJapgolly.expressValidator.contextMod.Context
import typingsJapgolly.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/chain-condition", JSImport.Namespace)
@js.native
object chainConditionMod extends js.Object {
  @js.native
  class ChainCondition protected () extends ContextItem {
    def this(chain: ValidationChain) = this()
    val chain: js.Any = js.native
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
  }
  
}

