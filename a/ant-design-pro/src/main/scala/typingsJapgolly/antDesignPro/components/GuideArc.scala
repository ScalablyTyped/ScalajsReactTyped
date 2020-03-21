package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.bizchartsMod.Guide.Arc
import typingsJapgolly.bizcharts.mod.Guide.ArcProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideArc {
  def apply(
    end: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    start: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    style: js.Any = null,
    top: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ArcProps, Arc, Unit, ArcProps] = {
    val __obj = js.Dynamic.literal()
  
      if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.Guide.ArcProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.bizchartsMod.Guide.Arc](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.Guide.ArcProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.Arc")
  @js.native
  object componentImport extends js.Object
  
}

