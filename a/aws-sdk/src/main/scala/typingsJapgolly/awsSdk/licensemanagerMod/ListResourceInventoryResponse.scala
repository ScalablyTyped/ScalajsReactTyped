package typingsJapgolly.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceInventoryResponse extends js.Object {
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the resources.
    */
  var ResourceInventoryList: js.UndefOr[typingsJapgolly.awsSdk.licensemanagerMod.ResourceInventoryList] = js.native
}

object ListResourceInventoryResponse {
  @scala.inline
  def apply(NextToken: String = null, ResourceInventoryList: ResourceInventoryList = null): ListResourceInventoryResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceInventoryList != null) __obj.updateDynamic("ResourceInventoryList")(ResourceInventoryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceInventoryResponse]
  }
}

