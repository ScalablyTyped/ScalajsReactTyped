package typingsJapgolly.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an Interconnects resource. The Interconnects resource is a
  * dedicated connection between Google&#39;s network and your on-premises
  * network. For more information, see the  Dedicated overview page. (==
  * resource_for v1.interconnects ==) (== resource_for beta.interconnects ==)
  */
@js.native
trait SchemaInterconnect extends js.Object {
  /**
    * Administrative status of the interconnect. When this is set to true, the
    * Interconnect is functional and can carry traffic. When set to false, no
    * packets can be carried over the interconnect and no BGP routes are
    * exchanged over it. By default, the status is set to true.
    */
  var adminEnabled: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] A list of CircuitInfo objects, that describe the individual
    * circuits in this LAG.
    */
  var circuitInfos: js.UndefOr[js.Array[SchemaInterconnectCircuitInfo]] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * Customer name, to put in the Letter of Authorization as the party
    * authorized to request a crossconnect.
    */
  var customerName: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] A list of outages expected for this Interconnect.
    */
  var expectedOutages: js.UndefOr[js.Array[SchemaInterconnectOutageNotification]] = js.native
  /**
    * [Output Only] IP address configured on the Google side of the
    * Interconnect link. This can be used only for ping tests.
    */
  var googleIpAddress: js.UndefOr[String] = js.native
  /**
    * [Output Only] Google reference ID to be used when raising support tickets
    * with Google or otherwise to debug backend connectivity issues.
    */
  var googleReferenceId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] A list of the URLs of all InterconnectAttachments
    * configured to use this Interconnect.
    */
  var interconnectAttachments: js.UndefOr[js.Array[String]] = js.native
  /**
    * Type of interconnect. Note that &quot;IT_PRIVATE&quot; has been
    * deprecated in favor of &quot;DEDICATED&quot;
    */
  var interconnectType: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#interconnect for
    * interconnects.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Type of link requested. This field indicates speed of each of the links
    * in the bundle, not the entire bundle.
    */
  var linkType: js.UndefOr[String] = js.native
  /**
    * URL of the InterconnectLocation object that represents where this
    * connection is to be provisioned.
    */
  var location: js.UndefOr[String] = js.native
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
    * Email address to contact the customer NOC for operations and maintenance
    * notifications regarding this Interconnect. If specified, this will be
    * used for notifications in addition to all other forms described, such as
    * Stackdriver logs alerting and Cloud Notifications.
    */
  var nocContactEmail: js.UndefOr[String] = js.native
  /**
    * [Output Only] The current status of whether or not this Interconnect is
    * functional.
    */
  var operationalStatus: js.UndefOr[String] = js.native
  /**
    * [Output Only] IP address configured on the customer side of the
    * Interconnect link. The customer should configure this IP address during
    * turnup when prompted by Google NOC. This can be used only for ping tests.
    */
  var peerIpAddress: js.UndefOr[String] = js.native
  /**
    * [Output Only] Number of links actually provisioned in this interconnect.
    */
  var provisionedLinkCount: js.UndefOr[Double] = js.native
  /**
    * Target number of physical links in the link bundle, as requested by the
    * customer.
    */
  var requestedLinkCount: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The current state of whether or not this Interconnect is
    * functional.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaInterconnect {
  @scala.inline
  def apply(
    adminEnabled: js.UndefOr[Boolean] = js.undefined,
    circuitInfos: js.Array[SchemaInterconnectCircuitInfo] = null,
    creationTimestamp: String = null,
    customerName: String = null,
    description: String = null,
    expectedOutages: js.Array[SchemaInterconnectOutageNotification] = null,
    googleIpAddress: String = null,
    googleReferenceId: String = null,
    id: String = null,
    interconnectAttachments: js.Array[String] = null,
    interconnectType: String = null,
    kind: String = null,
    linkType: String = null,
    location: String = null,
    name: String = null,
    nocContactEmail: String = null,
    operationalStatus: String = null,
    peerIpAddress: String = null,
    provisionedLinkCount: Int | Double = null,
    requestedLinkCount: Int | Double = null,
    selfLink: String = null,
    state: String = null
  ): SchemaInterconnect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adminEnabled)) __obj.updateDynamic("adminEnabled")(adminEnabled.asInstanceOf[js.Any])
    if (circuitInfos != null) __obj.updateDynamic("circuitInfos")(circuitInfos.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (customerName != null) __obj.updateDynamic("customerName")(customerName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expectedOutages != null) __obj.updateDynamic("expectedOutages")(expectedOutages.asInstanceOf[js.Any])
    if (googleIpAddress != null) __obj.updateDynamic("googleIpAddress")(googleIpAddress.asInstanceOf[js.Any])
    if (googleReferenceId != null) __obj.updateDynamic("googleReferenceId")(googleReferenceId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (interconnectAttachments != null) __obj.updateDynamic("interconnectAttachments")(interconnectAttachments.asInstanceOf[js.Any])
    if (interconnectType != null) __obj.updateDynamic("interconnectType")(interconnectType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (linkType != null) __obj.updateDynamic("linkType")(linkType.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nocContactEmail != null) __obj.updateDynamic("nocContactEmail")(nocContactEmail.asInstanceOf[js.Any])
    if (operationalStatus != null) __obj.updateDynamic("operationalStatus")(operationalStatus.asInstanceOf[js.Any])
    if (peerIpAddress != null) __obj.updateDynamic("peerIpAddress")(peerIpAddress.asInstanceOf[js.Any])
    if (provisionedLinkCount != null) __obj.updateDynamic("provisionedLinkCount")(provisionedLinkCount.asInstanceOf[js.Any])
    if (requestedLinkCount != null) __obj.updateDynamic("requestedLinkCount")(requestedLinkCount.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnect]
  }
}

