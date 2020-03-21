package typingsJapgolly.jupyterlabServices.sessionSessionMod.Session

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabServices.PartialIModelId
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.`type`
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.name
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.path
import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.IAnyMessageArgs
import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.Status
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.MessageType
import typingsJapgolly.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of a session object.
  */
trait ISession extends IDisposable {
  /**
    * A signal emitted for any kernel message.
    *
    * Note: The behavior is undefined if the message is modified
    * during message handling. As such, it should be treated as read-only.
    */
  var anyMessage: ISignal[this.type, IAnyMessageArgs]
  /**
    * Unique id of the session.
    */
  val id: String
  /**
    * A signal emitted for iopub kernel messages.
    */
  var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]]
  /**
    * The kernel.
    *
    * #### Notes
    * This is a read-only property, and can be altered by [changeKernel].
    */
  val kernel: IKernelConnection
  /**
    * A signal emitted when the kernel changes.
    */
  var kernelChanged: ISignal[this.type, IKernelChangedArgs]
  /**
    * The model associated with the session.
    */
  val model: IModel
  /**
    * The current name associated with the session.
    */
  val name: String
  /**
    * The current path associated with the session.
    */
  val path: String
  /**
    * A signal emitted when a session property changes.
    */
  val propertyChanged: ISignal[
    this.type, 
    typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.path | typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.name | typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.`type`
  ]
  /**
    * The server settings of the session.
    */
  val serverSettings: ISettings
  /**
    * The current status of the session.
    *
    * #### Notes
    * This is a delegate to the kernel status.
    */
  val status: Status
  /**
    * A signal emitted when the session status changes.
    */
  var statusChanged: ISignal[this.type, Status]
  /**
    * A signal emitted when the session is shut down.
    */
  var terminated: ISignal[this.type, Unit]
  /**
    * The type of the session.
    */
  val `type`: String
  /**
    * A signal emitted for unhandled kernel message.
    */
  var unhandledMessage: ISignal[this.type, IMessage[MessageType]]
  /**
    * Change the kernel.
    *
    * @param options - The name or id of the new kernel.
    *
    * @returns A promise that resolves with the new kernel model.
    *
    * #### Notes
    * This shuts down the existing kernel and creates a new kernel,
    * keeping the existing session ID and path.
    */
  def changeKernel(options: PartialIModelId): js.Promise[IKernelConnection]
  /**
    * Change the session name.
    */
  def setName(name: String): js.Promise[Unit]
  /**
    * Change the session path.
    *
    * @param path - The new session path.
    *
    * @returns A promise that resolves when the session has renamed.
    *
    * #### Notes
    * This uses the Jupyter REST API, and the response is validated.
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def setPath(path: String): js.Promise[Unit]
  /**
    * Change the session type.
    */
  def setType(`type`: String): js.Promise[Unit]
  /**
    * Kill the kernel and shutdown the session.
    *
    * @returns A promise that resolves when the session is shut down.
    *
    * #### Notes
    * This uses the Jupyter REST API, and the response is validated.
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def shutdown(): js.Promise[Unit]
}

object ISession {
  @scala.inline
  def apply(
    anyMessage: ISignal[ISession, IAnyMessageArgs],
    changeKernel: PartialIModelId => CallbackTo[js.Promise[IKernelConnection]],
    dispose: Callback,
    id: String,
    iopubMessage: ISignal[ISession, IIOPubMessage[IOPubMessageType]],
    isDisposed: Boolean,
    kernel: IKernelConnection,
    kernelChanged: ISignal[ISession, IKernelChangedArgs],
    model: IModel,
    name: String,
    path: String,
    propertyChanged: ISignal[ISession, path | name | `type`],
    serverSettings: ISettings,
    setName: String => CallbackTo[js.Promise[Unit]],
    setPath: String => CallbackTo[js.Promise[Unit]],
    setType: String => CallbackTo[js.Promise[Unit]],
    shutdown: CallbackTo[js.Promise[Unit]],
    status: Status,
    statusChanged: ISignal[ISession, Status],
    terminated: ISignal[ISession, Unit],
    `type`: String,
    unhandledMessage: ISignal[ISession, IMessage[MessageType]]
  ): ISession = {
    val __obj = js.Dynamic.literal(anyMessage = anyMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iopubMessage = iopubMessage.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], kernelChanged = kernelChanged.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyChanged = propertyChanged.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusChanged = statusChanged.asInstanceOf[js.Any], terminated = terminated.asInstanceOf[js.Any], unhandledMessage = unhandledMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("changeKernel")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabServices.PartialIModelId) => changeKernel(t0).runNow()))
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setPath")(js.Any.fromFunction1((t0: java.lang.String) => setPath(t0).runNow()))
    __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: java.lang.String) => setType(t0).runNow()))
    __obj.updateDynamic("shutdown")(shutdown.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
}

