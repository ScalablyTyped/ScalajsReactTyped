package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gRPC channel credentials to access the SDS server.
  */
@js.native
trait SchemaChannelCredentials extends js.Object {
  /**
    * The call credentials to access the SDS server.
    */
  var certificates: js.UndefOr[SchemaTlsCertificatePaths] = js.native
  /**
    * The channel credentials to access the SDS server. This field can be set
    * to one of the following: CERTIFICATES: Use TLS certificates to access the
    * SDS server. GCE_VM: Use local GCE VM credentials to access the SDS
    * server.
    */
  var channelCredentialType: js.UndefOr[String] = js.native
}

object SchemaChannelCredentials {
  @scala.inline
  def apply(certificates: SchemaTlsCertificatePaths = null, channelCredentialType: String = null): SchemaChannelCredentials = {
    val __obj = js.Dynamic.literal()
    if (certificates != null) __obj.updateDynamic("certificates")(certificates.asInstanceOf[js.Any])
    if (channelCredentialType != null) __obj.updateDynamic("channelCredentialType")(channelCredentialType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelCredentials]
  }
}

