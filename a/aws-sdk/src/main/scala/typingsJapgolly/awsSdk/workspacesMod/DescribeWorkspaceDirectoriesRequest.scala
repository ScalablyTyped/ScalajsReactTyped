package typingsJapgolly.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceDirectoriesRequest extends js.Object {
  /**
    * The identifiers of the directories. If the value is null, all directories are retrieved.
    */
  var DirectoryIds: js.UndefOr[DirectoryIdList] = js.native
  /**
    * The maximum number of directories to return.
    */
  var Limit: js.UndefOr[typingsJapgolly.awsSdk.workspacesMod.Limit] = js.native
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeWorkspaceDirectoriesRequest {
  @scala.inline
  def apply(
    DirectoryIds: DirectoryIdList = null,
    Limit: Int | Double = null,
    NextToken: PaginationToken = null
  ): DescribeWorkspaceDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryIds != null) __obj.updateDynamic("DirectoryIds")(DirectoryIds.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceDirectoriesRequest]
  }
}

