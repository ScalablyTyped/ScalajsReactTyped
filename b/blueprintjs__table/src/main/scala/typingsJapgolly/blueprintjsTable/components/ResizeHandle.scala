package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.resizeHandleMod.IResizeHandleProps
import typingsJapgolly.blueprintjsTable.resizeHandleMod.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResizeHandle {
  def apply(
    orientation: Orientation,
    onLayoutLock: js.UndefOr[Boolean] => Callback,
    className: String = null,
    onDoubleClick: js.UndefOr[Callback] = js.undefined,
    onResizeEnd: /* offset */ Double => Callback = null,
    onResizeMove: (/* offset */ Double, /* delta */ Double) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IResizeHandleProps, 
    typingsJapgolly.blueprintjsTable.mod.ResizeHandle, 
    Unit, 
    IResizeHandleProps
  ] = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onLayoutLock")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => onLayoutLock(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    onDoubleClick.foreach(p => __obj.updateDynamic("onDoubleClick")(p.toJsFn))
    if (onResizeEnd != null) __obj.updateDynamic("onResizeEnd")(js.Any.fromFunction1((t0: /* offset */ scala.Double) => onResizeEnd(t0).runNow()))
    if (onResizeMove != null) __obj.updateDynamic("onResizeMove")(js.Any.fromFunction2((t0: /* offset */ scala.Double, t1: /* delta */ scala.Double) => onResizeMove(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.resizeHandleMod.IResizeHandleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.mod.ResizeHandle](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.resizeHandleMod.IResizeHandleProps])(children: _*)
  }
  @JSImport("@blueprintjs/table", "ResizeHandle")
  @js.native
  object componentImport extends js.Object
  
}

