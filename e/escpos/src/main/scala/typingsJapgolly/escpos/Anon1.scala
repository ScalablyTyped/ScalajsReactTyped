package typingsJapgolly.escpos

import typingsJapgolly.escpos.escposStrings.Acknowledge
import typingsJapgolly.escpos.escposStrings.Bel
import typingsJapgolly.escpos.escposStrings.Endoftext
import typingsJapgolly.escpos.escposStrings.Endoftransmission
import typingsJapgolly.escpos.escposStrings.Enquiry
import typingsJapgolly.escpos.escposStrings.Null
import typingsJapgolly.escpos.escposStrings.Startofheading
import typingsJapgolly.escpos.escposStrings.Startoftext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var `1`: Null
  var `2`: Startofheading
  var `3`: Startoftext
  var `4`: Endoftext
  var `5`: Endoftransmission
  var `6`: Enquiry
  var `7`: Acknowledge
  var `8`: Bel
}

object Anon1 {
  @scala.inline
  def apply(
    `1`: Null,
    `2`: Startofheading,
    `3`: Startoftext,
    `4`: Endoftext,
    `5`: Endoftransmission,
    `6`: Enquiry,
    `7`: Acknowledge,
    `8`: Bel
  ): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

