package typingsJapgolly.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGovCloudAccountResponse extends js.Object {
  var CreateAccountStatus: js.UndefOr[typingsJapgolly.awsSdk.organizationsMod.CreateAccountStatus] = js.native
}

object CreateGovCloudAccountResponse {
  @scala.inline
  def apply(CreateAccountStatus: CreateAccountStatus = null): CreateGovCloudAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateAccountStatus != null) __obj.updateDynamic("CreateAccountStatus")(CreateAccountStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGovCloudAccountResponse]
  }
}

