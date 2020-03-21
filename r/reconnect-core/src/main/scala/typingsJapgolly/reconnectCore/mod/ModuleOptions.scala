package typingsJapgolly.reconnectCore.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.backoff.mod.Backoff
import typingsJapgolly.backoff.mod.ExponentialOptions
import typingsJapgolly.reconnectCore.reconnectCoreStrings.exponential
import typingsJapgolly.reconnectCore.reconnectCoreStrings.fibonacci
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions[ConnectionType] extends ExponentialOptions {
  var failAfter: js.UndefOr[Double] = js.undefined
  var immediate: js.UndefOr[Boolean] = js.undefined
  var onConnect: js.UndefOr[js.Function1[/* con */ ConnectionType, Unit]] = js.undefined
  var strategy: js.UndefOr[fibonacci | exponential | Backoff] = js.undefined
}

object ModuleOptions {
  @scala.inline
  def apply[ConnectionType](
    factor: Int | Double = null,
    failAfter: Int | Double = null,
    immediate: js.UndefOr[Boolean] = js.undefined,
    initialDelay: Int | Double = null,
    maxDelay: Int | Double = null,
    onConnect: /* con */ ConnectionType => Callback = null,
    randomisationFactor: Int | Double = null,
    strategy: fibonacci | exponential | Backoff = null
  ): ModuleOptions[ConnectionType] = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (failAfter != null) __obj.updateDynamic("failAfter")(failAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction1((t0: /* con */ ConnectionType) => onConnect(t0).runNow()))
    if (randomisationFactor != null) __obj.updateDynamic("randomisationFactor")(randomisationFactor.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptions[ConnectionType]]
  }
}

