package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.draggableMod.IDraggableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Draggable {
  def apply(
    className: String = null,
    onActivate: /* event */ MouseEvent => CallbackTo[Boolean] = null,
    onClick: /* event */ MouseEvent => Callback = null,
    onDoubleClick: /* event */ MouseEvent => Callback = null,
    onDragEnd: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Callback = null,
    onDragMove: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Callback = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IDraggableProps, typingsJapgolly.blueprintjsTable.mod.Draggable, Unit, IDraggableProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onActivate(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onClick(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onDoubleClick(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData) => onDragEnd(t0, t1).runNow()))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction2((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData) => onDragMove(t0, t1).runNow()))
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.draggableMod.IDraggableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.mod.Draggable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.draggableMod.IDraggableProps])(children: _*)
  }
  @JSImport("@blueprintjs/table", "Draggable")
  @js.native
  object componentImport extends js.Object
  
}

