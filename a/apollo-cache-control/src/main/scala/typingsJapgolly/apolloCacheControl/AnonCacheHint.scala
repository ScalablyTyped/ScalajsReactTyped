package typingsJapgolly.apolloCacheControl

import japgolly.scalajs.react.Callback
import typingsJapgolly.apolloCacheControl.mod.CacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheHint extends js.Object {
  var cacheHint: CacheHint
  def setCacheHint(hint: CacheHint): Unit
}

object AnonCacheHint {
  @scala.inline
  def apply(cacheHint: CacheHint, setCacheHint: CacheHint => Callback): AnonCacheHint = {
    val __obj = js.Dynamic.literal(cacheHint = cacheHint.asInstanceOf[js.Any])
    __obj.updateDynamic("setCacheHint")(js.Any.fromFunction1((t0: typingsJapgolly.apolloCacheControl.mod.CacheHint) => setCacheHint(t0).runNow()))
    __obj.asInstanceOf[AnonCacheHint]
  }
}

