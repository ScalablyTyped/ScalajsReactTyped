package typingsJapgolly.reactNativeSvgCharts.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeSvgCharts.mod.Decorators.HorizontalLine
import typingsJapgolly.reactNativeSvgCharts.mod.HorizontalLineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DecoratorsHorizontalLine {
  def apply(
    stroke: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HorizontalLineProps, HorizontalLine, Unit, HorizontalLineProps] = {
    val __obj = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvgCharts.mod.HorizontalLineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvgCharts.mod.Decorators.HorizontalLine](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvgCharts.mod.HorizontalLineProps])(children: _*)
  }
  @JSImport("react-native-svg-charts", "Decorators.HorizontalLine")
  @js.native
  object componentImport extends js.Object
  
}

