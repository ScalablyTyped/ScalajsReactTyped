package typingsJapgolly.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedIdentityId extends js.Object {
  /**
    * The error code indicating the type of error that occurred.
    */
  var ErrorCode: js.UndefOr[typingsJapgolly.awsSdk.cognitoidentityMod.ErrorCode] = js.native
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typingsJapgolly.awsSdk.cognitoidentityMod.IdentityId] = js.native
}

object UnprocessedIdentityId {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, IdentityId: IdentityId = null): UnprocessedIdentityId = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedIdentityId]
  }
}

