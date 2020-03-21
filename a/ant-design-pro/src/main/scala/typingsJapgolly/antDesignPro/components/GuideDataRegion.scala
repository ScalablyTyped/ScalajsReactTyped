package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.bizchartsMod.Guide.DataRegion
import typingsJapgolly.bizcharts.bizchartsStrings.downward
import typingsJapgolly.bizcharts.bizchartsStrings.upward
import typingsJapgolly.bizcharts.mod.Guide.DataRegionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideDataRegion {
  def apply(
    content: String = null,
    direction: upward | downward = null,
    display: js.Object = null,
    end: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    lineLength: Int | Double = null,
    regionStyle: js.Object = null,
    start: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    style: js.Object = null,
    top: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DataRegionProps, DataRegion, Unit, DataRegionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (lineLength != null) __obj.updateDynamic("lineLength")(lineLength.asInstanceOf[js.Any])
    if (regionStyle != null) __obj.updateDynamic("regionStyle")(regionStyle.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.Guide.DataRegionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.bizchartsMod.Guide.DataRegion](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.Guide.DataRegionProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.DataRegion")
  @js.native
  object componentImport extends js.Object
  
}

