package typingsJapgolly.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountResponse extends js.Object {
  /**
    * The Amazon Chime account details.
    */
  var Account: js.UndefOr[typingsJapgolly.awsSdk.chimeMod.Account] = js.native
}

object CreateAccountResponse {
  @scala.inline
  def apply(Account: Account = null): CreateAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountResponse]
  }
}

