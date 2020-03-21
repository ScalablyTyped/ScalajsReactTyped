package typingsJapgolly.redis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ js.Error | scala.Null, /* reply */ T, scala.Unit]
  type RetryStrategy = js.Function1[
    /* options */ typingsJapgolly.redis.mod.RetryStrategyOptions, 
    scala.Double | js.Error
  ]
}
