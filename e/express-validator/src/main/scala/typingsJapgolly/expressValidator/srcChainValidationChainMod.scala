package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.srcBaseMod.Request
import typingsJapgolly.expressValidator.srcChainContextHandlerMod.ContextHandler
import typingsJapgolly.expressValidator.srcChainContextRunnerMod.ContextRunner
import typingsJapgolly.expressValidator.srcChainSanitizersMod.Sanitizers
import typingsJapgolly.expressValidator.srcChainValidatorsMod.Validators
import typingsJapgolly.expressValidator.srcContextBuilderMod.ContextBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainValidationChainMod {
  
  @js.native
  trait ValidationChain
    extends StObject
       with Validators[ValidationChain]
       with Sanitizers[ValidationChain]
       with ContextHandler[ValidationChain]
       with ContextRunner {
    
    def apply(req: Request, res: Any, next: js.Function1[/* error */ js.UndefOr[Any], Unit]): Unit = js.native
    
    var builder: ContextBuilder = js.native
  }
}
