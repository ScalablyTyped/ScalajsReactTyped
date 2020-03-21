package typingsJapgolly.jupyterlabServices.kernelKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Kernel {
  type IControlFuture[REQUEST /* <: typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IControlMessage[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType] */, REPLY /* <: typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IControlMessage[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType] */] = typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.IFuture[REQUEST, REPLY]
  type IShellFuture[REQUEST /* <: typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IShellMessage[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType] */, REPLY /* <: typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IShellMessage[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType] */] = typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.IFuture[REQUEST, REPLY]
}
