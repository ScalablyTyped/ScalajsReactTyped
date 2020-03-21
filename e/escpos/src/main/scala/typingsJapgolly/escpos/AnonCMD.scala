package typingsJapgolly.escpos

import typingsJapgolly.escpos.escposNumbers.`12`
import typingsJapgolly.escpos.escposNumbers.`1`
import typingsJapgolly.escpos.escposNumbers.`24`
import typingsJapgolly.escpos.escposStrings.EscapeNumbersignNumbersignQPIX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCMD extends js.Object {
  var CMD: EscapeNumbersignNumbersignQPIX
  var DEFAULT: `12`
  var MAX: `24`
  var MIN: `1`
}

object AnonCMD {
  @scala.inline
  def apply(CMD: EscapeNumbersignNumbersignQPIX, DEFAULT: `12`, MAX: `24`, MIN: `1`): AnonCMD = {
    val __obj = js.Dynamic.literal(CMD = CMD.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCMD]
  }
}

