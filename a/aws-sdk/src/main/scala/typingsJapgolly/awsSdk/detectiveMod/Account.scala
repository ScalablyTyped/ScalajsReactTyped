package typingsJapgolly.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /**
    * The account identifier of the AWS account.
    */
  var AccountId: typingsJapgolly.awsSdk.detectiveMod.AccountId = js.native
  /**
    * The AWS account root user email address for the AWS account.
    */
  var EmailAddress: typingsJapgolly.awsSdk.detectiveMod.EmailAddress = js.native
}

object Account {
  @scala.inline
  def apply(AccountId: AccountId, EmailAddress: EmailAddress): Account = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Account]
  }
}

