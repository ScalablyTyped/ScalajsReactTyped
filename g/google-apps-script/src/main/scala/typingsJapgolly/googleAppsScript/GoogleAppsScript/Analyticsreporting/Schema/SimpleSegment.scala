package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSegment extends js.Object {
  var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.undefined
}

object SimpleSegment {
  @scala.inline
  def apply(orFiltersForSegment: js.Array[OrFiltersForSegment] = null): SimpleSegment = {
    val __obj = js.Dynamic.literal()
    if (orFiltersForSegment != null) __obj.updateDynamic("orFiltersForSegment")(orFiltersForSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleSegment]
  }
}

