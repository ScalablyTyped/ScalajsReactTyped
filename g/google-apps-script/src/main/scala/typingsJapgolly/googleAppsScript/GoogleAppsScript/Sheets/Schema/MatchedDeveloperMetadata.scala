package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedDeveloperMetadata extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.undefined
}

object MatchedDeveloperMetadata {
  @scala.inline
  def apply(dataFilters: js.Array[DataFilter] = null, developerMetadata: DeveloperMetadata = null): MatchedDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedDeveloperMetadata]
  }
}

