package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentDefinition extends js.Object {
  var segmentFilters: js.UndefOr[js.Array[SegmentFilter]] = js.undefined
}

object SegmentDefinition {
  @scala.inline
  def apply(segmentFilters: js.Array[SegmentFilter] = null): SegmentDefinition = {
    val __obj = js.Dynamic.literal()
    if (segmentFilters != null) __obj.updateDynamic("segmentFilters")(segmentFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentDefinition]
  }
}

