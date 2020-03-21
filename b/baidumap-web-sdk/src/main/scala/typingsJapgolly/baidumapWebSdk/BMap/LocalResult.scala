package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalResult extends js.Object {
  var bounds: Bounds
  var center: LocalResultPoi
  var city: String
  var keyword: String
  var moreResultsUrl: String
  var province: String
  var radius: Double
  var suggestions: js.Array[String]
  def getCityList(): js.Array[_]
  def getCurrentNumPois(): Double
  def getNumPages(): Double
  def getNumPois(): Double
  def getPageIndex(): Double
  def getPoi(i: Double): LocalResultPoi
}

object LocalResult {
  @scala.inline
  def apply(
    bounds: Bounds,
    center: LocalResultPoi,
    city: String,
    getCityList: CallbackTo[js.Array[js.Any]],
    getCurrentNumPois: CallbackTo[Double],
    getNumPages: CallbackTo[Double],
    getNumPois: CallbackTo[Double],
    getPageIndex: CallbackTo[Double],
    getPoi: Double => CallbackTo[LocalResultPoi],
    keyword: String,
    moreResultsUrl: String,
    province: String,
    radius: Double,
    suggestions: js.Array[String]
  ): LocalResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.updateDynamic("getCityList")(getCityList.toJsFn)
    __obj.updateDynamic("getCurrentNumPois")(getCurrentNumPois.toJsFn)
    __obj.updateDynamic("getNumPages")(getNumPages.toJsFn)
    __obj.updateDynamic("getNumPois")(getNumPois.toJsFn)
    __obj.updateDynamic("getPageIndex")(getPageIndex.toJsFn)
    __obj.updateDynamic("getPoi")(js.Any.fromFunction1((t0: scala.Double) => getPoi(t0).runNow()))
    __obj.asInstanceOf[LocalResult]
  }
}

