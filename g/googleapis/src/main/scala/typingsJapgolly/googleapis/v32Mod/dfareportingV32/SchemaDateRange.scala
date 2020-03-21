package typingsJapgolly.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a date range.
  */
@js.native
trait SchemaDateRange extends js.Object {
  /**
    * The end date of the date range, inclusive. A string of the format:
    * &quot;yyyy-MM-dd&quot;.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#dateRange.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The date range relative to the date of when the report is run.
    */
  var relativeDateRange: js.UndefOr[String] = js.native
  /**
    * The start date of the date range, inclusive. A string of the format:
    * &quot;yyyy-MM-dd&quot;.
    */
  var startDate: js.UndefOr[String] = js.native
}

object SchemaDateRange {
  @scala.inline
  def apply(
    endDate: String = null,
    kind: String = null,
    relativeDateRange: String = null,
    startDate: String = null
  ): SchemaDateRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (relativeDateRange != null) __obj.updateDynamic("relativeDateRange")(relativeDateRange.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDateRange]
  }
}

