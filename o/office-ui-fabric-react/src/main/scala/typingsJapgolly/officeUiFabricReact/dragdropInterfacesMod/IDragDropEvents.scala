package typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropEvents extends js.Object {
  /**
    * Whether or not drag action is allowed.
    */
  var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /**
    * Whether drag operation is allowed on groups
    */
  var canDragGroups: js.UndefOr[Boolean] = js.undefined
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
    * On drag end event callback.
    */
  var onDragEnd: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.undefined
  /**
    * On drag enter region event callback.
    */
  var onDragEnter: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], String]
  ] = js.undefined
  /**
    * On drag leave region event callback.
    */
  var onDragLeave: js.UndefOr[
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
}

object IDragDropEvents {
  @scala.inline
  def apply(
    canDrag: /* item */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    canDragGroups: js.UndefOr[Boolean] = js.undefined,
    canDrop: (/* dropContext */ js.UndefOr[IDragDropContext], /* dragContext */ js.UndefOr[IDragDropContext]) => CallbackTo[Boolean] = null,
    onDragEnd: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Callback = null,
    onDragEnter: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => CallbackTo[String] = null,
    onDragLeave: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Callback = null,
    onDragStart: (/* item */ js.UndefOr[js.Any], /* itemIndex */ js.UndefOr[Double], /* selectedItems */ js.UndefOr[js.Array[js.Any]], /* event */ js.UndefOr[MouseEvent]) => Callback = null,
    onDrop: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Callback = null
  ): IDragDropEvents = {
    val __obj = js.Dynamic.literal()
    if (canDrag != null) __obj.updateDynamic("canDrag")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => canDrag(t0).runNow()))
    if (!js.isUndefined(canDragGroups)) __obj.updateDynamic("canDragGroups")(canDragGroups.asInstanceOf[js.Any])
    if (canDrop != null) __obj.updateDynamic("canDrop")(js.Any.fromFunction2((t0: /* dropContext */ js.UndefOr[typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropContext], t1: /* dragContext */ js.UndefOr[typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropContext]) => canDrop(t0, t1).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* event */ js.UndefOr[org.scalajs.dom.raw.DragEvent]) => onDragEnd(t0, t1).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* event */ js.UndefOr[org.scalajs.dom.raw.DragEvent]) => onDragEnter(t0, t1).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* event */ js.UndefOr[org.scalajs.dom.raw.DragEvent]) => onDragLeave(t0, t1).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* itemIndex */ js.UndefOr[scala.Double], t2: /* selectedItems */ js.UndefOr[js.Array[js.Any]], t3: /* event */ js.UndefOr[org.scalajs.dom.raw.MouseEvent]) => onDragStart(t0, t1, t2, t3).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* event */ js.UndefOr[org.scalajs.dom.raw.DragEvent]) => onDrop(t0, t1).runNow()))
    __obj.asInstanceOf[IDragDropEvents]
  }
}

