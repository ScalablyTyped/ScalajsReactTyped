package typingsJapgolly.blueprintjsTable

import typingsJapgolly.blueprintjsTable.commonCellMod.ICellCoordinates
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", JSImport.Namespace)
@js.native
object focusedCellUtilsMod extends js.Object {
  def expandFocusedRegion(focusedCell: IFocusedCellCoordinates, newRegion: IRegion): IRegion = js.native
  def getFocusedOrLastSelectedIndex(selectedRegions: js.Array[IRegion]): Double = js.native
  def getFocusedOrLastSelectedIndex(selectedRegions: js.Array[IRegion], focusedCell: IFocusedCellCoordinates): Double = js.native
  def getInitialFocusedCell(
    enableFocusedCell: Boolean,
    focusedCellFromProps: IFocusedCellCoordinates,
    focusedCellFromState: IFocusedCellCoordinates,
    selectedRegions: js.Array[IRegion]
  ): IFocusedCellCoordinates = js.native
  def isFocusedCellAtRegionBottom(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = js.native
  def isFocusedCellAtRegionLeft(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = js.native
  def isFocusedCellAtRegionRight(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = js.native
  def isFocusedCellAtRegionTop(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = js.native
  def toFullCoordinates(cellCoords: ICellCoordinates): IFocusedCellCoordinates = js.native
  def toFullCoordinates(cellCoords: ICellCoordinates, focusSelectionIndex: Double): IFocusedCellCoordinates = js.native
}

