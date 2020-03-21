package typingsJapgolly.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsOutput extends js.Object {
  /**
    * Information about the tags.
    */
  var TagDescriptions: js.UndefOr[typingsJapgolly.awsSdk.elbv2Mod.TagDescriptions] = js.native
}

object DescribeTagsOutput {
  @scala.inline
  def apply(TagDescriptions: TagDescriptions = null): DescribeTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (TagDescriptions != null) __obj.updateDynamic("TagDescriptions")(TagDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsOutput]
  }
}

