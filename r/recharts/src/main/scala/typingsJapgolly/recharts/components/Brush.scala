package typingsJapgolly.recharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.recharts.PartialMargin
import typingsJapgolly.recharts.mod.BrushProps
import typingsJapgolly.recharts.mod.DataKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Brush {
  def apply(
    className: String = null,
    data: js.Array[_] = null,
    dataKey: DataKey = null,
    endIndex: Int | Double = null,
    fill: String = null,
    gap: Int | Double = null,
    height: Int | Double = null,
    leaveTimeOut: Int | Double = null,
    onChange: /* repeated */ js.Any => Callback = null,
    padding: PartialMargin = null,
    startIndex: Int | Double = null,
    stroke: String = null,
    tickFormatter: /* value */ js.Any => CallbackTo[js.Any] = null,
    travellerWidth: Int | Double = null,
    updateId: String | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BrushProps, typingsJapgolly.recharts.mod.Brush, Unit, BrushProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (leaveTimeOut != null) __obj.updateDynamic("leaveTimeOut")(leaveTimeOut.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onChange(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction1((t0: /* value */ js.Any) => tickFormatter(t0).runNow()))
    if (travellerWidth != null) __obj.updateDynamic("travellerWidth")(travellerWidth.asInstanceOf[js.Any])
    if (updateId != null) __obj.updateDynamic("updateId")(updateId.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.recharts.mod.BrushProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.recharts.mod.Brush](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.recharts.mod.BrushProps])(children: _*)
  }
  @JSImport("recharts", "Brush")
  @js.native
  object componentImport extends js.Object
  
}

