package typingsJapgolly.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTypeInfos extends js.Object {
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * The list of workflow type information.
    */
  var typeInfos: WorkflowTypeInfoList = js.native
}

object WorkflowTypeInfos {
  @scala.inline
  def apply(typeInfos: WorkflowTypeInfoList, nextPageToken: PageToken = null): WorkflowTypeInfos = {
    val __obj = js.Dynamic.literal(typeInfos = typeInfos.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTypeInfos]
  }
}

