package typingsJapgolly.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilterData extends FilterValue {
  var `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.DateFilter
  var value: DateFilterValue
}

object DateFilterData {
  @scala.inline
  def apply(
    `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.DateFilter,
    value: DateFilterValue
  ): DateFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilterData]
  }
}

