package typingsJapgolly.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * The tags for the resource.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(tags: Tags = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

