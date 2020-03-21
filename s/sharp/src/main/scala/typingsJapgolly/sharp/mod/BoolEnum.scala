package typingsJapgolly.sharp.mod

import typingsJapgolly.sharp.sharpStrings.and
import typingsJapgolly.sharp.sharpStrings.eor
import typingsJapgolly.sharp.sharpStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoolEnum extends js.Object {
  var and: typingsJapgolly.sharp.sharpStrings.and
  var eor: typingsJapgolly.sharp.sharpStrings.eor
  var or: typingsJapgolly.sharp.sharpStrings.or
}

object BoolEnum {
  @scala.inline
  def apply(and: and, eor: eor, or: or): BoolEnum = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], eor = eor.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoolEnum]
  }
}

