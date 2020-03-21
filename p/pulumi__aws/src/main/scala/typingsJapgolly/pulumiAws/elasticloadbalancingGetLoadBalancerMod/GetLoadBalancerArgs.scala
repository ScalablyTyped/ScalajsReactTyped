package typingsJapgolly.pulumiAws.elasticloadbalancingGetLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerArgs extends js.Object {
  /**
    * The unique name of the load balancer.
    */
  val name: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetLoadBalancerArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetLoadBalancerArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerArgs]
  }
}

