package typingsJapgolly.reactTable

import typingsJapgolly.reactTable.mod.Cell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCell[D /* <: js.Object */] extends js.Object {
  var cell: Cell[D]
}

object AnonCell {
  @scala.inline
  def apply[D /* <: js.Object */](cell: Cell[D]): AnonCell[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCell[D]]
  }
}

