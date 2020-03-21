package typingsJapgolly.agGrid.gridOptionsMod

import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.agGrid.gridCellMod.GridCellDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToNextCellParams extends js.Object {
  var event: KeyboardEvent
  var key: Double
  var nextCellDef: GridCellDef
  var previousCellDef: GridCellDef
}

object NavigateToNextCellParams {
  @scala.inline
  def apply(event: KeyboardEvent, key: Double, nextCellDef: GridCellDef, previousCellDef: GridCellDef): NavigateToNextCellParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], nextCellDef = nextCellDef.asInstanceOf[js.Any], previousCellDef = previousCellDef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigateToNextCellParams]
  }
}

