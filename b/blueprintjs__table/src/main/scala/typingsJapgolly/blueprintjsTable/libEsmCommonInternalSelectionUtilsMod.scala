package typingsJapgolly.blueprintjsTable

import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmCommonDirectionMod.Direction
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.IRegion
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonInternalSelectionUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/selectionUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeRegion(region: Region, direction: Direction): IRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRegion")(region.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[IRegion]
  inline def resizeRegion(region: Region, direction: Direction, focusedCell: FocusedCellCoordinates): IRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRegion")(region.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[IRegion]
}
