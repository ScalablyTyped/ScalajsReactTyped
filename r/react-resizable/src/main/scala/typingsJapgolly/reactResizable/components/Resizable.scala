package typingsJapgolly.reactResizable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactResizable.mod.Axis
import typingsJapgolly.reactResizable.mod.ResizableProps
import typingsJapgolly.reactResizable.mod.ResizeCallbackData
import typingsJapgolly.reactResizable.mod.ResizeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Resizable {
  def apply(
    height: Double,
    width: Double,
    axis: Axis = null,
    className: String = null,
    draggableOpts: js.Any = null,
    handle: Node | (js.Function1[/* resizeHandle */ ResizeHandle, Node]) = null,
    handleSize: js.Tuple2[Double, Double] = null,
    lockAspectRatio: js.UndefOr[Boolean] = js.undefined,
    maxConstraints: js.Tuple2[Double, Double] = null,
    minConstraints: js.Tuple2[Double, Double] = null,
    onResize: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => CallbackTo[js.Any] = null,
    onResizeStart: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => CallbackTo[js.Any] = null,
    onResizeStop: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => CallbackTo[js.Any] = null,
    resizeHandles: js.Array[ResizeHandle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ResizableProps, typingsJapgolly.reactResizable.mod.Resizable, Unit, ResizableProps] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (draggableOpts != null) __obj.updateDynamic("draggableOpts")(draggableOpts.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (handleSize != null) __obj.updateDynamic("handleSize")(handleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.asInstanceOf[js.Any])
    if (maxConstraints != null) __obj.updateDynamic("maxConstraints")(maxConstraints.asInstanceOf[js.Any])
    if (minConstraints != null) __obj.updateDynamic("minConstraints")(minConstraints.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: /* data */ typingsJapgolly.reactResizable.mod.ResizeCallbackData) => onResize(t0, t1).runNow()))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: /* data */ typingsJapgolly.reactResizable.mod.ResizeCallbackData) => onResizeStart(t0, t1).runNow()))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: /* data */ typingsJapgolly.reactResizable.mod.ResizeCallbackData) => onResizeStop(t0, t1).runNow()))
    if (resizeHandles != null) __obj.updateDynamic("resizeHandles")(resizeHandles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactResizable.mod.ResizableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactResizable.mod.Resizable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactResizable.mod.ResizableProps])(children: _*)
  }
  @JSImport("react-resizable", "Resizable")
  @js.native
  object componentImport extends js.Object
  
}

