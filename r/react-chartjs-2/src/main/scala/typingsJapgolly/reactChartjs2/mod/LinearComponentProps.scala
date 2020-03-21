package typingsJapgolly.reactChartjs2.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.chartJs.mod.ChartLegendOptions
import typingsJapgolly.chartJs.mod.ChartOptions
import typingsJapgolly.chartJs.mod.ChartType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearComponentProps extends ChartComponentProps

object LinearComponentProps {
  @scala.inline
  def apply(
    data: ChartData[typingsJapgolly.chartJs.mod.ChartData],
    datasetKeyProvider: /* any */ js.Any => CallbackTo[js.Any] = null,
    getDatasetAtEvent: /* e */ js.Any => Callback = null,
    getElementAtEvent: /* e */ js.Any => Callback = null,
    getElementsAtEvent: /* e */ js.Any => Callback = null,
    height: Int | Double = null,
    legend: ChartLegendOptions = null,
    onElementsClick: /* e */ js.Any => Callback = null,
    options: ChartOptions = null,
    plugins: js.Array[js.Object] = null,
    redraw: js.UndefOr[Boolean] = js.undefined,
    `type`: ChartType = null,
    width: Int | Double = null
  ): LinearComponentProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (datasetKeyProvider != null) __obj.updateDynamic("datasetKeyProvider")(js.Any.fromFunction1((t0: /* any */ js.Any) => datasetKeyProvider(t0).runNow()))
    if (getDatasetAtEvent != null) __obj.updateDynamic("getDatasetAtEvent")(js.Any.fromFunction1((t0: /* e */ js.Any) => getDatasetAtEvent(t0).runNow()))
    if (getElementAtEvent != null) __obj.updateDynamic("getElementAtEvent")(js.Any.fromFunction1((t0: /* e */ js.Any) => getElementAtEvent(t0).runNow()))
    if (getElementsAtEvent != null) __obj.updateDynamic("getElementsAtEvent")(js.Any.fromFunction1((t0: /* e */ js.Any) => getElementsAtEvent(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (onElementsClick != null) __obj.updateDynamic("onElementsClick")(js.Any.fromFunction1((t0: /* e */ js.Any) => onElementsClick(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(redraw)) __obj.updateDynamic("redraw")(redraw.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearComponentProps]
  }
}

