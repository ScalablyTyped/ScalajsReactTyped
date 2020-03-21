package typingsJapgolly.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnlinkDeveloperIdentityInput extends js.Object {
  /**
    * The "domain" by which Cognito will refer to your users.
    */
  var DeveloperProviderName: typingsJapgolly.awsSdk.cognitoidentityMod.DeveloperProviderName = js.native
  /**
    * A unique ID used by your backend authentication process to identify a user.
    */
  var DeveloperUserIdentifier: typingsJapgolly.awsSdk.cognitoidentityMod.DeveloperUserIdentifier = js.native
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typingsJapgolly.awsSdk.cognitoidentityMod.IdentityId = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typingsJapgolly.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
}

object UnlinkDeveloperIdentityInput {
  @scala.inline
  def apply(
    DeveloperProviderName: DeveloperProviderName,
    DeveloperUserIdentifier: DeveloperUserIdentifier,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId
  ): UnlinkDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal(DeveloperProviderName = DeveloperProviderName.asInstanceOf[js.Any], DeveloperUserIdentifier = DeveloperUserIdentifier.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnlinkDeveloperIdentityInput]
  }
}

