package typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInputReply
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IShellControlMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IStdinMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ReplyContent
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.StdinMessageType
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Future interface for responses from the kernel.
  *
  * When a message is sent to a kernel, a Future is created to handle any
  * responses that may come from the kernel.
  */
trait IFuture[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */] extends IDisposable {
  /**
    * A promise that resolves when the future is done.
    *
    * #### Notes
    * The future is done when there are no more responses expected from the
    * kernel.
    *
    * The `done` promise resolves to the reply message if there is one,
    * otherwise it resolves to `undefined`.
    */
  val done: js.Promise[js.UndefOr[REPLY]]
  /**
    * The original outgoing message.
    */
  val msg: REQUEST
  /**
    * The iopub handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a promise, all kernel message processing pauses
    * until the promise is resolved.
    */
  def onIOPub(msg: IIOPubMessage[IOPubMessageType]): Unit | js.Thenable[Unit]
  /**
    * The reply handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a promise, all kernel message processing pauses
    * until the promise is resolved. If there is a reply message, the future
    * `done` promise also resolves to the reply message after this handler has
    * been called.
    */
  def onReply(msg: REPLY): Unit | js.Thenable[Unit]
  /**
    * The stdin handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a promise, all kernel message processing pauses
    * until the promise is resolved.
    */
  def onStdin(msg: IStdinMessage[StdinMessageType]): Unit | js.Thenable[Unit]
  /**
    * Register hook for IOPub messages.
    *
    * @param hook - The callback invoked for an IOPub message.
    *
    * #### Notes
    * The IOPub hook system allows you to preempt the handlers for IOPub
    * messages handled by the future.
    *
    * The most recently registered hook is run first. A hook can return a
    * boolean or a promise to a boolean, in which case all kernel message
    * processing pauses until the promise is fulfilled. If a hook return value
    * resolves to false, any later hooks will not run and the function will
    * return a promise resolving to false. If a hook throws an error, the error
    * is logged to the console and the next hook is run. If a hook is
    * registered during the hook processing, it will not run until the next
    * message. If a hook is removed during the hook processing, it will be
    * deactivated immediately.
    */
  def registerMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit
  /**
    * Remove a hook for IOPub messages.
    *
    * @param hook - The hook to remove.
    *
    * #### Notes
    * If a hook is removed during the hook processing, it will be deactivated immediately.
    */
  def removeMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit
  /**
    * Send an `input_reply` message.
    */
  def sendInputReply(content: ReplyContent[IInputReply]): Unit
}

object IFuture {
  @scala.inline
  def apply[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */](
    dispose: Callback,
    done: js.Promise[js.UndefOr[REPLY]],
    isDisposed: Boolean,
    msg: REQUEST,
    onIOPub: IIOPubMessage[IOPubMessageType] => CallbackTo[Unit | js.Thenable[Unit]],
    onReply: REPLY => CallbackTo[Unit | js.Thenable[Unit]],
    onStdin: IStdinMessage[StdinMessageType] => CallbackTo[Unit | js.Thenable[Unit]],
    registerMessageHook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]] => Callback,
    removeMessageHook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]] => Callback,
    sendInputReply: ReplyContent[IInputReply] => Callback
  ): IFuture[REQUEST, REPLY] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("onIOPub")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType]) => onIOPub(t0).runNow()))
    __obj.updateDynamic("onReply")(js.Any.fromFunction1((t0: REPLY) => onReply(t0).runNow()))
    __obj.updateDynamic("onStdin")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IStdinMessage[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.StdinMessageType]) => onStdin(t0).runNow()))
    __obj.updateDynamic("registerMessageHook")(js.Any.fromFunction1((t0: js.Function1[
  /* msg */ typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType], 
  scala.Boolean | js.Thenable[scala.Boolean]]) => registerMessageHook(t0).runNow()))
    __obj.updateDynamic("removeMessageHook")(js.Any.fromFunction1((t0: js.Function1[
  /* msg */ typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType], 
  scala.Boolean | js.Thenable[scala.Boolean]]) => removeMessageHook(t0).runNow()))
    __obj.updateDynamic("sendInputReply")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ReplyContent[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInputReply]) => sendInputReply(t0).runNow()))
    __obj.asInstanceOf[IFuture[REQUEST, REPLY]]
  }
}

