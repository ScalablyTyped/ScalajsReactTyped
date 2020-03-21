package typingsJapgolly.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponentsRequest extends js.Object {
  /**
    *  The filters. 
    */
  var filters: js.UndefOr[FilterList] = js.native
  /**
    *  The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    *  A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The owner defines which components you want to list. By default, this request will only show components owned by your account. You can use this field to specify if you want to view components owned by yourself, by Amazon, or those components that have been shared with you by other customers. 
    */
  var owner: js.UndefOr[Ownership] = js.native
}

object ListComponentsRequest {
  @scala.inline
  def apply(
    filters: FilterList = null,
    maxResults: Int | Double = null,
    nextToken: NonEmptyString = null,
    owner: Ownership = null
  ): ListComponentsRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentsRequest]
  }
}

