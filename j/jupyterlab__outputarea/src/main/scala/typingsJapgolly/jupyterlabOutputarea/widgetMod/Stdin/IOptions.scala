package typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin

import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.IShellFuture
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IShellMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options to create a stdin widget.
  */
trait IOptions extends js.Object {
  /**
    * The kernel future associated with the request.
    */
  var future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]]
  /**
    * Whether the input is a password.
    */
  var password: Boolean
  /**
    * The prompt text.
    */
  var prompt: String
}

object IOptions {
  @scala.inline
  def apply(
    future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]],
    password: Boolean,
    prompt: String
  ): IOptions = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

