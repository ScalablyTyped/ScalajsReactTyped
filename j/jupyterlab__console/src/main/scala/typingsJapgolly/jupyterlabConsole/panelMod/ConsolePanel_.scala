package typingsJapgolly.jupyterlabConsole.panelMod

import typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession
import typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory
import typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel.IOptions
import typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole
import typingsJapgolly.phosphorWidgets.mod.Panel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel")
@js.native
class ConsolePanel_ protected () extends Panel {
  /**
    * Construct a console panel.
    */
  def this(options: IOptions) = this()
  var _connected: js.Any = js.native
  var _executed: js.Any = js.native
  /**
    * Handle a console execution.
    */
  var _onExecuted: js.Any = js.native
  var _session: js.Any = js.native
  /**
    * Update the console panel title.
    */
  var _updateTitle: js.Any = js.native
  /**
    * The console widget used by the panel.
    */
  val console: CodeConsole = js.native
  /**
    * The content factory used by the console panel.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * The session used by the panel.
    */
  val session: IClientSession = js.native
}

