package typingsJapgolly.reactEasyChart.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactEasyChart.AnonColor
import typingsJapgolly.reactEasyChart.mod.PieChartProps
import typingsJapgolly.reactEasyChart.mod.PieData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PieChart {
  def apply(
    data: js.Array[AnonColor],
    clickHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    innerHoleSize: Int | Double = null,
    labels: js.UndefOr[Boolean] = js.undefined,
    mouseMoveHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    mouseOutHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    mouseOverHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    padding: Int | Double = null,
    size: Int | Double = null,
    styles: StringDictionary[CSSProperties] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PieChartProps, typingsJapgolly.reactEasyChart.mod.PieChart, Unit, PieChartProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.PieData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => clickHandler(t0, t1).runNow()))
    if (innerHoleSize != null) __obj.updateDynamic("innerHoleSize")(innerHoleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.PieData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseMoveHandler(t0, t1).runNow()))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.PieData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseOutHandler(t0, t1).runNow()))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.PieData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseOverHandler(t0, t1).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactEasyChart.mod.PieChartProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactEasyChart.mod.PieChart](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactEasyChart.mod.PieChartProps])(children: _*)
  }
  @JSImport("react-easy-chart", "PieChart")
  @js.native
  object componentImport extends js.Object
  
}

