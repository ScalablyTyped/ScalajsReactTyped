package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkingRouteResult extends js.Object {
  var city: String
  def getEnd(): LocalResultPoi
  def getNumPlans(): Double
  def getPlan(i: Double): RoutePlan
  def getStart(): LocalResultPoi
}

object WalkingRouteResult {
  @scala.inline
  def apply(
    city: String,
    getEnd: CallbackTo[LocalResultPoi],
    getNumPlans: CallbackTo[Double],
    getPlan: Double => CallbackTo[RoutePlan],
    getStart: CallbackTo[LocalResultPoi]
  ): WalkingRouteResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any])
    __obj.updateDynamic("getEnd")(getEnd.toJsFn)
    __obj.updateDynamic("getNumPlans")(getNumPlans.toJsFn)
    __obj.updateDynamic("getPlan")(js.Any.fromFunction1((t0: scala.Double) => getPlan(t0).runNow()))
    __obj.updateDynamic("getStart")(getStart.toJsFn)
    __obj.asInstanceOf[WalkingRouteResult]
  }
}

