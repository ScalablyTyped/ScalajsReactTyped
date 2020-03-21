package typingsJapgolly.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribedServer extends js.Object {
  /**
    * Specifies the unique Amazon Resource Name (ARN) for the server to be described.
    */
  var Arn: typingsJapgolly.awsSdk.transferMod.Arn = js.native
  /**
    * The virtual private cloud (VPC) endpoint settings that you configured for your SFTP server.
    */
  var EndpointDetails: js.UndefOr[typingsJapgolly.awsSdk.transferMod.EndpointDetails] = js.native
  /**
    * The type of endpoint that your SFTP server is connected to. If your SFTP server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typingsJapgolly.awsSdk.transferMod.EndpointType] = js.native
  /**
    * This value contains the message-digest algorithm (MD5) hash of the server's host key. This value is equivalent to the output of the ssh-keygen -l -E md5 -f my-new-server-key command.
    */
  var HostKeyFingerprint: js.UndefOr[typingsJapgolly.awsSdk.transferMod.HostKeyFingerprint] = js.native
  /**
    * Specifies information to call a customer-supplied authentication API. This field is not populated when the IdentityProviderType of the server is SERVICE_MANAGED&gt;.
    */
  var IdentityProviderDetails: js.UndefOr[typingsJapgolly.awsSdk.transferMod.IdentityProviderDetails] = js.native
  /**
    * This property defines the mode of authentication method enabled for this service. A value of SERVICE_MANAGED means that you are using this server to store and access SFTP user credentials within the service. A value of API_GATEWAY indicates that you have integrated an API Gateway endpoint that will be invoked for authenticating your user into the service.
    */
  var IdentityProviderType: js.UndefOr[typingsJapgolly.awsSdk.transferMod.IdentityProviderType] = js.native
  /**
    * This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on Amazon CloudWatch logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.native
  /**
    * This property is a unique system-assigned identifier for the SFTP server that you instantiate.
    */
  var ServerId: js.UndefOr[typingsJapgolly.awsSdk.transferMod.ServerId] = js.native
  /**
    * The condition of the SFTP server for the server that was described. A value of ONLINE indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typingsJapgolly.awsSdk.transferMod.State] = js.native
  /**
    * This property contains the key-value pairs that you can use to search for and group servers that were assigned to the server that was described.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.transferMod.Tags] = js.native
  /**
    * The number of users that are assigned to the SFTP server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typingsJapgolly.awsSdk.transferMod.UserCount] = js.native
}

object DescribedServer {
  @scala.inline
  def apply(
    Arn: Arn,
    EndpointDetails: EndpointDetails = null,
    EndpointType: EndpointType = null,
    HostKeyFingerprint: HostKeyFingerprint = null,
    IdentityProviderDetails: IdentityProviderDetails = null,
    IdentityProviderType: IdentityProviderType = null,
    LoggingRole: Role = null,
    ServerId: ServerId = null,
    State: State = null,
    Tags: Tags = null,
    UserCount: Int | Double = null
  ): DescribedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (EndpointDetails != null) __obj.updateDynamic("EndpointDetails")(EndpointDetails.asInstanceOf[js.Any])
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (HostKeyFingerprint != null) __obj.updateDynamic("HostKeyFingerprint")(HostKeyFingerprint.asInstanceOf[js.Any])
    if (IdentityProviderDetails != null) __obj.updateDynamic("IdentityProviderDetails")(IdentityProviderDetails.asInstanceOf[js.Any])
    if (IdentityProviderType != null) __obj.updateDynamic("IdentityProviderType")(IdentityProviderType.asInstanceOf[js.Any])
    if (LoggingRole != null) __obj.updateDynamic("LoggingRole")(LoggingRole.asInstanceOf[js.Any])
    if (ServerId != null) __obj.updateDynamic("ServerId")(ServerId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UserCount != null) __obj.updateDynamic("UserCount")(UserCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedServer]
  }
}

