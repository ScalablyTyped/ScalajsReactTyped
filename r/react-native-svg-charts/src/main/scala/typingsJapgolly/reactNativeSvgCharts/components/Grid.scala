package typingsJapgolly.reactNativeSvgCharts.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeSvgCharts.PartialLineProps
import typingsJapgolly.reactNativeSvgCharts.mod.GridDirection
import typingsJapgolly.reactNativeSvgCharts.mod.GridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
  def apply[T](
    belowChart: js.UndefOr[Boolean] = js.undefined,
    direction: GridDirection = null,
    svg: PartialLineProps = null,
    ticks: js.Array[T] = null,
    x: T => CallbackTo[Double] = null,
    y: T => CallbackTo[Double] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GridProps[T], typingsJapgolly.reactNativeSvgCharts.mod.Grid[T], Unit, GridProps[T]] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(belowChart)) __obj.updateDynamic("belowChart")(belowChart.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(js.Any.fromFunction1((t0: T) => x(t0).runNow()))
    if (y != null) __obj.updateDynamic("y")(js.Any.fromFunction1((t0: T) => y(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvgCharts.mod.GridProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvgCharts.mod.Grid[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvgCharts.mod.GridProps[T]])(children: _*)
  }
  @JSImport("react-native-svg-charts", "Grid")
  @js.native
  object componentImport extends js.Object
  
}

