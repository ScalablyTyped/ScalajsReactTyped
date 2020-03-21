package typingsJapgolly.reactDraggable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.reactDraggable.PartialDraggableCoreProps
import typingsJapgolly.reactDraggable.mod.DraggableData
import typingsJapgolly.reactDraggable.mod.DraggableEvent
import typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DraggableCore {
  def apply(
    allowAnyClick: js.UndefOr[Boolean] = js.undefined,
    cancel: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enableUserSelectHack: js.UndefOr[Boolean] = js.undefined,
    grid: js.Tuple2[Double, Double] = null,
    handle: String = null,
    offsetParent: HTMLElement = null,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`] = null,
    onMouseDown: /* e */ MouseEvent => Callback = null,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`] = null,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`] = null,
    scale: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PartialDraggableCoreProps, 
    typingsJapgolly.reactDraggable.mod.DraggableCore, 
    Unit, 
    PartialDraggableCoreProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowAnyClick)) __obj.updateDynamic("allowAnyClick")(allowAnyClick.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUserSelectHack)) __obj.updateDynamic("enableUserSelectHack")(enableUserSelectHack.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onDrag(t0, t1).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MouseEvent) => onMouseDown(t0).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onStart(t0, t1).runNow()))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onStop(t0, t1).runNow()))
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDraggable.PartialDraggableCoreProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDraggable.mod.DraggableCore](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDraggable.PartialDraggableCoreProps])(children: _*)
  }
  @JSImport("react-draggable", "DraggableCore")
  @js.native
  object componentImport extends js.Object
  
}

