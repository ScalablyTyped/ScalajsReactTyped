package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchContactsResponse extends js.Object {
  /**
    * The contacts that meet the specified set of filter criteria, in sort order.
    */
  var Contacts: js.UndefOr[ContactDataList] = js.native
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The total number of contacts returned.
    */
  var TotalCount: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}

object SearchContactsResponse {
  @scala.inline
  def apply(Contacts: ContactDataList = null, NextToken: NextToken = null, TotalCount: Int | Double = null): SearchContactsResponse = {
    val __obj = js.Dynamic.literal()
    if (Contacts != null) __obj.updateDynamic("Contacts")(Contacts.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchContactsResponse]
  }
}

