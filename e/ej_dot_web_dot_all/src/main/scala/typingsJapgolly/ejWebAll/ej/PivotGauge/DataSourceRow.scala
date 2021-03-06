package typingsJapgolly.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceRow extends js.Object {
  /** Allows the user to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  /** Applies filter to the field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.undefined
}

object DataSourceRow {
  @scala.inline
  def apply(fieldName: String = null, filterItems: DataSourceRowsFilterItems = null): DataSourceRow = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (filterItems != null) __obj.updateDynamic("filterItems")(filterItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceRow]
  }
}

