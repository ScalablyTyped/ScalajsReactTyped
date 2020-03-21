package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import typingsJapgolly.blueprintjsTable.selectableMod.ISelectedRegionTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/selectable.IDragSelectableProps> */
trait PartialIDragSelectablePro extends js.Object {
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.undefined
  var enableMultipleSelection: js.UndefOr[Boolean] = js.undefined
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
  var ignoredSelectors: js.UndefOr[js.Array[String]] = js.undefined
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, IRegion]] = js.undefined
  var locateDrag: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* coords */ ICoordinateData, 
      /* returnEndOnly */ js.UndefOr[Boolean], 
      IRegion
    ]
  ] = js.undefined
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.undefined
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.undefined
  var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.undefined
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.undefined
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
}

object PartialIDragSelectablePro {
  @scala.inline
  def apply(
    disabled: Boolean | (js.Function1[/* event */ MouseEvent, Boolean]) = null,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    ignoredSelectors: js.Array[String] = null,
    locateClick: /* event */ MouseEvent => CallbackTo[IRegion] = null,
    locateDrag: (/* event */ MouseEvent, /* coords */ ICoordinateData, /* returnEndOnly */ js.UndefOr[Boolean]) => CallbackTo[IRegion] = null,
    onFocusedCell: /* focusedCell */ IFocusedCellCoordinates => Callback = null,
    onSelection: /* regions */ js.Array[IRegion] => Callback = null,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Callback = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => CallbackTo[IRegion] = null,
    selectedRegions: js.Array[IRegion] = null
  ): PartialIDragSelectablePro = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (ignoredSelectors != null) __obj.updateDynamic("ignoredSelectors")(ignoredSelectors.asInstanceOf[js.Any])
    if (locateClick != null) __obj.updateDynamic("locateClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => locateClick(t0).runNow()))
    if (locateDrag != null) __obj.updateDynamic("locateDrag")(js.Any.fromFunction3((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData, t2: /* returnEndOnly */ js.UndefOr[scala.Boolean]) => locateDrag(t0, t1, t2).runNow()))
    if (onFocusedCell != null) __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: /* focusedCell */ typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: /* regions */ js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1((t0: /* regions */ js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelectionEnd(t0).runNow()))
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3((t0: /* region */ typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion, t1: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent, t2: /* coords */ js.UndefOr[typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData]) => selectedRegionTransform(t0, t1, t2).runNow()))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIDragSelectablePro]
  }
}

