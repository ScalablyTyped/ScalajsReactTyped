package typingsJapgolly.activexOutlook

import typingsJapgolly.activexOutlook.Outlook.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccount extends js.Object {
  val Account: typingsJapgolly.activexOutlook.Outlook.Account
}

object AnonAccount {
  @scala.inline
  def apply(Account: Account): AnonAccount = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccount]
  }
}

