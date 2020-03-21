package typingsJapgolly.connectRedis.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.expressSession.mod.Store
import typingsJapgolly.ioredis.mod.Redis
import typingsJapgolly.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStore
  extends Store
     with Instantiable1[/* options */ RedisStoreOptions, RedisStore] {
  var client: RedisClient | Redis = js.native
}

