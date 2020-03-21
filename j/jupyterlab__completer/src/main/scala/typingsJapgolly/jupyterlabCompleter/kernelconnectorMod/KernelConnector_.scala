package typingsJapgolly.jupyterlabCompleter.kernelconnectorMod

import typingsJapgolly.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsJapgolly.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsJapgolly.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions
import typingsJapgolly.jupyterlabCoreutils.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/kernelconnector", "KernelConnector")
@js.native
class KernelConnector_ protected () extends DataConnector[IReply, Unit, IRequest] {
  /**
    * Create a new kernel connector for completion requests.
    *
    * @param options - The instatiation options for the kernel connector.
    */
  def this(options: IOptions) = this()
  var _session: js.Any = js.native
}

