package typingsJapgolly.jupyterlabServices.libManagerMod.ServiceManager

import japgolly.scalajs.react.Callback
import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.ISpecModels
import typingsJapgolly.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service manager interface.
  */
trait IManager extends IDisposable {
  /**
    * The builder for the manager.
    */
  val builder: typingsJapgolly.jupyterlabServices.builderMod.Builder.IManager
  /**
    * A signal emitted when there is a connection failure with the server.
    */
  val connectionFailure: ISignal[IManager, js.Error]
  /**
    * The contents manager for the manager.
    */
  val contents: typingsJapgolly.jupyterlabServices.contentsMod.Contents.IManager
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean
  /**
    * The nbconvert manager for the manager.
    */
  val nbconvert: typingsJapgolly.jupyterlabServices.nbconvertMod.NbConvert.IManager
  /**
    * A promise that fulfills when the manager is initially ready.
    */
  val ready: js.Promise[Unit]
  /**
    * The server settings of the manager.
    */
  val serverSettings: ISettings
  /**
    * The session manager for the manager.
    */
  val sessions: typingsJapgolly.jupyterlabServices.sessionSessionMod.Session.IManager
  /**
    * The setting manager for the manager.
    */
  val settings: typingsJapgolly.jupyterlabServices.settingMod.Setting.IManager
  /**
    * The kernel spec models.
    */
  val specs: ISpecModels | Null
  /**
    * A signal emitted when the kernel specs change.
    */
  val specsChanged: ISignal[IManager, ISpecModels]
  /**
    * The terminals manager for the manager.
    */
  val terminals: typingsJapgolly.jupyterlabServices.terminalTerminalMod.TerminalSession.IManager
  /**
    * The workspace manager for the manager.
    */
  val workspaces: typingsJapgolly.jupyterlabServices.workspaceMod.Workspace.IManager
}

object IManager {
  @scala.inline
  def apply(
    builder: typingsJapgolly.jupyterlabServices.builderMod.Builder.IManager,
    connectionFailure: ISignal[IManager, js.Error],
    contents: typingsJapgolly.jupyterlabServices.contentsMod.Contents.IManager,
    dispose: Callback,
    isDisposed: Boolean,
    isReady: Boolean,
    nbconvert: typingsJapgolly.jupyterlabServices.nbconvertMod.NbConvert.IManager,
    ready: js.Promise[Unit],
    serverSettings: ISettings,
    sessions: typingsJapgolly.jupyterlabServices.sessionSessionMod.Session.IManager,
    settings: typingsJapgolly.jupyterlabServices.settingMod.Setting.IManager,
    specsChanged: ISignal[IManager, ISpecModels],
    terminals: typingsJapgolly.jupyterlabServices.terminalTerminalMod.TerminalSession.IManager,
    workspaces: typingsJapgolly.jupyterlabServices.workspaceMod.Workspace.IManager,
    specs: ISpecModels = null
  ): IManager = {
    val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any], connectionFailure = connectionFailure.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], nbconvert = nbconvert.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], specsChanged = specsChanged.asInstanceOf[js.Any], terminals = terminals.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManager]
  }
}

