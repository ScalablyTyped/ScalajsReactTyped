package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.anon.DryRun
import typingsJapgolly.expressValidator.anon.ResultanycontextReadonlyC
import typingsJapgolly.expressValidator.srcBaseMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainContextRunnerMod {
  
  @js.native
  trait ContextRunner extends StObject {
    
    def run(req: Request): js.Promise[ResultanycontextReadonlyC] = js.native
    def run(req: Request, options: DryRun): js.Promise[ResultanycontextReadonlyC] = js.native
  }
}
