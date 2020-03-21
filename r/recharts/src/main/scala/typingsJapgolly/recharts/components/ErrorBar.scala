package typingsJapgolly.recharts.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.recharts.AnonErrorVal
import typingsJapgolly.recharts.mod.DataKey
import typingsJapgolly.recharts.mod.ErrorBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ErrorBar {
  def apply(
    dataKey: DataKey,
    data: js.Array[_] = null,
    dataPointFormatter: (/* entry */ js.Any, /* dataKey */ DataKey) => CallbackTo[AnonErrorVal] = null,
    layout: String = null,
    offset: Int | Double = null,
    stroke: String = null,
    strokeWidth: Int | Double = null,
    width: Int | Double = null,
    xAxis: js.Object = null,
    yAxis: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ErrorBarProps, typingsJapgolly.recharts.mod.ErrorBar, Unit, ErrorBarProps] = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
  
      if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataPointFormatter != null) __obj.updateDynamic("dataPointFormatter")(js.Any.fromFunction2((t0: /* entry */ js.Any, t1: /* dataKey */ typingsJapgolly.recharts.mod.DataKey) => dataPointFormatter(t0, t1).runNow()))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.recharts.mod.ErrorBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.recharts.mod.ErrorBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.recharts.mod.ErrorBarProps])(children: _*)
  }
  @JSImport("recharts", "ErrorBar")
  @js.native
  object componentImport extends js.Object
  
}

