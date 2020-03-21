package typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.officeUiFabricReact.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropOptions extends js.Object {
  /**
    * Whether or not drag action is allowed.
    */
  var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /**
    * Whether or not drop action is allowed.
    */
  var canDrop: js.UndefOr[
    js.Function2[
      /* dropContext */ js.UndefOr[IDragDropContext], 
      /* dragContext */ js.UndefOr[IDragDropContext], 
      Boolean
    ]
  ] = js.undefined
  /**
    * Context associated with drag and drop event.
    */
  var context: IDragDropContext
  /**
    * Map of event name to callback function to subscribe to.
    */
  var eventMap: js.UndefOr[js.Array[AnonCallback]] = js.undefined
  /**
    * Unique key to associate with instance.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * On drag end event callback.
    */
  var onDragEnd: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.undefined
  /**
    * On drag over element(s) event callback.
    */
  var onDragOver: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.undefined
  /**
    * On drag start event callback.
    */
  var onDragStart: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* itemIndex */ js.UndefOr[Double], 
      /* selectedItems */ js.UndefOr[js.Array[_]], 
      /* event */ js.UndefOr[MouseEvent], 
      Unit
    ]
  ] = js.undefined
  /**
    * On drop event callback.
    */
  var onDrop: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.undefined
  /**
    * Selection index on drag and drop event.
    */
  var selectionIndex: Double
  /**
    * Callback on drop state update.
    */
  def updateDropState(isDropping: Boolean, event: DragEvent): Unit
}

object IDragDropOptions {
  @scala.inline
  def apply(
    context: IDragDropContext,
    selectionIndex: Double,
    updateDropState: (Boolean, DragEvent) => Callback,
    canDrag: /* item */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    canDrop: (/* dropContext */ js.UndefOr[IDragDropContext], /* dragContext */ js.UndefOr[IDragDropContext]) => CallbackTo[Boolean] = null,
    eventMap: js.Array[AnonCallback] = null,
    key: String = null,
    onDragEnd: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Callback = null,
    onDragOver: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Callback = null,
    onDragStart: (/* item */ js.UndefOr[js.Any], /* itemIndex */ js.UndefOr[Double], /* selectedItems */ js.UndefOr[js.Array[js.Any]], /* event */ js.UndefOr[MouseEvent]) => Callback = null,
    onDrop: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Callback = null
  ): IDragDropOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("updateDropState")(js.Any.fromFunction2((t0: scala.Boolean, t1: org.scalajs.dom.raw.DragEvent) => updateDropState(t0, t1).runNow()))
    if (canDrag != null) __obj.updateDynamic("canDrag")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => canDrag(t0).runNow()))
    if (canDrop != null) __obj.updateDynamic("canDrop")(js.Any.fromFunction2((t0: /* dropContext */ js.UndefOr[typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropContext], t1: /* dragContext */ js.UndefOr[typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropContext]) => canDrop(t0, t1).runNow()))
    if (eventMap != null) __obj.updateDynamic("eventMap")(eventMap.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* event */ js.UndefOr[org.scalajs.dom.raw.DragEvent]) => onDragEnd(t0, t1).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* event */ js.UndefOr[org.scalajs.dom.raw.DragEvent]) => onDragOver(t0, t1).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* itemIndex */ js.UndefOr[scala.Double], t2: /* selectedItems */ js.UndefOr[js.Array[js.Any]], t3: /* event */ js.UndefOr[org.scalajs.dom.raw.MouseEvent]) => onDragStart(t0, t1, t2, t3).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* event */ js.UndefOr[org.scalajs.dom.raw.DragEvent]) => onDrop(t0, t1).runNow()))
    __obj.asInstanceOf[IDragDropOptions]
  }
}

