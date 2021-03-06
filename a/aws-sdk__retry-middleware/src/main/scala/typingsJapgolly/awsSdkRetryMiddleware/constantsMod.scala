package typingsJapgolly.awsSdkRetryMiddleware

import typingsJapgolly.awsSdkRetryMiddleware.awsSdkRetryMiddlewareNumbers.`100`
import typingsJapgolly.awsSdkRetryMiddleware.awsSdkRetryMiddlewareNumbers.`500`
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/retry-middleware/build/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val DEFAULT_RETRY_DELAY_BASE: `100` = js.native
  val MAXIMUM_RETRY_DELAY: Double = js.native
  val RETRYABLE_STATUS_CODES: Set[Double] = js.native
  val THROTTLING_RETRY_DELAY_BASE: `500` = js.native
}

