package typingsJapgolly.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.organizationsMod.NextToken] = js.native
  /**
    * The tags that are assigned to the resource.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.organizationsMod.Tags] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: Tags = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

