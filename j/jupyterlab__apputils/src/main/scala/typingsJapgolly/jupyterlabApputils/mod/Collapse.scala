package typingsJapgolly.jupyterlabApputils.mod

import typingsJapgolly.jupyterlabApputils.collapseMod.Collapse.IOptions
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Collapse")
@js.native
class Collapse[T /* <: Widget */] protected ()
  extends typingsJapgolly.jupyterlabApputils.collapseMod.Collapse[T] {
  def this(options: IOptions[T]) = this()
}

