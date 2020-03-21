package typingsJapgolly.jupyterlabServices.sessionSessionMod.Session

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.ISpecModels
import typingsJapgolly.jupyterlabServices.mod.ServerConnection.NetworkError
import typingsJapgolly.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsJapgolly.phosphorAlgorithm.iterMod.IIterator
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object which manages session instances.
  *
  * #### Notes
  * The manager is responsible for maintaining the state of running
  * sessions and the initial fetch of kernel specs.
  */
trait IManager extends IDisposable {
  /**
    * A signal emitted when there is a connection failure.
    */
  var connectionFailure: ISignal[IManager, NetworkError]
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean
  /**
    * A promise that is fulfilled when the manager is ready.
    */
  val ready: js.Promise[Unit]
  /**
    * A signal emitted when the running sessions change.
    */
  var runningChanged: ISignal[this.type, js.Array[IModel]]
  /**
    * The server settings for the manager.
    */
  var serverSettings: js.UndefOr[ISettings] = js.undefined
  /**
    * The cached kernel specs.
    *
    * #### Notes
    * This value will be null until the manager is ready.
    */
  val specs: ISpecModels | Null
  /**
    * A signal emitted when the kernel specs change.
    */
  var specsChanged: ISignal[this.type, ISpecModels]
  /**
    * Connect to a running session.
    *
    * @param model - The model of the target session.
    *
    * @param options - The session options to use.
    *
    * @returns The new session instance.
    */
  def connectTo(model: IModel): ISession
  /**
    * Find a session by id.
    *
    * @param id - The id of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  def findById(id: String): js.Promise[IModel]
  /**
    * Find a session by path.
    *
    * @param path - The path of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  def findByPath(path: String): js.Promise[IModel]
  /**
    * Force a refresh of the running sessions.
    *
    * @returns A promise that resolves when the models are refreshed.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  def refreshRunning(): js.Promise[Unit]
  /**
    * Force a refresh of the specs from the server.
    *
    * @returns A promise that resolves when the specs are fetched.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  def refreshSpecs(): js.Promise[Unit]
  /**
    * Create an iterator over the known running sessions.
    *
    * @returns A new iterator over the running sessions.
    */
  def running(): IIterator[IModel]
  /**
    * Shut down a session by id.
    *
    * @param id - The id of the target kernel.
    *
    * @returns A promise that resolves when the operation is complete.
    */
  def shutdown(id: String): js.Promise[Unit]
  /**
    * Shut down all sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def shutdownAll(): js.Promise[Unit]
  /**
    * Start a new session.
    *
    * @param options - The session options to use.
    *
    * @returns A promise that resolves with the session instance.
    *
    * #### Notes
    * The `serverSettings` of the manager will be used.
    */
  def startNew(options: IOptions): js.Promise[ISession]
  /**
    * Find a session associated with a path and stop it is the only session
    * using that kernel.
    *
    * @param path - The path in question.
    *
    * @returns A promise that resolves when the relevant sessions are stopped.
    */
  def stopIfNeeded(path: String): js.Promise[Unit]
}

object IManager {
  @scala.inline
  def apply(
    connectTo: IModel => CallbackTo[ISession],
    connectionFailure: ISignal[IManager, NetworkError],
    dispose: Callback,
    findById: String => CallbackTo[js.Promise[IModel]],
    findByPath: String => CallbackTo[js.Promise[IModel]],
    isDisposed: Boolean,
    isReady: Boolean,
    ready: js.Promise[Unit],
    refreshRunning: CallbackTo[js.Promise[Unit]],
    refreshSpecs: CallbackTo[js.Promise[Unit]],
    running: CallbackTo[IIterator[IModel]],
    runningChanged: ISignal[IManager, js.Array[IModel]],
    shutdown: String => CallbackTo[js.Promise[Unit]],
    shutdownAll: CallbackTo[js.Promise[Unit]],
    specsChanged: ISignal[IManager, ISpecModels],
    startNew: IOptions => CallbackTo[js.Promise[ISession]],
    stopIfNeeded: String => CallbackTo[js.Promise[Unit]],
    serverSettings: ISettings = null,
    specs: ISpecModels = null
  ): IManager = {
    val __obj = js.Dynamic.literal(connectionFailure = connectionFailure.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], runningChanged = runningChanged.asInstanceOf[js.Any], specsChanged = specsChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("connectTo")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabServices.sessionSessionMod.Session.IModel) => connectTo(t0).runNow()))
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("findById")(js.Any.fromFunction1((t0: java.lang.String) => findById(t0).runNow()))
    __obj.updateDynamic("findByPath")(js.Any.fromFunction1((t0: java.lang.String) => findByPath(t0).runNow()))
    __obj.updateDynamic("refreshRunning")(refreshRunning.toJsFn)
    __obj.updateDynamic("refreshSpecs")(refreshSpecs.toJsFn)
    __obj.updateDynamic("running")(running.toJsFn)
    __obj.updateDynamic("shutdown")(js.Any.fromFunction1((t0: java.lang.String) => shutdown(t0).runNow()))
    __obj.updateDynamic("shutdownAll")(shutdownAll.toJsFn)
    __obj.updateDynamic("startNew")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabServices.sessionSessionMod.Session.IOptions) => startNew(t0).runNow()))
    __obj.updateDynamic("stopIfNeeded")(js.Any.fromFunction1((t0: java.lang.String) => stopIfNeeded(t0).runNow()))
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManager]
  }
}

