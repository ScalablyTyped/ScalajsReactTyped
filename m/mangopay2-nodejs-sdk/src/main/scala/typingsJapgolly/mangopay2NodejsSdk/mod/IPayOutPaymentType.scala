package typingsJapgolly.mangopay2NodejsSdk.mod

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPayOutPaymentType extends js.Object {
  var BankWire: BANK_WIRE
}

object IPayOutPaymentType {
  @scala.inline
  def apply(BankWire: BANK_WIRE): IPayOutPaymentType = {
    val __obj = js.Dynamic.literal(BankWire = BankWire.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPayOutPaymentType]
  }
}

