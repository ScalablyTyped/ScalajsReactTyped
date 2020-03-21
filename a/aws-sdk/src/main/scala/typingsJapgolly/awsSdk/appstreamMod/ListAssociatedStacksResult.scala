package typingsJapgolly.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociatedStacksResult extends js.Object {
  /**
    * The name of the stack.
    */
  var Names: js.UndefOr[StringList] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListAssociatedStacksResult {
  @scala.inline
  def apply(Names: StringList = null, NextToken: String = null): ListAssociatedStacksResult = {
    val __obj = js.Dynamic.literal()
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedStacksResult]
  }
}

