package typingsJapgolly.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTagsForResourceRequest extends js.Object {
  /**
    * The ARN of the assessment template that you want to set tags to.
    */
  var resourceArn: Arn = js.native
  /**
    * A collection of key and value pairs that you want to set to the assessment template.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object SetTagsForResourceRequest {
  @scala.inline
  def apply(resourceArn: Arn, tags: TagList = null): SetTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTagsForResourceRequest]
  }
}

