package typingsJapgolly.wepy

import typingsJapgolly.wepy.wepyStrings.`0`
import typingsJapgolly.wepy.wepyStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBankAccount extends js.Object {
  var bankAccount: String
  var bankName: String
  var companyAddress: String
  var errMsg: String
  var taxNumber: String
  var telephone: String
  var title: String
  var `type`: `0` | `1`
}

object AnonBankAccount {
  @scala.inline
  def apply(
    bankAccount: String,
    bankName: String,
    companyAddress: String,
    errMsg: String,
    taxNumber: String,
    telephone: String,
    title: String,
    `type`: `0` | `1`
  ): AnonBankAccount = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount.asInstanceOf[js.Any], bankName = bankName.asInstanceOf[js.Any], companyAddress = companyAddress.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], taxNumber = taxNumber.asInstanceOf[js.Any], telephone = telephone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBankAccount]
  }
}

