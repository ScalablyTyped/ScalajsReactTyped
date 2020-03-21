package typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel

import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommCloseMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommMsgMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IShellMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client side Comm interface.
  */
@js.native
trait IComm extends IDisposable {
  /**
    * The unique id for the comm channel.
    */
  val commId: String = js.native
  /**
    * The target name for the comm channel.
    */
  val targetName: String = js.native
  /**
    * Close the comm.
    *
    * @param data - The data to send to the server on opening.
    *
    * @param metadata - Additional metatada for the message.
    *
    * @returns A future for the generated message.
    *
    * #### Notes
    * This will send a `comm_close` message to the kernel, and call the
    * `onClose` callback if set.
    *
    * This is a no-op if the comm is already closed.
    */
  def close(): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  def close(data: JSONValue): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  def close(data: JSONValue, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  def close(
    data: JSONValue,
    metadata: JSONObject,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ]
  ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  /**
    * Callback for a comm close event.
    *
    * #### Notes
    * This is called when the comm is closed from either the server or client.
    * If this is called in response to a kernel message and the handler returns
    * a promise, all kernel message processing pauses until the promise is
    * resolved.
    */
  def onClose(msg: ICommCloseMsg[iopub | shell]): Unit | js.Thenable[Unit] = js.native
  /**
    * Callback for a comm message received event.
    *
    * #### Notes
    * If the handler returns a promise, all kernel message processing pauses
    * until the promise is resolved.
    */
  def onMsg(msg: ICommMsgMsg[iopub | shell]): Unit | js.Thenable[Unit] = js.native
  /**
    * Open a comm with optional data and metadata.
    *
    * @param data - The data to send to the server on opening.
    *
    * @param metadata - Additional metatada for the message.
    *
    * @returns A future for the generated message.
    *
    * #### Notes
    * This sends a `comm_open` message to the server.
    */
  def open(): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  def open(data: JSONValue): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  def open(data: JSONValue, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  def open(
    data: JSONValue,
    metadata: JSONObject,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ]
  ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  /**
    * Send a `comm_msg` message to the kernel.
    *
    * @param data - The data to send to the server on opening.
    *
    * @param metadata - Additional metatada for the message.
    *
    * @param buffers - Optional buffer data.
    *
    * @param disposeOnDone - Whether to dispose of the future when done.
    *
    * @returns A future for the generated message.
    *
    * #### Notes
    * This is a no-op if the comm has been closed.
    */
  def send(data: JSONValue): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  def send(data: JSONValue, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  def send(
    data: JSONValue,
    metadata: JSONObject,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ]
  ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  def send(
    data: JSONValue,
    metadata: JSONObject,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ],
    disposeOnDone: Boolean
  ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
}

