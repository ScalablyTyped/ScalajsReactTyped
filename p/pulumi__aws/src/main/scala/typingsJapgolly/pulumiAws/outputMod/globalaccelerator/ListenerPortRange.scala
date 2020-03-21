package typingsJapgolly.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerPortRange extends js.Object {
  /**
    * The first port in the range of ports, inclusive.
    */
  var fromPort: js.UndefOr[Double] = js.native
  /**
    * The last port in the range of ports, inclusive.
    */
  var toPort: js.UndefOr[Double] = js.native
}

object ListenerPortRange {
  @scala.inline
  def apply(fromPort: Int | Double = null, toPort: Int | Double = null): ListenerPortRange = {
    val __obj = js.Dynamic.literal()
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerPortRange]
  }
}

