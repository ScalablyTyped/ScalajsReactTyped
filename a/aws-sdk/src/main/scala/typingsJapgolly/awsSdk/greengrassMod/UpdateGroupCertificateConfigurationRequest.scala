package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupCertificateConfigurationRequest extends js.Object {
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[string] = js.native
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}

object UpdateGroupCertificateConfigurationRequest {
  @scala.inline
  def apply(GroupId: string, CertificateExpiryInMilliseconds: string = null): UpdateGroupCertificateConfigurationRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    if (CertificateExpiryInMilliseconds != null) __obj.updateDynamic("CertificateExpiryInMilliseconds")(CertificateExpiryInMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupCertificateConfigurationRequest]
  }
}

