package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.AnonY
import typingsJapgolly.antDesignPro.miniAreaMod.IAxis
import typingsJapgolly.antDesignPro.miniAreaMod.IMiniAreaProps
import typingsJapgolly.antDesignPro.miniAreaMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MiniArea {
  def apply(
    data: js.Array[AnonY],
    height: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    borderColor: String = null,
    color: String = null,
    line: js.UndefOr[Boolean] = js.undefined,
    xAxis: IAxis = null,
    yAxis: IAxis = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IMiniAreaProps, default, Unit, IMiniAreaProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.miniAreaMod.IMiniAreaProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.miniAreaMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.miniAreaMod.IMiniAreaProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/MiniArea", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

