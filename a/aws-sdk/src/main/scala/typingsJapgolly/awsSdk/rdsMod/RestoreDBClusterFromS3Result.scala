package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreDBClusterFromS3Result extends js.Object {
  var DBCluster: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.DBCluster] = js.native
}

object RestoreDBClusterFromS3Result {
  @scala.inline
  def apply(DBCluster: DBCluster = null): RestoreDBClusterFromS3Result = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBClusterFromS3Result]
  }
}

