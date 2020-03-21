package typingsJapgolly.jupyterlabServices

import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.IModel
import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.ISpecModel
import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.ISpecModels
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/validate", JSImport.Namespace)
@js.native
object kernelValidateMod extends js.Object {
  def validateMessage(msg: IMessage[MessageType]): Unit = js.native
  def validateModel(model: IModel): Unit = js.native
  def validateSpecModel(data: js.Any): ISpecModel = js.native
  def validateSpecModels(data: js.Any): ISpecModels = js.native
}

