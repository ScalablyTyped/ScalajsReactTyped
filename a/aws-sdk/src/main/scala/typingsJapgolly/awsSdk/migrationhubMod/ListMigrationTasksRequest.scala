package typingsJapgolly.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMigrationTasksRequest extends js.Object {
  /**
    * Value to specify how many results are returned per page.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.migrationhubMod.MaxResults] = js.native
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * Filter migration tasks by discovered resource name.
    */
  var ResourceName: js.UndefOr[typingsJapgolly.awsSdk.migrationhubMod.ResourceName] = js.native
}

object ListMigrationTasksRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: Token = null, ResourceName: ResourceName = null): ListMigrationTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMigrationTasksRequest]
  }
}

