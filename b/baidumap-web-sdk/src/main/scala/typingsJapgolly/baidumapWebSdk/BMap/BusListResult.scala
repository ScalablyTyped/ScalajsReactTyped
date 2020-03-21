package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusListResult extends js.Object {
  var city: String
  var keyword: String
  var moreResultsUrl: String
  def getBusListItem(i: Double): BusListItem
  def getNumBusList(): Double
}

object BusListResult {
  @scala.inline
  def apply(
    city: String,
    getBusListItem: Double => CallbackTo[BusListItem],
    getNumBusList: CallbackTo[Double],
    keyword: String,
    moreResultsUrl: String
  ): BusListResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("getBusListItem")(js.Any.fromFunction1((t0: scala.Double) => getBusListItem(t0).runNow()))
    __obj.updateDynamic("getNumBusList")(getNumBusList.toJsFn)
    __obj.asInstanceOf[BusListResult]
  }
}

