package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetOptions extends js.Object {
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetDragenterEvent, Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetDragleaveEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetDropEvent, Unit]] = js.undefined
  var group: js.UndefOr[String] = js.undefined
}

object DropTargetOptions {
  @scala.inline
  def apply(
    dragenter: /* e */ DropTargetDragenterEvent => Callback = null,
    dragleave: /* e */ DropTargetDragleaveEvent => Callback = null,
    drop: /* e */ DropTargetDropEvent => Callback = null,
    group: String = null
  ): DropTargetOptions = {
    val __obj = js.Dynamic.literal()
    if (dragenter != null) __obj.updateDynamic("dragenter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DropTargetDragenterEvent) => dragenter(t0).runNow()))
    if (dragleave != null) __obj.updateDynamic("dragleave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DropTargetDragleaveEvent) => dragleave(t0).runNow()))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DropTargetDropEvent) => drop(t0).runNow()))
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetOptions]
  }
}

