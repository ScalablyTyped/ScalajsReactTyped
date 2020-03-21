package typingsJapgolly.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// data formats are not well documented on all the ways they can be passed to the constructors
// this definition gives some intellisense, but does not protect the user from misuse
// TODO: come in and tidy this up and make it fit better
trait IChartistData extends js.Object {
  var labels: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
  var series: js.Array[
    (js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData
  ]
}

object IChartistData {
  @scala.inline
  def apply(
    series: js.Array[
      (js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData
    ],
    labels: js.Array[js.Date | Double | String] = null
  ): IChartistData = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistData]
  }
}

