package typingsJapgolly.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reserved address resource. (== resource_for beta.addresses ==) (==
  * resource_for v1.addresses ==) (== resource_for beta.globalAddresses ==) (==
  * resource_for v1.globalAddresses ==)
  */
@js.native
trait SchemaAddress extends js.Object {
  /**
    * The static IP address represented by this resource.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * The type of address to reserve, either INTERNAL or EXTERNAL. If
    * unspecified, defaults to EXTERNAL.
    */
  var addressType: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The IP Version that will be used by this address. Valid options are IPV4
    * or IPV6. This can only be specified for a global address.
    */
  var ipVersion: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#address for addresses.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the network in which to reserve the address. This field can
    * only be used with INTERNAL type with VPC_PEERING purpose.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * This signifies the networking tier used for configuring this Address and
    * can only take the following values: PREMIUM, STANDARD. Global forwarding
    * rules can only be Premium Tier. Regional forwarding rules can be either
    * Premium or Standard Tier. Standard Tier addresses applied to regional
    * forwarding rules can be used with any external load balancer. Regional
    * forwarding rules in Premium Tier can only be used with a Network load
    * balancer.  If this field is not specified, it is assumed to be PREMIUM.
    */
  var networkTier: js.UndefOr[String] = js.native
  /**
    * The prefix length if the resource reprensents an IP range.
    */
  var prefixLength: js.UndefOr[Double] = js.native
  /**
    * The purpose of resource, only used with INTERNAL type.
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of the region where the regional address resides. This
    * field is not applicable to global addresses. You must specify this field
    * as part of the HTTP request URL. You cannot set this field in the request
    * body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The status of the address, which can be one of RESERVING,
    * RESERVED, or IN_USE. An address that is RESERVING is currently in the
    * process of being reserved. A RESERVED address is currently reserved and
    * available to use. An IN_USE address is currently being used by another
    * resource and is not available.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The URL of the subnetwork in which to reserve the address. If an IP
    * address is specified, it must be within the subnetwork&#39;s IP range.
    * This field can only be used with INTERNAL type with
    * GCE_ENDPOINT/DNS_RESOLVER purposes.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URLs of the resources that are using this address.
    */
  var users: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAddress {
  @scala.inline
  def apply(
    address: String = null,
    addressType: String = null,
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    ipVersion: String = null,
    kind: String = null,
    name: String = null,
    network: String = null,
    networkTier: String = null,
    prefixLength: Int | Double = null,
    purpose: String = null,
    region: String = null,
    selfLink: String = null,
    status: String = null,
    subnetwork: String = null,
    users: js.Array[String] = null
  ): SchemaAddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (addressType != null) __obj.updateDynamic("addressType")(addressType.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipVersion != null) __obj.updateDynamic("ipVersion")(ipVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (networkTier != null) __obj.updateDynamic("networkTier")(networkTier.asInstanceOf[js.Any])
    if (prefixLength != null) __obj.updateDynamic("prefixLength")(prefixLength.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddress]
  }
}

