package typingsJapgolly.redisRateLimiter.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-rate-limiter", JSImport.Namespace)
@js.native
class ^ () extends RedisRateLimiter

@JSImport("redis-rate-limiter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(options: Options): js.Function2[
    /* req */ Request_[ParamsDictionary], 
    /* callback */ js.Function2[/* err */ js.Error, /* res */ Response, Unit], 
    Unit
  ] = js.native
  def middleware(options: Options): RequestHandler[ParamsDictionary] = js.native
}

