package typingsJapgolly.blueprintjsTable.selectableMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectableProps extends js.Object {
  /**
    * If `false`, only a single region of a single column/row/cell may be
    * selected at one time. Using `ctrl` or `meta` key will have no effect,
    * and a mouse drag will select the current column/row/cell only.
    * @default false
    */
  var enableMultipleSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * The currently focused cell.
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
  /**
    * An additional convenience callback invoked when the user releases the
    * mouse from either a click or a drag, indicating that the selection
    * interaction has ended.
    */
  var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.undefined
  /**
    * An optional transform function that will be applied to the located
    * `Region`.
    *
    * This allows you to, for example, convert cell `Region`s into row
    * `Region`s while maintaining the existing multi-select and meta-click
    * functionality.
    */
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.undefined
  /**
    * An array containing the table's selection Regions.
    * @default []
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
  /**
    * When the user focuses something, this callback is called with new
    * focused cell coordinates. This should be considered the new focused cell
    * state for the entire table.
    */
  def onFocusedCell(focusedCell: IFocusedCellCoordinates): Unit
  /**
    * When the user selects something, this callback is called with a new
    * array of `Region`s. This array should be considered the new selection
    * state for the entire table.
    */
  def onSelection(regions: js.Array[IRegion]): Unit
}

object ISelectableProps {
  @scala.inline
  def apply(
    onFocusedCell: IFocusedCellCoordinates => Callback,
    onSelection: js.Array[IRegion] => Callback,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Callback = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => CallbackTo[IRegion] = null,
    selectedRegions: js.Array[IRegion] = null
  ): ISelectableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1((t0: /* regions */ js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelectionEnd(t0).runNow()))
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3((t0: /* region */ typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion, t1: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent, t2: /* coords */ js.UndefOr[typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData]) => selectedRegionTransform(t0, t1, t2).runNow()))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectableProps]
  }
}

