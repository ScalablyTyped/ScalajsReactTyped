package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotLimitsResult extends js.Object {
  /**
    * A SnapshotLimits object that contains the manual snapshot limits for the specified directory.
    */
  var SnapshotLimits: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.SnapshotLimits] = js.native
}

object GetSnapshotLimitsResult {
  @scala.inline
  def apply(SnapshotLimits: SnapshotLimits = null): GetSnapshotLimitsResult = {
    val __obj = js.Dynamic.literal()
    if (SnapshotLimits != null) __obj.updateDynamic("SnapshotLimits")(SnapshotLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotLimitsResult]
  }
}

