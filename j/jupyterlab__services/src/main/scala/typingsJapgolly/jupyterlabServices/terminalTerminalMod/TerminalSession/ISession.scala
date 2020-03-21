package typingsJapgolly.jupyterlabServices.terminalTerminalMod.TerminalSession

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a terminal session.
  */
trait ISession extends IDisposable {
  /**
    * Test whether the session is ready.
    */
  val isReady: Boolean
  /**
    * A signal emitted when a message is received from the server.
    */
  var messageReceived: ISignal[ISession, IMessage]
  /**
    * The model associated with the session.
    */
  val model: IModel
  /**
    * Get the name of the terminal session.
    */
  val name: String
  /**
    * A promise that fulfills when the session is initially ready.
    */
  val ready: js.Promise[Unit]
  /**
    * The server settings for the session.
    */
  val serverSettings: ISettings
  /**
    * A signal emitted when the session is shut down.
    */
  var terminated: ISignal[ISession, Unit]
  /**
    * Reconnect to the terminal.
    *
    * @returns A promise that resolves when the terminal has reconnected.
    */
  def reconnect(): js.Promise[Unit]
  /**
    * Send a message to the terminal session.
    */
  def send(message: IMessage): Unit
  /**
    * Shut down the terminal session.
    */
  def shutdown(): js.Promise[Unit]
}

object ISession {
  @scala.inline
  def apply(
    dispose: Callback,
    isDisposed: Boolean,
    isReady: Boolean,
    messageReceived: ISignal[ISession, IMessage],
    model: IModel,
    name: String,
    ready: js.Promise[Unit],
    reconnect: CallbackTo[js.Promise[Unit]],
    send: IMessage => Callback,
    serverSettings: ISettings,
    shutdown: CallbackTo[js.Promise[Unit]],
    terminated: ISignal[ISession, Unit]
  ): ISession = {
    val __obj = js.Dynamic.literal(isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], messageReceived = messageReceived.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], terminated = terminated.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("reconnect")(reconnect.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabServices.terminalTerminalMod.TerminalSession.IMessage) => send(t0).runNow()))
    __obj.updateDynamic("shutdown")(shutdown.toJsFn)
    __obj.asInstanceOf[ISession]
  }
}

