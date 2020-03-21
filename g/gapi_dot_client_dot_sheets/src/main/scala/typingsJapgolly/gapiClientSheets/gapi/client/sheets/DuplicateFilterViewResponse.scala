package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateFilterViewResponse extends js.Object {
  /** The newly created filter. */
  var filter: js.UndefOr[FilterView] = js.undefined
}

object DuplicateFilterViewResponse {
  @scala.inline
  def apply(filter: FilterView = null): DuplicateFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateFilterViewResponse]
  }
}

