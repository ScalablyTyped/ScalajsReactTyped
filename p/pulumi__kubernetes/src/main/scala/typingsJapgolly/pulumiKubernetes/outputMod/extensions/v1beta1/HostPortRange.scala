package typingsJapgolly.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.
  * It requires both the start and end to be defined. Deprecated: use HostPortRange from policy
  * API Group instead.
  */
trait HostPortRange extends js.Object {
  /**
    * max is the end of the range, inclusive.
    */
  val max: Double
  /**
    * min is the start of the range, inclusive.
    */
  val min: Double
}

object HostPortRange {
  @scala.inline
  def apply(max: Double, min: Double): HostPortRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HostPortRange]
  }
}

