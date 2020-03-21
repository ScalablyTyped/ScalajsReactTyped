package typingsJapgolly.rollingRateLimiter.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleRedisClient extends js.Object {
  def multi(): js.Any
}

object CompatibleRedisClient {
  @scala.inline
  def apply(multi: CallbackTo[js.Any]): CompatibleRedisClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("multi")(multi.toJsFn)
    __obj.asInstanceOf[CompatibleRedisClient]
  }
}

