package typingsJapgolly.pulumiAws.inputMod.appmesh

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceSpecProviderVirtualNode extends js.Object {
  /**
    * The name of the virtual node that is acting as a service provider.
    */
  var virtualNodeName: Input[String] = js.native
}

object VirtualServiceSpecProviderVirtualNode {
  @scala.inline
  def apply(virtualNodeName: Input[String]): VirtualServiceSpecProviderVirtualNode = {
    val __obj = js.Dynamic.literal(virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualNode]
  }
}

