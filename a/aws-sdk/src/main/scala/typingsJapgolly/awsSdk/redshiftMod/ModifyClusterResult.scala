package typingsJapgolly.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterResult extends js.Object {
  var Cluster: js.UndefOr[typingsJapgolly.awsSdk.redshiftMod.Cluster] = js.native
}

object ModifyClusterResult {
  @scala.inline
  def apply(Cluster: Cluster = null): ModifyClusterResult = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterResult]
  }
}

