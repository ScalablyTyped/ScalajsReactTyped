package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/reorderable.IDragReorderable> */
trait PartialIDragReorderable extends js.Object {
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.undefined
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, IRegion]] = js.undefined
  var locateDrag: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Double]] = js.undefined
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.undefined
  var onReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.undefined
  var onReordering: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.undefined
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.undefined
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
  var toRegion: js.UndefOr[js.Function2[/* index1 */ Double, /* index2 */ js.UndefOr[Double], IRegion]] = js.undefined
}

object PartialIDragReorderable {
  @scala.inline
  def apply(
    disabled: Boolean | (js.Function1[/* event */ MouseEvent, Boolean]) = null,
    locateClick: /* event */ MouseEvent => CallbackTo[IRegion] = null,
    locateDrag: (/* event */ MouseEvent, /* coords */ ICoordinateData) => CallbackTo[Double] = null,
    onFocusedCell: /* focusedCell */ IFocusedCellCoordinates => Callback = null,
    onReordered: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Callback = null,
    onReordering: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Callback = null,
    onSelection: /* regions */ js.Array[IRegion] => Callback = null,
    selectedRegions: js.Array[IRegion] = null,
    toRegion: (/* index1 */ Double, /* index2 */ js.UndefOr[Double]) => CallbackTo[IRegion] = null
  ): PartialIDragReorderable = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (locateClick != null) __obj.updateDynamic("locateClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => locateClick(t0).runNow()))
    if (locateDrag != null) __obj.updateDynamic("locateDrag")(js.Any.fromFunction2((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData) => locateDrag(t0, t1).runNow()))
    if (onFocusedCell != null) __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: /* focusedCell */ typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    if (onReordered != null) __obj.updateDynamic("onReordered")(js.Any.fromFunction3((t0: /* oldIndex */ scala.Double, t1: /* newIndex */ scala.Double, t2: /* length */ scala.Double) => onReordered(t0, t1, t2).runNow()))
    if (onReordering != null) __obj.updateDynamic("onReordering")(js.Any.fromFunction3((t0: /* oldIndex */ scala.Double, t1: /* newIndex */ scala.Double, t2: /* length */ scala.Double) => onReordering(t0, t1, t2).runNow()))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: /* regions */ js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    if (toRegion != null) __obj.updateDynamic("toRegion")(js.Any.fromFunction2((t0: /* index1 */ scala.Double, t1: /* index2 */ js.UndefOr[scala.Double]) => toRegion(t0, t1).runNow()))
    __obj.asInstanceOf[PartialIDragReorderable]
  }
}

