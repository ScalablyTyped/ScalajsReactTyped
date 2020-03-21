package typingsJapgolly.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncreaseReplicationFactorResponse extends js.Object {
  /**
    * A description of the DAX cluster. with its new replication factor.
    */
  var Cluster: js.UndefOr[typingsJapgolly.awsSdk.daxMod.Cluster] = js.native
}

object IncreaseReplicationFactorResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): IncreaseReplicationFactorResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseReplicationFactorResponse]
  }
}

