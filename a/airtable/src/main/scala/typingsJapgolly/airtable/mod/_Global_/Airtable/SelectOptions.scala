package typingsJapgolly.airtable.mod._Global_.Airtable

import typingsJapgolly.airtable.airtableStrings.json
import typingsJapgolly.airtable.airtableStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOptions extends js.Object {
  var cellFormat: js.UndefOr[json | string] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var filterByFormula: js.UndefOr[String] = js.undefined
  var maxRecords: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[js.Array[SortParameter]] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  var userLocale: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object SelectOptions {
  @scala.inline
  def apply(
    cellFormat: json | string = null,
    fields: js.Array[String] = null,
    filterByFormula: String = null,
    maxRecords: Int | Double = null,
    pageSize: Int | Double = null,
    sort: js.Array[SortParameter] = null,
    timeZone: String = null,
    userLocale: String = null,
    view: String = null
  ): SelectOptions = {
    val __obj = js.Dynamic.literal()
    if (cellFormat != null) __obj.updateDynamic("cellFormat")(cellFormat.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterByFormula != null) __obj.updateDynamic("filterByFormula")(filterByFormula.asInstanceOf[js.Any])
    if (maxRecords != null) __obj.updateDynamic("maxRecords")(maxRecords.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (userLocale != null) __obj.updateDynamic("userLocale")(userLocale.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOptions]
  }
}

