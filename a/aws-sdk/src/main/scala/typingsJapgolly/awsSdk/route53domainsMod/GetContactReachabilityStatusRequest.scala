package typingsJapgolly.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactReachabilityStatusRequest extends js.Object {
  /**
    * The name of the domain for which you want to know whether the registrant contact has confirmed that the email address is valid.
    */
  var domainName: js.UndefOr[DomainName] = js.native
}

object GetContactReachabilityStatusRequest {
  @scala.inline
  def apply(domainName: DomainName = null): GetContactReachabilityStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactReachabilityStatusRequest]
  }
}

