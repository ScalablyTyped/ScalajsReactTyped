package typingsJapgolly.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListIndexResponse extends js.Object {
  /**
    * The objects and indexed values attached to the index.
    */
  var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object BatchListIndexResponse {
  @scala.inline
  def apply(IndexAttachments: IndexAttachmentList = null, NextToken: NextToken = null): BatchListIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (IndexAttachments != null) __obj.updateDynamic("IndexAttachments")(IndexAttachments.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListIndexResponse]
  }
}

