package typingsJapgolly.jupyterlabCoreutils.mod

import typingsJapgolly.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "ActivityMonitor")
@js.native
class ActivityMonitor[Sender, Args] protected ()
  extends typingsJapgolly.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor[Sender, Args] {
  /**
    * Construct a new activity monitor.
    */
  def this(options: IOptions[Sender, Args]) = this()
}

