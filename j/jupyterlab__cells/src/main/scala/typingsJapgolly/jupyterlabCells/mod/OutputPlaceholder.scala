package typingsJapgolly.jupyterlabCells.mod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "OutputPlaceholder")
@js.native
class OutputPlaceholder protected ()
  extends typingsJapgolly.jupyterlabCells.placeholderMod.OutputPlaceholder {
  /**
    * Construct a new output placeholder.
    */
  def this(callback: js.Function1[/* e */ ReactMouseEventFrom[HTMLDivElement], Unit]) = this()
}

