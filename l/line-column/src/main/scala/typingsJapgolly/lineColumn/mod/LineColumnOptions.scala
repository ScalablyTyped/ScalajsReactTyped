package typingsJapgolly.lineColumn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the main `lineColumn` function.
  */
trait LineColumnOptions extends js.Object {
  var origin: Double
}

object LineColumnOptions {
  @scala.inline
  def apply(origin: Double): LineColumnOptions = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineColumnOptions]
  }
}

