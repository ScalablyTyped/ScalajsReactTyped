package typingsJapgolly.reactBootstrapTable.mod

import typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.ArrayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactBootstrapTable.mod.TextFilterData
  - typingsJapgolly.reactBootstrapTable.mod.SelectFilterData
  - typingsJapgolly.reactBootstrapTable.mod.RegexFilterData
  - typingsJapgolly.reactBootstrapTable.mod.NumberFilterData
  - typingsJapgolly.reactBootstrapTable.mod.DateFilterData
  - typingsJapgolly.reactBootstrapTable.mod.ArrayFilterData
*/
trait FilterValue extends js.Object

object FilterValue {
  @scala.inline
  def TextFilterData(`type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.TextFilter, value: String): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def SelectFilterData(`type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter, value: String): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def DateFilterData(
    `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.DateFilter,
    value: DateFilterValue
  ): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def RegexFilterData(`type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter, value: String): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def NumberFilterData(
    `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter,
    value: NumberFilterValue
  ): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def ArrayFilterData(`type`: ArrayFilter, value: js.Array[Double | String]): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
}

