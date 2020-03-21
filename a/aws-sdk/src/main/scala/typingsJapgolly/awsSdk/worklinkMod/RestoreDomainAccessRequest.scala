package typingsJapgolly.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreDomainAccessRequest extends js.Object {
  /**
    * The name of the domain.
    */
  var DomainName: typingsJapgolly.awsSdk.worklinkMod.DomainName = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsJapgolly.awsSdk.worklinkMod.FleetArn = js.native
}

object RestoreDomainAccessRequest {
  @scala.inline
  def apply(DomainName: DomainName, FleetArn: FleetArn): RestoreDomainAccessRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestoreDomainAccessRequest]
  }
}

