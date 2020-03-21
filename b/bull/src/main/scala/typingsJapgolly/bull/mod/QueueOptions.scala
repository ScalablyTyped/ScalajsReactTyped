package typingsJapgolly.bull.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bull.bullStrings.bclient
import typingsJapgolly.bull.bullStrings.client
import typingsJapgolly.bull.bullStrings.subscriber
import typingsJapgolly.ioredis.mod.Cluster
import typingsJapgolly.ioredis.mod.Redis
import typingsJapgolly.ioredis.mod.RedisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  /**
    * When specified, the `Queue` will use this function to create new `ioredis` client connections.
    * This is useful if you want to re-use connections or connect to a Redis cluster.
    */
  var createClient: js.UndefOr[
    js.Function2[
      /* type */ client | subscriber | bclient, 
      /* redisOpts */ js.UndefOr[RedisOptions], 
      Redis | Cluster
    ]
  ] = js.undefined
  var defaultJobOptions: js.UndefOr[JobOptions] = js.undefined
  var limiter: js.UndefOr[RateLimiter] = js.undefined
  /**
    * Prefix to use for all redis keys
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Options passed directly to the `ioredis` constructor
    */
  var redis: js.UndefOr[RedisOptions | String] = js.undefined
  var settings: js.UndefOr[AdvancedSettings] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(
    createClient: (/* type */ client | subscriber | bclient, /* redisOpts */ js.UndefOr[RedisOptions]) => CallbackTo[Redis | Cluster] = null,
    defaultJobOptions: JobOptions = null,
    limiter: RateLimiter = null,
    prefix: String = null,
    redis: RedisOptions | String = null,
    settings: AdvancedSettings = null
  ): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (createClient != null) __obj.updateDynamic("createClient")(js.Any.fromFunction2((t0: /* type */ typingsJapgolly.bull.bullStrings.client | typingsJapgolly.bull.bullStrings.subscriber | typingsJapgolly.bull.bullStrings.bclient, t1: /* redisOpts */ js.UndefOr[typingsJapgolly.ioredis.mod.RedisOptions]) => createClient(t0, t1).runNow()))
    if (defaultJobOptions != null) __obj.updateDynamic("defaultJobOptions")(defaultJobOptions.asInstanceOf[js.Any])
    if (limiter != null) __obj.updateDynamic("limiter")(limiter.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (redis != null) __obj.updateDynamic("redis")(redis.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOptions]
  }
}

