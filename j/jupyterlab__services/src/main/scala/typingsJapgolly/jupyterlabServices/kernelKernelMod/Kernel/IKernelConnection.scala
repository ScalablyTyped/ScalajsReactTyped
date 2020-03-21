package typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel

import typingsJapgolly.jupyterlabServices.AnonAllowstdin
import typingsJapgolly.jupyterlabServices.AnonArguments
import typingsJapgolly.jupyterlabServices.AnonCode
import typingsJapgolly.jupyterlabServices.AnonCodeString
import typingsJapgolly.jupyterlabServices.AnonCursorpos
import typingsJapgolly.jupyterlabServices.AnonTarget
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommInfoReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommOpenMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICompleteReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IControlMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IDebugReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IDebugRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IHistoryReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IHistoryRequestRange
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IHistoryRequestSearch
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IHistoryRequestTail
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInfoReply
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInfoReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInputReply
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInspectReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IShellMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ReplyContent
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of a Kernel connection that is managed by a session.
  *
  * #### Notes
  * The Kernel object is tied to the lifetime of the Kernel id, which is a
  * unique id for the Kernel session on the server.  The Kernel object manages
  * a websocket connection internally, and will auto-restart if the websocket
  * temporarily loses connection.  Restarting creates a new Kernel process on
  * the server, but preserves the Kernel id.
  */
