package typingsJapgolly.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainSuggestionsRequest extends js.Object {
  /**
    * A domain name that you want to use as the basis for a list of possible domain names. The domain name must contain a top-level domain (TLD), such as .com, that Amazon Route 53 supports. For a list of TLDs, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide.
    */
  var DomainName: typingsJapgolly.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * If OnlyAvailable is true, Amazon Route 53 returns only domain names that are available. If OnlyAvailable is false, Amazon Route 53 returns domain names without checking whether they're available to be registered. To determine whether the domain is available, you can call checkDomainAvailability for each suggestion.
    */
  var OnlyAvailable: Boolean = js.native
  /**
    * The number of suggested domain names that you want Amazon Route 53 to return.
    */
  var SuggestionCount: Integer = js.native
}

object GetDomainSuggestionsRequest {
  @scala.inline
  def apply(DomainName: DomainName, OnlyAvailable: Boolean, SuggestionCount: Integer): GetDomainSuggestionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], OnlyAvailable = OnlyAvailable.asInstanceOf[js.Any], SuggestionCount = SuggestionCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDomainSuggestionsRequest]
  }
}

