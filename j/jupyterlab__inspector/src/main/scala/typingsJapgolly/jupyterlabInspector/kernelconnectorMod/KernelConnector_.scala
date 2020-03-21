package typingsJapgolly.jupyterlabInspector.kernelconnectorMod

import typingsJapgolly.jupyterlabCoreutils.dataconnectorMod.DataConnector
import typingsJapgolly.jupyterlabInspector.handlerMod.InspectionHandler.IReply
import typingsJapgolly.jupyterlabInspector.handlerMod.InspectionHandler.IRequest
import typingsJapgolly.jupyterlabInspector.kernelconnectorMod.KernelConnector.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector/lib/kernelconnector", "KernelConnector")
@js.native
class KernelConnector_ protected () extends DataConnector[IReply, Unit, IRequest] {
  /**
    * Create a new kernel connector for inspection requests.
    *
    * @param options - The instatiation options for the kernel connector.
    */
  def this(options: IOptions) = this()
  var _session: js.Any = js.native
}

