package typingsJapgolly.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexFilterData extends FilterValue {
  var `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter
  var value: String
}

object RegexFilterData {
  @scala.inline
  def apply(`type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter, value: String): RegexFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexFilterData]
  }
}

