package typingsJapgolly.angularMocks.mod.angularAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// IntervalService
// see https://docs.angularjs.org/api/ngMock/service/$interval
// Augments the original service
///////////////////////////////////////////////////////////////////////////
trait IIntervalService extends js.Object {
  /**
    * Runs interval tasks scheduled to be run in the next `millis` milliseconds.
    *
    * @param millis - The maximum timeout amount to flush up until.
    * @return The amount of time moved forward.
    */
  def flush(millis: Double): Double
}

object IIntervalService {
  @scala.inline
  def apply(flush: Double => CallbackTo[Double]): IIntervalService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flush")(js.Any.fromFunction1((t0: scala.Double) => flush(t0).runNow()))
    __obj.asInstanceOf[IIntervalService]
  }
}

