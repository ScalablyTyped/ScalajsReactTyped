package typingsJapgolly.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var `val`: Boolean
}

object AnonType {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, `val`: Boolean): AnonType = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

