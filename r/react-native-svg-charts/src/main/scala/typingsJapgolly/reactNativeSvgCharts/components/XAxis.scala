package typingsJapgolly.reactNativeSvgCharts.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvgCharts.AnonLeft
import typingsJapgolly.reactNativeSvgCharts.PartialTextProps
import typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsJapgolly.reactNativeSvgCharts.mod.ScaleType
import typingsJapgolly.reactNativeSvgCharts.mod.XAxisProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object XAxis {
  def apply[T](
    data: js.Array[T],
    contentInset: AnonLeft = null,
    formatLabel: (/* value */ js.Any, /* index */ Double) => CallbackTo[Double | String] = null,
    numberOfTicks: Int | Double = null,
    scale: js.UndefOr[CallbackTo[(ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]]] = js.undefined,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    svg: PartialTextProps = null,
    xAccessor: /* props */ AccessorFunctionProps[T] => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[XAxisProps[T], typingsJapgolly.reactNativeSvgCharts.mod.XAxis[T], Unit, XAxisProps[T]] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* index */ scala.Double) => formatLabel(t0, t1).runNow()))
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    scale.foreach(p => __obj.updateDynamic("scale")(p.toJsFn))
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps[T]) => xAccessor(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvgCharts.mod.XAxisProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvgCharts.mod.XAxis[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvgCharts.mod.XAxisProps[T]])(children: _*)
  }
  @JSImport("react-native-svg-charts", "XAxis")
  @js.native
  object componentImport extends js.Object
  
}

