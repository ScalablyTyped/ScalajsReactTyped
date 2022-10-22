package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.srcChainContextHandlerMod.ContextHandler
import typingsJapgolly.expressValidator.srcContextBuilderMod.ContextBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainContextHandlerImplMod {
  
  @JSImport("express-validator/src/chain/context-handler-impl", "ContextHandlerImpl")
  @js.native
  open class ContextHandlerImpl[Chain] protected ()
    extends StObject
       with ContextHandler[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
    
    /* private */ val builder: Any = js.native
    
    /* private */ val chain: Any = js.native
  }
}
