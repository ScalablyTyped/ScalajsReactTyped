package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventProvider extends js.Object {
  var colToMove: IColumn
  var groupToMove: js.Any
  def assignEvents(): Unit
  def assignGridEventHandlers(): Unit
  def dragOver(event: js.Any): Unit
  def dragStart(event: js.Any): Unit
  def onGroupDrop(event: js.Any): Unit
  def onGroupMouseDown(event: js.Any): Unit
  def onHeaderDrop(event: js.Any): Unit
  def onHeaderMouseDown(event: js.Any): Unit
  def setDraggables(): Unit
}

object IEventProvider {
  @scala.inline
  def apply(
    assignEvents: Callback,
    assignGridEventHandlers: Callback,
    colToMove: IColumn,
    dragOver: js.Any => Callback,
    dragStart: js.Any => Callback,
    groupToMove: js.Any,
    onGroupDrop: js.Any => Callback,
    onGroupMouseDown: js.Any => Callback,
    onHeaderDrop: js.Any => Callback,
    onHeaderMouseDown: js.Any => Callback,
    setDraggables: Callback
  ): IEventProvider = {
    val __obj = js.Dynamic.literal(colToMove = colToMove.asInstanceOf[js.Any], groupToMove = groupToMove.asInstanceOf[js.Any])
    __obj.updateDynamic("assignEvents")(assignEvents.toJsFn)
    __obj.updateDynamic("assignGridEventHandlers")(assignGridEventHandlers.toJsFn)
    __obj.updateDynamic("dragOver")(js.Any.fromFunction1((t0: js.Any) => dragOver(t0).runNow()))
    __obj.updateDynamic("dragStart")(js.Any.fromFunction1((t0: js.Any) => dragStart(t0).runNow()))
    __obj.updateDynamic("onGroupDrop")(js.Any.fromFunction1((t0: js.Any) => onGroupDrop(t0).runNow()))
    __obj.updateDynamic("onGroupMouseDown")(js.Any.fromFunction1((t0: js.Any) => onGroupMouseDown(t0).runNow()))
    __obj.updateDynamic("onHeaderDrop")(js.Any.fromFunction1((t0: js.Any) => onHeaderDrop(t0).runNow()))
    __obj.updateDynamic("onHeaderMouseDown")(js.Any.fromFunction1((t0: js.Any) => onHeaderMouseDown(t0).runNow()))
    __obj.updateDynamic("setDraggables")(setDraggables.toJsFn)
    __obj.asInstanceOf[IEventProvider]
  }
}

