package typingsJapgolly.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateDomainRequest extends js.Object {
  /**
    * The ARN of an issued ACM certificate that is valid for the domain being associated.
    */
  var AcmCertificateArn: typingsJapgolly.awsSdk.worklinkMod.AcmCertificateArn = js.native
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * The fully qualified domain name (FQDN).
    */
  var DomainName: typingsJapgolly.awsSdk.worklinkMod.DomainName = js.native
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: typingsJapgolly.awsSdk.worklinkMod.FleetArn = js.native
}

object AssociateDomainRequest {
  @scala.inline
  def apply(
    AcmCertificateArn: AcmCertificateArn,
    DomainName: DomainName,
    FleetArn: FleetArn,
    DisplayName: DisplayName = null
  ): AssociateDomainRequest = {
    val __obj = js.Dynamic.literal(AcmCertificateArn = AcmCertificateArn.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDomainRequest]
  }
}

