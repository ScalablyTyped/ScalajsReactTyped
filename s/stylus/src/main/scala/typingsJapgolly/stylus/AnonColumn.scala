package typingsJapgolly.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: Double
  var filename: String
  var lineno: Double
}

object AnonColumn {
  @scala.inline
  def apply(column: Double, filename: String, lineno: Double): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumn]
  }
}

