package typingsJapgolly.redisRateLimiter.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.redis.mod.RedisClient
import typingsJapgolly.redisRateLimiter.redisRateLimiterStrings.ip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var deleteImmediatelyIfRaceCondition: js.UndefOr[Boolean] = js.undefined
  var key: ip | (js.Function1[/* req */ Request_[ParamsDictionary], String])
  var limit: js.UndefOr[Double] = js.undefined
  var onPossibleRaceCondition: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var rate: js.UndefOr[String] = js.undefined
  var redis: RedisClient
  var window: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    key: ip | (js.Function1[/* req */ Request_[ParamsDictionary], String]),
    redis: RedisClient,
    deleteImmediatelyIfRaceCondition: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    onPossibleRaceCondition: /* key */ String => Callback = null,
    rate: String = null,
    window: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteImmediatelyIfRaceCondition)) __obj.updateDynamic("deleteImmediatelyIfRaceCondition")(deleteImmediatelyIfRaceCondition.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (onPossibleRaceCondition != null) __obj.updateDynamic("onPossibleRaceCondition")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => onPossibleRaceCondition(t0).runNow()))
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

