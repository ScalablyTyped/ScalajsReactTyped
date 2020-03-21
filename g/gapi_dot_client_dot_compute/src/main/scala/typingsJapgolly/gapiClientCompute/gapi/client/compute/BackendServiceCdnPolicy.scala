package typingsJapgolly.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServiceCdnPolicy extends js.Object {
  /** The CacheKeyPolicy for this CdnPolicy. */
  var cacheKeyPolicy: js.UndefOr[CacheKeyPolicy] = js.undefined
}

object BackendServiceCdnPolicy {
  @scala.inline
  def apply(cacheKeyPolicy: CacheKeyPolicy = null): BackendServiceCdnPolicy = {
    val __obj = js.Dynamic.literal()
    if (cacheKeyPolicy != null) __obj.updateDynamic("cacheKeyPolicy")(cacheKeyPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendServiceCdnPolicy]
  }
}

