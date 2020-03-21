package typingsJapgolly.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsRequest extends js.Object {
  /**
    * Specifies the ARN of the trail from which tags should be removed. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceId: String = js.native
  /**
    * Specifies a list of tags to be removed.
    */
  var TagsList: js.UndefOr[typingsJapgolly.awsSdk.cloudtrailMod.TagsList] = js.native
}

object RemoveTagsRequest {
  @scala.inline
  def apply(ResourceId: String, TagsList: TagsList = null): RemoveTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    if (TagsList != null) __obj.updateDynamic("TagsList")(TagsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsRequest]
  }
}