@js.native
trait IKernelConnection extends IDisposable {
  /**
    * The client unique id.
    *
    * #### Notes
    * This should be unique for a particular kernel connection object.
    */
  val clientId: String = js.native
  /**
    * Whether the kernel connection handles comm messages.
    *
    * #### Notes
    * The comm message protocol currently has implicit assumptions that only
    * one kernel connection is handling comm messages. This option allows a
    * kernel connection to opt out of handling comms.
    *
    * See https://github.com/jupyter/jupyter_client/issues/263
    */
  var handleComms: Boolean = js.native
  /**
    * The id of the server-side kernel.
    */
  val id: String = js.native
  /**
    * The cached kernel info.
    *
    * #### Notes
    * This value will be null until the kernel is ready.
    */
  val info: IInfoReply | Null = js.native
  /**
    * Test whether the kernel is ready.
    *
    * #### Notes
    * A kernel is ready when the communication channel is active and we have
    * cached the kernel info.
    */
  val isReady: Boolean = js.native
  /**
    * The model associated with the kernel.
    */
  val model: IModel = js.native
  /**
    * The name of the server-side kernel.
    */
  val name: String = js.native
  /**
    * A promise that resolves when the kernel is initially ready after a start
    * or restart.
    *
    * #### Notes
    * A kernel is ready when the communication channel is active and we have
    * cached the kernel info.
    */
  val ready: js.Promise[Unit] = js.native
  /**
    * The current status of the kernel.
    */
  val status: Status = js.native
  /**
    * The client username.
    */
  val username: String = js.native
  /**
    * Connect to a comm, or create a new one.
    *
    * @param targetName - The name of the comm target.
    *
    * @param id - The comm id.
    *
    * @returns A comm instance.
    */
  def connectToComm(targetName: String): IComm = js.native
  def connectToComm(targetName: String, commId: String): IComm = js.native
  /**
    * Get the kernel spec.
    *
    * @returns A promise that resolves with the kernel spec for this kernel.
    */
  def getSpec(): js.Promise[ISpecModel] = js.native
  /**
    * Interrupt a kernel.
    *
    * @returns A promise that resolves when the kernel has interrupted.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels).
    *
    * The promise is fulfilled on a valid response and rejected otherwise.
    *
    * It is assumed that the API call does not mutate the kernel id or name.
    *
    * The promise will be rejected if the kernel status is `'dead'` or if the
    * request fails or the response is invalid.
    */
  def interrupt(): js.Promise[Unit] = js.native
  /**
    * Reconnect to a disconnected kernel.
    *
    * @returns A promise that resolves when the kernel has reconnected.
    *
    * #### Notes
    * This just refreshes the connection to an existing kernel, and does not
    * perform an HTTP request to the server or restart the kernel.
    */
  def reconnect(): js.Promise[Unit] = js.native
  /**
    * Register a comm target handler.
    *
    * @param targetName - The name of the comm target.
    *
    * @param callback - The callback invoked for a comm open message.
    *
    * #### Notes
    * Only one comm target can be registered to a target name at a time, an
    * existing callback for the same target name will be overridden.  A registered
    * comm target handler will take precedence over a comm which specifies a
    * `target_module`.
    *
    * If the callback returns a promise, kernel message processing will pause
    * until the returned promise is fulfilled.
    */
  def registerCommTarget(
    targetName: String,
    callback: js.Function2[/* comm */ IComm, /* msg */ ICommOpenMsg[iopub | shell], Unit | js.Thenable[Unit]]
  ): Unit = js.native
  /**
    * Register an IOPub message hook.
    *
    * @param msg_id - The parent_header message id in messages the hook should
    * intercept.
    *
    * @param hook - The callback invoked for the message.
    *
    * #### Notes
    * The IOPub hook system allows you to preempt the handlers for IOPub
    * messages with a given parent_header message id. The most recently
    * registered hook is run first. If a hook return value resolves to false,
    * any later hooks and the future's onIOPub handler will not run. If a hook
    * throws an error, the error is logged to the console and the next hook is
    * run. If a hook is registered during the hook processing, it will not run
    * until the next message. If a hook is disposed during the hook processing,
    * it will be deactivated immediately.
    *
    * See also [[IFuture.registerMessageHook]].
    */
  def registerMessageHook(
    msgId: String,
    hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]
  ): Unit = js.native
  /**
    * Remove a comm target handler.
    *
    * @param targetName - The name of the comm target to remove.
    *
    * @param callback - The callback to remove.
    *
    * #### Notes
    * The comm target is only removed if it matches the callback argument.
    */
  def removeCommTarget(
    targetName: String,
    callback: js.Function2[/* comm */ IComm, /* msg */ ICommOpenMsg[iopub | shell], Unit | js.Thenable[Unit]]
  ): Unit = js.native
  /**
    * Remove an IOPub message hook.
    *
    * @param msg_id - The parent_header message id the hook intercepted.
    *
    * @param hook - The callback invoked for the message.
    *
    */
  def removeMessageHook(
    msgId: String,
    hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]
  ): Unit = js.native
  /**
    * Send a `comm_info_request` message.
    *
    * @param content - The content of the request.
    *
    * @returns A promise that resolves with the response message.
    *
    * #### Notes
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm_info).
    *
    * Fulfills with the `comm_info_reply` content when the shell reply is
    * received and validated.
    */
  def requestCommInfo(content: AnonTarget): js.Promise[ICommInfoReplyMsg] = js.native
  /**
    * Send a `complete_request` message.
    *
    * @param content - The content of the request.
    *
    * @returns A promise that resolves with the response message.
    *
    * #### Notes
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
    *
    * Fulfills with the `complete_reply` content when the shell reply is
    * received and validated.
    */
  def requestComplete(content: AnonCode): js.Promise[ICompleteReplyMsg] = js.native
  /**
    * Send an experimental `debug_request` message.
    *
    * @hidden
    *
    * @param content - The content of the request.
    *
    * @param disposeOnDone - Whether to dispose of the future when done.
    *
    * @returns A kernel future.
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this function is *NOT* considered
    * part of the public API, and may change without notice.
    */
  def requestDebug(content: AnonArguments): IControlFuture[IDebugRequestMsg, IDebugReplyMsg] = js.native
  def requestDebug(content: AnonArguments, disposeOnDone: Boolean): IControlFuture[IDebugRequestMsg, IDebugReplyMsg] = js.native
  /**
    * Send an `execute_request` message.
    *
    * @param content - The content of the request.
    *
    * @param disposeOnDone - Whether to dispose of the future when done.
    *
    * @returns A kernel future.
    *
    * #### Notes
    * See [Messaging in
    * Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execute).
    *
    * This method returns a kernel future, rather than a promise, since execution may
    * have many response messages (for example, many iopub display messages).
    *
    * Future `onReply` is called with the `execute_reply` content when the
    * shell reply is received and validated.
    *
    * **See also:** [[IExecuteReply]]
    */
  def requestExecute(content: AnonAllowstdin): IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
  def requestExecute(content: AnonAllowstdin, disposeOnDone: Boolean): IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
  def requestExecute(content: AnonAllowstdin, disposeOnDone: Boolean, metadata: JSONObject): IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
  /**
    * Send a `history_request` message.
    *
    * @param content - The content of the request.
    *
    * @returns A promise that resolves with the response message.
    *
    * #### Notes
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
    *
    * Fulfills with the `history_reply` content when the shell reply is
    * received and validated.
    */
  def requestHistory(content: IHistoryRequestRange): js.Promise[IHistoryReplyMsg] = js.native
  def requestHistory(content: IHistoryRequestSearch): js.Promise[IHistoryReplyMsg] = js.native
  def requestHistory(content: IHistoryRequestTail): js.Promise[IHistoryReplyMsg] = js.native
  /**
    * Send an `inspect_request` message.
    *
    * @param content - The content of the request.
    *
    * @returns A promise that resolves with the response message.
    *
    * #### Notes
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
    *
    * Fulfills with the `inspect_reply` content when the shell reply is
    * received and validated.
    */
  def requestInspect(content: AnonCursorpos): js.Promise[IInspectReplyMsg] = js.native
  /**
    * Send an `is_complete_request` message.
    *
    * @param content - The content of the request.
    *
    * @returns A promise that resolves with the response message.
    *
    * #### Notes
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-completeness).
    *
    * Fulfills with the `is_complete_response` content when the shell reply is
    * received and validated.
    */
  def requestIsComplete(content: AnonCodeString): js.Promise[IIsCompleteReplyMsg] = js.native
  /**
    * Send a `kernel_info_request` message.
    *
    * @param content - The content of the request.
    *
    * @returns A promise that resolves with the response message.
    *
    * #### Notes
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
    *
    * Fulfills with the `kernel_info_response` content when the shell reply is
    * received and validated.
    */
  def requestKernelInfo(): js.Promise[IInfoReplyMsg] = js.native
  /**
    * Restart a kernel.
    *
    * @returns A promise that resolves when the kernel has restarted.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
    *
    * Any existing Future or Comm objects are cleared.
    *
    * It is assumed that the API call does not mutate the kernel id or name.
    *
    * The promise will be rejected if the kernel status is `'dead'` or if the
    * request fails or the response is invalid.
    */
  def restart(): js.Promise[Unit] = js.native
  def sendControlMessage[T /* <: ControlMessageType */](msg: IControlMessage[T]): IControlFuture[IControlMessage[T], IControlMessage[ControlMessageType]] = js.native
  def sendControlMessage[T /* <: ControlMessageType */](msg: IControlMessage[T], expectReply: Boolean): IControlFuture[IControlMessage[T], IControlMessage[ControlMessageType]] = js.native
  def sendControlMessage[T /* <: ControlMessageType */](msg: IControlMessage[T], expectReply: Boolean, disposeOnDone: Boolean): IControlFuture[IControlMessage[T], IControlMessage[ControlMessageType]] = js.native
  /**
    * Send an `input_reply` message.
    *
    * @param content - The content of the reply.
    *
    * #### Notes
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
    */
  def sendInputReply(content: ReplyContent[IInputReply]): Unit = js.native
  /**
    * Send a shell message to the kernel.
    *
    * @param msg - The fully-formed shell message to send.
    *
    * @param expectReply - Whether to expect a shell reply message.
    *
    * @param disposeOnDone - Whether to dispose of the future when done.
    *
    * #### Notes
    * Send a message to the kernel's shell channel, yielding a future object
    * for accepting replies.
    *
    * If `expectReply` is given and `true`, the future is done when both a
    * shell reply and an idle status message are received with the appropriate
    * parent header, in which case the `.done` promise resolves to the reply.
    * If `expectReply` is not given or is `false`, the future is done when an
    * idle status message with the appropriate parent header is received, in
    * which case the `.done` promise resolves to `undefined`.
    *
    * If `disposeOnDone` is given and `false`, the future will not be disposed
    * of when the future is done, instead relying on the caller to dispose of
    * it. This allows for the handling of out-of-order output from ill-behaved
    * kernels.
    *
    * All replies are validated as valid kernel messages.
    *
    * If the kernel status is `'dead'`, this will throw an error.
    */
  def sendShellMessage[T /* <: ShellMessageType */](msg: IShellMessage[T]): IShellFuture[IShellMessage[T], IShellMessage[ShellMessageType]] = js.native
  def sendShellMessage[T /* <: ShellMessageType */](msg: IShellMessage[T], expectReply: Boolean): IShellFuture[IShellMessage[T], IShellMessage[ShellMessageType]] = js.native
  def sendShellMessage[T /* <: ShellMessageType */](msg: IShellMessage[T], expectReply: Boolean, disposeOnDone: Boolean): IShellFuture[IShellMessage[T], IShellMessage[ShellMessageType]] = js.native
}

