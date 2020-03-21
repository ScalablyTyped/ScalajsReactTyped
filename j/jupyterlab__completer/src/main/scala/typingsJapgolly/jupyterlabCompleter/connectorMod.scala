package typingsJapgolly.jupyterlabCompleter

import typingsJapgolly.jupyterlabCompleter.connectorMod.CompletionConnector.IOptions
import typingsJapgolly.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsJapgolly.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsJapgolly.jupyterlabCoreutils.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/connector", JSImport.Namespace)
@js.native
object connectorMod extends js.Object {
  @js.native
  class CompletionConnector protected () extends DataConnector[IReply, Unit, IRequest] {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instatiation options for the connector.
      */
    def this(options: IOptions) = this()
    var _context: js.Any = js.native
    var _kernel: js.Any = js.native
  }
  
  @js.native
  object CompletionConnector extends js.Object {
    /**
      * The instantiation options for cell completion handlers.
      */
    type IOptions = typingsJapgolly.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions with typingsJapgolly.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions
  }
  
}

