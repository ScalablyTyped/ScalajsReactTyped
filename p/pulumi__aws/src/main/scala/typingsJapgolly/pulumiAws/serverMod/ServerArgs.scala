package typingsJapgolly.pulumiAws.serverMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.transfer.ServerEndpointDetails
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerArgs extends js.Object {
  /**
    * The virtual private cloud (VPC) endpoint settings that you want to configure for your SFTP server. Fields documented below.
    */
  val endpointDetails: js.UndefOr[Input[ServerEndpointDetails]] = js.native
  /**
    * The type of endpoint that you want your SFTP server connect to. If you connect to a `VPC_ENDPOINT`, your SFTP server isn't accessible over the public internet. If you want to connect your SFTP server via public internet, set `PUBLIC`.  Defaults to `PUBLIC`.
    */
  val endpointType: js.UndefOr[Input[String]] = js.native
  /**
    * A boolean that indicates all users associated with the server should be deleted so that the Server can be destroyed without error. The default value is `false`.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
    */
  val identityProviderType: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identityProviderType` of `API_GATEWAY`.
    */
  val invocationRole: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
    */
  val loggingRole: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * - URL of the service endpoint used to authenticate users with an `identityProviderType` of `API_GATEWAY`.
    */
  val url: js.UndefOr[Input[String]] = js.native
}

object ServerArgs {
  @scala.inline
  def apply(
    endpointDetails: Input[ServerEndpointDetails] = null,
    endpointType: Input[String] = null,
    forceDestroy: Input[Boolean] = null,
    identityProviderType: Input[String] = null,
    invocationRole: Input[String] = null,
    loggingRole: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    url: Input[String] = null
  ): ServerArgs = {
    val __obj = js.Dynamic.literal()
    if (endpointDetails != null) __obj.updateDynamic("endpointDetails")(endpointDetails.asInstanceOf[js.Any])
    if (endpointType != null) __obj.updateDynamic("endpointType")(endpointType.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (identityProviderType != null) __obj.updateDynamic("identityProviderType")(identityProviderType.asInstanceOf[js.Any])
    if (invocationRole != null) __obj.updateDynamic("invocationRole")(invocationRole.asInstanceOf[js.Any])
    if (loggingRole != null) __obj.updateDynamic("loggingRole")(loggingRole.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerArgs]
  }
}

