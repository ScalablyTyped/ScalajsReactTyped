package typingsJapgolly.jupyterlabApputils.mod

import typingsJapgolly.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptions
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "MainAreaWidget")
@js.native
class MainAreaWidget[T /* <: Widget */] protected ()
  extends typingsJapgolly.jupyterlabApputils.mainareawidgetMod.MainAreaWidget[T] {
  /**
    * Construct a new main area widget.
    *
    * @param options - The options for initializing the widget.
    */
  def this(options: IOptions[T]) = this()
}

