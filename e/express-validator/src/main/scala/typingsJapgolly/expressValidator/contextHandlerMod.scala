package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.baseMod.CustomValidator
import typingsJapgolly.expressValidator.contextMod.Optional
import typingsJapgolly.expressValidator.expressValidatorBooleans.`true`
import typingsJapgolly.expressValidator.validationChainMod.ValidationChain
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/context-handler", JSImport.Namespace)
@js.native
object contextHandlerMod extends js.Object {
  @js.native
  trait ContextHandler[Chain] extends js.Object {
    def bail(): Chain = js.native
    def `if`(condition: CustomValidator): Chain = js.native
    def `if`(condition: ValidationChain): Chain = js.native
    def optional(): Chain = js.native
    def optional(options: Partial[Optional]): Chain = js.native
    @JSName("optional")
    def optional_true(options: `true`): Chain = js.native
  }
  
}

