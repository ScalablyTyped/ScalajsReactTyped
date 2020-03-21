package typingsJapgolly.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRateBasedRulesResponse extends js.Object {
  /**
    * If you have more Rules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more Rules, submit another ListRateBasedRules request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsJapgolly.awsSdk.wafregionalMod.NextMarker] = js.native
  /**
    * An array of RuleSummary objects.
    */
  var Rules: js.UndefOr[RuleSummaries] = js.native
}

object ListRateBasedRulesResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, Rules: RuleSummaries = null): ListRateBasedRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRateBasedRulesResponse]
  }
}

