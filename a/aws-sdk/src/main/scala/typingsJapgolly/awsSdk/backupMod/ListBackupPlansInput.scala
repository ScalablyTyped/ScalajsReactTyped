package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupPlansInput extends js.Object {
  /**
    * A Boolean value with a default value of FALSE that returns deleted backup plans when set to TRUE.
    */
  var IncludeDeleted: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.backupMod.MaxResults] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListBackupPlansInput {
  @scala.inline
  def apply(
    IncludeDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): ListBackupPlansInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IncludeDeleted)) __obj.updateDynamic("IncludeDeleted")(IncludeDeleted.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackupPlansInput]
  }
}

