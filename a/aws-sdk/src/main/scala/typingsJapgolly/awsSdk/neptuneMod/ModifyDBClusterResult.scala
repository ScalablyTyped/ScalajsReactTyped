package typingsJapgolly.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[typingsJapgolly.awsSdk.neptuneMod.DBCluster] = js.native
}

object ModifyDBClusterResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): ModifyDBClusterResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterResult]
  }
}

