package typingsJapgolly.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterDbRevisionResult extends js.Object {
  var Cluster: js.UndefOr[typingsJapgolly.awsSdk.redshiftMod.Cluster] = js.native
}

object ModifyClusterDbRevisionResult {
  @scala.inline
  def apply(Cluster: Cluster = null): ModifyClusterDbRevisionResult = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterDbRevisionResult]
  }
}

