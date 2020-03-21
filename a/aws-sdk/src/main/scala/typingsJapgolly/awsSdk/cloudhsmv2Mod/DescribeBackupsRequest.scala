package typingsJapgolly.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupsRequest extends js.Object {
  /**
    * One or more filters to limit the items returned in the response. Use the backupIds filter to return only the specified backups. Specify backups by their backup identifier (ID). Use the sourceBackupIds filter to return only the backups created from a source backup. The sourceBackupID of a source backup is returned by the CopyBackupToRegion operation. Use the clusterIds filter to return only the backups for the specified clusters. Specify clusters by their cluster identifier (ID). Use the states filter to return only backups that match the specified state.
    */
  var Filters: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.Filters] = js.native
  /**
    * The maximum number of backups to return in the response. When there are more backups than the number you specify, the response contains a NextToken value.
    */
  var MaxResults: js.UndefOr[MaxSize] = js.native
  /**
    * The NextToken value that you received in the previous response. Use this value to get more backups.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.NextToken] = js.native
  /**
    * Designates whether or not to sort the return backups by ascending chronological order of generation.
    */
  var SortAscending: js.UndefOr[Boolean] = js.native
}

object DescribeBackupsRequest {
  @scala.inline
  def apply(
    Filters: Filters = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SortAscending: js.UndefOr[scala.Boolean] = js.undefined
  ): DescribeBackupsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(SortAscending)) __obj.updateDynamic("SortAscending")(SortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupsRequest]
  }
}

