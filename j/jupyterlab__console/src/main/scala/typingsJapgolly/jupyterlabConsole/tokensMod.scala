package typingsJapgolly.jupyterlabConsole

import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  val IConsoleTracker: Token[typingsJapgolly.jupyterlabConsole.tokensMod.IConsoleTracker] = js.native
  type IConsoleTracker = IWidgetTracker[ConsolePanel]
}

