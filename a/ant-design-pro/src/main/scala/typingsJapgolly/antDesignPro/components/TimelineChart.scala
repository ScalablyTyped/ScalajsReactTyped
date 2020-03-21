package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.AnonY1
import typingsJapgolly.antDesignPro.AnonY2
import typingsJapgolly.antDesignPro.timelineChartMod.ITimelineChartProps
import typingsJapgolly.antDesignPro.timelineChartMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimelineChart {
  def apply(
    data: js.Array[AnonY1],
    titleMap: AnonY2,
    height: Int | Double = null,
    padding: js.Tuple4[Double, Double, Double, Double] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ITimelineChartProps, default, Unit, ITimelineChartProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], titleMap = titleMap.asInstanceOf[js.Any])
  
      if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.timelineChartMod.ITimelineChartProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.timelineChartMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.timelineChartMod.ITimelineChartProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/TimelineChart", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

