package typingsJapgolly.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterResponse extends js.Object {
  /**
    * Information about the cluster that was deleted.
    */
  var Cluster: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.Cluster] = js.native
}

object DeleteClusterResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterResponse]
  }
}

