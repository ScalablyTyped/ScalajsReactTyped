package typingsJapgolly.googleapis.resellerV1Mod.resellerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a customer.
  */
@js.native
trait SchemaCustomer extends js.Object {
  /**
    * Like the &quot;Customer email&quot; in the reseller tools, this email is
    * the secondary contact used if something happens to the customer&#39;s
    * service such as service outage or a security issue. This property is
    * required when creating a new customer and should not use the same domain
    * as customerDomain.
    */
  var alternateEmail: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s primary domain name string. customerDomain is required
    * when creating a new customer. Do not include the www prefix in the domain
    * when adding a customer.
    */
  var customerDomain: js.UndefOr[String] = js.native
  /**
    * Whether the customer&#39;s primary domain has been verified.
    */
  var customerDomainVerified: js.UndefOr[Boolean] = js.native
  /**
    * This property will always be returned in a response as the unique
    * identifier generated by Google. In a request, this property can be either
    * the primary domain or the unique identifier generated by Google.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a customer. Value: reseller#customer
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Customer contact phone number. Must start with &quot;+&quot; followed by
    * the country code. The rest of the number can be contiguous numbers or
    * respect the phone local format conventions, but it must be a real phone
    * number and not, for example, &quot;123&quot;. This field is silently
    * ignored if invalid.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * A customer&#39;s address information. Each field has a limit of 255
    * charcters.
    */
  var postalAddress: js.UndefOr[SchemaAddress] = js.native
  /**
    * URL to customer&#39;s Admin console dashboard. The read-only URL is
    * generated by the API service. This is used if your client application
    * requires the customer to complete a task in the Admin console.
    */
  var resourceUiUrl: js.UndefOr[String] = js.native
}

object SchemaCustomer {
  @scala.inline
  def apply(
    alternateEmail: String = null,
    customerDomain: String = null,
    customerDomainVerified: js.UndefOr[Boolean] = js.undefined,
    customerId: String = null,
    kind: String = null,
    phoneNumber: String = null,
    postalAddress: SchemaAddress = null,
    resourceUiUrl: String = null
  ): SchemaCustomer = {
    val __obj = js.Dynamic.literal()
    if (alternateEmail != null) __obj.updateDynamic("alternateEmail")(alternateEmail.asInstanceOf[js.Any])
    if (customerDomain != null) __obj.updateDynamic("customerDomain")(customerDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(customerDomainVerified)) __obj.updateDynamic("customerDomainVerified")(customerDomainVerified.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress.asInstanceOf[js.Any])
    if (resourceUiUrl != null) __obj.updateDynamic("resourceUiUrl")(resourceUiUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomer]
  }
}

