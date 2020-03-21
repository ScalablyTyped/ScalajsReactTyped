package typingsJapgolly.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for retrieving a range of values in a spreadsheet selected by a
  * set of DataFilters.
  */
@js.native
trait SchemaBatchGetValuesByDataFilterRequest extends js.Object {
  /**
    * The data filters used to match the ranges of values to retrieve.  Ranges
    * that match any of the specified data filters will be included in the
    * response.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  /**
    * How dates, times, and durations should be represented in the output. This
    * is ignored if value_render_option is FORMATTED_VALUE. The default
    * dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.native
  /**
    * The major dimension that results should use.  For example, if the
    * spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then a request that selects
    * that range and sets `majorDimension=ROWS` will return `[[1,2],[3,4]]`,
    * whereas a request that sets `majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.native
  /**
    * How values should be represented in the output. The default render option
    * is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.native
}

object SchemaBatchGetValuesByDataFilterRequest {
  @scala.inline
  def apply(
    dataFilters: js.Array[SchemaDataFilter] = null,
    dateTimeRenderOption: String = null,
    majorDimension: String = null,
    valueRenderOption: String = null
  ): SchemaBatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (dateTimeRenderOption != null) __obj.updateDynamic("dateTimeRenderOption")(dateTimeRenderOption.asInstanceOf[js.Any])
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension.asInstanceOf[js.Any])
    if (valueRenderOption != null) __obj.updateDynamic("valueRenderOption")(valueRenderOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchGetValuesByDataFilterRequest]
  }
}

