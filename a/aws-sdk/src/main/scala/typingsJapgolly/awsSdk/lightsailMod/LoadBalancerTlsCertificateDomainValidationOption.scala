package typingsJapgolly.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTlsCertificateDomainValidationOption extends js.Object {
  /**
    * The fully qualified domain name in the certificate request.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * The status of the domain validation. Valid values are listed below.
    */
  var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.native
}

object LoadBalancerTlsCertificateDomainValidationOption {
  @scala.inline
  def apply(domainName: DomainName = null, validationStatus: LoadBalancerTlsCertificateDomainStatus = null): LoadBalancerTlsCertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerTlsCertificateDomainValidationOption]
  }
}

