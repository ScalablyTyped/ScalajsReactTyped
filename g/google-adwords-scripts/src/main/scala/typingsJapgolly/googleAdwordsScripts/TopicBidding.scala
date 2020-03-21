package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicBidding extends AdWordsBidding {
  def clearCpc(): Unit
  def clearCpm(): Unit
  def getCpc(): Double
  def getCpm(): Double
  def setCpc(cpc: Double): Unit
  def setCpm(cpm: Double): Unit
}

object TopicBidding {
  @scala.inline
  def apply(
    clearCpc: Callback,
    clearCpm: Callback,
    getCpc: CallbackTo[Double],
    getCpm: CallbackTo[Double],
    getStrategy: CallbackTo[BiddingStrategy],
    getStrategySource: CallbackTo[BiddingStrategySource],
    getStrategyType: CallbackTo[String],
    setCpc: Double => Callback,
    setCpm: Double => Callback
  ): TopicBidding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearCpc")(clearCpc.toJsFn)
    __obj.updateDynamic("clearCpm")(clearCpm.toJsFn)
    __obj.updateDynamic("getCpc")(getCpc.toJsFn)
    __obj.updateDynamic("getCpm")(getCpm.toJsFn)
    __obj.updateDynamic("getStrategy")(getStrategy.toJsFn)
    __obj.updateDynamic("getStrategySource")(getStrategySource.toJsFn)
    __obj.updateDynamic("getStrategyType")(getStrategyType.toJsFn)
    __obj.updateDynamic("setCpc")(js.Any.fromFunction1((t0: scala.Double) => setCpc(t0).runNow()))
    __obj.updateDynamic("setCpm")(js.Any.fromFunction1((t0: scala.Double) => setCpm(t0).runNow()))
    __obj.asInstanceOf[TopicBidding]
  }
}

