package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.chartChartMod.ChartProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Chart {
  def apply(
    className: String = null,
    data: js.Object = null,
    height: String = null,
    id: String = null,
    options: js.Object = null,
    style: js.Object = null,
    `type`: String = null,
    width: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ChartProps, typingsJapgolly.primereact.chartMod.Chart, Unit, ChartProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.chartChartMod.ChartProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.chartMod.Chart](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.chartChartMod.ChartProps])(children: _*)
  }
  @JSImport("primereact/chart", "Chart")
  @js.native
  object componentImport extends js.Object
  
}

