package typingsJapgolly.rollingRateLimiter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncLimiter = typingsJapgolly.rollingRateLimiter.mod.AsyncLimiterWithToken
  type AsyncLimiterCallback = js.Function3[
    /* err */ js.Any, 
    /* timeLeft */ scala.Double, 
    /* actionsLeft */ scala.Double, 
    scala.Unit
  ]
  type AsyncLimiterWithToken = js.Function2[
    /* token */ java.lang.String, 
    /* callback */ typingsJapgolly.rollingRateLimiter.mod.AsyncLimiterCallback, 
    scala.Unit
  ]
  type AsyncLimiterWithoutToken = js.Function1[
    /* callback */ typingsJapgolly.rollingRateLimiter.mod.AsyncLimiterCallback, 
    scala.Unit
  ]
  type InMemoryOptions = typingsJapgolly.rollingRateLimiter.mod.GeneralOptions
  type SyncLimiter = js.Function1[/* token */ js.UndefOr[java.lang.String], scala.Double]
  type SyncOrAsyncLimiter = typingsJapgolly.rollingRateLimiter.mod.SyncLimiter with typingsJapgolly.rollingRateLimiter.mod.AsyncLimiter
}
