package typingsJapgolly.reactDraggable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.reactDraggable.PartialDraggableProps
import typingsJapgolly.reactDraggable.mod.ControlPosition
import typingsJapgolly.reactDraggable.mod.DraggableBounds
import typingsJapgolly.reactDraggable.mod.DraggableData
import typingsJapgolly.reactDraggable.mod.DraggableEvent
import typingsJapgolly.reactDraggable.mod.PositionOffsetControlPosition
import typingsJapgolly.reactDraggable.mod.default
import typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
import typingsJapgolly.reactDraggable.reactDraggableStrings.both
import typingsJapgolly.reactDraggable.reactDraggableStrings.none
import typingsJapgolly.reactDraggable.reactDraggableStrings.x
import typingsJapgolly.reactDraggable.reactDraggableStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDraggable {
  def apply(
    allowAnyClick: js.UndefOr[Boolean] = js.undefined,
    axis: both | x | y | none = null,
    bounds: DraggableBounds | String | `false` = null,
    cancel: String = null,
    defaultClassName: String = null,
    defaultClassNameDragged: String = null,
    defaultClassNameDragging: String = null,
    defaultPosition: ControlPosition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enableUserSelectHack: js.UndefOr[Boolean] = js.undefined,
    grid: js.Tuple2[Double, Double] = null,
    handle: String = null,
    offsetParent: HTMLElement = null,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`] = null,
    onMouseDown: /* e */ MouseEvent => Callback = null,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`] = null,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`] = null,
    position: ControlPosition = null,
    positionOffset: PositionOffsetControlPosition = null,
    scale: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PartialDraggableProps, default, Unit, PartialDraggableProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowAnyClick)) __obj.updateDynamic("allowAnyClick")(allowAnyClick.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (defaultClassName != null) __obj.updateDynamic("defaultClassName")(defaultClassName.asInstanceOf[js.Any])
    if (defaultClassNameDragged != null) __obj.updateDynamic("defaultClassNameDragged")(defaultClassNameDragged.asInstanceOf[js.Any])
    if (defaultClassNameDragging != null) __obj.updateDynamic("defaultClassNameDragging")(defaultClassNameDragging.asInstanceOf[js.Any])
    if (defaultPosition != null) __obj.updateDynamic("defaultPosition")(defaultPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUserSelectHack)) __obj.updateDynamic("enableUserSelectHack")(enableUserSelectHack.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onDrag(t0, t1).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MouseEvent) => onMouseDown(t0).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onStart(t0, t1).runNow()))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onStop(t0, t1).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionOffset != null) __obj.updateDynamic("positionOffset")(positionOffset.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDraggable.PartialDraggableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDraggable.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDraggable.PartialDraggableProps])(children: _*)
  }
  @JSImport("react-draggable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

