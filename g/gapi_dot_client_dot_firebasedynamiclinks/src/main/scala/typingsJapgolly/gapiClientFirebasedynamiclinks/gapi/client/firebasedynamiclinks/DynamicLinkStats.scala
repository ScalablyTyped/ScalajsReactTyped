package typingsJapgolly.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLinkStats extends js.Object {
  /** Dynamic Link event stats. */
  var linkEventStats: js.UndefOr[js.Array[DynamicLinkEventStat]] = js.undefined
}

object DynamicLinkStats {
  @scala.inline
  def apply(linkEventStats: js.Array[DynamicLinkEventStat] = null): DynamicLinkStats = {
    val __obj = js.Dynamic.literal()
    if (linkEventStats != null) __obj.updateDynamic("linkEventStats")(linkEventStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicLinkStats]
  }
}

