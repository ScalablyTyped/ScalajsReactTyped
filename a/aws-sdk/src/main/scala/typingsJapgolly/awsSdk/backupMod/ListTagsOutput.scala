package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsOutput extends js.Object {
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * To help organize your resources, you can assign your own metadata to the resources you create. Each tag is a key-value pair.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.backupMod.Tags] = js.native
}

object ListTagsOutput {
  @scala.inline
  def apply(NextToken: String = null, Tags: Tags = null): ListTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsOutput]
  }
}

