package typingsJapgolly.jqueryHandsontable.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellPosition extends js.Object {
  var col: Double
  var row: Double
}

object CellPosition {
  @scala.inline
  def apply(col: Double, row: Double): CellPosition = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellPosition]
  }
}

