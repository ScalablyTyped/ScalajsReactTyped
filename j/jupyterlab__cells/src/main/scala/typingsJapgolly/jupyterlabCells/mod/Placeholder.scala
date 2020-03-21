package typingsJapgolly.jupyterlabCells.mod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "Placeholder")
@js.native
abstract class Placeholder protected ()
  extends typingsJapgolly.jupyterlabCells.placeholderMod.Placeholder {
  /**
    * Construct a new placeholder.
    */
  def this(callback: js.Function1[/* e */ ReactMouseEventFrom[HTMLDivElement], Unit]) = this()
}

