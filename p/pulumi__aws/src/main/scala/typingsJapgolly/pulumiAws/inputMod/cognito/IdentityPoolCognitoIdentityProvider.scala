package typingsJapgolly.pulumiAws.inputMod.cognito

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolCognitoIdentityProvider extends js.Object {
  /**
    * The client ID for the Amazon Cognito Identity User Pool.
    */
  var clientId: js.UndefOr[Input[String]] = js.native
  /**
    * The provider name for an Amazon Cognito Identity User Pool.
    */
  var providerName: js.UndefOr[Input[String]] = js.native
  /**
    * Whether server-side token validation is enabled for the identity provider’s token or not.
    */
  var serverSideTokenCheck: js.UndefOr[Input[Boolean]] = js.native
}

object IdentityPoolCognitoIdentityProvider {
  @scala.inline
  def apply(
    clientId: Input[String] = null,
    providerName: Input[String] = null,
    serverSideTokenCheck: Input[Boolean] = null
  ): IdentityPoolCognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (serverSideTokenCheck != null) __obj.updateDynamic("serverSideTokenCheck")(serverSideTokenCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolCognitoIdentityProvider]
  }
}

