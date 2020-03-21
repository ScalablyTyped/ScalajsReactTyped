package typingsJapgolly.reactNativeSvgCharts.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvgCharts.mod.ProgressCircleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressCircle {
  def apply(
    progress: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    animateDuration: Int | Double = null,
    backgroundColor: String = null,
    endAngle: Int | Double = null,
    progressColor: String = null,
    startAngle: Int | Double = null,
    strokeWidth: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ProgressCircleProps, 
    typingsJapgolly.reactNativeSvgCharts.mod.ProgressCircle, 
    Unit, 
    ProgressCircleProps
  ] = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animateDuration != null) __obj.updateDynamic("animateDuration")(animateDuration.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvgCharts.mod.ProgressCircleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvgCharts.mod.ProgressCircle](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvgCharts.mod.ProgressCircleProps])(children: _*)
  }
  @JSImport("react-native-svg-charts", "ProgressCircle")
  @js.native
  object componentImport extends js.Object
  
}

