package typingsJapgolly.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJournalS3ExportsForLedgerRequest extends js.Object {
  /**
    * The maximum number of results to return in a single ListJournalS3ExportsForLedger request. (The actual number of results returned might be fewer.)
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.qldbMod.MaxResults] = js.native
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
  /**
    * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for NextToken in the response from a previous ListJournalS3ExportsForLedger call, then you should use that value as input here.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.qldbMod.NextToken] = js.native
}

object ListJournalS3ExportsForLedgerRequest {
  @scala.inline
  def apply(Name: LedgerName, MaxResults: Int | Double = null, NextToken: NextToken = null): ListJournalS3ExportsForLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJournalS3ExportsForLedgerRequest]
  }
}

