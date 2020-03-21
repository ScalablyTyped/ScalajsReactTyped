package typingsJapgolly.jupyterlabLogconsoleExtension

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLSelectElement
import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsJapgolly.jupyterlabApplication.mod.JupyterFrontEnd
import typingsJapgolly.jupyterlabApputils.mod.ReactWidget
import typingsJapgolly.jupyterlabLogconsole.mod.LogConsolePanel
import typingsJapgolly.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typingsJapgolly.phosphorApplication.mod.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class LogLevelSwitcher protected () extends ReactWidget {
    /**
      * Construct a new cell type switcher.
      */
    def this(widget: LogConsolePanel) = this()
    var _id: js.Any = js.native
    var _logConsole: js.Any = js.native
    var _updateSource: js.Any = js.native
    /**
      * Handle `change` events for the HTMLSelect component.
      */
    def handleChange(event: ReactEventFrom[HTMLSelectElement]): Unit = js.native
    /**
      * Handle `keydown` events for the HTMLSelect component.
      */
    def handleKeyDown(event: ReactKeyboardEventFrom[Element]): Unit = js.native
  }
  
  val default: js.Array[IPlugin[JupyterFrontEnd[IShell], ILoggerRegistry | Unit]] = js.native
}

