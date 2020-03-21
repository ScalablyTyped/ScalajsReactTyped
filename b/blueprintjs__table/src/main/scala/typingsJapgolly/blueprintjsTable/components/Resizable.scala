package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.resizableMod.IResizableProps
import typingsJapgolly.blueprintjsTable.resizeHandleMod.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Resizable {
  def apply(
    orientation: Orientation,
    size: Double,
    onLayoutLock: js.UndefOr[Boolean] => Callback,
    className: String = null,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    onDoubleClick: js.UndefOr[Callback] = js.undefined,
    onResizeEnd: /* size */ Double => Callback = null,
    onSizeChanged: /* size */ Double => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IResizableProps, 
    typingsJapgolly.blueprintjsTable.resizableMod.Resizable, 
    Unit, 
    IResizableProps
  ] = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onLayoutLock")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => onLayoutLock(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    onDoubleClick.foreach(p => __obj.updateDynamic("onDoubleClick")(p.toJsFn))
    if (onResizeEnd != null) __obj.updateDynamic("onResizeEnd")(js.Any.fromFunction1((t0: /* size */ scala.Double) => onResizeEnd(t0).runNow()))
    if (onSizeChanged != null) __obj.updateDynamic("onSizeChanged")(js.Any.fromFunction1((t0: /* size */ scala.Double) => onSizeChanged(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.resizableMod.IResizableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.resizableMod.Resizable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.resizableMod.IResizableProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
  @js.native
  object componentImport extends js.Object
  
}

