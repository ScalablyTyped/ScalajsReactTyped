package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsFactory extends js.Object {
  def createCounter(name: String, tags: js.Any): Counter
  def createGauge(name: String, tags: js.Any): Gauge
  def createTimer(name: String, tags: js.Any): Timer
}

object MetricsFactory {
  @scala.inline
  def apply(
    createCounter: (String, js.Any) => CallbackTo[Counter],
    createGauge: (String, js.Any) => CallbackTo[Gauge],
    createTimer: (String, js.Any) => CallbackTo[Timer]
  ): MetricsFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCounter")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => createCounter(t0, t1).runNow()))
    __obj.updateDynamic("createGauge")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => createGauge(t0, t1).runNow()))
    __obj.updateDynamic("createTimer")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => createTimer(t0, t1).runNow()))
    __obj.asInstanceOf[MetricsFactory]
  }
}

