package typingsJapgolly.jupyterlabCompleter

import typingsJapgolly.jupyterlabCompleter.libHandlerMod.CompletionHandler.IReply
import typingsJapgolly.jupyterlabCompleter.libHandlerMod.CompletionHandler.IRequest
import typingsJapgolly.jupyterlabCompleter.libKernelconnectorMod.KernelConnector.IOptions
import typingsJapgolly.jupyterlabServices.libSessionSessionMod.ISessionConnection
import typingsJapgolly.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelconnectorMod {
  
  @JSImport("@jupyterlab/completer/lib/kernelconnector", "KernelConnector")
  @js.native
  open class KernelConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new kernel connector for completion requests.
      *
      * @param options - The instantiation options for the kernel connector.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _session: Any = js.native
  }
  object KernelConnector {
    
    /**
      * The instantiation options for cell completion handlers.
      */
    trait IOptions extends StObject {
      
      /**
        * The session used by the kernel connector.
        */
      var session: ISessionConnection | Null
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal(session = null)
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setSession(value: ISessionConnection): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        inline def setSessionNull: Self = StObject.set(x, "session", null)
      }
    }
  }
}
