package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteResult extends js.Object {
  var keyword: String
  def getNumPois(): Double
  def getPoi(i: Double): AutocompleteResultPoi
}

object AutocompleteResult {
  @scala.inline
  def apply(
    getNumPois: CallbackTo[Double],
    getPoi: Double => CallbackTo[AutocompleteResultPoi],
    keyword: String
  ): AutocompleteResult = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.updateDynamic("getNumPois")(getNumPois.toJsFn)
    __obj.updateDynamic("getPoi")(js.Any.fromFunction1((t0: scala.Double) => getPoi(t0).runNow()))
    __obj.asInstanceOf[AutocompleteResult]
  }
}

