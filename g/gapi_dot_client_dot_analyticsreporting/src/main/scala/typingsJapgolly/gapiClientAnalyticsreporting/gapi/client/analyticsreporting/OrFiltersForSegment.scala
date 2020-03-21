package typingsJapgolly.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrFiltersForSegment extends js.Object {
  /** List of segment filters to be combined with a `OR` operator. */
  var segmentFilterClauses: js.UndefOr[js.Array[SegmentFilterClause]] = js.undefined
}

object OrFiltersForSegment {
  @scala.inline
  def apply(segmentFilterClauses: js.Array[SegmentFilterClause] = null): OrFiltersForSegment = {
    val __obj = js.Dynamic.literal()
    if (segmentFilterClauses != null) __obj.updateDynamic("segmentFilterClauses")(segmentFilterClauses.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrFiltersForSegment]
  }
}

