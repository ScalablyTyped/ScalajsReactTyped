package typingsJapgolly.jupyterlabStatusbar.mod

import typingsJapgolly.jupyterlabStatusbar.runningSessionsMod.RunningSessions.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar", "RunningSessions")
@js.native
class RunningSessions protected ()
  extends typingsJapgolly.jupyterlabStatusbar.defaultsMod.RunningSessions {
  /**
    * Create a new RunningSessions widget.
    */
  def this(opts: IOptions) = this()
}

@JSImport("@jupyterlab/statusbar", "RunningSessions")
@js.native
object RunningSessions extends js.Object {
  /**
    * A VDomModel for the RunninSessions status item.
    */
  @js.native
  class Model ()
    extends typingsJapgolly.jupyterlabStatusbar.runningSessionsMod.RunningSessions.Model
  
}

