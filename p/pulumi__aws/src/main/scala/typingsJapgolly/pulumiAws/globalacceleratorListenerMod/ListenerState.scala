package typingsJapgolly.pulumiAws.globalacceleratorListenerMod

import typingsJapgolly.pulumiAws.inputMod.globalaccelerator.ListenerPortRange
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of your accelerator.
    */
  val acceleratorArn: js.UndefOr[Input[String]] = js.native
  /**
    * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
    */
  val clientAffinity: js.UndefOr[Input[String]] = js.native
  /**
    * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
    */
  val portRanges: js.UndefOr[Input[js.Array[Input[ListenerPortRange]]]] = js.native
  /**
    * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
    */
  val protocol: js.UndefOr[Input[String]] = js.native
}

object ListenerState {
  @scala.inline
  def apply(
    acceleratorArn: Input[String] = null,
    clientAffinity: Input[String] = null,
    portRanges: Input[js.Array[Input[ListenerPortRange]]] = null,
    protocol: Input[String] = null
  ): ListenerState = {
    val __obj = js.Dynamic.literal()
    if (acceleratorArn != null) __obj.updateDynamic("acceleratorArn")(acceleratorArn.asInstanceOf[js.Any])
    if (clientAffinity != null) __obj.updateDynamic("clientAffinity")(clientAffinity.asInstanceOf[js.Any])
    if (portRanges != null) __obj.updateDynamic("portRanges")(portRanges.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerState]
  }
}

