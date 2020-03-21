package typingsJapgolly.backo2.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backoff extends js.Object {
  /**
    * The number of previous attempts
    */
  var attempts: Double
  /**
    * The base to which the attempt is raised as an exponent
    */
  var factor: Double
  /**
    * An upper bound on the variance around the duration between attempts
    */
  var jitter: Double
  /**
    * An upper bound on the duration between attempts
    */
  var max: Double
  /**
    * A lower bound on the duration between attempts
    */
  var ms: Double
  /**
    * Compute the backoff duration and increment the number of attempts
    */
  def duration(): Double
  /**
    * Reset the number of attempts
    */
  def reset(): Unit
  /**
    * Set the jitter
    */
  def setJitter(jitter: Double): Unit
  /**
    * Set the maximum duration between attempts
    */
  def setMax(max: Double): Unit
  /**
    * Set the minimum duration between attempts
    */
  def setMin(min: Double): Unit
}

object Backoff {
  @scala.inline
  def apply(
    attempts: Double,
    duration: CallbackTo[Double],
    factor: Double,
    jitter: Double,
    max: Double,
    ms: Double,
    reset: Callback,
    setJitter: Double => Callback,
    setMax: Double => Callback,
    setMin: Double => Callback
  ): Backoff = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], ms = ms.asInstanceOf[js.Any])
    __obj.updateDynamic("duration")(duration.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("setJitter")(js.Any.fromFunction1((t0: scala.Double) => setJitter(t0).runNow()))
    __obj.updateDynamic("setMax")(js.Any.fromFunction1((t0: scala.Double) => setMax(t0).runNow()))
    __obj.updateDynamic("setMin")(js.Any.fromFunction1((t0: scala.Double) => setMin(t0).runNow()))
    __obj.asInstanceOf[Backoff]
  }
}

