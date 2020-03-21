package typingsJapgolly.postmark.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDetails extends Domain {
  var DKIMHost: String
  var DKIMPendingHost: String
  var DKIMPendingTextValue: String
  var DKIMRevokedHost: String
  var DKIMRevokedTextValue: String
  var DKIMTextValue: String
  var DKIMUpdateStatus: String
  var ReturnPathDomain: String
  var ReturnPathDomainCNAMEValue: String
  var SafeToRemoveRevokedKeyFromDNS: String
  var SpfHost: String
  var SpfTextValue: String
}

object DomainDetails {
  @scala.inline
  def apply(
    DKIMHost: String,
    DKIMPendingHost: String,
    DKIMPendingTextValue: String,
    DKIMRevokedHost: String,
    DKIMRevokedTextValue: String,
    DKIMTextValue: String,
    DKIMUpdateStatus: String,
    DKIMVerified: Boolean,
    ID: Double,
    Name: String,
    ReturnPathDomain: String,
    ReturnPathDomainCNAMEValue: String,
    ReturnPathDomainVerified: Boolean,
    SafeToRemoveRevokedKeyFromDNS: String,
    SpfHost: String,
    SpfTextValue: String,
    SpfVerified: Boolean,
    WeakDKIM: Boolean
  ): DomainDetails = {
    val __obj = js.Dynamic.literal(DKIMHost = DKIMHost.asInstanceOf[js.Any], DKIMPendingHost = DKIMPendingHost.asInstanceOf[js.Any], DKIMPendingTextValue = DKIMPendingTextValue.asInstanceOf[js.Any], DKIMRevokedHost = DKIMRevokedHost.asInstanceOf[js.Any], DKIMRevokedTextValue = DKIMRevokedTextValue.asInstanceOf[js.Any], DKIMTextValue = DKIMTextValue.asInstanceOf[js.Any], DKIMUpdateStatus = DKIMUpdateStatus.asInstanceOf[js.Any], DKIMVerified = DKIMVerified.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReturnPathDomain = ReturnPathDomain.asInstanceOf[js.Any], ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue.asInstanceOf[js.Any], ReturnPathDomainVerified = ReturnPathDomainVerified.asInstanceOf[js.Any], SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS.asInstanceOf[js.Any], SpfHost = SpfHost.asInstanceOf[js.Any], SpfTextValue = SpfTextValue.asInstanceOf[js.Any], SpfVerified = SpfVerified.asInstanceOf[js.Any], WeakDKIM = WeakDKIM.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainDetails]
  }
}

