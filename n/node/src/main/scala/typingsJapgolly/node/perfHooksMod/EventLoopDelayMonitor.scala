package typingsJapgolly.node.perfHooksMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLoopDelayMonitor extends js.Object {
  /**
    * The number of times the event loop delay exceeded the maximum 1 hour eventloop delay threshold.
    */
  val exceeds: Double
  /**
    * The maximum recorded event loop delay.
    */
  val max: Double
  /**
    * The mean of the recorded event loop delays.
    */
  val mean: Double
  /**
    * The minimum recorded event loop delay.
    */
  val min: Double
  /**
    * A `Map` object detailing the accumulated percentile distribution.
    */
  val percentiles: Map[Double, Double]
  /**
    * The standard deviation of the recorded event loop delays.
    */
  val stddev: Double
  /**
    * Disables the event loop delay sample timer. Returns `true` if the timer was stopped, `false` if it was already stopped.
    */
  def disable(): Boolean
  /**
    * Enables the event loop delay sample timer. Returns `true` if the timer was started, `false` if it was already started.
    */
  def enable(): Boolean
  /**
    * Returns the value at the given percentile.
    * @param percentile A percentile value between 1 and 100.
    */
  def percentile(percentile: Double): Double
  /**
    * Resets the collected histogram data.
    */
  def reset(): Unit
}

object EventLoopDelayMonitor {
  @scala.inline
  def apply(
    disable: CallbackTo[Boolean],
    enable: CallbackTo[Boolean],
    exceeds: Double,
    max: Double,
    mean: Double,
    min: Double,
    percentile: Double => CallbackTo[Double],
    percentiles: Map[Double, Double],
    reset: Callback,
    stddev: Double
  ): EventLoopDelayMonitor = {
    val __obj = js.Dynamic.literal(exceeds = exceeds.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], percentiles = percentiles.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any])
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("percentile")(js.Any.fromFunction1((t0: scala.Double) => percentile(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[EventLoopDelayMonitor]
  }
}

