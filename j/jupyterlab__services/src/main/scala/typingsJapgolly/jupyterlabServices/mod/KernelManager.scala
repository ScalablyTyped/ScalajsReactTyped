package typingsJapgolly.jupyterlabServices.mod

import typingsJapgolly.jupyterlabServices.managerMod.KernelManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "KernelManager")
@js.native
/**
  * Construct a new kernel manager.
  *
  * @param options - The default options for kernel.
  */
class KernelManager ()
  extends typingsJapgolly.jupyterlabServices.kernelMod.KernelManager {
  def this(options: IOptions) = this()
}

