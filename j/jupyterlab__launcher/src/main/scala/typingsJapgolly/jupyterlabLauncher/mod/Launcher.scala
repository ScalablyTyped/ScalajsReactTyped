package typingsJapgolly.jupyterlabLauncher.mod

import typingsJapgolly.jupyterlabApputils.vdomMod.VDomRenderer
import typingsJapgolly.jupyterlabLauncher.mod.ILauncher.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/launcher", "Launcher")
@js.native
class Launcher protected () extends VDomRenderer[LauncherModel] {
  /**
    * Construct a new launcher widget.
    */
  def this(options: IOptions) = this()
  var _callback: js.Any = js.native
  var _commands: js.Any = js.native
  var _cwd: js.Any = js.native
  var _pending: js.Any = js.native
  /**
    * The cwd of the launcher.
    */
  var cwd: String = js.native
  /**
    * Whether there is a pending item being launched.
    */
  var pending: Boolean = js.native
}

