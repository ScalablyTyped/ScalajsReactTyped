package typingsJapgolly.jupyterlabTerminalExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsJapgolly.jupyterlabApplication.mod.JupyterFrontEnd
import typingsJapgolly.jupyterlabApputils.mod.MainAreaWidget
import typingsJapgolly.jupyterlabApputils.mod.WidgetTracker
import typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry
import typingsJapgolly.jupyterlabTerminal.tokensMod.ITerminal.ITerminal
import typingsJapgolly.jupyterlabTerminal.tokensMod.ITerminalTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The default terminal extension.
    */
  val default: JupyterFrontEndPlugin[ITerminalTracker] = js.native
  def addCommands(
    app: JupyterFrontEnd[IShell],
    tracker: WidgetTracker[MainAreaWidget[ITerminal]],
    settingRegistry: ISettingRegistry,
    options: PartialIOptions
  ): Unit = js.native
}

