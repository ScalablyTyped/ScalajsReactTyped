package typingsJapgolly.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseFiltersState[D /* <: js.Object */] extends js.Object {
  var filters: Filters[D]
}

object UseFiltersState {
  @scala.inline
  def apply[D /* <: js.Object */](filters: Filters[D]): UseFiltersState[D] = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseFiltersState[D]]
  }
}

