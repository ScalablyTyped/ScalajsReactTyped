package typingsJapgolly.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainClusterConfigZoneAwarenessConfig extends js.Object {
  /**
    * Number of Availability Zones for the domain to use with `zoneAwarenessEnabled`. Defaults to `2`. Valid values: `2` or `3`.
    */
  var availabilityZoneCount: js.UndefOr[Double] = js.native
}

object DomainClusterConfigZoneAwarenessConfig {
  @scala.inline
  def apply(availabilityZoneCount: Int | Double = null): DomainClusterConfigZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal()
    if (availabilityZoneCount != null) __obj.updateDynamic("availabilityZoneCount")(availabilityZoneCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainClusterConfigZoneAwarenessConfig]
  }
}

