package typingsJapgolly.pulumiAws.inputMod.globalaccelerator

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerPortRange extends js.Object {
  /**
    * The first port in the range of ports, inclusive.
    */
  var fromPort: js.UndefOr[Input[Double]] = js.native
  /**
    * The last port in the range of ports, inclusive.
    */
  var toPort: js.UndefOr[Input[Double]] = js.native
}

object ListenerPortRange {
  @scala.inline
  def apply(fromPort: Input[Double] = null, toPort: Input[Double] = null): ListenerPortRange = {
    val __obj = js.Dynamic.literal()
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerPortRange]
  }
}

