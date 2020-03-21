package typingsJapgolly.blueprintjsTable.draggableMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragHandler extends js.Object {
  /**
    * Called when the mouse is pressed down. Drag and click operations may
    * be cancelled at this point by returning false from this method.
    */
  var onActivate: js.UndefOr[js.Function1[/* event */ MouseEvent, Boolean]] = js.undefined
  /**
    * Called when the mouse is released iff the mouse was NOT dragged after
    * activation.
    *
    * This will be called asynchronously if `onDoubleClick` is defined. See
    * that callback for more details.
    */
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * Called iff there are two click events within the timeout
    * `DragEvents.DOUBLE_CLICK_TIMEOUT_MSEC`, which defaults to 500 msec.
    *
    * NOTE: Defining this callback requires that we wait to invoke the
    * `onClick` callback until the timeout has expired and we are certain the
    * interaction was only a single click. If this callback is not defined,
    * the `onClick` callback will be invoked synchronously with the mouseup
    * event.
    */
  var onDoubleClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * Called when the mouse is released iff the mouse was dragged after
    * activation.
    */
  var onDragEnd: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Unit]] = js.undefined
  /**
    * Called every time the mouse is moved after activation and before the
    * mouse is released. This method is also called on the last even when the
    * mouse is released.
    */
  var onDragMove: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Unit]] = js.undefined
  /**
    * This prevents mouse events from performing their default operation such
    * as text selection.
    * @default true
    */
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * This prevents the event from propagating up to parent elements.
    * @default false
    */
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
}

object IDragHandler {
  @scala.inline
  def apply(
    onActivate: /* event */ MouseEvent => CallbackTo[Boolean] = null,
    onClick: /* event */ MouseEvent => Callback = null,
    onDoubleClick: /* event */ MouseEvent => Callback = null,
    onDragEnd: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Callback = null,
    onDragMove: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Callback = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined
  ): IDragHandler = {
    val __obj = js.Dynamic.literal()
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onActivate(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onClick(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onDoubleClick(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData) => onDragEnd(t0, t1).runNow()))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction2((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData) => onDragMove(t0, t1).runNow()))
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragHandler]
  }
}

