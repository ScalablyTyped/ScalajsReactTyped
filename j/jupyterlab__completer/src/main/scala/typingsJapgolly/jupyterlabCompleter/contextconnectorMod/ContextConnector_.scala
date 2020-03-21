package typingsJapgolly.jupyterlabCompleter.contextconnectorMod

import typingsJapgolly.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions
import typingsJapgolly.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsJapgolly.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsJapgolly.jupyterlabCoreutils.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/contextconnector", "ContextConnector")
@js.native
class ContextConnector_ protected () extends DataConnector[IReply, Unit, IRequest] {
  /**
    * Create a new context connector for completion requests.
    *
    * @param options - The instatiation options for the context connector.
    */
  def this(options: IOptions) = this()
  var _editor: js.Any = js.native
}

