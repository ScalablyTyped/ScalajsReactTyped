package typingsJapgolly.agGrid.dragAndDropServiceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTarget extends js.Object {
  /** Icon to show when drag is over*/
  var getIconName: js.UndefOr[js.Function0[String]] = js.undefined
  /** If any secondary containers. For example when moving columns in ag-Grid, we listen for drops
    * in the header as well as the body (main rows and pinned rows) of the grid. */
  var getSecondaryContainers: js.UndefOr[js.Function0[js.Array[HTMLElement]]] = js.undefined
  /** Callback for when drag enters */
  var onDragEnter: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.undefined
  /** Callback for when drag leaves */
  var onDragLeave: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.undefined
  /** Callback for when drag stops */
  var onDragStop: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.undefined
  /** Callback for when dragging */
  var onDragging: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.undefined
  /** The main container that will get the drop. */
  def getContainer(): HTMLElement
  def isInterestedIn(`type`: DragSourceType): Boolean
}

object DropTarget {
  @scala.inline
  def apply(
    getContainer: CallbackTo[HTMLElement],
    isInterestedIn: DragSourceType => CallbackTo[Boolean],
    getIconName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSecondaryContainers: js.UndefOr[CallbackTo[js.Array[HTMLElement]]] = js.undefined,
    onDragEnter: /* params */ DraggingEvent => Callback = null,
    onDragLeave: /* params */ DraggingEvent => Callback = null,
    onDragStop: /* params */ DraggingEvent => Callback = null,
    onDragging: /* params */ DraggingEvent => Callback = null
  ): DropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContainer")(getContainer.toJsFn)
    __obj.updateDynamic("isInterestedIn")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.dragAndDropServiceMod.DragSourceType) => isInterestedIn(t0).runNow()))
    getIconName.foreach(p => __obj.updateDynamic("getIconName")(p.toJsFn))
    getSecondaryContainers.foreach(p => __obj.updateDynamic("getSecondaryContainers")(p.toJsFn))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.dragAndDropServiceMod.DraggingEvent) => onDragEnter(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.dragAndDropServiceMod.DraggingEvent) => onDragLeave(t0).runNow()))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.dragAndDropServiceMod.DraggingEvent) => onDragStop(t0).runNow()))
    if (onDragging != null) __obj.updateDynamic("onDragging")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.dragAndDropServiceMod.DraggingEvent) => onDragging(t0).runNow()))
    __obj.asInstanceOf[DropTarget]
  }
}

