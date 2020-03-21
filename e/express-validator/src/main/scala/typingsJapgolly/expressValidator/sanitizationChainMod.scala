package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.baseMod.Request
import typingsJapgolly.expressValidator.contextBuilderMod.ContextBuilder
import typingsJapgolly.expressValidator.contextRunnerMod.ContextRunner
import typingsJapgolly.expressValidator.sanitizersMod.Sanitizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/sanitization-chain", JSImport.Namespace)
@js.native
object sanitizationChainMod extends js.Object {
  @js.native
  trait SanitizationChain
    extends Sanitizers[SanitizationChain]
       with ContextRunner {
    var builder: ContextBuilder = js.native
    def apply(req: Request, res: js.Any, next: js.Function1[/* errors */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  
}

