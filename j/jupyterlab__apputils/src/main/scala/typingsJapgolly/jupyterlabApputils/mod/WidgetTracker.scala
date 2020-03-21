package typingsJapgolly.jupyterlabApputils.mod

import typingsJapgolly.jupyterlabApputils.widgettrackerMod.WidgetTracker.IOptions
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "WidgetTracker")
@js.native
class WidgetTracker[T /* <: Widget */] protected ()
  extends typingsJapgolly.jupyterlabApputils.widgettrackerMod.WidgetTracker[T] {
  /**
    * Create a new widget tracker.
    *
    * @param options - The instantiation options for a widget tracker.
    */
  def this(options: IOptions) = this()
}

