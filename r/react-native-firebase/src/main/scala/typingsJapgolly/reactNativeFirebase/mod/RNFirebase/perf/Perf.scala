package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.perf

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Perf extends js.Object {
  /**
    * Returns a new HTTP Metric instance.
    */
  def newHttpMetric(url: String, httpMethod: HttpMethod): HttpMetric
  /**
    * Returns a new Trace instance.
    */
  def newTrace(trace: String): Trace
  /**
    * Globally enable or disable performance monitoring.
    */
  def setPerformanceCollectionEnabled(enabled: Boolean): Unit
}

object Perf {
  @scala.inline
  def apply(
    newHttpMetric: (String, HttpMethod) => CallbackTo[HttpMetric],
    newTrace: String => CallbackTo[Trace],
    setPerformanceCollectionEnabled: Boolean => Callback
  ): Perf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newHttpMetric")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.perf.HttpMethod) => newHttpMetric(t0, t1).runNow()))
    __obj.updateDynamic("newTrace")(js.Any.fromFunction1((t0: java.lang.String) => newTrace(t0).runNow()))
    __obj.updateDynamic("setPerformanceCollectionEnabled")(js.Any.fromFunction1((t0: scala.Boolean) => setPerformanceCollectionEnabled(t0).runNow()))
    __obj.asInstanceOf[Perf]
  }
}

