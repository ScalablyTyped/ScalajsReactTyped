package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircuitFactory_ extends js.Object {
  def getCache(): js.Array[CircuitBreaker]
  def getOrCreate(config: CirctuiBreakerConfig): CircuitBreaker
  def resetCache(): Unit
}

object CircuitFactory_ {
  @scala.inline
  def apply(
    getCache: CallbackTo[js.Array[CircuitBreaker]],
    getOrCreate: CirctuiBreakerConfig => CallbackTo[CircuitBreaker],
    resetCache: Callback
  ): CircuitFactory_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCache")(getCache.toJsFn)
    __obj.updateDynamic("getOrCreate")(js.Any.fromFunction1((t0: typingsJapgolly.hystrixjs.mod.CirctuiBreakerConfig) => getOrCreate(t0).runNow()))
    __obj.updateDynamic("resetCache")(resetCache.toJsFn)
    __obj.asInstanceOf[CircuitFactory_]
  }
}

