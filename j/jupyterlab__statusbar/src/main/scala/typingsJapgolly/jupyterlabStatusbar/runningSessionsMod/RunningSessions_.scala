package typingsJapgolly.jupyterlabStatusbar.runningSessionsMod

import typingsJapgolly.jupyterlabApputils.vdomMod.VDomRenderer
import typingsJapgolly.jupyterlabStatusbar.runningSessionsMod.RunningSessions.IOptions
import typingsJapgolly.jupyterlabStatusbar.runningSessionsMod.RunningSessions.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/defaults/runningSessions", "RunningSessions")
@js.native
class RunningSessions_ protected () extends VDomRenderer[Model] {
  /**
    * Create a new RunningSessions widget.
    */
  def this(opts: IOptions) = this()
  var _handleClick: js.Any = js.native
  /**
    * Set the number of model kernels when the list changes.
    */
  var _onKernelsRunningChanged: js.Any = js.native
  /**
    * Set the number of model terminal sessions when the list changes.
    */
  var _onTerminalsRunningChanged: js.Any = js.native
  var _serviceManager: js.Any = js.native
}

