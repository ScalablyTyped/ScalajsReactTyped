package typingsJapgolly.blueprintjsTable

import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.directionMod.Direction
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/internal/selectionUtils", JSImport.Namespace)
@js.native
object selectionUtilsMod extends js.Object {
  def resizeRegion(region: IRegion, direction: Direction): IRegion = js.native
  def resizeRegion(region: IRegion, direction: Direction, focusedCell: IFocusedCellCoordinates): IRegion = js.native
}

