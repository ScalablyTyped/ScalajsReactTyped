package typingsJapgolly.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * This value is the ARN you specified to list the tags of.
    */
  var Arn: js.UndefOr[typingsJapgolly.awsSdk.transferMod.Arn] = js.native
  /**
    * When you can get additional results from the ListTagsForResource call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional tags.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.transferMod.NextToken] = js.native
  /**
    * Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for items. Tags are metadata that you define.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.transferMod.Tags] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Arn: Arn = null, NextToken: NextToken = null, Tags: Tags = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

