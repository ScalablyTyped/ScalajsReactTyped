package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contain information of Nat mapping for an interface of this endpoint.
  */
@js.native
trait SchemaVmEndpointNatMappingsInterfaceNatMappings extends js.Object {
  /**
    * List of all drain IP:port-range mappings assigned to this interface.
    * These ranges are inclusive, that is, both the first and the last ports
    * can be used for NAT. Example: [&quot;2.2.2.2:12345-12355&quot;,
    * &quot;1.1.1.1:2234-2234&quot;].
    */
  var drainNatIpPortRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of all IP:port-range mappings assigned to this interface. These
    * ranges are inclusive, that is, both the first and the last ports can be
    * used for NAT. Example: [&quot;2.2.2.2:12345-12355&quot;,
    * &quot;1.1.1.1:2234-2234&quot;].
    */
  var natIpPortRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * Total number of drain ports across all NAT IPs allocated to this
    * interface. It equals to the aggregated port number in the field
    * drain_nat_ip_port_ranges.
    */
  var numTotalDrainNatPorts: js.UndefOr[Double] = js.native
  /**
    * Total number of ports across all NAT IPs allocated to this interface. It
    * equals to the aggregated port number in the field nat_ip_port_ranges.
    */
  var numTotalNatPorts: js.UndefOr[Double] = js.native
  /**
    * Alias IP range for this interface endpoint. It will be a private (RFC
    * 1918) IP range. Examples: &quot;10.33.4.55/32&quot;, or
    * &quot;192.168.5.0/24&quot;.
    */
  var sourceAliasIpRange: js.UndefOr[String] = js.native
  /**
    * Primary IP of the VM for this NIC.
    */
  var sourceVirtualIp: js.UndefOr[String] = js.native
}

object SchemaVmEndpointNatMappingsInterfaceNatMappings {
  @scala.inline
  def apply(
    drainNatIpPortRanges: js.Array[String] = null,
    natIpPortRanges: js.Array[String] = null,
    numTotalDrainNatPorts: Int | Double = null,
    numTotalNatPorts: Int | Double = null,
    sourceAliasIpRange: String = null,
    sourceVirtualIp: String = null
  ): SchemaVmEndpointNatMappingsInterfaceNatMappings = {
    val __obj = js.Dynamic.literal()
    if (drainNatIpPortRanges != null) __obj.updateDynamic("drainNatIpPortRanges")(drainNatIpPortRanges.asInstanceOf[js.Any])
    if (natIpPortRanges != null) __obj.updateDynamic("natIpPortRanges")(natIpPortRanges.asInstanceOf[js.Any])
    if (numTotalDrainNatPorts != null) __obj.updateDynamic("numTotalDrainNatPorts")(numTotalDrainNatPorts.asInstanceOf[js.Any])
    if (numTotalNatPorts != null) __obj.updateDynamic("numTotalNatPorts")(numTotalNatPorts.asInstanceOf[js.Any])
    if (sourceAliasIpRange != null) __obj.updateDynamic("sourceAliasIpRange")(sourceAliasIpRange.asInstanceOf[js.Any])
    if (sourceVirtualIp != null) __obj.updateDynamic("sourceVirtualIp")(sourceVirtualIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVmEndpointNatMappingsInterfaceNatMappings]
  }
}

