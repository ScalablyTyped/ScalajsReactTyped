package typingsJapgolly.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an InterconnectAttachment (VLAN attachment) resource. For more
  * information, see  Creating VLAN Attachments. (== resource_for
  * beta.interconnectAttachments ==) (== resource_for
  * v1.interconnectAttachments ==)
  */
@js.native
trait SchemaInterconnectAttachment extends js.Object {
  /**
    * Determines whether this Attachment will carry packets. Not present for
    * PARTNER_PROVIDER.
    */
  var adminEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Provisioned bandwidth capacity for the interconnectAttachment. Can be set
    * by the partner to update the customer&#39;s provisioned bandwidth. Output
    * only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED.
    */
  var bandwidth: js.UndefOr[String] = js.native
  /**
    * Up to 16 candidate prefixes that can be used to restrict the allocation
    * of cloudRouterIpAddress and customerRouterIpAddress for this attachment.
    * All prefixes must be within link-local address space (169.254.0.0/16) and
    * must be /29 or shorter (/28, /27, etc). Google will attempt to select an
    * unused /29 from the supplied candidate prefix(es). The request will fail
    * if all possible /29s are in use on Google?s edge. If not supplied, Google
    * will randomly select an unused /29 from all of link-local space.
    */
  var candidateSubnets: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] IPv4 address + prefix length to be configured on Cloud
    * Router Interface for this interconnect attachment.
    */
  var cloudRouterIpAddress: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] IPv4 address + prefix length to be configured on the
    * customer router subinterface for this interconnect attachment.
    */
  var customerRouterIpAddress: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Desired availability domain for the attachment. Only available for type
    * PARTNER, at creation time. For improved reliability, customers should
    * configure a pair of attachments with one per availability domain. The
    * selected availability domain will be provided to the Partner via the
    * pairing key so that the provisioned circuit will lie in the specified
    * domain. If not specified, the value will default to
    * AVAILABILITY_DOMAIN_ANY.
    */
  var edgeAvailabilityDomain: js.UndefOr[String] = js.native
  /**
    * [Output Only] Google reference ID, to be used when raising support
    * tickets with Google or otherwise to debug backend connectivity issues.
    */
  var googleReferenceId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * URL of the underlying Interconnect object that this attachment&#39;s
    * traffic will traverse through.
    */
  var interconnect: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#interconnectAttachment
    * for interconnect attachments.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A fingerprint for the labels being applied to this
    * InterconnectAttachment, which is essentially a hash of the labels set
    * used for optimistic locking. The fingerprint is initially generated by
    * Compute Engine and changes after every request to modify or update
    * labels. You must always provide an up-to-date fingerprint hash in order
    * to update or change labels, otherwise the request will fail with error
    * 412 conditionNotMet.  To see the latest fingerprint, make a get() request
    * to retrieve an InterconnectAttachment.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  /**
    * Labels to apply to this InterconnectAttachment resource. These can be
    * later modified by the setLabels method. Each label key/value must comply
    * with RFC1035. Label values may be empty.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
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
    * [Output Only] The current status of whether or not this interconnect
    * attachment is functional.
    */
  var operationalStatus: js.UndefOr[String] = js.native
  /**
    * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not
    * present for DEDICATED]. The opaque identifier of an PARTNER attachment
    * used to initiate provisioning with a selected partner. Of the form
    * &quot;XXXXX/region/domain&quot;
    */
  var pairingKey: js.UndefOr[String] = js.native
  /**
    * Optional BGP ASN for the router that should be supplied by a layer 3
    * Partner if they configured BGP on behalf of the customer. Output only for
    * PARTNER type, input only for PARTNER_PROVIDER, not available for
    * DEDICATED.
    */
  var partnerAsn: js.UndefOr[String] = js.native
  /**
    * Informational metadata about Partner attachments from Partners to display
    * to customers. Output only for for PARTNER type, mutable for
    * PARTNER_PROVIDER, not available for DEDICATED.
    */
  var partnerMetadata: js.UndefOr[SchemaInterconnectAttachmentPartnerMetadata] = js.native
  /**
    * [Output Only] Information specific to an InterconnectAttachment. This
    * property is populated if the interconnect that this is attached to is of
    * type DEDICATED.
    */
  var privateInterconnectInfo: js.UndefOr[SchemaInterconnectAttachmentPrivateInfo] = js.native
  /**
    * [Output Only] URL of the region where the regional interconnect
    * attachment resides. You must specify this field as part of the HTTP
    * request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * URL of the Cloud Router to be used for dynamic routing. This router must
    * be in the same region as this InterconnectAttachment. The
    * InterconnectAttachment will automatically connect the Interconnect to the
    * network &amp; region within which the Cloud Router is configured.
    */
  var router: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The current state of this attachment&#39;s functionality.
    */
  var state: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  /**
    * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only
    * specified at creation time.
    */
  var vlanTag8021q: js.UndefOr[Double] = js.native
}

object SchemaInterconnectAttachment {
  @scala.inline
  def apply(
    adminEnabled: js.UndefOr[Boolean] = js.undefined,
    bandwidth: String = null,
    candidateSubnets: js.Array[String] = null,
    cloudRouterIpAddress: String = null,
    creationTimestamp: String = null,
    customerRouterIpAddress: String = null,
    description: String = null,
    edgeAvailabilityDomain: String = null,
    googleReferenceId: String = null,
    id: String = null,
    interconnect: String = null,
    kind: String = null,
    labelFingerprint: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    operationalStatus: String = null,
    pairingKey: String = null,
    partnerAsn: String = null,
    partnerMetadata: SchemaInterconnectAttachmentPartnerMetadata = null,
    privateInterconnectInfo: SchemaInterconnectAttachmentPrivateInfo = null,
    region: String = null,
    router: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    state: String = null,
    `type`: String = null,
    vlanTag8021q: Int | Double = null
  ): SchemaInterconnectAttachment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adminEnabled)) __obj.updateDynamic("adminEnabled")(adminEnabled.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (candidateSubnets != null) __obj.updateDynamic("candidateSubnets")(candidateSubnets.asInstanceOf[js.Any])
    if (cloudRouterIpAddress != null) __obj.updateDynamic("cloudRouterIpAddress")(cloudRouterIpAddress.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (customerRouterIpAddress != null) __obj.updateDynamic("customerRouterIpAddress")(customerRouterIpAddress.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (edgeAvailabilityDomain != null) __obj.updateDynamic("edgeAvailabilityDomain")(edgeAvailabilityDomain.asInstanceOf[js.Any])
    if (googleReferenceId != null) __obj.updateDynamic("googleReferenceId")(googleReferenceId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (interconnect != null) __obj.updateDynamic("interconnect")(interconnect.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labelFingerprint != null) __obj.updateDynamic("labelFingerprint")(labelFingerprint.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operationalStatus != null) __obj.updateDynamic("operationalStatus")(operationalStatus.asInstanceOf[js.Any])
    if (pairingKey != null) __obj.updateDynamic("pairingKey")(pairingKey.asInstanceOf[js.Any])
    if (partnerAsn != null) __obj.updateDynamic("partnerAsn")(partnerAsn.asInstanceOf[js.Any])
    if (partnerMetadata != null) __obj.updateDynamic("partnerMetadata")(partnerMetadata.asInstanceOf[js.Any])
    if (privateInterconnectInfo != null) __obj.updateDynamic("privateInterconnectInfo")(privateInterconnectInfo.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (router != null) __obj.updateDynamic("router")(router.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (vlanTag8021q != null) __obj.updateDynamic("vlanTag8021q")(vlanTag8021q.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectAttachment]
  }
}

