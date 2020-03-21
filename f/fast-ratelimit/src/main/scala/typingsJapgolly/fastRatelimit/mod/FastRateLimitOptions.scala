package typingsJapgolly.fastRatelimit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastRateLimitOptions extends js.Object {
  var threshold: Double
    // available tokens over timespan
  var ttl: Double
}

object FastRateLimitOptions {
  @scala.inline
  def apply(threshold: Double, ttl: Double): FastRateLimitOptions = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FastRateLimitOptions]
  }
}

