package typingsJapgolly.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: js.RegExp
  var unformat: js.RegExp
}

object AnonFormat {
  @scala.inline
  def apply(format: js.RegExp, unformat: js.RegExp): AnonFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], unformat = unformat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFormat]
  }
}

