package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotsResult extends js.Object {
  /**
    * If not null, more results are available. Pass this value in the NextToken member of a subsequent call to DescribeSnapshots.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * The list of Snapshot objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var Snapshots: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.Snapshots] = js.native
}

object DescribeSnapshotsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Snapshots: Snapshots = null): DescribeSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Snapshots != null) __obj.updateDynamic("Snapshots")(Snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotsResult]
  }
}

