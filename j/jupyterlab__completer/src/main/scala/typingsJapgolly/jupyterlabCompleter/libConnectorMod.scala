package typingsJapgolly.jupyterlabCompleter

import typingsJapgolly.jupyterlabCompleter.libConnectorMod.CompletionConnector.IOptions
import typingsJapgolly.jupyterlabCompleter.libHandlerMod.CompletionHandler.IReply
import typingsJapgolly.jupyterlabCompleter.libHandlerMod.CompletionHandler.IRequest
import typingsJapgolly.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectorMod {
  
  @JSImport("@jupyterlab/completer/lib/connector", "CompletionConnector")
  @js.native
  open class CompletionConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instantiation options for the connector.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _kernel: Any = js.native
  }
  object CompletionConnector {
    
    /**
      * The instantiation options for cell completion handlers.
      */
    trait IOptions
      extends StObject
         with typingsJapgolly.jupyterlabCompleter.libKernelconnectorMod.KernelConnector.IOptions
         with typingsJapgolly.jupyterlabCompleter.libContextconnectorMod.ContextConnector.IOptions
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal(editor = null, session = null)
        __obj.asInstanceOf[IOptions]
      }
    }
  }
}
