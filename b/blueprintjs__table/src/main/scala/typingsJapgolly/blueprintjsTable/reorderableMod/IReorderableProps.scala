package typingsJapgolly.blueprintjsTable.reorderableMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReorderableProps extends js.Object {
  /**
    * An array containing the table's selection Regions.
    * @default []
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
  /**
    * When the user reorders something, this callback is called with the new
    * focus cell for the newly selected set of regions.
    */
  def onFocusedCell(focusedCell: IFocusedCellCoordinates): Unit
  /**
    * A callback that is called when the user is done dragging to reorder.
    *
    * @param oldIndex the original index of the element or set of elements
    * @param newIndex the new index of the element or set of elements
    * @param length the number of contiguous elements that were moved
    */
  def onReordered(oldIndex: Double, newIndex: Double, length: Double): Unit
  /**
    * A callback that is called while the user is dragging to reorder.
    *
    * @param oldIndex the original index of the element or set of elements
    * @param newIndex the new index of the element or set of elements
    * @param length the number of contiguous elements that were moved
    */
  def onReordering(oldIndex: Double, newIndex: Double, length: Double): Unit
  /**
    * When the user reorders something, this callback is called with a new
    * array of `Region`s. This array should be considered the new selection
    * state for the entire table.
    */
  def onSelection(regions: js.Array[IRegion]): Unit
}

object IReorderableProps {
  @scala.inline
  def apply(
    onFocusedCell: IFocusedCellCoordinates => Callback,
    onReordered: (Double, Double, Double) => Callback,
    onReordering: (Double, Double, Double) => Callback,
    onSelection: js.Array[IRegion] => Callback,
    selectedRegions: js.Array[IRegion] = null
  ): IReorderableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    __obj.updateDynamic("onReordered")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onReordered(t0, t1, t2).runNow()))
    __obj.updateDynamic("onReordering")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onReordering(t0, t1, t2).runNow()))
    __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReorderableProps]
  }
}

