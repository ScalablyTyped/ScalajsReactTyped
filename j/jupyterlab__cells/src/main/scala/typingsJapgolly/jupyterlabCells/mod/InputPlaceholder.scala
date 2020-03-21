package typingsJapgolly.jupyterlabCells.mod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "InputPlaceholder")
@js.native
class InputPlaceholder protected ()
  extends typingsJapgolly.jupyterlabCells.placeholderMod.InputPlaceholder {
  /**
    * Construct a new input placeholder.
    */
  def this(callback: js.Function1[/* e */ ReactMouseEventFrom[HTMLDivElement], Unit]) = this()
}

