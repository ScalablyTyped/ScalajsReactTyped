package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramSeries extends js.Object {
  var barColor: js.UndefOr[Color] = js.undefined
  var data: js.UndefOr[ChartData] = js.undefined
}

object HistogramSeries {
  @scala.inline
  def apply(barColor: Color = null, data: ChartData = null): HistogramSeries = {
    val __obj = js.Dynamic.literal()
    if (barColor != null) __obj.updateDynamic("barColor")(barColor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramSeries]
  }
}

