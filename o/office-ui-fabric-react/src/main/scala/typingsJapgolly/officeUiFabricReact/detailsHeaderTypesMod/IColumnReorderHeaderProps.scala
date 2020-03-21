package typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.officeUiFabricReact.AnonDropLocation
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumnDragDropDetails
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnReorderHeaderProps extends IColumnReorderOptions {
  /** Callback to notify the column dragEnd event to List
    * Need this to check whether the dragEnd has happened on
    * corresponding list or outside of the list
    */
  var onColumnDragEnd: js.UndefOr[js.Function2[/* props */ AnonDropLocation, /* event */ MouseEvent, Unit]] = js.undefined
}

object IColumnReorderHeaderProps {
  @scala.inline
  def apply(
    frozenColumnCountFromEnd: Int | Double = null,
    frozenColumnCountFromStart: Int | Double = null,
    handleColumnReorder: (/* draggedIndex */ Double, /* targetIndex */ Double) => Callback = null,
    onColumnDragEnd: (/* props */ AnonDropLocation, /* event */ MouseEvent) => Callback = null,
    onColumnDragStart: /* dragStarted */ Boolean => Callback = null,
    onColumnDrop: /* dragDropDetails */ IColumnDragDropDetails => Callback = null,
    onDragEnd: /* columnDropLocationDetails */ ColumnDragEndLocation => Callback = null
  ): IColumnReorderHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (frozenColumnCountFromEnd != null) __obj.updateDynamic("frozenColumnCountFromEnd")(frozenColumnCountFromEnd.asInstanceOf[js.Any])
    if (frozenColumnCountFromStart != null) __obj.updateDynamic("frozenColumnCountFromStart")(frozenColumnCountFromStart.asInstanceOf[js.Any])
    if (handleColumnReorder != null) __obj.updateDynamic("handleColumnReorder")(js.Any.fromFunction2((t0: /* draggedIndex */ scala.Double, t1: /* targetIndex */ scala.Double) => handleColumnReorder(t0, t1).runNow()))
    if (onColumnDragEnd != null) __obj.updateDynamic("onColumnDragEnd")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.officeUiFabricReact.AnonDropLocation, t1: /* event */ org.scalajs.dom.raw.MouseEvent) => onColumnDragEnd(t0, t1).runNow()))
    if (onColumnDragStart != null) __obj.updateDynamic("onColumnDragStart")(js.Any.fromFunction1((t0: /* dragStarted */ scala.Boolean) => onColumnDragStart(t0).runNow()))
    if (onColumnDrop != null) __obj.updateDynamic("onColumnDrop")(js.Any.fromFunction1((t0: /* dragDropDetails */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumnDragDropDetails) => onColumnDrop(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* columnDropLocationDetails */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation) => onDragEnd(t0).runNow()))
    __obj.asInstanceOf[IColumnReorderHeaderProps]
  }
}

