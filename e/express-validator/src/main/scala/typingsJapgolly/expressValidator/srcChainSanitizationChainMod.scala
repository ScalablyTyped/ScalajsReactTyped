package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.srcBaseMod.Request
import typingsJapgolly.expressValidator.srcChainContextRunnerMod.ContextRunner
import typingsJapgolly.expressValidator.srcChainSanitizersMod.Sanitizers
import typingsJapgolly.expressValidator.srcContextBuilderMod.ContextBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainSanitizationChainMod {
  
  @js.native
  trait SanitizationChain
    extends StObject
       with Sanitizers[SanitizationChain]
       with ContextRunner {
    
    def apply(req: Request, res: Any, next: js.Function1[/* errors */ js.UndefOr[Any], Unit]): Unit = js.native
    
    var builder: ContextBuilder = js.native
  }
}
