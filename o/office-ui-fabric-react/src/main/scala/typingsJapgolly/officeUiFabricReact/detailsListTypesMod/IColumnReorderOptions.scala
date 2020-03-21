package typingsJapgolly.officeUiFabricReact.detailsListTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnReorderOptions extends js.Object {
  /**
    * Specifies the number fixed columns from right
    * @defaultvalue 0
    */
  var frozenColumnCountFromEnd: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the number fixed columns from left(0th index)
    * @defaultvalue 0
    */
  var frozenColumnCountFromStart: js.UndefOr[Double] = js.undefined
  /**
    * Callback to handle the column reorder
    * draggedIndex is the source column index, that need to be placed in targetIndex
    * Deprecated, use `onColumnDrop` instead.
    * @deprecated Use `onColumnDrop` instead.
    */
  var handleColumnReorder: js.UndefOr[js.Function2[/* draggedIndex */ Double, /* targetIndex */ Double, Unit]] = js.undefined
  /**
    * Callback to handle the column dragstart
    * draggedStarted indicates that the column drag has been started on DetailsHeader
    */
  var onColumnDragStart: js.UndefOr[js.Function1[/* dragStarted */ Boolean, Unit]] = js.undefined
  /**
    * Callback to handle the column reorder
    * draggedIndex is the source column index, that need to be placed in targetIndex
    */
  var onColumnDrop: js.UndefOr[js.Function1[/* dragDropDetails */ IColumnDragDropDetails, Unit]] = js.undefined
  /**
    * Callback to handle the column reorder
    */
  var onDragEnd: js.UndefOr[js.Function1[/* columnDropLocationDetails */ ColumnDragEndLocation, Unit]] = js.undefined
}

object IColumnReorderOptions {
  @scala.inline
  def apply(
    frozenColumnCountFromEnd: Int | Double = null,
    frozenColumnCountFromStart: Int | Double = null,
    handleColumnReorder: (/* draggedIndex */ Double, /* targetIndex */ Double) => Callback = null,
    onColumnDragStart: /* dragStarted */ Boolean => Callback = null,
    onColumnDrop: /* dragDropDetails */ IColumnDragDropDetails => Callback = null,
    onDragEnd: /* columnDropLocationDetails */ ColumnDragEndLocation => Callback = null
  ): IColumnReorderOptions = {
    val __obj = js.Dynamic.literal()
    if (frozenColumnCountFromEnd != null) __obj.updateDynamic("frozenColumnCountFromEnd")(frozenColumnCountFromEnd.asInstanceOf[js.Any])
    if (frozenColumnCountFromStart != null) __obj.updateDynamic("frozenColumnCountFromStart")(frozenColumnCountFromStart.asInstanceOf[js.Any])
    if (handleColumnReorder != null) __obj.updateDynamic("handleColumnReorder")(js.Any.fromFunction2((t0: /* draggedIndex */ scala.Double, t1: /* targetIndex */ scala.Double) => handleColumnReorder(t0, t1).runNow()))
    if (onColumnDragStart != null) __obj.updateDynamic("onColumnDragStart")(js.Any.fromFunction1((t0: /* dragStarted */ scala.Boolean) => onColumnDragStart(t0).runNow()))
    if (onColumnDrop != null) __obj.updateDynamic("onColumnDrop")(js.Any.fromFunction1((t0: /* dragDropDetails */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumnDragDropDetails) => onColumnDrop(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* columnDropLocationDetails */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation) => onDragEnd(t0).runNow()))
    __obj.asInstanceOf[IColumnReorderOptions]
  }
}

