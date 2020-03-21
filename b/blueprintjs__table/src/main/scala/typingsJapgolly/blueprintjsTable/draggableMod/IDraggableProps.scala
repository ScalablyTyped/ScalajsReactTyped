package typingsJapgolly.blueprintjsTable.draggableMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDraggableProps
  extends IProps
     with IDragHandler

object IDraggableProps {
  @scala.inline
  def apply(
    className: String = null,
    onActivate: /* event */ MouseEvent => CallbackTo[Boolean] = null,
    onClick: /* event */ MouseEvent => Callback = null,
    onDoubleClick: /* event */ MouseEvent => Callback = null,
    onDragEnd: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Callback = null,
    onDragMove: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Callback = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined
  ): IDraggableProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onActivate(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onClick(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onDoubleClick(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData) => onDragEnd(t0, t1).runNow()))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction2((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData) => onDragMove(t0, t1).runNow()))
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDraggableProps]
  }
}

