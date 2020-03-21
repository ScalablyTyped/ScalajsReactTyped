package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExponentialRolloutRate extends js.Object {
  /**
    * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This parameter allows you to define the initial rate of rollout.
    */
  var baseRatePerMinute: RolloutRatePerMinute = js.native
  /**
    * The exponential factor to increase the rate of rollout for a job.
    */
  var incrementFactor: IncrementFactor = js.native
  /**
    * The criteria to initiate the increase in rate of rollout for a job. AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
    */
  var rateIncreaseCriteria: RateIncreaseCriteria = js.native
}

object ExponentialRolloutRate {
  @scala.inline
  def apply(
    baseRatePerMinute: RolloutRatePerMinute,
    incrementFactor: IncrementFactor,
    rateIncreaseCriteria: RateIncreaseCriteria
  ): ExponentialRolloutRate = {
    val __obj = js.Dynamic.literal(baseRatePerMinute = baseRatePerMinute.asInstanceOf[js.Any], incrementFactor = incrementFactor.asInstanceOf[js.Any], rateIncreaseCriteria = rateIncreaseCriteria.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExponentialRolloutRate]
  }
}

