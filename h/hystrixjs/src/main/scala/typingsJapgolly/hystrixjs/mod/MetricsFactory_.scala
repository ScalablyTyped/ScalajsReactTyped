package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsFactory_ extends js.Object {
  def getAllMetrics(): js.Array[CommandMetrics]
  def getOrCreate(config: MetricsProperties): CommandMetrics
  def resetCache(): Unit
}

object MetricsFactory_ {
  @scala.inline
  def apply(
    getAllMetrics: CallbackTo[js.Array[CommandMetrics]],
    getOrCreate: MetricsProperties => CallbackTo[CommandMetrics],
    resetCache: Callback
  ): MetricsFactory_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllMetrics")(getAllMetrics.toJsFn)
    __obj.updateDynamic("getOrCreate")(js.Any.fromFunction1((t0: typingsJapgolly.hystrixjs.mod.MetricsProperties) => getOrCreate(t0).runNow()))
    __obj.updateDynamic("resetCache")(resetCache.toJsFn)
    __obj.asInstanceOf[MetricsFactory_]
  }
}

