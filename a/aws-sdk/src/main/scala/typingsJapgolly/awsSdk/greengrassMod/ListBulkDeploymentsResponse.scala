package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBulkDeploymentsResponse extends js.Object {
  /**
    * A list of bulk deployments.
    */
  var BulkDeployments: js.UndefOr[typingsJapgolly.awsSdk.greengrassMod.BulkDeployments] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListBulkDeploymentsResponse {
  @scala.inline
  def apply(BulkDeployments: BulkDeployments = null, NextToken: string = null): ListBulkDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    if (BulkDeployments != null) __obj.updateDynamic("BulkDeployments")(BulkDeployments.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBulkDeploymentsResponse]
  }
}

