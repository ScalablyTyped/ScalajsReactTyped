package typingsJapgolly.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /**
    * An AWS account ID of the account that was not processed.
    */
  var AccountId: js.UndefOr[typingsJapgolly.awsSdk.securityhubMod.AccountId] = js.native
  /**
    * The reason that the account was not processed.
    */
  var ProcessingResult: js.UndefOr[NonEmptyString] = js.native
}

object Result {
  @scala.inline
  def apply(AccountId: AccountId = null, ProcessingResult: NonEmptyString = null): Result = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (ProcessingResult != null) __obj.updateDynamic("ProcessingResult")(ProcessingResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

