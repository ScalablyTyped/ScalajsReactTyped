package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.baseMod.Request
import typingsJapgolly.expressValidator.contextBuilderMod.ContextBuilder
import typingsJapgolly.expressValidator.contextHandlerMod.ContextHandler
import typingsJapgolly.expressValidator.contextRunnerMod.ContextRunner
import typingsJapgolly.expressValidator.sanitizersMod.Sanitizers
import typingsJapgolly.expressValidator.validatorsMod.Validators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/validation-chain", JSImport.Namespace)
@js.native
object validationChainMod extends js.Object {
  @js.native
  trait ValidationChain
    extends Validators[ValidationChain]
       with Sanitizers[ValidationChain]
       with ContextHandler[ValidationChain]
       with ContextRunner {
    var builder: ContextBuilder = js.native
    def apply(req: Request, res: js.Any, next: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  
}

