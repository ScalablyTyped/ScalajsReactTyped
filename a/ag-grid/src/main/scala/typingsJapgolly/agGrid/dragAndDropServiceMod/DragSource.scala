package typingsJapgolly.agGrid.dragAndDropServiceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragSource extends js.Object {
  /** This name appears in the ghost icon when dragging */
  var dragItemName: String
  /** The drop target associated with this dragSource. So when dragging starts, this target does not get
    * onDragEnter event. */
  var dragSourceDropTarget: js.UndefOr[DropTarget] = js.undefined
  /** After how many pixels of dragging should the drag operation start. Default is 4px. */
  var dragStartPixels: js.UndefOr[Double] = js.undefined
  /** Callback for drag started */
  var dragStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Callback for drag stopped */
  var dragStopped: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Element which, when dragged, will kick off the DnD process */
  var eElement: HTMLElement
  /** So the drop target knows what type of event it is, useful for columns,
    * we we re-ordering or moving dropping from toolPanel */
  var `type`: DragSourceType
  /** If eElement is dragged, then the dragItem is the object that gets passed around. */
  def dragItemCallback(): DragItem
}

object DragSource {
  @scala.inline
  def apply(
    dragItemCallback: CallbackTo[DragItem],
    dragItemName: String,
    eElement: HTMLElement,
    `type`: DragSourceType,
    dragSourceDropTarget: DropTarget = null,
    dragStartPixels: Int | Double = null,
    dragStarted: js.UndefOr[Callback] = js.undefined,
    dragStopped: js.UndefOr[Callback] = js.undefined
  ): DragSource = {
    val __obj = js.Dynamic.literal(dragItemName = dragItemName.asInstanceOf[js.Any], eElement = eElement.asInstanceOf[js.Any])
    __obj.updateDynamic("dragItemCallback")(dragItemCallback.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dragSourceDropTarget != null) __obj.updateDynamic("dragSourceDropTarget")(dragSourceDropTarget.asInstanceOf[js.Any])
    if (dragStartPixels != null) __obj.updateDynamic("dragStartPixels")(dragStartPixels.asInstanceOf[js.Any])
    dragStarted.foreach(p => __obj.updateDynamic("dragStarted")(p.toJsFn))
    dragStopped.foreach(p => __obj.updateDynamic("dragStopped")(p.toJsFn))
    __obj.asInstanceOf[DragSource]
  }
}

