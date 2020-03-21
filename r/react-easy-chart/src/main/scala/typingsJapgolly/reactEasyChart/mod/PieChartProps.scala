package typingsJapgolly.reactEasyChart.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactEasyChart.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartProps extends js.Object {
  var clickHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  var data: js.Array[AnonColor]
  /** Size in pixels of the inner hole (diameter) */
  var innerHoleSize: js.UndefOr[Double] = js.undefined
  /** Whether to add labels the to pie segments */
  var labels: js.UndefOr[Boolean] = js.undefined
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  /** Padding around the chart in pixels */
  var padding: js.UndefOr[Double] = js.undefined
  /** Size in pixels in each dimension */
  var size: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.undefined
}

object PieChartProps {
  @scala.inline
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
    styles: StringDictionary[CSSProperties] = null
  ): PieChartProps = {
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
    __obj.asInstanceOf[PieChartProps]
  }
}

