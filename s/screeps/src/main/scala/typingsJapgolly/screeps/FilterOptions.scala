package typingsJapgolly.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Filter Options
trait FilterOptions[T /* <: FindConstant */] extends js.Object {
  var filter: FilterFunction[T] | FilterObject | String
}

object FilterOptions {
  @scala.inline
  def apply[T /* <: FindConstant */](filter: FilterFunction[T] | FilterObject | String): FilterOptions[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterOptions[T]]
  }
}

