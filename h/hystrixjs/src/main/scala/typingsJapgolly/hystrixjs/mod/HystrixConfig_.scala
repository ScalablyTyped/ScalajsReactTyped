package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HystrixConfig_ extends js.Object {
  def circuitBreakerErrorThresholdPercentage(): Double
  def circuitBreakerForceClosed(): Boolean
  def circuitBreakerForceOpened(): Boolean
  def circuitBreakerRequestVolumeThreshold(): Double
  def circuitBreakerRequestVolumeThresholdForceOverride(): Boolean
  def circuitBreakerRequestVolumeThresholdOverride(): Double
  def circuitBreakerSleepWindowInMilliseconds(): Double
  def executionTimeoutInMilliseconds(): Double
  def init(properties: HystrixProperties): Unit
  def metricsPercentileWindowBuckets(): Double
  def metricsPercentileWindowInMilliseconds(): Double
  def metricsStatisticalWindowBuckets(): Double
  def metricsStatisticalWindowInMilliseconds(): Double
  def requestVolumeRejectionThreshold(): Double
  def resetProperties(): Unit
}

object HystrixConfig_ {
  @scala.inline
  def apply(
    circuitBreakerErrorThresholdPercentage: CallbackTo[Double],
    circuitBreakerForceClosed: CallbackTo[Boolean],
    circuitBreakerForceOpened: CallbackTo[Boolean],
    circuitBreakerRequestVolumeThreshold: CallbackTo[Double],
    circuitBreakerRequestVolumeThresholdForceOverride: CallbackTo[Boolean],
    circuitBreakerRequestVolumeThresholdOverride: CallbackTo[Double],
    circuitBreakerSleepWindowInMilliseconds: CallbackTo[Double],
    executionTimeoutInMilliseconds: CallbackTo[Double],
    init: HystrixProperties => Callback,
    metricsPercentileWindowBuckets: CallbackTo[Double],
    metricsPercentileWindowInMilliseconds: CallbackTo[Double],
    metricsStatisticalWindowBuckets: CallbackTo[Double],
    metricsStatisticalWindowInMilliseconds: CallbackTo[Double],
    requestVolumeRejectionThreshold: CallbackTo[Double],
    resetProperties: Callback
  ): HystrixConfig_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(circuitBreakerErrorThresholdPercentage.toJsFn)
    __obj.updateDynamic("circuitBreakerForceClosed")(circuitBreakerForceClosed.toJsFn)
    __obj.updateDynamic("circuitBreakerForceOpened")(circuitBreakerForceOpened.toJsFn)
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(circuitBreakerRequestVolumeThreshold.toJsFn)
    __obj.updateDynamic("circuitBreakerRequestVolumeThresholdForceOverride")(circuitBreakerRequestVolumeThresholdForceOverride.toJsFn)
    __obj.updateDynamic("circuitBreakerRequestVolumeThresholdOverride")(circuitBreakerRequestVolumeThresholdOverride.toJsFn)
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(circuitBreakerSleepWindowInMilliseconds.toJsFn)
    __obj.updateDynamic("executionTimeoutInMilliseconds")(executionTimeoutInMilliseconds.toJsFn)
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.hystrixjs.mod.HystrixProperties) => init(t0).runNow()))
    __obj.updateDynamic("metricsPercentileWindowBuckets")(metricsPercentileWindowBuckets.toJsFn)
    __obj.updateDynamic("metricsPercentileWindowInMilliseconds")(metricsPercentileWindowInMilliseconds.toJsFn)
    __obj.updateDynamic("metricsStatisticalWindowBuckets")(metricsStatisticalWindowBuckets.toJsFn)
    __obj.updateDynamic("metricsStatisticalWindowInMilliseconds")(metricsStatisticalWindowInMilliseconds.toJsFn)
    __obj.updateDynamic("requestVolumeRejectionThreshold")(requestVolumeRejectionThreshold.toJsFn)
    __obj.updateDynamic("resetProperties")(resetProperties.toJsFn)
    __obj.asInstanceOf[HystrixConfig_]
  }
}

