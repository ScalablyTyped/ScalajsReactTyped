package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandlestickSeries extends js.Object {
  /** The data of the CandlestickSeries. */
  var data: js.UndefOr[ChartData] = js.undefined
}

object CandlestickSeries {
  @scala.inline
  def apply(data: ChartData = null): CandlestickSeries = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandlestickSeries]
  }
}

