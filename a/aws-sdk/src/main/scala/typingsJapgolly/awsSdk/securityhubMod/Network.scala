package typingsJapgolly.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  /**
    * The destination domain of network-related information about a finding.
    */
  var DestinationDomain: js.UndefOr[NonEmptyString] = js.native
  /**
    * The destination IPv4 address of network-related information about a finding.
    */
  var DestinationIpV4: js.UndefOr[NonEmptyString] = js.native
  /**
    * The destination IPv6 address of network-related information about a finding.
    */
  var DestinationIpV6: js.UndefOr[NonEmptyString] = js.native
  /**
    * The destination port of network-related information about a finding.
    */
  var DestinationPort: js.UndefOr[Integer] = js.native
  /**
    * The direction of network traffic associated with a finding.
    */
  var Direction: js.UndefOr[NetworkDirection] = js.native
  /**
    * The protocol of network-related information about a finding.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source domain of network-related information about a finding.
    */
  var SourceDomain: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source IPv4 address of network-related information about a finding.
    */
  var SourceIpV4: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source IPv6 address of network-related information about a finding.
    */
  var SourceIpV6: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source media access control (MAC) address of network-related information about a finding.
    */
  var SourceMac: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source port of network-related information about a finding.
    */
  var SourcePort: js.UndefOr[Integer] = js.native
}

object Network {
  @scala.inline
  def apply(
    DestinationDomain: NonEmptyString = null,
    DestinationIpV4: NonEmptyString = null,
    DestinationIpV6: NonEmptyString = null,
    DestinationPort: Int | scala.Double = null,
    Direction: NetworkDirection = null,
    Protocol: NonEmptyString = null,
    SourceDomain: NonEmptyString = null,
    SourceIpV4: NonEmptyString = null,
    SourceIpV6: NonEmptyString = null,
    SourceMac: NonEmptyString = null,
    SourcePort: Int | scala.Double = null
  ): Network = {
    val __obj = js.Dynamic.literal()
    if (DestinationDomain != null) __obj.updateDynamic("DestinationDomain")(DestinationDomain.asInstanceOf[js.Any])
    if (DestinationIpV4 != null) __obj.updateDynamic("DestinationIpV4")(DestinationIpV4.asInstanceOf[js.Any])
    if (DestinationIpV6 != null) __obj.updateDynamic("DestinationIpV6")(DestinationIpV6.asInstanceOf[js.Any])
    if (DestinationPort != null) __obj.updateDynamic("DestinationPort")(DestinationPort.asInstanceOf[js.Any])
    if (Direction != null) __obj.updateDynamic("Direction")(Direction.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (SourceDomain != null) __obj.updateDynamic("SourceDomain")(SourceDomain.asInstanceOf[js.Any])
    if (SourceIpV4 != null) __obj.updateDynamic("SourceIpV4")(SourceIpV4.asInstanceOf[js.Any])
    if (SourceIpV6 != null) __obj.updateDynamic("SourceIpV6")(SourceIpV6.asInstanceOf[js.Any])
    if (SourceMac != null) __obj.updateDynamic("SourceMac")(SourceMac.asInstanceOf[js.Any])
    if (SourcePort != null) __obj.updateDynamic("SourcePort")(SourcePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
}

