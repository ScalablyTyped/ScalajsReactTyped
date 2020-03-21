package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetrics extends js.Object {
  def addExecutionTime(value: Double): Unit
  def decrementExecutionCount(): Unit
  def getCurrentExecutionCount(): Double
  def getExecutionTime(percentile: js.Any): Double
  def getHealthCounts(): HealthCounts
  def getRollingCount(`type`: js.Any): Double
  def incrementExecutionCount(): Unit
  def markFailure(): Unit
  def markRejected(): Unit
  def markShortCircuited(): Unit
  def markSuccess(): Unit
  def markTimeout(): Unit
  def reset(): Unit
}

object CommandMetrics {
  @scala.inline
  def apply(
    addExecutionTime: Double => Callback,
    decrementExecutionCount: Callback,
    getCurrentExecutionCount: CallbackTo[Double],
    getExecutionTime: js.Any => CallbackTo[Double],
    getHealthCounts: CallbackTo[HealthCounts],
    getRollingCount: js.Any => CallbackTo[Double],
    incrementExecutionCount: Callback,
    markFailure: Callback,
    markRejected: Callback,
    markShortCircuited: Callback,
    markSuccess: Callback,
    markTimeout: Callback,
    reset: Callback
  ): CommandMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addExecutionTime")(js.Any.fromFunction1((t0: scala.Double) => addExecutionTime(t0).runNow()))
    __obj.updateDynamic("decrementExecutionCount")(decrementExecutionCount.toJsFn)
    __obj.updateDynamic("getCurrentExecutionCount")(getCurrentExecutionCount.toJsFn)
    __obj.updateDynamic("getExecutionTime")(js.Any.fromFunction1((t0: js.Any) => getExecutionTime(t0).runNow()))
    __obj.updateDynamic("getHealthCounts")(getHealthCounts.toJsFn)
    __obj.updateDynamic("getRollingCount")(js.Any.fromFunction1((t0: js.Any) => getRollingCount(t0).runNow()))
    __obj.updateDynamic("incrementExecutionCount")(incrementExecutionCount.toJsFn)
    __obj.updateDynamic("markFailure")(markFailure.toJsFn)
    __obj.updateDynamic("markRejected")(markRejected.toJsFn)
    __obj.updateDynamic("markShortCircuited")(markShortCircuited.toJsFn)
    __obj.updateDynamic("markSuccess")(markSuccess.toJsFn)
    __obj.updateDynamic("markTimeout")(markTimeout.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[CommandMetrics]
  }
}

