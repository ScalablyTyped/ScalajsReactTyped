package typingsJapgolly.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ------------------0_0--------------------
  * @description Defines For String Methods
  * @see https://github.com/node-modules/utility#others
  * -------------------0^0---------------------
  */
trait IReplaceInvalidHttpHeaderCharReturns extends js.Object {
  var invalid: Boolean
  var `val`: String
}

object IReplaceInvalidHttpHeaderCharReturns {
  @scala.inline
  def apply(invalid: Boolean, `val`: String): IReplaceInvalidHttpHeaderCharReturns = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReplaceInvalidHttpHeaderCharReturns]
  }
}

