package typingsJapgolly.jupyterlabStatusbar.mod

import typingsJapgolly.jupyterlabStatusbar.kernelStatusMod.KernelStatus.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar", "KernelStatus")
@js.native
class KernelStatus protected ()
  extends typingsJapgolly.jupyterlabStatusbar.defaultsMod.KernelStatus {
  /**
    * Construct the kernel status widget.
    */
  def this(opts: IOptions) = this()
}

@JSImport("@jupyterlab/statusbar", "KernelStatus")
@js.native
object KernelStatus extends js.Object {
  /**
    * A VDomModel for the kernel status indicator.
    */
  @js.native
  class Model ()
    extends typingsJapgolly.jupyterlabStatusbar.kernelStatusMod.KernelStatus.Model
  
}

