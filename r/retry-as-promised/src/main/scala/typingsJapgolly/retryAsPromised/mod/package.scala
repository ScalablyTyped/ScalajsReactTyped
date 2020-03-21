package typingsJapgolly.retryAsPromised

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MatchOption = java.lang.String | js.RegExp | js.Error
  type RetryAsPromisedStatic = js.Function2[
    /* callback */ typingsJapgolly.retryAsPromised.mod.RetryCallback[js.Any], 
    /* options */ typingsJapgolly.retryAsPromised.mod.Options | scala.Double, 
    typingsJapgolly.bluebird.mod.^[js.Any]
  ]
  type RetryCallback[T] = js.Function1[
    /* hasCurrent */ typingsJapgolly.retryAsPromised.AnonCurrent, 
    typingsJapgolly.bluebird.mod.Thenable[T]
  ]
}
